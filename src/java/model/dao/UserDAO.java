/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

}
