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
import utils.DBUtils;

/**
 *
 * @author dell
 */
public class CourseDAO_Nhat extends DBUtils {

    public CourseDTO_Nhat getCourseByID(int id) {
        try {
            String sql = "SELECT *\n"
                    + "  FROM  [Courses]\n"
                    + "  where courseID = ?";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                return new CourseDTO_Nhat(rs.getInt("courseID"),
                        rs.getString("name"),
                        rs.getString("description"),
                        rs.getInt("numberOfMonths"),
                        rs.getString("image"),
                        rs.getDouble("price"));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClassSlotDAO_Nhat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public CourseDTO_Nhat getBestCourse() {
        try {
            String sql = "SELECT \n"
                    + "Top 1\n"
                    + "courseID, Count(courseID) as total\n"
                    + "FROM [Bill]\n"
                    + "Group by courseID\n"
                    + "Order by total desc";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                return getCourseByID(rs.getInt("courseID"));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClassSlotDAO_Nhat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
