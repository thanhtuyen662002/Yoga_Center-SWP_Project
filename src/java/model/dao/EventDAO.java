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
import model.dto.CoursesDTO;
import model.dto.NewsDTO;
import utils.DBUtils;

/**
 *
 * @author nguye
 */
public class EventDAO {

    private static final String SHOW = "Select e.*,c.name FROM Event as e\n" +
" join Courses as c  on e.courseID=c.courseID WHERE e.status = 1";
    private static final String SHOW_PENDINGEVENT = "Select e.*,c.name FROM Event as e\n" +
" join Courses as c  on e.courseID=c.courseID WHERE e.status = 0";
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
                    list.add(new EventDTO(rs.getInt("eventID"), rs.getString("eventName"), 
                            rs.getInt("courseID"), rs.getString("name"), rs.getFloat("discount"), 
                            rs.getString("daystart"), rs.getString("dayend"), rs.getString("image"), 
                            rs.getString("data"), rs.getBoolean("status")));
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
    public static ArrayList<EventDTO> getALlPendingEvent() throws SQLException {
        ArrayList<EventDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(SHOW_PENDINGEVENT);
                rs = ptm.executeQuery();

                while (rs.next()) {
                    list.add(new EventDTO(rs.getInt("eventID"), rs.getString("eventName"), 
                            rs.getInt("courseID"), rs.getString("name"), rs.getFloat("discount"), 
                            rs.getString("daystart"), rs.getString("dayend"), rs.getString("image"), 
                            rs.getString("data"), rs.getBoolean("status")));
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
                String sql = "SELECT eventID, eventName, courseID, discount, daystart, dayend, image, data, status  FROM Event WHERE eventID = " + id;              
                ptm = conn.prepareStatement(sql);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    return new EventDTO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getFloat(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getBoolean(9));
                  
                }
                
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e.getMessage());
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
        return null;
    }

    public void updateEvent(String name, String courseID, String discount, String daystart, String dayend, String image, String data,String eventID) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;        
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql= "UPDATE Event set eventName=  N'" + name + "', courseID=" + courseID + " , discount= "+discount+",daystart='" + daystart + "',dayend='" + dayend + "',"
                        + "image='" + image + "', data='" + data + "' where eventID="+eventID;
                ptm = conn.prepareStatement(sql);
                ptm.executeUpdate();
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e.getMessage());
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

    public void insertEvent(String eventName, String courseID, String discount, String daystart, String dayend, String image, String data, boolean status) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "INSERT INTO [dbo].[Event]\n"
                        + "           ([eventName]\n"
                        + "           ,[courseID]\n"
                        + "           ,[discount]\n"
                        + "           ,[daystart]\n"
                        + "           ,[dayend])\n"
                        + "           ,[image])\n"
                        + "           ,[data])\n"
                        + "           ,[status])\n"
                        + "     VALUES\n"
                        + "           (?\n"
                        + "           ,?\n"
                        + "           ,?\n"
                        + "           ,?\n"
                        + "           ,?\n"
                        + "           ,?\n"
                        + "           ,?\n"
                        + "           ,?)";
                ptm = conn.prepareStatement(sql);
                ptm.setString(1, eventName);
                ptm.setString(2, courseID);
                ptm.setString(3, discount);
                ptm.setString(4, daystart);
                ptm.setString(5, dayend);
                ptm.setString(6,image);
                ptm.setString(7, data);
                ptm.setBoolean(8, status);
                
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

    public List<CoursesDTO> getCourseName() throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        List<CoursesDTO> list = new ArrayList<>();
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT courseID, name FROM Courses WHERE status = 1";
                ptm = conn.prepareStatement(sql);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    list.add(new CoursesDTO(rs.getInt(1), rs.getString(2)));
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
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
    public boolean checkEventDuplicate(String eventName) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        boolean check = false;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String query = "SELECT name FROM Event\n"
                        + "WHERE name = '" + eventName + "'";
                ptm = conn.prepareStatement(query);
                rs = ptm.executeQuery();
                rs.next();
                String value = rs.getString(1);
                if (value != null || !value.isEmpty()) {
                    check = true;
                } else {
                    check = false;
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
   public EventDTO getEventDetail (String id) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT eventName, courseID, courseName, discount, daystart, dayend, image, data FROM Event WHERE EventID = "
                        + id + " AND status = 1";
                ptm = conn.prepareStatement(sql);
                rs = ptm.executeQuery();
                while (rs.next()) {                  
                    return new EventDTO(rs.getInt("eventID"), rs.getString("eventName"), rs.getInt("courseID"), 
                            rs.getString("courseName"), rs.getFloat("discount"), 
                            rs.getString("daystart"), rs.getString("dayend"), rs.getString("image"), 
                            rs.getString("data"), rs.getBoolean("status"));
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

        return null;
    }
   public static  ArrayList<EventDTO> getCusEvent() throws SQLException {
        ArrayList<EventDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT eventName, courseID, discount, daystart, dayend, image, data, status FROM Event";
                ptm = conn.prepareStatement(sql);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    String eventName = rs.getString("eventName");
                    int courseID = rs.getInt("courseID");
                    float discount = rs.getFloat("discount");
                    String daystart = rs.getString("daystart");
                    String dayend = rs.getString("dayend");
                    String image = rs.getString("image");
                    String data = rs.getString("data"); 
                    boolean status = rs.getBoolean("status");
                    list.add(new EventDTO(eventName,courseID, discount, daystart, dayend, image, data, status));                 
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
    public void softdeleteEvent(int EventID) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            String sql = "UPDATE Event SET status = 0 WHERE EventID = ?";
            ptm = conn.prepareStatement(sql);
            ptm.setInt(1, EventID);
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
    public static ArrayList<EventDTO> getsoftdeleteEvent() throws ClassNotFoundException, SQLException {
        ArrayList<EventDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement("SELECT * FROM Event WHERE status = 0");
                rs = ptm.executeQuery();

                while (rs.next()) {
                   String eventName = rs.getString("eventName");
                    int courseID = rs.getInt("courseID");
                    float discount = rs.getFloat("discount");
                    String daystart = rs.getString("daystart");
                    String dayend = rs.getString("dayend");
                    String image = rs.getString("image");
                    String data = rs.getString("data"); 
                    boolean status = rs.getBoolean("status");
                    list.add(new EventDTO(eventName, courseID, discount, daystart, dayend, image, data, status));
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
}
