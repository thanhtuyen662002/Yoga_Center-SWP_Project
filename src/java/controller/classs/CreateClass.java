package controller.classs;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.ClassDAO;
import model.dto.ClassDTO;

@WebServlet(name = "CreateClass", urlPatterns = {"/createClass"})
public class CreateClass extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            ClassDAO dao = new ClassDAO();
            List<ClassDTO> course = dao.getCourseName();
            List<ClassDTO> staff = dao.getStaff();

            request.setAttribute("course", course);
            request.setAttribute("staff", staff);
            request.getRequestDispatcher("createClass.jsp").forward(request, response);
        } catch (Exception e) {
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String className = new String(request.getParameter("className").getBytes("ISO-8859-1"), "UTF-8");
        String description = new String(request.getParameter("description").getBytes("ISO-8859-1"), "UTF-8");
        String ptPhone = request.getParameter("ptPhone");
        String capacity = request.getParameter("capacity");
        String courseID = request.getParameter("course");

        ClassDAO dao = new ClassDAO();
        String message = "";
        boolean check;
        int numberOfMonths;
        int totalSession;
        try {
            ClassDTO list = dao.getNumberOfMonths(courseID);
            numberOfMonths = list.getNumberOfMonths();
            if (numberOfMonths > 0) {
                totalSession = numberOfMonths * 8;
            } else {
                totalSession = 7;
            }
            check = dao.checkNameClass(className);
            if (check) {
                message = "Name of class alredy exist!";
            } else {
                check = dao.saveClassToDatabase(courseID, ptPhone, className, description, totalSession, capacity);
                if (check) {
                    message = "Insert class success!";

                } else {
                    message = "Can't insert class!";
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(CreateClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        response.sendRedirect("showclass?message=" + message);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
