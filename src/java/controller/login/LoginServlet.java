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
        
//        try {
//            if (user != null) {
//                if (user.getRoleID().equals("AD")) {
//                    HttpSession session = request.getSession(true);
//                    if (session != null) {
//                        session.setAttribute("txtphone", user.getPhone());
//                        session.setAttribute("txtname", user.getName());
//                        session.setAttribute("user", user);
//                        request.getRequestDispatcher("home.jsp").forward(request, response);
//
//                    }
//                } else if (user.getRoleID().equals("ST")) {
//                    HttpSession session = request.getSession(true);
//                    if (session != null) {
//                        session.setAttribute("txtSTphone", user.getPhone());
//                        session.setAttribute("txtname", user.getName());
//                        session.setAttribute("user", user);
//                        request.getRequestDispatcher("homeStaff.jsp").forward(request, response);
//                    }
//                } else if (user.getRoleID().equals("US")) {
//                    HttpSession session = request.getSession(true);
//                    if (session != null) {
//                        session.setAttribute("txtphone", user.getPhone());
//                        session.setAttribute("txtname", user.getName());
//                        session.setAttribute("user", user);
//                        request.getRequestDispatcher("home.jsp").forward(request, response);
//
//                    }
//                }
//            } else {
//                request.setAttribute("message", "Login fail");
//                request.getRequestDispatcher("login.jsp").forward(request, response);
//
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
                
            try {
            String phone = request.getParameter("txtPhone");
        String password = request.getParameter("txtPassword");
        UserDTO user = UserDAO.getUser(phone, password);
        if (user != null) {
                    HttpSession session = request.getSession();
                    session.setAttribute("USER", user);
                    switch (user.getRoleID()) {
                        case "US":
                            request.getRequestDispatcher("home.jsp").forward(request, response);;
                            break;
                        case "AD":
                            session.setAttribute("ADMIN", user);
                            request.getRequestDispatcher("home.jsp").forward(request, response);;
                            break;
                        case "ST":
                            request.getRequestDispatcher("home.jsp").forward(request, response);;
                            break;
                    }
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
