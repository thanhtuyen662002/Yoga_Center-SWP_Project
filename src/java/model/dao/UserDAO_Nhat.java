/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.dto.ClassDTO_Nhat;
import model.dto.UserDTO;
import utils.DBUtils;

/**
 *
 * @author dell
 */
public class UserDAO_Nhat extends DBUtils {

    public ArrayList<UserDTO> getAll() {
        ArrayList<UserDTO> list = new ArrayList<>();
        try {
            String sql = "SELECT *\n"
                    + "  FROM [User]";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                list.add(new UserDTO(rs.getString("phone"), rs.getString("name")));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClassSlotDAO_Nhat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public UserDTO getUserByID(String phone) {
        try {
            String sql = "SELECT *\n"
                    + "  FROM [User] where phone = ?";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            stm.setString(1, phone);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                return new UserDTO(rs.getString("phone"),
                        rs.getString("name"),
                        rs.getString("address"),
                        rs.getString("gender"),
                        rs.getString("role"),
                        rs.getBoolean("status"));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClassSlotDAO_Nhat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<UserDTO> getAllCustomer() {
        ArrayList<UserDTO> list = new ArrayList<>();
        try {
            String sql = "SELECT *\n"
                    + "  FROM [User]\n"
                    + "  where role = 'US'\n"
                    + "  and status = 1";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                list.add(new UserDTO(rs.getString("phone"), rs.getString("name")));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClassSlotDAO_Nhat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ArrayList<UserDTO> getAllStaff() {
        ArrayList<UserDTO> list = new ArrayList<>();
        try {
            String sql = "SELECT *\n"
                    + "  FROM [User]\n"
                    + "  where role = 'ST'";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                list.add(new UserDTO(rs.getString("phone"),
                        rs.getString("name"),
                        rs.getString("address"),
                        rs.getString("gender"),
                        rs.getString("role"),
                        rs.getBoolean("status")));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClassSlotDAO_Nhat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public int getTotalRecords(String gender, String status, String textSearch) {
        try {

            HashMap<Integer, Object> setter = new HashMap<>();
            String sql = "Select Count(*) as 'total' from [User]";
            int count = 1;

            textSearch = "%" + textSearch + "%";
            sql += "\n Where (phone like ? or [name] like ?)  and role = 'ST'\n";
            setter.put(count, textSearch);
            count++;
            setter.put(count, textSearch);
            count++;

            if (!gender.equalsIgnoreCase("All")) {
                sql += " and gender = ?";
                setter.put(count, gender);
                count++;
            }

            if (!status.equalsIgnoreCase("All")) {
                sql += " and status = ?";
                setter.put(count, Boolean.valueOf(status));
                count++;
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

    public ArrayList<UserDTO> getAllStaff(int offset, int recordsPerPage,
            String gender, String status, String textSearch) {
        ArrayList<UserDTO> list = new ArrayList<>();
        try {

            HashMap<Integer, Object> setter = new HashMap<>();
            String sql = "Select * from [User]";
            int count = 1;

            textSearch = "%" + textSearch + "%";
            sql += "\n Where (phone like ? or [name] like ?) and role = 'ST'\n";
            setter.put(count, textSearch);
            count++;
            setter.put(count, textSearch);
            count++;

            if (!gender.equalsIgnoreCase("All")) {
                sql += " and gender = ?\n";
                setter.put(count, gender);
                count++;
            }

            if (!status.equalsIgnoreCase("All")) {
                sql += " and status = ?\n";
                setter.put(count, Boolean.valueOf(status));
                count++;
            }

            sql += " order by phone ASC\n"
                    + "offset ? ROW\n"
                    + "FETCH Next ? Rows only";
            setter.put(count, offset);
            count++;
            setter.put(count, recordsPerPage);

            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            for (Map.Entry<Integer, Object> entry : setter.entrySet()) {
                stm.setObject(entry.getKey(), entry.getValue());
            }

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                list.add(new UserDTO(rs.getString("phone"),
                        rs.getString("name"),
                        rs.getString("address"),
                        rs.getString("gender"),
                        rs.getString("role"),
                        rs.getBoolean("status")));
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserDAO_Nhat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ArrayList<UserDTO> getAllCustomer(int offset, int recordsPerPage, int classID,
            String gender, String status, String textSearch) {
        ArrayList<UserDTO> list = new ArrayList<>();
        try {

            HashMap<Integer, Object> setter = new HashMap<>();
            String sql = "SELECT u.*\n"
                    + "  FROM [UserClass] uc left join [User] u\n"
                    + "  on uc.phone = u.phone";
            int count = 1;

            textSearch = "%" + textSearch + "%";
            sql += "\n Where (u.phone like ? or [name] like ?) and role = 'US' and classID = ?\n";
            setter.put(count, textSearch);
            count++;
            setter.put(count, textSearch);
            count++;
            setter.put(count, classID);
            count++;

            if (!gender.equalsIgnoreCase("All")) {
                sql += " and gender = ?\n";
                setter.put(count, gender);
                count++;
            }

            if (!status.equalsIgnoreCase("All")) {
                sql += " and status = ?\n";
                setter.put(count, Boolean.valueOf(status));
                count++;
            }

            sql += " order by phone ASC\n"
                    + "offset ? ROW\n"
                    + "FETCH Next ? Rows only";
            setter.put(count, offset);
            count++;
            setter.put(count, recordsPerPage);

            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            for (Map.Entry<Integer, Object> entry : setter.entrySet()) {
                stm.setObject(entry.getKey(), entry.getValue());
            }

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                list.add(new UserDTO(rs.getString("phone"),
                        rs.getString("name"),
                        rs.getString("address"),
                        rs.getString("gender"),
                        rs.getString("role"),
                        rs.getBoolean("status")));
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserDAO_Nhat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public int getTotalRecords(int classID, String gender, String status, String textSearch) {
        try {

            HashMap<Integer, Object> setter = new HashMap<>();
            String sql = "SELECT count(*) as 'total'\n"
                    + "  FROM [UserClass] uc left join [User] u\n"
                    + "  on uc.phone = u.phone";
            int count = 1;

            textSearch = "%" + textSearch + "%";
            sql += "\n Where (u.phone like ? or [name] like ?) and role = 'US' and classID = ?\n";
            setter.put(count, textSearch);
            count++;
            setter.put(count, textSearch);
            count++;
            setter.put(count, classID);
            count++;

            if (!gender.equalsIgnoreCase("All")) {
                sql += " and gender = ?\n";
                setter.put(count, gender);
                count++;
            }

            if (!status.equalsIgnoreCase("All")) {
                sql += " and status = ?\n";
                setter.put(count, Boolean.valueOf(status));
                count++;
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

    public boolean isPhoneExist(String phone) {
        try {
            String sql = "SELECT *\n"
                    + "  FROM [User] where phone = ?";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            stm.setString(1, phone);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserDAO_Nhat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public void insert(UserDTO staff) {
        try {
            String sql = "INSERT INTO [User]\n"
                    + "           ([phone]\n"
                    + "           ,[password]\n"
                    + "           ,[name]\n"
                    + "           ,[address]\n"
                    + "           ,[gender]\n"
                    + "           ,[role]\n"
                    + "           ,[status])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            stm.setString(1, staff.getPhone());
            stm.setString(2, staff.getPassword());
            stm.setString(3, staff.getName());
            stm.setString(4, staff.getAddress());
            stm.setString(5, staff.getGender());
            stm.setString(6, staff.getRoleID());
            stm.setBoolean(7, staff.isStatus());
            stm.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserDAO_Nhat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean isUidExist(String uid) {
        try {
            String sql = "SELECT *\n"
                    + "  FROM [User] where userlogin = ?";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            stm.setString(1, uid);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserDAO_Nhat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public void updateStatusUser(String phone, boolean status) {
        try {
            String sql = "UPDATE [User]\n"
                    + "   SET [status] = ?\n"
                    + " WHERE phone = ?";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            stm.setBoolean(1, status);
            stm.setString(2, phone);
            stm.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserDAO_Nhat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete(String phone) {
        try {
            String sql = "DELETE FROM [User]\n"
                    + "      WHERE phone = ?";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            stm.setString(1, phone);
            stm.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserDAO_Nhat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(UserDTO user) {
        try {
            String sql = "UPDATE[User]\n"
                    + "   SET [phone] = ?\n"
                    + "      ,[name] = ?\n"
                    + "      ,[address] = ?\n"
                    + "      ,[gender] = ?\n"
                    + "      ,[status] = ?\n"
                    + " WHERE phone = ?";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            stm.setString(1, user.getPhone());
            stm.setString(2, user.getName());
            stm.setString(3, user.getAddress());
            stm.setString(4, user.getGender());
            stm.setBoolean(5, user.isStatus());
            stm.setString(6, user.getPhone());
            stm.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserDAO_Nhat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(UserDTO user, String oldPhone) {
        try {
            String sql = "UPDATE[User]\n"
                    + "   SET [phone] = ?\n"
                    + "      ,[password] = ?\n"
                    + "      ,[name] = ?\n"
                    + "      ,[address] = ?\n"
                    + "      ,[gender] = ?\n"
                    + "      ,[status] = ?\n"
                    + " WHERE phone = ?";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            stm.setString(1, user.getPhone());
            stm.setString(2, user.getPassword());
            stm.setString(3, user.getName());
            stm.setString(4, user.getAddress());
            stm.setString(5, user.getGender());
            stm.setBoolean(6, user.isStatus());
            stm.setString(7, oldPhone);
            stm.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserDAO_Nhat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
