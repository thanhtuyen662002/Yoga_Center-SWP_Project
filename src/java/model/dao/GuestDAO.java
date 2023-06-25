package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.dto.CoursesDTO;
import model.dto.GuestDTO;
import utils.DBUtils;

public class GuestDAO {

    public static void main(String[] args) throws SQLException {
        GuestDAO dao = new GuestDAO();
        boolean check = dao.insertUserCourse("0321456987");
        System.out.println(check);
    }

    public List<GuestDTO> getListGuest() throws SQLException {
        List<GuestDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = " SELECT s.*, c.name FROM SignUp AS s \n"
                        + "  JOIN Courses AS c ON c.courseID = s.courseID\n"
                        + "  WHERE s.flag = 1 AND s.status = 1";
                ptm = conn.prepareStatement(sql);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    list.add(new GuestDTO(rs.getInt("signupID"), rs.getString("fullName"), rs.getString("phone"),
                            rs.getString("address"), rs.getString("gender"), rs.getInt("courseID"), rs.getString("name"), rs.getFloat("discount"),
                            rs.getBoolean("status"), rs.getBoolean("flag")));
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

    public boolean deleteGuest(String signUpID) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        boolean check = false;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "UPDATE SignUp SET flag = 0\n"
                        + "WHERE signupID = " + signUpID;
                ptm = conn.prepareStatement(sql);
                int row = ptm.executeUpdate();
                if (row > 0) {
                    return check = true;
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

    public GuestDTO getListGuestByID(String signupID) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT * FROM SignUp WHERE signupID =" + signupID;
                ptm = conn.prepareStatement(sql);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    return new GuestDTO(rs.getInt("signupID"), rs.getString("fullName"), rs.getString("phone"), rs.getString("address"),
                            rs.getInt("courseID"), rs.getFloat("discount"), rs.getBoolean("status"), rs.getBoolean("flag"));
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

    public boolean checkDuplicate(String phone) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        boolean check = false;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String query = "SELECT * FROM [User]\n"
                        + "WHERE phone = '" + phone + "'";
                ptm = conn.prepareStatement(query);
                rs = ptm.executeQuery();
                rs.next();
                String value = rs.getString(1);
                if (value != null || !value.isEmpty()) {
                    check = true;
                } else {
                    check = false;
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
        return check;
    }

    public boolean insertGuest(String fullName, String phone, String password, String address, String gender) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        boolean check = false;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "INSERT INTO [User] (name, phone, password, address, gender, role, status)\n"
                        + "VALUES (N'" + fullName + "','" + phone + "','" + password + "', N'" + address + "','" + gender + "', 'US', 1)";
                ptm = conn.prepareStatement(sql);
                int row = ptm.executeUpdate();
                if (row > 0) {
                    return check = true;
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

    public boolean setStatus(String phone) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        boolean check = false;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "UPDATE SignUp SET status = 0 WHERE phone = " + phone;
                ptm = conn.prepareStatement(sql);
                int row = ptm.executeUpdate();
                if (row > 0) {
                    return check = true;
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

    public boolean insertUserCourse(String phone) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        boolean check = false;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT courseID FROM SignUp WHERE phone = '" + phone + "'";
                ptm = conn.prepareStatement(sql);
                rs = ptm.executeQuery();
                if (rs.next()) {
                    int courseID = rs.getInt("courseID");
                    String sql1 = "INSERT INTO UserCourse (courseID, phone, status)\n"
                            + "VALUES (" + courseID + ",'" + phone + "',1)";
                    ptm = conn.prepareStatement(sql1);
                    int row = ptm.executeUpdate();
                    if (row > 0) {
                        System.out.println("Insert userCourse success!");
                        return check = true;
                    } else {
                        System.out.println("Can't insert userCourse success!");
                        return check = false;
                    }
                } else {
                    System.out.println("Can't find courseID by phone");
                    return check = false;
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
        return check;
    }
    public List<CoursesDTO> getCourseName() throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        List<CoursesDTO> list = new ArrayList<>();
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT courseID, name FROM Courses WHERE status = 1";
                ptm = conn.prepareStatement(sql);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    list.add(new CoursesDTO(rs.getInt(1), rs.getString(2)));
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
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

}
