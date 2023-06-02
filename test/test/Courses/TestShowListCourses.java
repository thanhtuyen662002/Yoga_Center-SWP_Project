/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.Courses;

import java.sql.SQLException;
import java.util.List;
import model.dao.CoursesDAO;
import model.dto.CoursesDTO;

/**
 *
 * @author HP Pro
 */
public class TestShowListCourses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        CoursesDAO dao = new CoursesDAO();
        List<CoursesDTO> List = dao.getAllCourses();
        for (CoursesDTO o : List){
            System.out.println(o);
        }
    }
    
}
