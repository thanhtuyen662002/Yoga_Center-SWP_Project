/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.Courses;

import java.sql.SQLException;
import java.util.List;
import yogacenter.dao.CoursesDAO;
import yogacenter.dto.CoursesDTO;

/**
 *
 * @author HP Pro
 */
public class TestDeleteCourse {
    public static void main(String[] args) throws SQLException {
        CoursesDAO dao = new CoursesDAO();
        boolean List = dao.deleteCourses(6);
        if (List){
            System.out.println("Delete Success");
        }else {
            System.out.println("Can not delete");
        }
        }
    }

