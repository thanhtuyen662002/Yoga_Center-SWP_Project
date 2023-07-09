package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.dto.UserDTO;
import utils.DBUtils;

public class TeacherDAO {

    public static void main(String[] args) throws SQLException {
        TeacherDAO dao = new TeacherDAO();
        UserDTO list = dao.getTeacherByPhone("0123456788");
        System.out.println(list);
//        boolean check = dao.setDeactive("0123456788");
//        System.out.println(check);
//        List<UserDTO> list = dao.getAllTeacher();
//        for (UserDTO userDTO : list) {
//            System.out.println(userDTO);
//        }
    }

    public List<UserDTO> getAllTeacher() throws SQLException {
        List<UserDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT * FROM [User] WHERE role = 'TC'";
                ptm = conn.prepareStatement(sql);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    list.add(new UserDTO(rs.getString("phone"), rs.getString("name"), rs.getString("address"),
                            rs.getString("gender"), rs.getString("role"), rs.getBoolean("status")));
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

    public boolean setActive(String phone) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "UPDATE [User] SET status = 1 WHERE phone = '" + phone + "'";
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

    public boolean setDeactive(String phone) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "UPDATE [User] SET status = 0 WHERE phone = '" + phone + "'";
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

    public UserDTO getTeacherByPhone(String phone) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT * FROM [User] WHERE role = 'TC' AND phone = '" + phone + "'";
                ptm = conn.prepareStatement(sql);
                rs = ptm.executeQuery();
                if (rs.next()) {
                    String gender = rs.getString("gender");
                    String trimGender = gender.trim();
                    return new UserDTO(rs.getString("phone"), rs.getString("name"), rs.getString("address"),
                            trimGender, rs.getString("role"), rs.getBoolean("status"));
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
        return null;
    }

    public boolean updateTeacher(String rootPhone, String name, String phone, String address, String gender) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "UPDATE [User] SET name= N'" + name + "', phone= '" + phone + 
                        "', address= N'" + address + "', gender= '" + gender + "' WHERE phone = '" + rootPhone + "'";
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
}
