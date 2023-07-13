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

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

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
            String signupID = request.getParameter("id");
            String courseID = request.getParameter("courseID");
            String phone = request.getParameter("phone");
            String address = new String(request.getParameter("address").getBytes("ISO-8859-1"), "UTF-8");
            String fullName = new String(request.getParameter("fullName").getBytes("ISO-8859-1"), "UTF-8");
            String message = "";

            boolean check = updateSignup(signupID, courseID, phone, fullName, address);
            if (check) {
                message = "Update successfully!";
            } else {
                message = "Can't update!";
            }
            response.sendRedirect("guest?message=" + message);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateGuestServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    private boolean updateSignup(String signupID, String courseID, String phone, String fullName, String address) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String query = "UPDATE SignUp SET courseID = " + courseID + ",phone = '" + phone + "', fullName = N'" + fullName + "', address = N'" + address + "' WHERE signupID = " + signupID;
                ptm = conn.prepareStatement(query);
                int row = ptm.executeUpdate();
                if (row > 0) {
                    return true;
                }
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
        } return false;
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
