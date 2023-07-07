package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.dto.ClassDTO;
import utils.DBUtils;

public class ClassDAO {

    public List<ClassDTO> getCourseName() throws SQLException {
        List<ClassDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT courseID, name, numberOfMonths FROM Courses";
                ptm = conn.prepareStatement(sql);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    list.add(new ClassDTO(rs.getInt("courseID"), rs.getString("name"), rs.getInt("numberOfMonths")));
                }
            }
        } catch (Exception e) {
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return list;
    }

    public List<ClassDTO> getStaff() throws SQLException {
        List<ClassDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT phone, name FROM [User] WHERE role = 'TC'";
                ptm = conn.prepareStatement(sql);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    list.add(new ClassDTO(rs.getString("phone"), rs.getString("name")));
                }
            }
        } catch (Exception e) {
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return list;
    }

    public boolean saveClassToDatabase(String courseID, String ptPhone, String name, String des, int totalSession, String capacity) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        boolean check = false;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "INSERT INTO Class (courseID, ptPhone, name, description, total_sessions, capacity, status)\n"
                        + "VALUES (" + courseID + ",'" + ptPhone + "', N'" + name + "', N'" + des + "', " + totalSession + ", " + capacity + ", 1)";
                ptm = conn.prepareStatement(sql);
                int row = ptm.executeUpdate();
                if (row > 0) {
                    return check = true;
                } else {
                    return check = false;
                }
            }
        } catch (Exception e) {
        } finally {
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return check;
    }

    public ClassDTO getNumberOfMonths(String id) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT numberOfMonths FROM Courses WHERE courseID =" + id;
                ptm = conn.prepareStatement(sql);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    return new ClassDTO(rs.getInt("numberOfMonths"));
                }
            }
        } catch (Exception e) {
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return null;
    }

    public static List<ClassDTO> getAllClass() throws SQLException {
        List<ClassDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement("SELECT c.classID, c.courseID, co.name AS courseName, u.name AS ptName, c.name AS className, c.description, c.total_sessions, c.capacity, c.status\n"
                        + "FROM Class AS c\n"
                        + "INNER JOIN [dbo].[User] u ON c.ptPhone = u.phone\n"
                        + "INNER JOIN Courses AS co On co.courseID = c.courseID\n"
                        + "WHERE c.status = 1");
                rs = ptm.executeQuery();

                while (rs.next()) {
                    int classID = rs.getInt("classID");
                    int courseID = rs.getInt("courseID");
                    String courseName = rs.getString("courseName");
                    String ptName = rs.getString("ptName");
                    String className = rs.getString("className");
                    String description = rs.getString("description");
                    int totalSession = rs.getInt("total_sessions");
                    int capacity = rs.getInt("capacity");
                    boolean status = rs.getBoolean("status");
                    list.add(new ClassDTO(classID, courseID, ptName, className, description, totalSession, status, courseName, capacity));
                }
            }
        } catch (Exception e) {
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return list;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ClassDAO dao = new ClassDAO();
        List<ClassDTO> List = dao.getUser("2");
        for (ClassDTO o : List) {
            System.out.println(o);
        }
    }

    public List<ClassDTO> getUser(String id) throws SQLException {
        List<ClassDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT u.name, uc.phone FROM UserCourse AS uc\n"
                        + "JOIN [User] AS u ON u.phone = uc.phone\n"
                        + "WHERE uc.status = 1 AND uc.courseID = " + id;
                ptm = conn.prepareStatement(sql);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    list.add(new ClassDTO(rs.getString("phone"), rs.getString("name")));
                }
            }
        } catch (Exception e) {
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return list;
    }

    public boolean insertUserToClass(String classID, String cusPhone) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        boolean check = false;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String query = "UPDATE UserCourse SET status = 0\n"
                        + "WHERE phone = '" + cusPhone + "'";
                ptm = conn.prepareStatement(query);
                int row = ptm.executeUpdate();
                if (row > 0) {
                    String sql = "INSERT INTO UserClass (classID, phone)\n"
                            + "VALUES (" + classID + ",'" + cusPhone + "')";
                    ptm = conn.prepareStatement(sql);
                    int row1 = ptm.executeUpdate();
                    if (row1 > 0) {
                        return check = true;
                    } else {
                        return check = false;
                    }
                } else {
                    return check = false;
                }
            }
        } catch (Exception e) {
        } finally {
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return check;
    }

    public List<ClassDTO> getListStudent(String classID) throws SQLException {
        List<ClassDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT u.name, uc.phone FROM UserClass AS uc\n"
                        + "JOIN [User] AS u ON uc.phone = u.phone\n"
                        + "WHERE uc.classID = " + classID;
                ptm = conn.prepareStatement(sql);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    list.add(new ClassDTO(rs.getString("phone"), rs.getString("name")));
                }
            }
        } catch (Exception e) {
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return list;
    }

    public List<ClassDTO> getListDeleteClass() throws SQLException {
        List<ClassDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement("SELECT c.classID, c.courseID, co.name AS courseName, u.name AS ptName, c.name AS className, c.description, c.total_sessions, c.capacity, c.status\n"
                        + "FROM Class AS c\n"
                        + "INNER JOIN [dbo].[User] u ON c.ptPhone = u.phone\n"
                        + "INNER JOIN Courses AS co On co.courseID = c.courseID\n"
                        + "WHERE c.status = 0");
                rs = ptm.executeQuery();

                while (rs.next()) {
                    int classID = rs.getInt("classID");
                    int courseID = rs.getInt("courseID");
                    String courseName = rs.getString("courseName");
                    String ptName = rs.getString("ptName");
                    String className = rs.getString("className");
                    String description = rs.getString("description");
                    int totalSession = rs.getInt("total_sessions");
                    int capacity = rs.getInt("capacity");
                    boolean status = rs.getBoolean("status");
                    list.add(new ClassDTO(classID, courseID, ptName, className, description, totalSession, status, courseName, capacity));
                }
            }
        } catch (Exception e) {
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return list;
    }

    public boolean checkDeleteClass(String className) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT uc.phone FROM Class AS cls\n"
                        + "  JOIN UserClass AS uc ON uc.classID = cls.classID\n"
                        + "  WHERE cls.name = '" + className + "'";
                ptm = conn.prepareStatement(sql);
                rs = ptm.executeQuery();
                if (rs.next()) {
                    return true;
                }
            }
        } catch (Exception e) {
        } finally {
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return false;
    }

    public boolean deleteClass(String name) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "UPDATE Class SET status = 0\n"
                        + "WHERE name = N'" + name + "'";
                ptm = conn.prepareStatement(sql);
                int row = ptm.executeUpdate();
                if (row > 0) {
                    return true;
                }
            }
        } catch (Exception e) {
        } finally {
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return false;
    }

    public boolean restoreClass(String name) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "UPDATE Class SET status = 1\n"
                        + "WHERE name = N'" + name + "'";
                ptm = conn.prepareStatement(sql);
                int row = ptm.executeUpdate();
                if (row > 0) {
                    return true;
                }
            }
        } catch (Exception e) {
        } finally {
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return false;
    }

    public List<ClassDTO> getListCourse() throws SQLException {
        List<ClassDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT courseID, name FROM Courses";
                ptm = conn.prepareStatement(sql);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    list.add(new ClassDTO(rs.getInt("courseID"), rs.getString("name")));
                }
            }
        } catch (Exception e) {
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return list;
    }

    public ClassDTO getClassByClassID(String ClassID) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement("SELECT c.classID, c.courseID, co.name AS courseName, u.name AS ptName, c.ptPhone, c.name AS className, c.description, c.total_sessions, c.capacity, c.status\n"
                        + "FROM Class AS c\n"
                        + "INNER JOIN [dbo].[User] u ON c.ptPhone = u.phone\n"
                        + "INNER JOIN Courses AS co On co.courseID = c.courseID\n"
                        + "WHERE c.status = 1 AND c.classID = " + ClassID);
                rs = ptm.executeQuery();

                while (rs.next()) {
                    int classID = rs.getInt("classID");
                    int courseID = rs.getInt("courseID");
                    String courseName = rs.getString("courseName");
                    String ptName = rs.getString("ptName");
                    String ptPhone = rs.getString("ptPhone");
                    String className = rs.getString("className");
                    String description = rs.getString("description");
                    int totalSession = rs.getInt("total_sessions");
                    int capacity = rs.getInt("capacity");
                    boolean status = rs.getBoolean("status");
                    return new ClassDTO(classID, courseID, ptName, ptPhone, className, description, totalSession, status, courseName, capacity);
                }
            }
        } catch (Exception e) {
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return null;
    }

}
