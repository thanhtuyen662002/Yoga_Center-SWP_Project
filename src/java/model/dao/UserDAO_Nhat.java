/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.dto.ClassDTO_Nhat;
import model.dto.UserDTO;
import utils.DBUtils;

/**
 *
 * @author dell
 */
public class UserDAO_Nhat {

    public ArrayList<UserDTO> getAll() {
        ArrayList<UserDTO> list = new ArrayList<>();
        try {
            String sql = "SELECT *\n"
                    + "  FROM [User]";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                list.add(new UserDTO(rs.getString("phone"), rs.getString("name")));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClassSlotDAO_Nhat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public UserDTO getUserByID(String phone) {
        try {
            String sql = "SELECT *\n"
                    + "  FROM [User] where phone = ?";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            stm.setString(1, phone);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                return new UserDTO(rs.getString("phone"),
                        rs.getString("name"),
                        rs.getString("role"));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClassSlotDAO_Nhat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<UserDTO> getAllCustomer() {
        ArrayList<UserDTO> list = new ArrayList<>();
        try {
            String sql = "SELECT *\n"
                    + "  FROM [User]\n"
                    + "  where role = 'US'\n"
                    + "  and status = 1";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                list.add(new UserDTO(rs.getString("phone"), rs.getString("name")));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClassSlotDAO_Nhat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
