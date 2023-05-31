/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yogacenter.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import yogacenter.dto.ClassDTO_Nhat;
import yogacenter.dto.ClassSlotDTO_Nhat;
import yogacenter.dto.CourseDTO_Nhat;
import yogacenter.dto.CustomerDTO_Nhat;
import yogacenter.dto.RoomDTO_Nhat;
import yogacenter.dto.ScheduleDTO_Nhat;
import yogacenter.dto.UserDTO;
import yogacenter.dto.UserDTO_Nhat;
import yogacenter.utils.DBUtils;

/**
 *
 * @author dell
 */
public class ScheduleDAO_Nhat extends DBUtils {

    public List<ScheduleDTO_Nhat> getAllCustomerSchedule(String c0001, Date monday, Date sunday) {
        List<ScheduleDTO_Nhat> list = new ArrayList<>();
        try {
            String sql = "SELECT s.*,c.*,c.description as 'cdescription',co.*,u.*,slot.*,r.*,cus.*\n"
                    + "  FROM [Schedule] s \n"
                    + "  left join Class c\n"
                    + "  on s.classID = c.classID\n"
                    + "  left join Courses co\n"
                    + "  on c.courseID = co.courseID\n"
                    + "  left join [User] u\n"
                    + "  on s.ptPhone = u.phone\n"
                    + "  left join Classslot slot\n"
                    + "  on slot.slotID = s.slotID\n"
                    + "  left join [Room] r\n"
                    + "  on r.roomID = s.roomID\n"
                    + "  left join Customer cus\n"
                    + "  on s.customerID = cus.customerId"
                    + "  Where (day >= ? and day <= ?)";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            stm.setDate(1, monday);
            stm.setDate(2, sunday);
            ResultSet rs = stm.executeQuery();
            CourseDTO_Nhat course = null;
            ClassDTO_Nhat classStudy = null;
            UserDTO_Nhat pt = null;
            ClassSlotDTO_Nhat slot = null;
            RoomDTO_Nhat room = null;
            CustomerDTO_Nhat customer = null;
            while (rs.next()) {
                course = new CourseDTO_Nhat(rs.getInt("courseID"),
                        rs.getString("name"),
                        rs.getString("description"),
                        rs.getString("image"),
                        rs.getDouble("price"));
                pt = new UserDTO_Nhat(rs.getString("phone"),
                        rs.getString("name"));
                slot = new ClassSlotDTO_Nhat(rs.getInt("slotID"),
                        rs.getTime("start_time"),
                        rs.getTime("end_time"));
                classStudy = new ClassDTO_Nhat(rs.getInt("classID"),
                        course,
                        pt,
                        rs.getString("name"),
                        rs.getString("cdescription"),
                        rs.getInt("total_sessions"),
                        rs.getInt("capacity"));
                room = new RoomDTO_Nhat(rs.getString("roomId"),
                        rs.getString("locate"),
                        rs.getString("roomNumber"),
                        rs.getBoolean("status"));
                customer = new CustomerDTO_Nhat(rs.getString("customerId"),
                        rs.getString("customerName"),
                        rs.getString("phone"),
                        rs.getString("address"),
                        rs.getBoolean(1));
                list.add(new ScheduleDTO_Nhat(classStudy,
                        pt,
                        slot,
                        room,
                        rs.getDate("day"),
                        customer));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ScheduleDAO_Nhat.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ScheduleDAO_Nhat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
