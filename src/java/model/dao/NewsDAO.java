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
import model.dto.CoursesDTO;
import model.dto.NewsDTO;
import model.dto.UserDTO;
import utils.DBUtils;

/**
 *
 * @author HOANG ANH
 */
public class NewsDAO {

    private static final String SHOW = "SELECT [newsID],[stPhone],[title],[postDate],[categoryID],[content],[image] FROM [Yoga_Center].[dbo].[News] WHERE [newsID] = '?' ORDER BY postDate DESC";

    public static ArrayList<NewsDTO> getAllNews() throws SQLException {
        ArrayList<NewsDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement("SELECT * FROM News");
                rs = ptm.executeQuery();

                while (rs.next()) {
                    int newsID = rs.getInt("newsID");
                    String stPhone = rs.getString("stPhone");
                    String title = rs.getString("title");
                    String date = rs.getString("postDate");
                    String content = rs.getString("content");
                    String image = rs.getString("image");
                    int categoryID = rs.getInt("categoryID");

                    list.add(new NewsDTO(newsID, stPhone, title, date, image, content, categoryID));
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

    public NewsDTO getNewsByID(String id) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT * FROM News WHERE newsID = ?";
                ptm = conn.prepareStatement(sql);
                ptm.setString(1, id);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    return new NewsDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7));
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

}
