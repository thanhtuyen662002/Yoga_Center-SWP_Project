/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.login;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.dao.UserDAO;
import model.dto.UserDTO;

/**
 *
 * @author HOANG ANH
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

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
        String phone = request.getParameter("txtPhone");
        String password = request.getParameter("txtPassword");
        UserDTO user = UserDAO.getUser(phone, password);
        
        String message = (String) request.getAttribute("message");
        request.setAttribute("ErrorMessage", message);
        try {
            if (user != null) {
                HttpSession session = request.getSession();
                session.setAttribute("USER", user);
                switch (user.getRoleID()) {
                    case "US":
                        request.setAttribute("phone", phone);
                        request.getRequestDispatcher("view.customer/home.jsp").forward(request, response);
                        break;
                    case "AD":
                        session.setAttribute("ROLE", "AD");
                        session.setAttribute("STAFF", user);
                        response.sendRedirect("listStaff");
                        break;
                    case "ST":
                        session.setAttribute("ROLE", "ST");
                        session.setAttribute("STAFF", user);
                        response.sendRedirect("courses");
                        break;
                    case "SV":
                        session.setAttribute("ROLE", "SV");
                        session.setAttribute("STAFF", user);
                        response.sendRedirect("courses");
                        break;
                    case "TC":
                        session.setAttribute("ROLE", "TC");
                        session.setAttribute("STAFF", user);
                        response.sendRedirect("showclass");
                        break;
                }
            } else {
                request.setAttribute("ErrorMessage", "Sai tài khoản hoặc mật khẩu!");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        } catch (Exception e) {
            log("Error at LoginController: " + e.toString());
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
        processRequest(request, response);
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
