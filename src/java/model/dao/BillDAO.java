/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.dto.BillDTO;
import utils.DBUtils;

/**
 *
 * @author HP Pro
 */
public class BillDAO {

    public boolean insertUserToBill(String phone) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        boolean check = false;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT courseID FROM UserCourse\n"
                        + "WHERE phone = '" + phone + "'";
                ptm = conn.prepareStatement(sql);
                rs = ptm.executeQuery();
                if (rs.next()) {
                    int courseID = rs.getInt("courseID");
                    String sql1 = "SELECT  fullName, discount, signupID FROM SignUp\n"
                            + "WHERE phone = '" + phone + "' AND courseID = " + courseID;
                    ptm = conn.prepareStatement(sql1);
                    rs = ptm.executeQuery();
                    if (rs.next()) {
                        String name = rs.getString("fullName");
                        float price = rs.getFloat("discount");
                        int signupID = rs.getInt("signupID");

                        LocalDateTime currentTime = LocalDateTime.now();
                        // Tạo đối tượng DateTimeFormatter với định dạng yyyy-MM-dd
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                        // Chuyển đổi thành chuỗi theo định dạng yyyy-MM-dd
                        String time = currentTime.format(formatter);

                        String query = "INSERT INTO Bill (courseID, cusName, cusPhone, price, signupID, time)\n"
                                + "VALUES (" + courseID + ",N'" + name + "','" + phone + "'," + price + "," + signupID + ",'" + time + "')";
                        ptm = conn.prepareStatement(query);
                        int row = ptm.executeUpdate();
                        if (row > 0) {
                            System.out.println("Insert bill success!");
                            return check = true;
                        } else {
                            System.out.println("Can't insert to bill!");
                            return check = false;
                        }
                    } else {
                        System.out.println("Can't find signup by phone and courseID!");
                        return check = false;
                    }
                } else {
                    System.out.println("Can't find courseID by phone");
                    return check = false;
                }
            }
        } catch (Exception e) {
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return check;
    }

    public List<BillDTO> getListBill() throws SQLException {
        List<BillDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT b.*, c.name FROM Bill AS b\n"
                        + "JOIN Courses AS c ON c.courseID = b.courseID";
                ptm = conn.prepareStatement(sql);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    LocalDate date = rs.getDate("time").toLocalDate();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

                    // Chuyển đổi thành chuỗi theo định dạng yyyy-MM-dd
                    String formattedDate = date.format(formatter);

                    // Chuyển đổi lại thành định dạng dd-MM-yyyy
                    DateTimeFormatter newFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                    LocalDate parsedDate = LocalDate.parse(formattedDate, formatter);
                    String time = parsedDate.format(newFormatter);

                    list.add(new BillDTO(rs.getInt("signupID"), rs.getInt("courseID"), rs.getString("cusPhone"), rs.getString("cusName"), rs.getFloat("price"), time, rs.getString("name")));
                }
            }
        } catch (Exception e) {
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return list;
    }

    public boolean makeBill(String phone, String courseID, String name, int price) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                LocalDateTime currentTime = LocalDateTime.now();
                // Tạo đối tượng DateTimeFormatter với định dạng yyyy-MM-dd
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                // Chuyển đổi thành chuỗi theo định dạng yyyy-MM-dd
                String time = currentTime.format(formatter);
                String sql = "INSERT INTO Bill (courseID, cusName, cusPhone, price, time)\n"
                        + "  VALUES (" + courseID + ",N'" + name + "','" + phone
                        + "','" + price + "','" + time + "')";
                ptm = conn.prepareStatement(sql);
                int row = ptm.executeUpdate();
                if (row > 0) {
                    return true;
                }
            }

        } catch (Exception e) {
        } finally {
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return false;
    }

    public static void main(String[] args) throws SQLException, ParseException {
        BillDAO dao = new BillDAO();
        List<BillDTO> check = dao.getListBill();
        for (BillDTO billDTO : check) {
            System.out.println(billDTO);
        }
    }

    public double getTotalPrice(int currentMonth) {
        try {
            String sql = "SELECT SUM(price) as 'total'\n"
                    + "  FROM [Bill] Where MONTH(time) = ?";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            stm.setInt(1, currentMonth);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                return rs.getDouble("total");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BillDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public double getTotalPriceYear(int currentYear) {
        try {
            String sql = "SELECT Sum(price) as 'total'\n"
                    + "  FROM [Bill] Where Year(time) = ?";
            PreparedStatement stm = DBUtils.getConnection().prepareStatement(sql);
            stm.setInt(1, currentYear);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                return rs.getDouble("total");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BillDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
}
