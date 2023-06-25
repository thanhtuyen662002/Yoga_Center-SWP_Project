/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.guest;

import controller.news.UpdateNewsServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.GuestDAO;
import model.dto.GuestDTO;
import utils.DBUtils;

/**
 *
 * @author HOANG ANH
 */
@WebServlet(name = "UpdateGuestServlet", urlPatterns = {"/updateguest"})
public class UpdateGuestServlet extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UpdateGuestServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdateGuestServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
//        processRequest(request, response);
        try {
            String signupID = request.getParameter("signupID");
            GuestDAO dao = new GuestDAO();
            GuestDTO guest = dao.getListGuestByID(signupID);
            if (guest == null) {
                response.sendRedirect(request.getContextPath() + "/error");
                return;
            }

            request.setAttribute("list_guest", guest);
            request.getRequestDispatcher("updateGuest.jsp").forward(request, response);
        } catch (Exception e) {
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
            //        processRequest(request, response);
            String signupID = request.getParameter("id");
            String courseID = request.getParameter("courseID");
            String phone = request.getParameter("phone");
            String address = new String(request.getParameter("address").getBytes("ISO-8859-1"), "UTF-8");
            String fullName = new String(request.getParameter("fullName").getBytes("ISO-8859-1"), "UTF-8");

            
            updateSignup(signupID, courseID, phone, fullName, address);
            response.sendRedirect("guest");
        } catch (SQLException ex) {
            Logger.getLogger(UpdateGuestServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    
    
    
    private void updateSignup(String signupID, String courseID, String phone, String fullName, String address) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String query = "UPDATE SignUp SET courseID = " + courseID +",phone = '"+ phone +"', fullName = N'"+ fullName +"', address = N'" + address +"' WHERE signupID = " + signupID;
                ptm = conn.prepareStatement(query);
                ptm.executeUpdate();
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateNewsServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateNewsServlet.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }
    
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
