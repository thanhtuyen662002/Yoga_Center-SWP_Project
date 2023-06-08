/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.course;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.CoursesDAO;
import model.dto.CoursesDTO;

/**
 *
 * @author HP Pro
 */
@WebServlet(name = "UpdateCourseServlet", urlPatterns = {"/updateCourse"})
public class UpdateCourseServlet extends HttpServlet {

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
        try {
            String cname = request.getParameter("name");
            String cdescription = request.getParameter("description");
            String cimage = request.getParameter("image");
            String cprice = request.getParameter("price");
            CoursesDAO dao = new CoursesDAO();
            boolean check = dao.checkCourseDuplicate(cname);
            if (check) {
                dao.updateCourses(cname, cdescription, cimage, cprice);
                String success = "success";
                String smessage = "Update Success!";
                request.setAttribute("status", success);
                request.setAttribute("message", smessage);
                request.getRequestDispatcher("updateCourse.jsp").forward(request, response);
                response.sendRedirect("courses");
            } else {
                String danger = "danger";
                String dmessage = "Can't Update!";
                request.setAttribute("status", danger);
                request.setAttribute("mesage", dmessage);
                request.getRequestDispatcher("updateCourse.jsp").forward(request, response);
            }

        } catch (SQLException ex) {
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String id = request.getParameter("id");
            CoursesDAO dao = new CoursesDAO();
            CoursesDTO course = dao.getCourseByID(id);
            request.setAttribute("c", course);
            request.getRequestDispatcher("updateCourse.jsp").forward(request, response);
        } catch (SQLException ex) {
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}