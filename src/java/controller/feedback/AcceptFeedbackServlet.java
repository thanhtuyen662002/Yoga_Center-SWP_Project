package controller.feedback;

import java.io.IOException;
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


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

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
                    message = "Delete feedback succesfully!";
                } else {
                    message = "Can't delete feedback!";
                }
            } else {
                FeedbackDAO dao = new FeedbackDAO();
                boolean checkRestore = dao.acceptFeedback(cusPhone);
                if (checkRestore) {
                    message = "Update feedback successfully!";
                } else {
                    message = "Can't update feedback!";
                }
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AcceptFeedbackServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

        request.setAttribute("ErrorMessage", message);
        request.getRequestDispatcher("pendingfeedback").forward(request, response);
    }

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
                    message = "Delete feedback succesfully!";
                } else {
                    message = "Can't delete feedback!";
                }
            } else {
                FeedbackDAO dao = new FeedbackDAO();
                boolean checkRestore = dao.acceptFeedback(cusPhone);
                if (checkRestore) {
                    message = "Update feedback successfully!";
                } else {
                    message = "Can't update feedback!";
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
