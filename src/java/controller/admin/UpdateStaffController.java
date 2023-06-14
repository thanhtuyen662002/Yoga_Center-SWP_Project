/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
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
 * @author dell
 */
public class UpdateStaffController extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UpdateStaffController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdateStaffController at " + request.getContextPath() + "</h1>");
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
                UserDTO staff = uDao.getUserByID(phone);
                request.setAttribute("st", staff);
                request.getRequestDispatcher("views/Admin_Nhat/UpdateStaff.jsp").forward(request, response);
                break;
            case "update":
                phone = request.getParameter("phone");
                String uid = request.getParameter("uid");
                String fullName = request.getParameter("fullName");
                String address = request.getParameter("address");
                String gender = request.getParameter("gender");
                String status = request.getParameter("status");

                staff = new UserDTO(phone, "", uid, fullName, address, gender, "ST", Boolean.valueOf(status));
                uDao.update(staff);
                request.getSession().setAttribute("update", "update");
                response.sendRedirect("listStaff");
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
