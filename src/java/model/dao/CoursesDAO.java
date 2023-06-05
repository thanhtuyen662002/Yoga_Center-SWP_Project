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
import model.dto.CoursesDTO;
import utils.DBUtils;

/**
 *
 * @author HP Pro
 */
//Ham chuc nang cua khoa hoc
public class CoursesDAO {

    private static final String SHOW = "SELECT * FROM Courses";
    //private static final String UPDATE = "UPDATE Courses SET name='?', description='?', image='?', price=? WHERE courseID=?";
    private static final String DELETE = "DELETE FROM Courses WHERE courseID=?";
    //private static final String INSERT = "SET IDENTITY_INSERT Courses ON" + "INSERT INTO Courses(courseID, name, description, image, price)" + "VALUE(?,'?','?','?',?)";

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
                    int courseID = rs.getInt("courseID");
                    String courseName = rs.getString("name");
                    String description = rs.getString("description");
                    String image = rs.getString("image");
                    float price = rs.getFloat("price");
                    list.add(new CoursesDTO(courseID, courseName, description, image, price));
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

    public CoursesDTO getCourseByID(String id) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT * FROM Courses WHERE courseID = ?";
                ptm = conn.prepareStatement(sql);
                ptm.setString(1, id);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    return new CoursesDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getFloat(5));
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

    //Ham cap nhat lai thong tin cac khoa hoc
    public void updateCourses(String ID, String name, String description, String image, String price) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "UPDATE Courses SET name='" + name + "', description= '" + description
                        + "', image= '" + image + "', price= " + price + " WHERE courseID= " + ID;
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

    //Ham xoa khoa hoc
    public void deleteCourses(String courseID) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(DELETE);
                ptm.setString(1, courseID);
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

    //Ham them du lieu khoa hoc
    public void insertCourses(String name, String description, String image, String price) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "INSERT INTO Courses(name, description, image, price)"
                        + "VALUES('" + name + "','" + description + "','" + image + "'," + price + ")";
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

    //Ham dang ky khoa hoc
    public boolean registerCourse() throws SQLException {
        boolean checkRegister = false;

        return checkRegister;
    }
}
