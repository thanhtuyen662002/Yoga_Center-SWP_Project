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
public class CourseDAO {

    private static final String SHOW = "SELECT * FROM tblCourses";
    private static final String UPDATE = "UPDATE tblCourses SET name=?, description=?, image=?, price=? WHERE courseID=?";
    private static final String DELETE = "DELETE tblCourses WHERE courseID=?";
    private static final String INSERT = "INSERT INTO tblCourses(courseID, name, description, image, price,status)" + "VALUE(?,?,?,?,?,?)";

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
                    int price = rs.getInt("price");
                    String image = rs.getString("courseImage");
                    byte status = rs.getByte("status");
                    list.add(new CoursesDTO(courseID, courseName, description, price, courseName, status));
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
                ptm = conn.prepareStatement(UPDATE);
                ptm.setString(1, courses.getCourseName());
                ptm.setString(2, courses.getDescription());
                ptm.setInt(3, courses.getPrice());
                ptm.setString(4, courses.getCourseImage());
                ptm.setByte(5, courses.getStatus());
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
    public boolean deleteCourses(String courseID) throws SQLException {
        boolean checkDelete = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(DELETE);
                ptm.setString(1, courseID);
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
                ptm = conn.prepareStatement(INSERT);
                ptm.setInt(1, courses.getCourseID());
                ptm.setString(2, courses.getCourseName());
                ptm.setString(3, courses.getDescription());
                ptm.setString(4, courses.getCourseImage());
                ptm.setInt(5, courses.getPrice());
                ptm.setByte(6, courses.getStatus());
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
