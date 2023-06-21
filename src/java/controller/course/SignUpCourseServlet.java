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
import java.util.logging.Level;
import java.util.logging.Logger;
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

        } catch (Exception e) {
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String fullName = new String(request.getParameter("name").getBytes("ISO-8859-1"), "UTF-8");
        String phone = request.getParameter("phone");
        String address = new String(request.getParameter("address").getBytes("ISO-8859-1"), "UTF-8");
        String gender = new String(request.getParameter("gender").getBytes("ISO-8859-1"), "UTF-8");
        String course = new String(request.getParameter("id").getBytes("ISO-8859-1"), "UTF-8");
        String time = request.getParameter("time");
        String timeToCome = request.getParameter("timeToCome");
        String discount = request.getParameter("discount");

        String ID = request.getParameter("ID");
        String success = "Đăng ký thành công!";
        String error = "Đăng ký thất bại!";
        try {
            if (!ID.isEmpty() && !discount.isEmpty()) {
                boolean check;
                try {
                    check = saveSignUpToDatabase(fullName, phone, address, gender, course, time, timeToCome, discount);
                    if (check) {
                        request.setAttribute("id", course);
                        request.setAttribute("ID", ID);
                        request.setAttribute("Message", success);
                        request.getRequestDispatcher("courseCustomer").forward(request, response);
                    } else {
                        request.setAttribute("id", course);
                        request.setAttribute("ID", ID);
                        request.setAttribute("Message", error);
                        request.getRequestDispatcher("courseCustomer").forward(request, response);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(SignUpCourseServlet.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                boolean check;
                try {
                    check = saveSignUpToDatabase(fullName, phone, address, gender, course, time, timeToCome, discount);
                    if (check) {
                        request.setAttribute("id", course);
                        request.setAttribute("Message", success);
                        request.getRequestDispatcher("courseCustomer").forward(request, response);
                    } else {
                        request.setAttribute("id", course);
                        request.setAttribute("Message", error);
                        request.getRequestDispatcher("courseCustomer").forward(request, response);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(SignUpCourseServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (Exception e) {
        }
    }

    public boolean saveSignUpToDatabase(String fullName, String phone, String address, String gender, String course, String time, String timeToCome, String discount) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "INSERT INTO SignUp (fullName, phone, address, gender, courseID, slotID, timeToCome, discount)\n"
                        + "VALUES (N'" + fullName + "','" + phone + "',N'" + address + "','"
                        + gender + "'," + course + "," + time + ",'" + timeToCome + "','" + discount + "')";
                ptm = conn.prepareStatement(sql);
                int row = ptm.executeUpdate();
                if (row > 0) {
                    return true;
                }
            }
        } catch (Exception e) {
        } finally {
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
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
