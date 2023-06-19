package controller.course;


import model.dao.CoursesDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dto.CoursesDTO;

/**
 *
 * @author HP Pro
 */
@WebServlet(name = "CourseCustomerServlet", urlPatterns = {"/courseCustomer"})
public class CourseCustomerServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            ArrayList<CoursesDTO> list = CoursesDAO.getCusCourse();
            request.setAttribute("list", list);
            request.getRequestDispatcher("view.customer/courses.jsp").forward(request, response);
        } catch (SQLException ex) {
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String id =request.getParameter("id");
            CoursesDAO dao = new CoursesDAO();
            CoursesDTO list = dao.getCourseDetail(id);
            request.setAttribute("c", list);
            request.getRequestDispatcher("view.customer/courseDetail.jsp").forward(request, response);
        } catch (SQLException ex) {
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
