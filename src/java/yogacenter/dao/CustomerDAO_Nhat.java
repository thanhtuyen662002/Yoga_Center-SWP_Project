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
import yogacenter.dto.CustomerDTO_Nhat;
import yogacenter.utils.DBUtils;

/**
 *
 * @author dell
 */
public class CustomerDAO_Nhat {

    public ArrayList<CustomerDTO_Nhat> getAll() {
        ArrayList<CustomerDTO_Nhat> list = new ArrayList<>();
        try {
            String sql = "SELECT *\n"
                    + "  FROM [Customer]";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                list.add(new CustomerDTO_Nhat(rs.getString("customerId"),
                        rs.getString("customerName"),
                        rs.getString("phone"),
                        rs.getString("address"),
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
