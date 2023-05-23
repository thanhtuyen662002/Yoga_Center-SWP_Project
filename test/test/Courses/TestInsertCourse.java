/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.Courses;

import java.sql.SQLException;
import yogacenter.dao.CoursesDAO;
import yogacenter.dto.CoursesDTO;

/**
 *
 * @author HP Pro
 */
public class TestInsertCourse {
    public static void main(String[] args) throws SQLException {
        CoursesDAO dao = new CoursesDAO();
        CoursesDTO courses =new CoursesDTO(10,"TestLai","ABD","ascs",10000);
        System.out.println(courses);
        boolean test = dao.insertCourses(courses);
        if (test){
            System.out.println("Insert Success");
        }else{
            System.out.println("Can not insert");
        }
    }
}
