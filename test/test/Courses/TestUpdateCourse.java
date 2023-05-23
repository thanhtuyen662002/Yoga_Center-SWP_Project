/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.Courses;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import yogacenter.dao.CoursesDAO;
import yogacenter.dto.CoursesDTO;
import yogacenter.utils.DBUtils;

/**
 *
 * @author HP Pro
 */
public class TestUpdateCourse {
    private static final String UPDATE = "UPDATE Courses SET name='?', description='?', image='?', price=? WHERE courseID=?";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        CoursesDAO dao = new CoursesDAO();
        CoursesDTO courses = new CoursesDTO(7, "Tran Hoang Anh", "Test lai ne", "Test quai met quas", 100000);
        System.out.println("List: " + courses);
        boolean test = dao.updateCourses(courses);
        if (test){
            System.out.println("Update success");
        }else{
            System.out.println("Can not update");
        }
    }
 
}
