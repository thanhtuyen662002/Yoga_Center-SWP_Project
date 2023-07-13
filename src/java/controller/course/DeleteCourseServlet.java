package controller.course;

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
import model.dao.CoursesDAO;

/**
 *
 * @author HP Pro
 */
@WebServlet(name = "DeleteCourseServlet", urlPatterns = {"/deleteCourse"})
public class DeleteCourseServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String name = request.getParameter("name");
            CoursesDAO dao = new CoursesDAO();
            boolean check = dao.checkDelete(name);
            if(!check){
                dao.deleteCourses(name);
                request.setAttribute("message", "Delete course " + name + " successfully!");
                request.getRequestDispatcher("courses").forward(request, response);
            } else {
                request.setAttribute("message", "Course name " + name + " still have students attending!");
                request.getRequestDispatcher("courses").forward(request, response);
            }
            
        } catch (SQLException ex) {
        }

    }
//tuyen
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(DeleteCourseServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
