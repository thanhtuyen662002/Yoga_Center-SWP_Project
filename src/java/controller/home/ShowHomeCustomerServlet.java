/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.home;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.CoursesDAO;
import model.dao.HomeCusDAO;
import model.dto.CoursesDTO;
import model.dto.HomeCusDTO;

@WebServlet(name = "ShowHomeCustomerServlet", urlPatterns = {"/homeCustomer"})
public class ShowHomeCustomerServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        HomeCusDAO dao = new HomeCusDAO();
        try {
            List<HomeCusDTO> list = dao.getMembershipStory();
            request.setAttribute("list", list);
            List<CoursesDTO> course = CoursesDAO.getAllCourses();
            request.setAttribute("course", course);
            List<HomeCusDTO> club = dao.getClub();
            request.setAttribute("club", club);
            List<HomeCusDTO> time = dao.getTimeToCome();
            request.setAttribute("time", time);
            request.getRequestDispatcher("view.customer/home.jsp").forward(request, response);
        } catch (Exception e) {
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ShowHomeCustomerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ShowHomeCustomerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
