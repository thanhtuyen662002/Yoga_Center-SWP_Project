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

import javax.naming.NamingException;
import model.dto.NewsDTO;
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
                    String name = rs.getString(3);
                    String address = rs.getString(4);
                    String gender = rs.getString(5);
                    String role = rs.getString(6);
                    boolean status = rs.getBoolean(7);
                    user = new UserDTO(phoneID, userPassword, name, address, gender, role, status);

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
    
    public static ArrayList<NewsDTO> getAllCus() throws SQLException {
        ArrayList<NewsDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement("SELECT * FROM [dbo].[User] WHERE role = 'US'");
                rs = ptm.executeQuery();

                while (rs.next()) {
                    int newsID = rs.getInt("newsID");
                    String stPhone = rs.getString("stPhone");
                    String title = rs.getString("title");
                    String date = rs.getString("postDate");
                    String content = rs.getString("content");
                    String image = rs.getString("image");
                    String data = rs.getString("data");
                    int categoryID = rs.getInt("categoryID");
                    boolean status = rs.getBoolean("status");
                    list.add(new NewsDTO(newsID, stPhone, title, date, image, data, content, categoryID, status));
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
    
    
        private static final String CHECK_DUPLICATE_ACCOUNT = "SELECT * FROM [Yoga Center].[dbo].[User] WHERE [phone] = '?'";


    public UserDTO getUserByPhone(String phone) throws SQLException, NamingException, ClassNotFoundException {
       
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String query = "SELECT * FROM [dbo].[User] WHERE [phone] = '"+ phone +"'";
                ptm = conn.prepareStatement(query);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    return new UserDTO(rs.getString("phone"),rs.getString("password"),rs.getString("name"), rs.getString("address"), rs.getString("gender"), rs.getString("roleID"), rs.getBoolean("status"));
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
        return null;
    }
    private static final String INSERT = "INSERT INTO [User]([phone], [password], [name], [address], [gender], [role], [status] )"
           + "VALUES('?','?','?','?','?','?','?','?')";
    public void insert(String phone,String password,String name,String address,String gender,String role) throws SQLException, NamingException, ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {               
                String sql = "INSERT INTO [User]([phone], [password], [name], [address], [gender], [role], [status] )"
                        + "VALUES('" + phone + "','" + password + "',N'" + name  + "',N'" + address + "','" + gender + "','" + role + "', 1)";
                ptm = conn.prepareStatement(sql);               
                ptm.executeUpdate();
            }
        } finally {
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }


   
}