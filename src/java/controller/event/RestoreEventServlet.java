package controller.event;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.EventDAO;

/**
 *
 * @author nguye
 */
@WebServlet(name = "RestoreEventServlet", urlPatterns = {"/restoreEvent"})
public class RestoreEventServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        EventDAO dao = new EventDAO();
        String id = request.getParameter("sid");
        String message = "";
        try {
            boolean checkRestore = dao.restoreEvent(id);
            if (checkRestore) {
                message = "Successful recovery!";
            } else {
                message = "Can't recovery!";
            }
        } catch (SQLException ex) {
            Logger.getLogger(RestoreEventServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.setAttribute("message", message);
        request.getRequestDispatcher("pendingevent").forward(request, response);
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
