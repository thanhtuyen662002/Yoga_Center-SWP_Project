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
import yogacenter.dto.ClassDTO_Nhat;
import yogacenter.dto.UserDTO_Nhat;
import yogacenter.utils.DBUtils;

/**
 *
 * @author dell
 */
public class UserDAO_Nhat {
    
    public ArrayList<UserDTO_Nhat> getAll() {
        ArrayList<UserDTO_Nhat> list = new ArrayList<>();
        try {
            String sql = "SELECT *\n"
                    + "  FROM [User]";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                list.add(new UserDTO_Nhat(rs.getString("phone"),rs.getString("name")));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClassSlotDAO_Nhat.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClassSlotDAO_Nhat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
}
