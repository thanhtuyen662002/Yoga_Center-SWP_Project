package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.dto.HomeCusDTO;
import utils.DBUtils;

public class HomeCusDAO {
    public List<HomeCusDTO> getMembershipStory() throws SQLException{
        List<HomeCusDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if(conn != null){
                String sql = "SELECT * FROM MembershipStory WHERE status = 1";
                ptm = conn.prepareStatement(sql);
                rs = ptm.executeQuery();
                while (rs.next()) {                    
                    list.add(new HomeCusDTO(rs.getString("phone"), rs.getString("image"), rs.getString("storyContent")));
                }
            }
        } catch (Exception e) {
        } finally {
            if(rs != null){
                rs.close();
            }
            if(ptm != null){
                ptm.close();
            }
            if(conn != null){
                conn.close();
            }
        }
        return list;
    } 
//    public static void main(String[] args) throws SQLException {
//        List<HomeCusDTO> List = HomeCusDAO.getMembershipStory();
//        for (HomeCusDTO o : List){
//            System.out.println(o);
//        }
//    }
//    
    public List<HomeCusDTO> getClub() throws SQLException{
        List<HomeCusDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if(conn != null){
                String sql = "SELECT clubID, name FROM Club status = 1";
                ptm = conn.prepareStatement(sql);
                rs = ptm.executeQuery();
                while (rs.next()) {                    
                    list.add(new HomeCusDTO(rs.getInt("clubID"), rs.getString("name")));
                }
            }
        } catch (Exception e) {
        } finally {
            if(rs != null){
                rs.close();
            }
            if(ptm != null){
                ptm.close();
            }
            if(conn != null){
                conn.close();
            }
        }
        return list;
    } 
    public List<HomeCusDTO> getVisitClub() throws SQLException{
        List<HomeCusDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if(conn != null){
                String sql = "SELECT * FROM VisitClub";
                ptm = conn.prepareStatement(sql);
                rs = ptm.executeQuery();
                while (rs.next()) {                    
                    list.add(new HomeCusDTO(rs.getInt("clubID"), rs.getString("fullName"), rs.getString("phone"), rs.getTime("timeToCome")));
                }
            }
        } catch (Exception e) {
        } finally {
            if(rs != null){
                rs.close();
            }
            if(ptm != null){
                ptm.close();
            }
            if(conn != null){
                conn.close();
            }
        }
        return list;
    } 
    public List<HomeCusDTO> getTimeToCome() throws SQLException{
        List<HomeCusDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if(conn != null){
                String sql = "SELECT * FROM TimeToCome";
                ptm = conn.prepareStatement(sql);
                rs = ptm.executeQuery();
                while (rs.next()) {                    
                    list.add(new HomeCusDTO(rs.getTime("timeToCome")));
                }
            }
        } catch (Exception e) {
        } finally {
            if(rs != null){
                rs.close();
            }
            if(ptm != null){
                ptm.close();
            }
            if(conn != null){
                conn.close();
            }
        }
        return list;
    } 
//    public static void main(String[] args) throws SQLException {
//        HomeCusDAO dao = new HomeCusDAO();
//        List<HomeCusDTO> rs = dao.getTimeToCome();
//        for (HomeCusDTO r : rs) {
//            System.out.println(r);
//        }
//    }
}
