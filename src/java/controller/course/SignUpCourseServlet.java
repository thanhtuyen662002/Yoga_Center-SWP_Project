/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.course;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.CoursesDAO;
import model.dto.CoursesDTO;
import utils.DBUtils;

/**
 *
 * @author HP Pro
 */
@WebServlet(name = "SignUpCourseServlet", urlPatterns = {"/signupCourse"})
public class SignUpCourseServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        CoursesDAO dao = new CoursesDAO();
        try {
            List<CoursesDTO> course = dao.getCourses();
            List<CoursesDTO> time = dao.getTime();
            List<CoursesDTO> timeToCome = dao.getTimeToCome();
            request.setAttribute("course", course);
            request.setAttribute("time", time);
            request.setAttribute("timeToCome", timeToCome);
            request.getRequestDispatcher("view.customer/signupCourse.jsp").forward(request, response);
        } catch (Exception e) {
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String fullName = new String(request.getParameter("name").getBytes("ISO-8859-1"), "UTF-8");
        String phone = request.getParameter("phone");
        String course = new String(request.getParameter("course").getBytes("ISO-8859-1"), "UTF-8");
        String time = request.getParameter("time");
        String timeToCome = request.getParameter("timeToCome");
        try {
            boolean check = saveSignUpToDatabase(fullName, phone, course, time, timeToCome);
            if (check){
                response.sendRedirect("courseCustomer");
            }
        } catch (Exception e) {
        }
    }

    
    public boolean saveSignUpToDatabase(String fullName, String phone, String course, String time, String timeToCome) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "INSERT INTO SignUp (fullName, phone, courseID, slotID, timeToCome)\n"
                        + "VALUES (N'" + fullName +"','" + phone + "'," + course + "," + time + ",'" + timeToCome + "')";
                ptm = conn.prepareStatement(sql);
                int row = ptm.executeUpdate();
                if (row > 0){
                    return true;
                }
            }
        } catch (Exception e) {
        } finally {
            if(ptm != null){
                ptm.close();
            }
            if(conn != null){
                conn.close();
            }
        }
        return false;
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
