/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.dto.ClassDTO_Nhat;
import model.dto.ClassSlotDTO_Nhat;
import model.dto.RoomDTO_Nhat;
import model.dto.ScheduleDTO_Nhat;
import model.dto.UserDTO;
import utils.DBUtils;

/**
 *
 * @author dell
 */
public class ScheduleDAO_Nhat extends DBUtils {

    public List<ScheduleDTO_Nhat> getAllCustomerSchedule(String id, Date monday, Date sunday) {
        List<ScheduleDTO_Nhat> list = new ArrayList<>();
        ClassDTO_Nhat classStudy;
        UserDTO pt;
        ClassSlotDTO_Nhat slot;
        RoomDTO_Nhat room;
        UserDTO customer;

        ClassDAO_Nhat cDao = new ClassDAO_Nhat();
        UserDAO_Nhat uDao = new UserDAO_Nhat();
        ClassSlotDAO_Nhat csDao = new ClassSlotDAO_Nhat();
        RoomDAO_Nhat rDao = new RoomDAO_Nhat();

        try {
            String sql = "SELECT *\n"
                    + "  FROM [Schedule]\n"
                    + "  Where (day >= ? and day <= ?)\n"
                    + "  and customerID = ? and deleteFlag = 0";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            stm.setDate(1, monday);
            stm.setDate(2, sunday);
            stm.setString(3, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                classStudy = cDao.getClassByID(rs.getInt("classID"));
                pt = uDao.getUserByID(rs.getString("ptPhone"));
                slot = csDao.getSlotByID(rs.getInt("slotID"));
                room = rDao.getRoomByID(rs.getString("roomID"));
                customer = uDao.getUserByID(rs.getString("ptPhone"));
                list.add(new ScheduleDTO_Nhat(rs.getInt("scheduleID"),
                        classStudy,
                        pt,
                        slot,
                        room,
                        rs.getDate("day"),
                        customer));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ScheduleDAO_Nhat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<ScheduleDTO_Nhat> getAllPTSchedule(String id, Date monday, Date sunday) {
        List<ScheduleDTO_Nhat> list = new ArrayList<>();
        ClassDTO_Nhat classStudy;
        UserDTO pt;
        ClassSlotDTO_Nhat slot;
        RoomDTO_Nhat room;
        UserDTO customer;

        ClassDAO_Nhat cDao = new ClassDAO_Nhat();
        UserDAO_Nhat uDao = new UserDAO_Nhat();
        ClassSlotDAO_Nhat csDao = new ClassSlotDAO_Nhat();
        RoomDAO_Nhat rDao = new RoomDAO_Nhat();

        try {
            String sql = "SELECT *\n"
                    + "  FROM [Schedule]\n"
                    + "  Where (day >= ? and day <= ?)\n"
                    + "  and ptPhone = ? and deleteFlag = 0";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            stm.setDate(1, monday);
            stm.setDate(2, sunday);
            stm.setString(3, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                classStudy = cDao.getClassByID(rs.getInt("classID"));
                pt = uDao.getUserByID(rs.getString("ptPhone"));
                slot = csDao.getSlotByID(rs.getInt("slotID"));
                room = rDao.getRoomByID(rs.getString("roomID"));
                customer = uDao.getUserByID(rs.getString("ptPhone"));
                list.add(new ScheduleDTO_Nhat(rs.getInt("scheduleID"),
                        classStudy,
                        pt,
                        slot,
                        room,
                        rs.getDate("day"),
                        customer));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ScheduleDAO_Nhat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ScheduleDTO_Nhat getScheduleById(int id) {
        ClassDTO_Nhat classStudy;
        UserDTO pt;
        ClassSlotDTO_Nhat slot;
        RoomDTO_Nhat room;
        UserDTO customer;

        ClassDAO_Nhat cDao = new ClassDAO_Nhat();
        UserDAO_Nhat uDao = new UserDAO_Nhat();
        ClassSlotDAO_Nhat csDao = new ClassSlotDAO_Nhat();
        RoomDAO_Nhat rDao = new RoomDAO_Nhat();
        try {
            String sql = "SELECT *\n"
                    + "  FROM [Schedule]\n"
                    + "  where scheduleID = ? and deleteFlag = 0";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                classStudy = cDao.getClassByID(rs.getInt("classID"));
                pt = uDao.getUserByID(rs.getString("ptPhone"));
                slot = csDao.getSlotByID(rs.getInt("slotID"));
                room = rDao.getRoomByID(rs.getString("roomID"));
                customer = uDao.getUserByID(rs.getString("ptPhone"));
                return new ScheduleDTO_Nhat(rs.getInt("scheduleID"),
                        classStudy,
                        pt,
                        slot,
                        room,
                        rs.getDate("day"),
                        customer);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ScheduleDAO_Nhat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void update(int id, String roomId, int slotId, Date date) {
        try {
            String sql = "UPDATE [dbo].[Schedule]\n"
                    + "   SET [slotID] = ?\n"
                    + "      ,[roomID] = ?\n"
                    + "      ,[day] = ?\n"
                    + " WHERE scheduleID = ?";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            stm.setInt(1, slotId);
            stm.setString(2, roomId);
            stm.setDate(3, date);
            stm.setInt(4, id);
            stm.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Update Schedule");
        }
    }

    public void delete(int id) {
        try {
            String sql = "UPDATE [Schedule]\n"
                    + "   SET [deleteFlag] = 1\n"
                    + " WHERE scheduleID = ?";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            stm.setInt(1, id);
            stm.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Update Schedule");
        }
    }

    public void insert(int classId, String phonePT, String roomId, int slotId, Date date, String customerId) throws ClassNotFoundException, SQLException {
        try {
            String sql = "INSERT INTO [Schedule]\n"
                    + "           ([classID]\n"
                    + "           ,[ptPhone]\n"
                    + "           ,[slotID]\n"
                    + "           ,[roomID]\n"
                    + "           ,[day]\n"
                    + "           ,[customerID]\n"
                    + "           ,[deleteFlag])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            stm.setInt(1, classId);
            stm.setString(2, phonePT);
            stm.setInt(3, slotId);
            stm.setString(4, roomId);
            stm.setDate(5, date);
            stm.setString(6, customerId);
            stm.setBoolean(7, false);
            stm.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
           throw e;
        }
    }

    public boolean isScheduleExist(int slotId, Date date, String customerId, String roomID, int classID) {
        try {
            String sql = "SELECT *\n"
                    + "  FROM [Schedule]\n"
                    + "  where slotID = ? and day = ? and customerID = ? and roomID = ? and classID = ? and deleteFlag = 0";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            stm.setInt(1, slotId);
            stm.setDate(2, date);
            stm.setString(3, customerId);
            stm.setString(4, roomID);
            stm.setInt(5, classID);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Update Schedule");
        }
        return false;
    }

    public boolean isScheduleExistUpdate(int scheduleID, int slotId, String phonePT, Date date) {
        try {
            String sql = "SELECT *\n"
                    + "  FROM [Schedule]\n"
                    + "  where ptPhone = ? and slotID = ? and day = ? and scheduleID != ? and deleteFlag = 0";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            stm.setString(1, phonePT);
            stm.setInt(2, slotId);
            stm.setDate(3, date);
            stm.setInt(4, scheduleID);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Update Schedule");
        }
        return false;
    }

}
