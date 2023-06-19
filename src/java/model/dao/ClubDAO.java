package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.dto.ClubDTO;
import utils.DBUtils;


public class ClubDAO {
    public static void main(String[] args) throws SQLException {
        ClubDAO dao = new ClubDAO();
        List<ClubDTO> rs = dao.getAllClub();
        for (ClubDTO r : rs) {
            System.out.println(r);
        }
    }
    
    public List<ClubDTO> getAllClub() throws SQLException{
        List<ClubDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null){
                String sql = "SELECT * FROM Club";
                ptm = conn.prepareStatement(sql);
                rs = ptm.executeQuery();
                while(rs.next()){
                    list.add(new ClubDTO(rs.getInt("clubID"), rs.getString("name"), rs.getString("district"), rs.getString("address"), 
                            rs.getString("hotline"), rs.getString("dataImage")));
                }
            }
        } catch (Exception e) {
        }
        return list;
    }
}
