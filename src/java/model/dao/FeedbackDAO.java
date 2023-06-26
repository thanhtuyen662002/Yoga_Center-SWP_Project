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
import java.util.ArrayList;
import java.util.List;
import model.dto.FeedbackDTO;
import utils.DBUtils;

/**
 *
 * @author HOANG ANH
 */
public class FeedbackDAO {
    
    
    public static ArrayList<FeedbackDTO> getAllFeedback() throws SQLException {
        ArrayList<FeedbackDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement("SELECT * FROM Feedback WHERE status = 1");
                rs = ptm.executeQuery();

                while (rs.next()) {
                    int courseID = rs.getInt("courseID");
                    String cusPhone = rs.getString("cusPhone");
                    String comment = rs.getString("comment");
                    String dayup = rs.getString("dayup");
                    boolean status = rs.getBoolean("status");
                    list.add(new FeedbackDTO(courseID, cusPhone, comment, dayup, status));
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
        public static void main(String[] args) throws SQLException {
        
        List<FeedbackDTO> List = FeedbackDAO.getAllFeedback();
        for (FeedbackDTO o : List){
            System.out.println(o);
        }
    }
    
    public boolean checkUserCourse(String phone, int courseID) throws ClassNotFoundException{
        boolean result = false;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        Connection conn = null;
        try {
            conn = DBUtils.getConnection();
            // Tạo câu truy vấn
            String query = "SELECT COUNT(*) AS count FROM UserCourse uc JOIN Courses c ON uc.courseID = c.courseID WHERE uc.phone = ? AND uc.courseID = ?";
            ptm = conn.prepareStatement(query);

            // Thiết lập tham số
            ptm.setString(1, phone);
            ptm.setInt(2, courseID);

            // Thực thi câu truy vấn và lấy kết quả
            rs = ptm.executeQuery();
            if (rs.next()) {
                int count = rs.getInt("count");
                if (count > 0) {
                    result = true;
                }
            }
        } catch (SQLException e) {
            // Xử lý lỗi
            e.printStackTrace();
        } finally {
            // Đóng ResultSet, PreparedStatement và Connection
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ptm != null) {
                    ptm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return result;
    }
    
//    public static void main(String[] args) {
//    try {
//        boolean enrolled = checkUserCourse("0258976431", 60);
//        if (enrolled) {
//            System.out.println("Người dùng đã đăng ký khóa học.");
//        } else {
//            System.out.println("Người dùng chưa đăng ký khóa học.");
//        }
//    } catch (ClassNotFoundException e) {
//        e.printStackTrace();
//    }
//}
    
    public void insertFeedback(String cusPhone, String courseID, String comment, String dayup) throws SQLException{
        Connection conn = null;
        PreparedStatement ptm = null;

        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "INSERT INTO Feedback (cusPhone, courseID, comment, dayup, status) \n" +
                                    "VALUES ('" + cusPhone + "'," + courseID +" , N'"+ comment +"', '"+ dayup +"' ,1 " + ")";
                ptm = conn.prepareStatement(sql);
                int row = ptm.executeUpdate();
                if (row > 0) {
                    System.out.println("Success");
                } else {
                    System.out.println("Fail");
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
        
    }
    
    
}
