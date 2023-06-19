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
import model.dao.UserDAO;
import model.dto.UserDTO;

/**
 *
 * @author HOANG ANH
 */
@WebServlet(name = "RegisterServlet", urlPatterns = {"/register"})
public class RegisterServlet extends HttpServlet {

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
        request.setCharacterEncoding("UTF-8");

        try {
            String phone = request.getParameter("phone").trim();
            String password = request.getParameter("password");
            String password_confirm = request.getParameter("password-confirm");
            String name = request.getParameter("name");
            String address = request.getParameter("address");
            String gender = request.getParameter("gender");

            String roleID = "US";
            UserDAO dao = new UserDAO();
            if (!password.equals(password_confirm)) {
                response.getWriter().println("Mật khẩu xác nhận không khớp.");
                return;
            } else {
                UserDTO check = dao.getUserByPhone(phone);
                if (check == null) {
                    dao.insert(phone, password, name, address, gender, roleID);
                    response.sendRedirect("login.jsp");
                } else {
                    request.setAttribute("ERROR", "Số điện thoại đã có người đăng ký");
                    request.setAttribute("PHONE", phone);
                }

            }

//            } else {
//                request.setAttribute("ERROR", "Số điện thoại đã có người đăng ký");
//                request.setAttribute("PHONE", phone);
//            }
        } catch (Exception e) {
            log("Error at RegisterServlet: " + e.toString());
        }
//        } finally {
//            request.getRequestDispatcher("login.jsp").forward(request, response);
//        }

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
