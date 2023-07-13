package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.dto.UserDTO;
import utils.DBUtils;

public class ServiceDAO {

    Connection conn = null;
    PreparedStatement ptm = null;
    ResultSet rs = null;

    public static void main(String[] args) throws SQLException {
        ServiceDAO dao = new ServiceDAO();
        List<UserDTO> list = dao.getListServiceManager();
        for (UserDTO userDTO : list) {
            System.out.println(userDTO);
        }
    }
    
    public UserDTO getServiceManagerInfo(String phone) throws SQLException {
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT * FROM [User] WHERE role = 'SV' AND phone = '" + phone + "'";
                ptm = conn.prepareStatement(sql);
                rs = ptm.executeQuery();
                if (rs.next()) {
                    return new UserDTO(rs.getString("phone"), rs.getString("password").trim(), rs.getString("name"),
                            rs.getString("address"), rs.getString("gender").trim(), rs.getString("role"), rs.getBoolean("status"));
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
        } return null;
    }
    
    public List<UserDTO> getListServiceManager() throws SQLException{
        List<UserDTO> list = new ArrayList<>();
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT * FROM [User] WHERE role = 'SV'";
                ptm = conn.prepareStatement(sql);
                rs = ptm.executeQuery();
                while (rs.next()) {                    
                    list.add(new UserDTO(rs.getString("phone"), rs.getString("password").trim(), rs.getString("name"),
                            rs.getString("address"), rs.getString("gender").trim(), rs.getString("role"), rs.getBoolean("status")));
                }
            }
        } catch (Exception e) {
        } finally {
            if (rs != null){
                rs.close();
            }
            if (ptm != null){
                ptm.close();
            }
            if (conn != null){
                conn.close();
            }
        }
         return list;
    }
}
