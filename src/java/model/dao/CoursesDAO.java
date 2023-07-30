/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.dto.CoursesDTO;
import utils.DBUtils;

/**
 *
 * @author HP Pro
 */
//Ham chuc nang cua khoa hoc
public class CoursesDAO {

    private static final String SHOW = "SELECT * FROM Courses WHERE status = 1";

    //Ham hien thi toan bo cac khoa hoc
    public static ArrayList<CoursesDTO> getAllCourses() throws SQLException {
        ArrayList<CoursesDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(SHOW);
                rs = ptm.executeQuery();

                while (rs.next()) {
                    int id = rs.getInt("courseID");
                    String courseName = rs.getString("name");
                    String description = rs.getString("description");
                    int numberOfMonths = rs.getInt("numberOfMonths");
                    String image = rs.getString("image");
                    String data = rs.getString("data");
                    float price = rs.getFloat("price");
                    Boolean status = rs.getBoolean("status");
                    list.add(new CoursesDTO(id, courseName, description, numberOfMonths, image, data, price, status));
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

    public static ArrayList<CoursesDTO> getCusCourse() throws SQLException {
        ArrayList<CoursesDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT courseID, name, description FROM Courses WHERE status = 1";
                ptm = conn.prepareStatement(sql);
                rs = ptm.executeQuery();

                while (rs.next()) {
                    int id = rs.getInt("courseID");
                    String courseName = rs.getString("name");
                    String description = rs.getString("description");
                    list.add(new CoursesDTO(id, courseName, description));
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

    public CoursesDTO getCourseByName(String name) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT * FROM Courses WHERE name = N'" + name + "'";
                ptm = conn.prepareStatement(sql);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    return new CoursesDTO(rs.getInt("courseID"), rs.getString("name"), rs.getString("description"), rs.getInt("numberOfMonths"),
                            rs.getString("image"), rs.getString("data"), rs.getFloat("price"), rs.getBoolean("status"));
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
            if (conn != null) {
                conn.close();
            }
        }
        return null;
    }

    public CoursesDTO getCourseDetail(String id) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT name, description, numberOfMonths, data, price FROM Courses WHERE courseID = "
                        + id + " AND status = 1";
                ptm = conn.prepareStatement(sql);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    return new CoursesDTO(rs.getString("name").toUpperCase(), rs.getString("description"),
                            rs.getFloat("price"), rs.getString("data"), rs.getInt("numberOfMonths"));
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

    public List<CoursesDTO> getListDeleteCourse() throws SQLException {
        List<CoursesDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT * FROM Courses WHERE status = 0";
                ptm = conn.prepareStatement(sql);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    list.add(new CoursesDTO(rs.getInt("courseID"), rs.getString("name"), rs.getString("description"),
                            rs.getInt("numberOfMonths"), rs.getString("image"), rs.getString("data"), rs.getFloat("price"), rs.getBoolean("status")));
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

    //Ham xoa khoa hoc
    public void deleteCourses(String name) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "UPDATE Courses SET status = 0\n"
                        + "WHERE name = N'" + name + "'";
                ptm = conn.prepareStatement(sql);
                ptm.executeUpdate();

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

    }

    //Ham check course con ai hoc hay khong
    public boolean checkDelete(String name) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "  SELECT co.name, cls.name, sch.ptPhone, COUNT(sch.ptPhone) AS TT FROM Courses AS  co\n"
                        + "  RIGHT JOIN Class AS cls ON co.courseID = cls.courseID\n"
                        + "  LEFT JOIN Schedule AS sch ON sch.classID = cls.classID\n"
                        + "  WHERE sch.deleteFlag = 0 AND co.name = N'" + name + "' AND co.status = 1\n"
                        + "  GROUP BY co.name, cls.name, sch.ptPhone";
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
            if (conn != null) {
                conn.close();
            }
        }
        return false;
    }

    public boolean checkCourseDuplicate(String name) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        boolean check = false;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String query = "SELECT name FROM Courses\n"
                        + "WHERE name = N'" + name + "'";
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

    public boolean checkCourseDuplicate2(String id, String name) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        boolean check = false;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String query = "SELECT courseID FROM Courses\n"
                        + "WHERE courseID = " + id + "AND name = N'" + name + "'";
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

    public boolean restoreCourses(String name) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "UPDATE Courses SET status = 1\n"
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

    public static void main(String[] args) throws SQLException {
        CoursesDAO dao = new CoursesDAO();
        List<CoursesDTO> listCoursesID = dao.getCourseIDByPhone("0321789654");
        for (int i = 0; i < listCoursesID.size(); i++) {
            System.out.println(listCoursesID);
        }
    }

    public CoursesDTO getCourses(String id) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT courseID, name, data FROM Courses WHERE courseID=" + id;
                ptm = conn.prepareStatement(sql);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    return new CoursesDTO(rs.getString("name"), rs.getInt("courseID"), rs.getString("data"));
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

    public List<CoursesDTO> getTime() throws SQLException {
        List<CoursesDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT slotID, start_time, end_time  FROM Classslot";
                ptm = conn.prepareStatement(sql);
                rs = ptm.executeQuery();;
                while (rs.next()) {
                    list.add(new CoursesDTO(rs.getInt("slotID"), rs.getTime("start_time"), rs.getTime("end_time")));
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

    public List<CoursesDTO> getTimeToCome() throws SQLException {
        List<CoursesDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT timeToCome FROM TimeToCome";
                ptm = conn.prepareStatement(sql);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    list.add(new CoursesDTO(rs.getTime("timeToCome")));
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

    public List<CoursesDTO> getCourseIDByPhone(String phone) throws SQLException {
        List<CoursesDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT courseID FROM UserCourse WHERE phone = '" + phone + "'";
                ptm = conn.prepareStatement(sql);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    list.add(new CoursesDTO(rs.getInt("courseID")));
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

    public int getTotalCourseStudyMonth(int currentMonth) {
        try {
            String sql = "  Select count(distinct(c.courseID)) as 'total'\n"
                    + "  from Class c\n"
                    + "  left join Courses co\n"
                    + "  on c.courseID = co.courseID\n"
                    + "  left join Schedule sc\n"
                    + "  on c.classID = sc.classID\n"
                    + "  Where MONTH(sc.day) = ?";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            stm.setInt(1, currentMonth);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                return rs.getInt("total");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(CoursesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public int getTotalCourse() {
        try {
            String sql = "Select COUNT(*) as 'total'\n"
                    + "  From Courses";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                return rs.getInt("total");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(CoursesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public int getBestCourse() {
        try {
            String sql = "SELECT \n"
                    + "Top 1\n"
                    + "courseID, Count(courseID) as total\n"
                    + "FROM [Bill]\n"
                    + "Group by courseID\n"
                    + "Order by total desc";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                return rs.getInt("total");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(CoursesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public double getTotalCourseStudy() {
        try {
            String sql = "SELECT Count(*) as total\n"
                    + "FROM [Bill]";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                return rs.getInt("total");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(CoursesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

}
