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
import java.util.Date;
import java.util.List;
import javax.naming.NamingException;
import model.dto.CoursesDTO;
import model.dto.NewsDTO;
import model.dto.UserDTO;
import utils.DBUtils;

/**
 *
 * @author HOANG ANH
 */
public class NewsDAO {

    private static final String NEWS_LIST_ACTIVE_BY_ID = "SELECT [newsID],[stPhone],[title],[postDate],[status],[content],[image] FROM [Yoga Center].[dbo].[News] WHERE newsID = ? ORDER BY postDate DESC ";
    private static final String CHECK_DUPLICATE_NEWSID = "SELECT newsID from News WHERE newsID = ?";
    private static final String SHOW = "SELECT [newsID],[stPhone],[title],[postDate],[categoryID],[content],[image] FROM [Yoga_Center].[dbo].[News] WHERE [newsID] = '?' ORDER BY postDate DESC";

    public static ArrayList<NewsDTO> getAllNews() throws SQLException {
        ArrayList<NewsDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement("SELECT * FROM News WHERE status = 1");
                rs = ptm.executeQuery();

                while (rs.next()) {
                    int newsID = rs.getInt("newsID");
                    String stPhone = rs.getString("stPhone");
                    String title = rs.getString("title");
                    String date = rs.getString("postDate");
                    String content = rs.getString("content");
                    String image = rs.getString("image");
                    String data = rs.getString("data");
                    int categoryID = rs.getInt("categoryID");
                    boolean status = rs.getBoolean("status");
                    list.add(new NewsDTO(newsID, stPhone, title, date, image, data, content, categoryID, status));
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
    
//     public static void main(String[] args) throws NamingException, SQLException, ClassNotFoundException {
//        NewsDAO dao = new NewsDAO();
//        ArrayList<NewsDTO> List = dao.g;
//        for (NewsDTO o : List) {
//            System.out.println(o);
//        }
//    }

    public NewsDTO getNewsByID(String id) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT * FROM News WHERE newsID = " + id;
                ptm = conn.prepareStatement(sql);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    return new NewsDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7), rs.getInt(8), rs.getBoolean(9));
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

    public void deleteNews(String id) {
        String query = "delete from News\n"
                + "where newsID = ?";
        try {
            Connection conn = null;
            PreparedStatement ptm = null;
            ResultSet rs = null;
            conn = DBUtils.getConnection();
            ptm = conn.prepareStatement(query);
            ptm.setString(1, id);
            ptm.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void updateNews(String newsID, String title, String image, String content, String categoryID) {
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String query = "UPDATE News SET title= '" + title + "' ,image= '" + image + "', content='" + content + "' ,categoryID= " + categoryID + "WHERE newsID= " + newsID;
                ptm = conn.prepareStatement(query);
                ptm.executeUpdate();
            }
        } catch (Exception e) {
        }
    }

    public void insertNews(String stPhone, String title, String postDate, String image, String content, String categoryID) {
        Connection conn = null;
        PreparedStatement ptm = null;

        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String query = "INSERT INTO News(stPhone, title, postDate, image,content,categoryID)"
                        + "VALUES('" + stPhone + "','" + title + "','" + postDate + "','" + image + "','" + content + "','" + categoryID + "')";
                ptm = conn.prepareStatement(query);
                ptm.executeUpdate();
            }
        } catch (Exception e) {
        }
    }

    public boolean checkDuplicateNewsID(int newsID) throws SQLException {
        boolean result = false;
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                statement = conn.prepareStatement(CHECK_DUPLICATE_NEWSID);
                statement.setInt(1, newsID);
                rs = statement.executeQuery();
                if (rs.next()) {
                    result = true;
                }
            }
        } catch (Exception e) {
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (statement != null) {
                statement.close();
            };
            if (conn != null) {
                conn.close();
            };

        }
        return result;
    }

    public List<NewsDTO> getRandomRecommendNews(int currentnewsID) throws NamingException, SQLException, ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        List<NewsDTO> list = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT TOP 3 * FROM News WHERE newsID != ? ORDER BY NEWID()";
                ptm = conn.prepareStatement(sql);
                ptm.setInt(1, currentnewsID);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    int newsID = rs.getInt("newsID");
                    String phone = rs.getString("stPhone");
                    String title = rs.getString("title");
                    String date = rs.getString("postDate");
                    boolean status = rs.getBoolean("status");
                    String content = rs.getString("content");
                    String image = rs.getString("image");
                    int categoryID = rs.getInt("categoryID");
                    NewsDTO news = new NewsDTO(newsID, phone, title, date, image, content, categoryID, status);
                    if (list == null) {
                        list = new ArrayList<>();
                    }
                    list.add(news);
                }
            }
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

    public List<NewsDTO> getRalativeNews(int currentnewsID) throws NamingException, SQLException, ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        List<NewsDTO> list = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT TOP 4 n.*\n"
                        + "FROM [News] n\n"
                        + "JOIN (\n"
                        + "  SELECT [categoryID] FROM [News] WHERE [newsID] = ?\n"
                        + ") t ON n.[categoryID] = t.[categoryID]\n"
                        + "WHERE n.[status] = '1' AND n.[newsID] != ?\n"
                        + "ORDER BY NEWID()";
                ptm = conn.prepareStatement(sql);
                ptm.setInt(1, currentnewsID);
                ptm.setInt(2, currentnewsID);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    int newsID = rs.getInt("newsID");
                    String phone = rs.getString("stPhone");
                    String title = rs.getString("title");
                    String date = rs.getString("postDate");
                    boolean status = rs.getBoolean("status");
                    String content = rs.getString("content");
                    String image = rs.getString("image");
                    int categoryID = rs.getInt("categoryID");
                    NewsDTO news = new NewsDTO(newsID, phone, title, date, image, content, categoryID, status);
                    if (list == null) {
                        list = new ArrayList<>();
                    }
                    list.add(news);
                }
            }
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

 

    public NewsDTO getNews(int newsID) throws NamingException, SQLException, ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String query = "SELECT * FROM [News] WHERE [newsID] = " + newsID + " ORDER BY postDate DESC";
                ptm = conn.prepareStatement(query);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    return new NewsDTO(rs.getInt("newsID"), rs.getString("stPhone"), rs.getString("title"), rs.getString("postDate"), rs.getString("image"), rs.getString("content"), rs.getInt("categoryID"), rs.getBoolean("status"));

                }
            }
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

    public void softdeleteNews(int newsID) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            String sql = "UPDATE News SET status = 0 WHERE newsID = ?";
            ptm = conn.prepareStatement(sql);
            ptm.setInt(1, newsID);
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
    public static ArrayList<NewsDTO> getsoftdeleteNews() throws ClassNotFoundException, SQLException {
        ArrayList<NewsDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement("SELECT * FROM News WHERE status = 0");
                rs = ptm.executeQuery();

                while (rs.next()) {
                    int newsID = rs.getInt("newsID");
                    String stPhone = rs.getString("stPhone");
                    String title = rs.getString("title");
                    String date = rs.getString("postDate");
                    String content = rs.getString("content");
                    String image = rs.getString("image");
                    String data = rs.getString("data");
                    int categoryID = rs.getInt("categoryID");
                    boolean status = rs.getBoolean("status");

                    list.add(new NewsDTO(newsID, stPhone, title, date, image, data, content, categoryID, status));
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
    
    public void restoreNews(int newsID) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            String sql = "UPDATE News SET status = 1 WHERE newsID = ?";
            ptm = conn.prepareStatement(sql);
            ptm.setInt(1, newsID);
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
}
