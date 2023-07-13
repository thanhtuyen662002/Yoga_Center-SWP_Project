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
@WebServlet(name = "DeleteEventServlet", urlPatterns = {"/deleteEvent"})
public class DeleteEventServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    } 

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String message = "";
        try {
            int EventID = Integer.parseInt(request.getParameter("sid"));
            EventDAO dao = new EventDAO();           
            boolean checkDelete = dao.softDeleteEvent(EventID);
            if (checkDelete) {
                message = "Delete event successfully!";
            } else {
                message = "Can't delete event!";
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DeleteEventServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.setAttribute("message", message);
        request.getRequestDispatcher("event").forward(request, response);
    } 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
* @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}