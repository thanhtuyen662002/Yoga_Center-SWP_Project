/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yogacenter.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import yogacenter.dto.CoursesDTO;
import yogacenter.utils.DBUtils;

/**
 *
 * @author HP Pro
 */
//Ham chuc nang cua khoa hoc
public class CoursesDAO {

    private static final String SHOW = "SELECT * FROM Courses";
    //private static final String UPDATE = "UPDATE Courses SET name='?', description='?', image='?', price=? WHERE courseID=?";
    private static final String DELETE = "DELETE Courses WHERE courseID=?";
    //private static final String INSERT = "SET IDENTITY_INSERT Courses ON" + "INSERT INTO Courses(courseID, name, description, image, price)" + "VALUE(?,'?','?','?',?)";

    //Ham hien thi toan bo cac khoa hoc
    public List<CoursesDTO> getAllCourses() throws SQLException {
        List<CoursesDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(SHOW);
                rs = ptm.executeQuery();

                while (rs.next()) {
                    int courseID = rs.getInt("courseID");
                    String courseName = rs.getString("name");
                    String description = rs.getString("description");
                    String image = rs.getString("image");
                    int price = rs.getInt("price");
                    list.add(new CoursesDTO(courseID, courseName, description, image, price));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
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

    //Ham cap nhat lai thong tin cac khoa hoc
    public boolean updateCourses(CoursesDTO courses) throws SQLException {
        boolean checkUpdate = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "UPDATE Courses SET name=" + "'" + courses.getCourseName() + "'" + ", description= " +  "'" + courses.getDescription() +  "'" +
                        ", image= " + "'" + courses.getCourseImage() + "'" + ", price= " + courses.getPrice() + " WHERE courseID= " + courses.getCourseID();
                ptm = conn.prepareStatement(sql); 
                checkUpdate = ptm.executeUpdate() > 0 ? true : false; //kiem tra xem da cap nhat thanh cong hay chua,
                //neu thanh cong = true, khong thanh cong = false
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return checkUpdate;
    }

    //Ham xoa khoa hoc
    public boolean deleteCourses(int courseID) throws SQLException {
        boolean checkDelete = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(DELETE);
                ptm.setInt(1, courseID);
                checkDelete = ptm.executeUpdate() > 0 ? true : false; //Kiem tra xem khoa hoc da duoc xoa hay chua
                //neu da xoa = true, chua xoa duoc = false
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return checkDelete;
    }

    //Ham them du lieu khoa hoc
    public boolean insertCourses(CoursesDTO courses) throws SQLException {
        boolean checkInsert = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SET IDENTITY_INSERT Courses ON " + "INSERT INTO Courses(courseID, name, description, image, price)" + 
                        "VALUES(" + courses.getCourseID() + "," + "'" + courses.getCourseName() + "'" + "," + "'" + courses.getDescription() + "'" + "," + "'" + courses.getCourseImage() + "'" + "," + courses.getPrice() + ")";
                ptm = conn.prepareStatement(sql);
                checkInsert = ptm.executeUpdate() > 0 ? true : false; //kiem tra xem da them khoa hoc thanh cong hay chua
                //neu them thanh cong = true, them that bai = false
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return checkInsert;
    }
}
