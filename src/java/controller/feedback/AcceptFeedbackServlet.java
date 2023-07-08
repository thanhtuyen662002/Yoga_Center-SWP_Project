/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.feedback;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.FeedbackDAO;

/**
 *
 * @author HOANG ANH
 */
@WebServlet(name = "AcceptFeedbackServlet", urlPatterns = {"/acceptfeedback"})
public class AcceptFeedbackServlet extends HttpServlet {

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
            out.println("<title>Servlet AcceptFeedbackServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AcceptFeedbackServlet at " + request.getContextPath() + "</h1>");
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
        String message = "";
        try {
            String cusPhone = request.getParameter("cusPhone");
            String status = request.getParameter("status");
            if (status.equals("deny")) {
                FeedbackDAO dao = new FeedbackDAO();
                boolean checkRestore = dao.denyFeedback(cusPhone);
                if (checkRestore) {
                    message = "Xóa đánh giá thành công!";
                } else {
                    message = "Xóa đánh giá thất bại!";
                }
            } else {
                FeedbackDAO dao = new FeedbackDAO();
                boolean checkRestore = dao.acceptFeedback(cusPhone);
                if (checkRestore) {
                    message = "Cập nhật đánh giá thành công!";
                } else {
                    message = "Cập nhật đánh giá thất bại!";
                }
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AcceptFeedbackServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

        request.setAttribute("ErrorMessage", message);
        request.getRequestDispatcher("pendingfeedback").forward(request, response);
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
        String message = "";
        try {
            String cusPhone = request.getParameter("cusPhone");
            String status = request.getParameter("status");
            if (status.equals("deny")) {
                FeedbackDAO dao = new FeedbackDAO();
                boolean checkRestore = dao.denyFeedback(cusPhone);
                if (checkRestore) {
                    message = "Xóa đánh giá thành công!";
                } else {
                    message = "Xóa đánh giá thất bại!";
                }
            } else {
                FeedbackDAO dao = new FeedbackDAO();
                boolean checkRestore = dao.acceptFeedback(cusPhone);
                if (checkRestore) {
                    message = "Cập nhật đánh giá thành công!";
                } else {
                    message = "Cập nhật đánh giá thất bại!";
                }
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AcceptFeedbackServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

        request.setAttribute("ErrorMessage", message);
        request.getRequestDispatcher("pendingfeedback.jsp").forward(request, response);
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
