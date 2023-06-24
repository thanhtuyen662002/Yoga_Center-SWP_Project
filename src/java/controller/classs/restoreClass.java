package controller.classs;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.ClassDAO;


@WebServlet(name = "restoreClass", urlPatterns = {"/restoreClass"})
public class restoreClass extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                String name =  request.getParameter("name");
        try {
            ClassDAO dao = new ClassDAO();
            boolean check = dao.restoreClass(name);
            if (check) {
                response.sendRedirect("showDeleteClass");
            }
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
