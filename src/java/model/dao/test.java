/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.SQLException;
import java.util.List;
import model.dto.CoursesDTO;

/**
 *
 * @author HP Pro
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        List<CoursesDTO> c = CoursesDAO.getAllCourses();
        for (CoursesDTO coursesDTO : c) {
           System.out.println(coursesDTO); 
        }
        
    }
    
}
