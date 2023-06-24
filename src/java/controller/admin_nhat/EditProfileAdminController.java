/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.admin_nhat;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.dao.UserDAO;
import model.dao.UserDAO_Nhat;
import model.dto.UserDTO;

/**
 *
 * @author dell
 */
public class EditProfileAdminController extends HttpServlet {

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
            out.println("<title>Servlet EditProfileAdminController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EditProfileAdminController at " + request.getContextPath() + "</h1>");
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

        HttpSession session = request.getSession();
        UserDTO user = (UserDTO) session.getAttribute("USER");

        request.setAttribute("account", user);
        request.getRequestDispatcher("/views/Admin_Nhat/EditProfile.jsp").forward(request, response);
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
        HttpSession session = request.getSession();
        UserDTO user = (UserDTO) session.getAttribute("USER");
        String oldPhone = user.getPhone();
        UserDAO_Nhat uDao = new UserDAO_Nhat();

        if (request.getParameter("oldPwd") != null && request.getParameter("oldPwd") != "") {
            UserDTO account = UserDAO.getUser(user.getPhone(), user.getPassword());
            if (account == null) {
                request.setAttribute("oldPwd", false);
            } else {
                user.setName(request.getParameter("fullName"));
                user.setPhone(request.getParameter("phone"));
                user.setAddress(request.getParameter("address"));
                user.setPassword(request.getParameter("newPwd"));
                request.setAttribute("isSuccess", true);
                uDao.update(user,oldPhone);
            }
        } else {
            user.setName(request.getParameter("fullName"));
            user.setPhone(request.getParameter("phone"));
            user.setAddress(request.getParameter("address"));
            request.setAttribute("isSuccess", true);
            uDao.update(user,oldPhone);
        }

        request.setAttribute("account", user);
        request.getRequestDispatcher("/views/Admin_Nhat/EditProfile.jsp").forward(request, response);
    }

    public static void main(String[] args) {
        String s = null;
        System.out.println(s.isEmpty());
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
