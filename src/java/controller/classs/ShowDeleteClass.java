package controller.classs;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.ClassDAO;
import model.dto.ClassDTO;


@WebServlet(name = "ShowDeleteClass", urlPatterns = {"/showDeleteClass"})
public class ShowDeleteClass extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            ClassDAO dao = new ClassDAO();
            List<ClassDTO> list = dao.getListDeleteClass();
            request.setAttribute("list", list);
            request.getRequestDispatcher("deleteClassStaff.jsp").forward(request, response);
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
