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

    public static void main(String[] args) throws SQLException {
        ClassDAO dao = new ClassDAO();
        List<ClassDTO> course = dao.getCourseName();
        List<ClassDTO> staff = dao.getStaff();
        for (ClassDTO classDTO : course) {
            System.out.println(classDTO);
        }
    }

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
                String sql = "SELECT phone, name FROM [User] WHERE role = 'ST'";
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
}
