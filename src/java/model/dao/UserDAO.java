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
import javax.naming.NamingException;
import model.dto.UserDTO;
import utils.DBUtils;

/**
 *
 * @author HP Pro
 */
public class UserDAO {
    public static UserDTO getUser(String phone, String password) {
        Connection cn = null;
        UserDTO user = null;
        try {
            cn = DBUtils.getConnection();
            if (cn != null) {
                String sql = "select * from [User]  where status = 1 and phone= ? and password = ? ";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, phone);
                pst.setString(2, password);
                ResultSet rs = pst.executeQuery();
                if (rs != null && rs.next()) {
                    String phoneID = rs.getString(1);
                    String userPassword = rs.getString(2);
                    String userLogin = rs.getString(3);
                    String name = rs.getString(4);
                    String address = rs.getString(5);
                    String gender = rs.getString(6);
                    String role = rs.getString(7);
                    boolean status = rs.getBoolean(8);
                    user = new UserDTO(phoneID, userLogin, name, userPassword, address, gender, role, status);

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cn != null) {
                try {
                    cn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return user;
    }
    private static final String CHECK_DUPLICATE_ACCOUNT = "SELECT * FROM [User] WHERE [phone] = '?'";
    public UserDTO getUserByPhone(String phone) throws SQLException, NamingException, ClassNotFoundException {
        UserDTO user = null;
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(CHECK_DUPLICATE_ACCOUNT);
                ptm.setString(1, phone);
                rs = ptm.executeQuery();
                if (rs.next()) {
                    user = new UserDTO(rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), true);
                }
            }
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
return user;
    }
}