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
import model.dto.EventDTO;
import utils.DBUtils;

/**
 *
 * @author nguye
 */
public class EventDAO {

    private static final String SHOW = "Select * FROM Event";
    private static final String DELETE = "DELETE FROM Event Where eventID =?";

    public static ArrayList<EventDTO> getALlEvent() throws SQLException {
        ArrayList<EventDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(SHOW);
                rs = ptm.executeQuery();

                while (rs.next()) {
                    int eventID = rs.getInt("eventID");
                    String eventName = rs.getString("eventName");
                    int courseID = rs.getInt("courseID");
                    String description = rs.getString("description");
                    float discount = rs.getFloat("discount");
                    String daystart = rs.getString("daystart");
                    list.add(new EventDTO(eventID, eventName, courseID, description, discount, daystart));
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

    public EventDTO getEventByID(String id) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT * FROM Event WHERE eventID = ?";
                ptm = conn.prepareStatement(sql);
                ptm.setString(1, id);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    return new EventDTO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getFloat(5), rs.getString(6));
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
            if (conn != null) {
                conn.close();
            }           
        }
        return null;
    }

   
    public void updateEvent(String ID, String name, String courseID, String description, String discount, String daystart) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "UPDATE Event SET eventName='" + name + "', courseID=" + courseID + ", description='" + description
                        + "', discount=" + discount + ", daystart='" + daystart + "' WHERE eventID=" + ID;
                ptm = conn.prepareStatement(sql);
                ptm.executeUpdate();
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

    public void deleteEvent(String eventID) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(DELETE);
                ptm.setString(1, eventID);
                ptm.executeUpdate();

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

    
    public void insertEvent(String eventName, String courseID, String description, String discount, String daystart) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "INSERT INTO Event(eventName, courseID, description, discount, daystart)"
                        + "VALUES('" + eventName + "'," + courseID + ",'" + description + "'," + discount + ",'" + daystart + "')";
                ptm = conn.prepareStatement(sql);
                ptm.executeUpdate();
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

  
    public boolean registerCourse() throws SQLException {
        boolean checkRegister = false;

        return checkRegister;
    }
}


