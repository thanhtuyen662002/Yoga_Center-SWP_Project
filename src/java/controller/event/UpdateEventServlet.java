/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.event;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.EventDAO;
import model.dto.EventDTO;

/**
 *
 * @author HP Pro
 */
@WebServlet(name = "UpdateEvent", urlPatterns = {"/updateEvent"})
public class UpdateEventServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
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
            EventDAO dao = new EventDAO();
            EventDTO event = dao.getEventByID(id);
            request.setAttribute("c", event);
            request.getRequestDispatcher("updateEvent.jsp").forward(request, response);
        } catch (SQLException ex) {
        }
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {    
            String id = request.getParameter("ID");
            String name = request.getParameter("name");
            String cID = request.getParameter("cID");
            String des = request.getParameter("description");
            String discount = request.getParameter("discount");
            String daystart = request.getParameter("daystart");
            EventDAO dao = new EventDAO();
            dao.updateEvent(id, name, cID, des, discount, daystart);
            response.sendRedirect("event");
        } catch (SQLException ex) {
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
