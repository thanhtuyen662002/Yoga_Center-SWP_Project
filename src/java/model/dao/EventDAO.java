package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import model.dto.EventDTO;
import model.dto.CoursesDTO;
import utils.DBUtils;

public class EventDAO {

    private static final String SHOW = "Select e.*,c.name FROM Event as e\n"
            + " join Courses as c  on e.courseID=c.courseID WHERE e.flag = 1";
    private static final String SHOW_PENDINGEVENT = "Select e.*,c.name FROM Event as e\n"
            + " join Courses as c  on e.courseID=c.courseID WHERE e.flag = 0";
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

    public EventDTO getDiscountByID(String ID) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "Select e.*,c.name FROM Event as e\n"
                        + "join Courses as c  on e.courseID=c.courseID WHERE eventID =" + ID;
                ptm = conn.prepareStatement(sql);
                rs = ptm.executeQuery();

                while (rs.next()) {
                    return new EventDTO(rs.getInt("eventID"), rs.getString("eventName"),
                            rs.getInt("courseID"), rs.getString("name"), rs.getFloat("discount"),
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

    public void updateEvent(String name, String courseID, String discount, String daystart, String dayend, String image, String data, String eventID) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "UPDATE Event set eventName=  N'" + name + "', courseID=" + courseID + " , discount= " + discount + ",daystart='" + daystart + "',dayend='" + dayend + "',"
                        + "image='" + image + "', data='" + data + "' where eventID=" + eventID;
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
                ptm.setString(6, image);
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
                String query = "SELECT eventName FROM Event\n"
                        + "WHERE eventName = N'" + eventName + "'";
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

    public boolean checkDuplicateCourse(String courseID) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        boolean check = false;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String query = "SELECT * FROM Event WHERE CourseID = " + courseID;
                ptm = conn.prepareStatement(query);
                rs = ptm.executeQuery();

                if (rs.next()) {
                    check = true;
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

    public boolean checkDayStart(String daystart, String courseID) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        boolean check = false;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); // Specify the appropriate format
        LocalDateTime dayStart = LocalDateTime.parse(daystart, formatter);
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String query = "SELECT daystart, dayend FROM Event WHERE CourseID = ? and status = 1 and flag =1 ";
                ptm = conn.prepareStatement(query);
                ptm.setString(1, courseID);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    LocalDateTime mocdaystart = LocalDateTime.parse(rs.getString("daystart") + " 00:00:00", formatter);
                    LocalDateTime mocdayend = LocalDateTime.parse(rs.getString("dayend") + " 00:00:00", formatter);
                    if (dayStart.isBefore(mocdayend) && dayStart.isAfter(mocdaystart)) {
                        check = true;
                        break;
                    }
                }
            }
        } catch (Exception e) {
            // Handle exception
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
    public boolean checkDayEnd( String dayend, String courseID) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        boolean check = false;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); // Specify the appropriate format
        LocalDateTime dayEnd = LocalDateTime.parse(dayend, formatter);
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String query = "SELECT daystart, dayend FROM Event WHERE CourseID = ? and status = 1 and flag =1 ";
                ptm = conn.prepareStatement(query);
                ptm.setString(1, courseID);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    LocalDateTime mocdaystart = LocalDateTime.parse(rs.getString("daystart") + " 00:00:00", formatter);
                    LocalDateTime mocdayend = LocalDateTime.parse(rs.getString("dayend") + " 00:00:00", formatter);
                    if (dayEnd.isBefore(mocdayend) && dayEnd.isAfter(mocdaystart)) {
                        check = true;
                        break;
                    }
                }
            }
        } catch (Exception e) {
            // Handle exception
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

    public static void main(String[] args) throws SQLException {

    }

    public EventDTO getEventDetail(String id) throws SQLException {
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

    public static ArrayList<EventDTO> getCusEvent() throws SQLException {
        ArrayList<EventDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT E.eventID, E.eventName, E.courseID, C.name , E.discount, E.daystart, E.dayend, E.image, E.data, E.status FROM Event AS E\n"
                        + "JOIN Courses AS C ON C.courseID = E.courseID WHERE E.status = 1";
                ptm = conn.prepareStatement(sql);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    list.add(new EventDTO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getFloat(5), rs.getString(6),
                            rs.getString(7), rs.getString(8), rs.getString(9), rs.getBoolean(10)));
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

    public boolean softDeleteEvent(int EventID) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            String sql = "UPDATE Event SET flag = 0 , status = 0 WHERE EventID = ?";
            ptm = conn.prepareStatement(sql);
            ptm.setInt(1, EventID);
            int row = ptm.executeUpdate();
            if (row > 0) {
                return true;
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

    public boolean checkDayStart() throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        boolean check = false;
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = currentDateTime.format(dateFormat);
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {

                String sql = "UPDATE Event SET status = 1\n"
                        + "WHERE daystart = '" + formattedDate + "'";
                ptm = conn.prepareStatement(sql);
                int row = ptm.executeUpdate();
                if (row > 0) {
                    check = true;
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
        return check;
    }

    public boolean checkDayEnd() throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        boolean check = false;
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = currentDateTime.format(dateFormat);
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "UPDATE Event SET status = 0\n"
                        + "WHERE dayend = '" + formattedDate + "'";
                ptm = conn.prepareStatement(sql);
                int row = ptm.executeUpdate();
                if (row > 0) {
                    check = true;
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
        return check;
    }

    public EventDTO getEventByName(String name) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT * FROM Event WHERE eventname = N'" + name + "'";
                ptm = conn.prepareStatement(sql);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    return new EventDTO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getFloat(4),
                            rs.getString(5), rs.getString(6), rs.getString(7),
                            rs.getString(8), rs.getBoolean(9));
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

    public boolean checkEventDuplicate2(String id, String name) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        boolean check = false;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String query = "SELECT eventID FROM Event\n"
                        + "WHERE eventID = " + id + "AND eventName = N'" + name + "'";
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

    public boolean restoreEvent(String id) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "UPDATE Event SET status = 1, flag = 1\n"
                        + "WHERE eventID = " + id + "";
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

    public String getEventByCourseID(String courseID) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        String eventID = "";
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT eventID FROM Event WHERE status = 1 AND courseID = " + courseID;
                ptm = conn.prepareStatement(sql);
                rs = ptm.executeQuery();
                if (rs.next()) {
                    return eventID = Integer.toString(rs.getInt("eventID"));
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
        return eventID;
    }

    public int getDiscountByCourseID(String courseID) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        int discount = 0;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT discount FROM Event WHERE status = 1 AND flag = 1 AND courseID = " + courseID;
                ptm = conn.prepareStatement(sql);
                rs = ptm.executeQuery();
                if (rs.next()) {
                    discount = (int) rs.getFloat("discount");
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
        return discount;
    }

}
