/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.admin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.UserDAO_Nhat;
import model.dto.UserDTO;

/**
 *
 * @author nhath
 */
public class UpdateServiceContrller extends HttpServlet {

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
            out.println("<title>Servlet UpdateServiceContrller</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdateServiceContrller at " + request.getContextPath() + "</h1>");
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
        processRequest(request, response);
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
        String action = request.getParameter("action");
        UserDAO_Nhat uDao = new UserDAO_Nhat();
        String phone;
        switch (action) {
            case "view":
                phone = request.getParameter("phone");
                UserDTO service = uDao.getUserByID(phone);
                request.setAttribute("sv", service);
                request.getRequestDispatcher("views/Admin_Nhat/UpdateService.jsp").forward(request, response);
                break;
            case "update":
                phone = request.getParameter("phone");
                String fullName = new String(request.getParameter("fullName").getBytes("ISO-8859-1"), "UTF-8");
                String address = new String(request.getParameter("address").getBytes("ISO-8859-1"), "UTF-8");
                String gender = request.getParameter("gender");
                String status = request.getParameter("status");

                service = new UserDTO(phone, "", fullName, address, gender, "SV", Boolean.valueOf(status));
                uDao.update(service);
                request.getSession().setAttribute("update", "update");
                response.sendRedirect("listService");
                break;
        }
    }

//    public static void main(String[] args) {
//        UserDAO_Nhat uDao = new UserDAO_Nhat();
//        UserDTO staff = new UserDTO("2342345221", "", "nono", "nono", "nono", "Male", "ST", Boolean.valueOf("true"));
//        uDao.update(staff);
//    }
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
