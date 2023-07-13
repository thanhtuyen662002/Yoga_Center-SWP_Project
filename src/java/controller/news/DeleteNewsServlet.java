package controller.news;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.NewsDAO;

/**
 *
 * @author HOANG ANH
 */
@WebServlet(name = "DeleteNewsServlet", urlPatterns = {"/deleteNews"})
public class DeleteNewsServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    } 

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String message = "";
        try {
            String newsID = request.getParameter("newsID");
            NewsDAO dao = new NewsDAO();
            boolean checkDelete = dao.softDeleteNews(newsID);
            if (checkDelete) {
                message = "Delete news successfully!";
            } else {
                message = "Can't delete news!";
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DeleteNewsServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.setAttribute("message", message);
        request.getRequestDispatcher("news").forward(request, response);
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