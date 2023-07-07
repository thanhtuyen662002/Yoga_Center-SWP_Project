/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.news;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.NewsDAO;
import model.dto.NewsDTO;

/**
 *
 * @author HP Pro
 */
@WebServlet("/news")
public class NewsStaffServlet extends HttpServlet {

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
//        processRequest(request, response);

        try {
            String message = (String) request.getAttribute("message");
            request.setAttribute("ErrorMessage", message);
            ArrayList<NewsDTO> list = NewsDAO.getAllNews();
            request.setAttribute("list_news", list);
            request.getRequestDispatcher("newsStaff.jsp").forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(NewsStaffServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String message = (String) request.getAttribute("message");
            request.setAttribute("ErrorMessage", message);
            ArrayList<NewsDTO> list = NewsDAO.getAllNews();
            request.setAttribute("list_news", list);
            request.getRequestDispatcher("newsStaff.jsp").forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(NewsStaffServlet.class.getName()).log(Level.SEVERE, null, ex);
        }                               
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}