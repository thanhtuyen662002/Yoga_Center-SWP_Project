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
import java.sql.Statement;
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
                String query = "SELECT  u.name AS cusName, f.cusPhone, f.courseID, c.name AS courseName, f.comment, f.dayup, f.status FROM Feedback f \n"
                        + "JOIN [dbo].[User] u ON f.cusPhone = u.phone \n"
                        + "JOIN Courses c ON f.courseID = c.courseID";
                ptm = conn.prepareStatement(query);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    int courseID = rs.getInt("courseID");
                    String courseName = rs.getString("courseName");
                    String cusName = rs.getString("cusName");
                    String cusPhone = rs.getString("cusPhone");
                    String comment = rs.getString("comment");
                    String dayup = rs.getString("dayup");
                    boolean status = rs.getBoolean("status");
                    list.add(new FeedbackDTO(courseID, cusPhone, comment, dayup, status, cusName, courseName));
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

    public void deleteFeedback(String phone) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            String sql = "UPDATE Feedback SET status = 0 WHERE cusPhone = ?";
            ptm = conn.prepareStatement(sql);
            ptm.setString(1, phone);
            ptm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
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
    }

    public static List<FeedbackDTO> getFeedbackByCourseID(String courseID) throws ClassNotFoundException {
        List<FeedbackDTO> feedbackList = new ArrayList<>();
        try {
            try (Connection conn = DBUtils.getConnection()) {
                PreparedStatement stmt = conn.prepareStatement("SELECT u.name, f.cusPhone, f.courseID, f.comment, f.dayup, f.status from Feedback f \n"
                        + "JOIN [dbo].[User] u ON f.cusPhone = u.phone WHERE f.courseID = ?");
                stmt.setString(1, courseID);
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    FeedbackDTO feedback = new FeedbackDTO();
                    feedback.setCusName(rs.getString("name"));
                    feedback.setCusPhone(rs.getString("cusPhone"));
                    feedback.setCourseID(rs.getInt("courseID"));
                    feedback.setComment(rs.getString("comment"));
                    feedback.setDayup(rs.getString("dayup"));
                    feedback.setStatus(rs.getBoolean("status"));
                    feedbackList.add(feedback);
                }
                rs.close();
                stmt.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return feedbackList;
    }

    public boolean checkUserCourse(String phone, String courseID) throws ClassNotFoundException, SQLException {
        PreparedStatement ptm = null;
        ResultSet rs = null;
        Connection conn = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String query = "SELECT uc.*, c.* FROM UserCourse uc JOIN Courses c ON uc.courseID = c.courseID WHERE uc.phone = " + phone
                        + " AND uc.courseID = " + courseID;
                ptm = conn.prepareStatement(query);
                rs = ptm.executeQuery();
                if (rs.next()) {
                    return true;
                }
            }
        } catch (SQLException e) {
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

        return false;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        FeedbackDAO dao = new FeedbackDAO();
        boolean check = dao.insertFeedback("0369852147", "61", "dahgjdsav", "2023-07-07");
        System.out.println(check);
    }

    public boolean insertFeedback(String cusPhone, String courseID, String comment, String dayup) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "INSERT INTO Feedback (cusPhone, courseID, comment, dayup, status) \n"
                        + "VALUES ('" + cusPhone + "'," + courseID + " , N'" + comment + "', '" + dayup + "' ,0)";
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

}
