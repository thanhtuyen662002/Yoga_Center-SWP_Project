/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.SQLException;
import model.dto.EventDTO;

/**
 *
 * @author HP Pro
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        EventDAO dao = new EventDAO();
        EventDTO e =   dao.getEventByID("1");
        System.out.println(e);
    }
    
}
