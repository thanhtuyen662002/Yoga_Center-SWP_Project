/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yogacenter.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import yogacenter.dto.RoomDTO_Nhat;
import yogacenter.dto.UserDTO_Nhat;
import yogacenter.utils.DBUtils;

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
                        rs.getString("locate"), rs.getString("roomNumber"),
                        rs.getBoolean("status")));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClassSlotDAO_Nhat.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClassSlotDAO_Nhat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
}
