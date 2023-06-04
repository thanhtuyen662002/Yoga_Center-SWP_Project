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
import model.dto.ClassSlotDTO_Nhat;
import utils.DBUtils;

/**
 *
 * @author dell
 */
public class ClassSlotDAO_Nhat {

    public ArrayList<ClassSlotDTO_Nhat> getAll() {
        ArrayList<ClassSlotDTO_Nhat> list = new ArrayList<>();
        try {
            String sql = "SELECT *\n"
                    + "  FROM [Classslot]";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {                
                list.add(new ClassSlotDTO_Nhat(rs.getInt("slotID"),
                        rs.getTime("start_time"),
                        rs.getTime("end_time")));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClassSlotDAO_Nhat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ClassSlotDTO_Nhat getSlotByID(int id) {
        try {
            String sql = "SELECT *\n"
                    + "  FROM [Classslot]\n"
                    + "  where slotID = ?";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {                
                return new ClassSlotDTO_Nhat(id,
                        rs.getTime("start_time"),
                        rs.getTime("end_time"));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClassSlotDAO_Nhat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
