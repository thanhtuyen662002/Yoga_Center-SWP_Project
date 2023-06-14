/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import model.dto.UserDTO;

/**
 *
 * @author dell
 */
public abstract class AdminAuthentication_Nhat extends HttpServlet{
    
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
        UserDTO user = (UserDTO) request.getSession().getAttribute("USER");
        if (user != null && user.getRoleID().equalsIgnoreCase("AD")) {
            processGet(request, response);
        } else {
            response.getWriter().print("Your are not Admin! Try again!");
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
        UserDTO user = (UserDTO) request.getSession().getAttribute("USER");
        if (user != null && user.getRoleID().equalsIgnoreCase("AD")) {
            processPost(request, response);
        } else {
            response.getWriter().print("Your are not Admin! Try again!");
        }
    }

    protected abstract void processGet(HttpServletRequest request, HttpServletResponse response);

    protected abstract void processPost(HttpServletRequest request, HttpServletResponse response);

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
