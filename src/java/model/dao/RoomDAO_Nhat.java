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
import model.dto.RoomDTO_Nhat;
import model.dto.UserDTO;
import utils.DBUtils;

/**
 *
 * @author dell
 */
public class RoomDAO_Nhat {

    public ArrayList<RoomDTO_Nhat> getAll() {
        ArrayList<RoomDTO_Nhat> list = new ArrayList<>();
        try {
            String sql = "SELECT *\n"
                    + "  FROM [Room]";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                list.add(new RoomDTO_Nhat(rs.getString("roomID"),
                        rs.getString("locate"),
                        rs.getString("roomNumber"),
                        rs.getBoolean("status"),
                        rs.getString("description")));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClassSlotDAO_Nhat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public RoomDTO_Nhat getRoomByID(String id) {
        try {
            String sql = "SELECT *\n"
                    + "  FROM Room\n"
                    + "  Where roomID = ?";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            stm.setString(1, id);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                return new RoomDTO_Nhat(id,
                        rs.getString("locate"),
                        rs.getString("roomNumber"),
                        rs.getBoolean("status"),
                        rs.getString("description"));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClassSlotDAO_Nhat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
