/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.sql.Array;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
                list.add(new ScheduleDTO_Nhat(rs.getInt("scheduleID"),
                        classStudy,
                        pt,
                        slot,
                        room,
                        rs.getDate("day")));
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
                list.add(new ScheduleDTO_Nhat(rs.getInt("scheduleID"),
                        classStudy,
                        pt,
                        slot,
                        room,
                        rs.getDate("day")));
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
                return new ScheduleDTO_Nhat(rs.getInt("scheduleID"),
                        classStudy,
                        pt,
                        slot,
                        room,
                        rs.getDate("day"));
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

    public void insert(int classId, String phonePT, String roomId, int slotId, Date date) {
        try {
            String sql = "INSERT INTO [Schedule]\n"
                    + "           ([classID]\n"
                    + "           ,[ptPhone]\n"
                    + "           ,[slotID]\n"
                    + "           ,[roomID]\n"
                    + "           ,[day]\n"
                    + "           ,[deleteFlag])\n"
                    + "     VALUES\n"
                    + "           (?\n"
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
            stm.setBoolean(6, false);
            stm.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean isScheduleExist(int slotId, Date date, String ptPhone, String roomID, int classID) {
        try {
            String sql = "SELECT *\n"
                    + "  FROM [Schedule]\n"
                    + "  where slotID = ? and day = ? and [ptPhone] = ? and roomID = ? and classID = ? and deleteFlag = 0";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            stm.setInt(1, slotId);
            stm.setDate(2, date);
            stm.setString(3, ptPhone);
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

    public boolean isScheduleExist(String phonePT, ArrayList<Date> studyDate, int slotId) {
        StringBuilder placeholders = new StringBuilder();
        for (int i = 0; i < studyDate.size(); i++) {
            if (i > 0) {
                placeholders.append(", ");
            }
            placeholders.append("?");
        }
        try {
            String sql = "SELECT * FROM Schedule WHERE slotID = ? and ptPhone = ?\n"
                    + " and day IN (" + placeholders + ")\n";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            stm.setInt(1, slotId);
            stm.setString(2, phonePT);
            int count = 3;
            for (Date date : studyDate) {
                stm.setDate(count++, date);
            }
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Update Schedule");
        }
        return false;
    }

    public ArrayList<ScheduleDTO_Nhat> getScheduleBySlotAndDate(int offset, int recordsPerPage, int slotID, Date date, String textSearch) {
        ArrayList<ScheduleDTO_Nhat> list = new ArrayList<>();
        try {

            HashMap<Integer, Object> setter = new HashMap<>();
            String sql = "SELECT s.*\n"
                    + "  FROM [Schedule] s left join Class c\n"
                    + "  on s.classID = c.classID\n"
                    + "  left join Courses co\n"
                    + "  on co.courseID = c.courseID\n"
                    + "  left join Room r\n"
                    + "  on r.roomID = s.roomID\n"
                    + "  Where slotID = ? and day = ?";
            int count = 1;
            setter.put(count, slotID);
            setter.put(++count, date);

            if (!textSearch.isEmpty() || !textSearch.equalsIgnoreCase("")) {
                textSearch = "%" + textSearch + "%";
                sql += "  and  (s.roomID like ? or c.name like ? or s.ptPhone like ?)";
                setter.put(++count, textSearch);
                setter.put(++count, textSearch);
                setter.put(++count, textSearch);
            }

            sql += " Order by scheduleID\n"
                    + "offset ? ROW\n"
                    + "FETCH Next ? Rows only";
            setter.put(++count, offset);
            setter.put(++count, recordsPerPage);

            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            for (Map.Entry<Integer, Object> entry : setter.entrySet()) {
                stm.setObject(entry.getKey(), entry.getValue());
            }

            ResultSet rs = stm.executeQuery();

            ClassDTO_Nhat classStudy;
            UserDTO pt;
            ClassSlotDTO_Nhat slot;
            RoomDTO_Nhat room;
            UserDTO customer;

            ClassDAO_Nhat cDao = new ClassDAO_Nhat();
            UserDAO_Nhat uDao = new UserDAO_Nhat();
            ClassSlotDAO_Nhat csDao = new ClassSlotDAO_Nhat();
            RoomDAO_Nhat rDao = new RoomDAO_Nhat();

            while (rs.next()) {
                classStudy = cDao.getClassByID(rs.getInt("classID"));
                pt = uDao.getUserByID(rs.getString("ptPhone"));
                slot = csDao.getSlotByID(rs.getInt("slotID"));
                room = rDao.getRoomByID(rs.getString("roomID"));
                list.add(new ScheduleDTO_Nhat(rs.getInt("scheduleID"),
                        classStudy,
                        pt,
                        slot,
                        room,
                        rs.getDate("day")));
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserDAO_Nhat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public int getTotalScheduleBySlotAndDate(int slotID, Date date, String textSearch) {
        try {

            HashMap<Integer, Object> setter = new HashMap<>();
            String sql = "SELECT count(*) as 'total'\n"
                    + "  FROM [Schedule] s left join Class c\n"
                    + "  on s.classID = c.classID\n"
                    + "  left join Courses co\n"
                    + "  on co.courseID = c.courseID\n"
                    + "  left join Room r\n"
                    + "  on r.roomID = s.roomID\n"
                    + "  Where slotID = ? and day = ?";
            int count = 1;
            setter.put(count, slotID);
            setter.put(++count, date);

            if (!textSearch.isEmpty() || !textSearch.equalsIgnoreCase("")) {
                textSearch = "%" + textSearch + "%";
                sql += "  and  (s.roomID like ? or c.name like ? or s.ptPhone like ?)";
                setter.put(++count, textSearch);
                setter.put(++count, textSearch);
                setter.put(++count, textSearch);
            }

            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            for (Map.Entry<Integer, Object> entry : setter.entrySet()) {
                stm.setObject(entry.getKey(), entry.getValue());
            }

            ResultSet rs = stm.executeQuery();
            
            if (rs.next()) {
                return rs.getInt("total");
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserDAO_Nhat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

}
