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
import model.dto.CourseDTO_Nhat;
import model.dto.UserDTO;
import utils.DBUtils;

/**
 *
 * @author dell
 */
public class ClassDAO_Nhat {

    public ArrayList<ClassDTO_Nhat> getAll() {
        ArrayList<ClassDTO_Nhat> list = new ArrayList<>();
        try {
            String sql = "SELECT *\n"
                    + "  FROM Class";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                list.add(new ClassDTO_Nhat(rs.getInt("classID"),
                        rs.getString("name")));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClassSlotDAO_Nhat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ClassDTO_Nhat getClassByID(int id) {
        CourseDAO_Nhat cDao = new CourseDAO_Nhat();
        UserDAO_Nhat uDao = new UserDAO_Nhat();

        CourseDTO_Nhat course;
        UserDTO pt;

        try {
            String sql = "SELECT *\n"
                    + "  FROM [Class] where classID = ?";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                course = cDao.getCourseByID(rs.getInt("courseID"));
                pt = uDao.getUserByID(rs.getString("ptPhone"));
                return new ClassDTO_Nhat(id,
                        course,
                        pt,
                        rs.getString("name"),
                        rs.getString("description"),
                        rs.getInt("total_sessions"),
                        rs.getInt("capacity"));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClassSlotDAO_Nhat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void main(String[] args) {
        ClassDAO_Nhat a = new ClassDAO_Nhat();
        ArrayList<ClassDTO_Nhat> b = a.getAll();
        System.out.println(b);
    }

    public ArrayList<ClassDTO_Nhat> getAllAvailable(String ptPhone) {
        ArrayList<ClassDTO_Nhat> list = new ArrayList<>();
        try {
            String sql = "Select * from Class c\n"
                    + "join \n"
                    + "(SELECT DISTINCT c.classID\n"
                    + "FROM Class c\n"
                    + "left join Schedule s\n"
                    + "on c.classID = s.classID\n"
                    + "join UserClass uc\n"
                    + "on uc.classID = c.classID\n"
                    + "Where scheduleID is NULL and uc.phone is not NULL\n"
                    + "and c.ptPhone = ?) as ca\n"
                    + "on ca.classID = c.classID";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            stm.setString(1, ptPhone);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                list.add(new ClassDTO_Nhat(rs.getInt("classID"),
                        rs.getString("name")));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClassSlotDAO_Nhat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
