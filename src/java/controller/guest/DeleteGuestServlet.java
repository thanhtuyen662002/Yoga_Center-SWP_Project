/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.guest;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.GuestDAO;

/**
 *
 * @author HP Pro
 */
@WebServlet(name = "DeleteGuestServlet", urlPatterns = {"/deleteGuest"})
public class DeleteGuestServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String message = "";
            String id = request.getParameter("id");
            GuestDAO dao = new GuestDAO();
            boolean check = dao.deleteGuest(id);
            if (check) {
                message = "Xóa khách hàng thành công!";
            } else {
                message = "Không thể xóa khách hàng";
            }
            request.setAttribute("message", message);
            request.getRequestDispatcher("guest").forward(request, response);
        } catch (Exception e) {
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
