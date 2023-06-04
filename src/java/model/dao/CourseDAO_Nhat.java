/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.dto.CourseDTO_Nhat;
import model.dto.UserDTO;
import utils.DBUtils;

/**
 *
 * @author dell
 */
public class CourseDAO_Nhat {

    public CourseDTO_Nhat getCourseByID(int id) {
        try {
            String sql = "SELECT *\n"
                    + "  FROM [Yoga Center].[dbo].[Courses]\n"
                    + "  where courseID = ?";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                return new CourseDTO_Nhat(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDouble(5));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClassSlotDAO_Nhat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
