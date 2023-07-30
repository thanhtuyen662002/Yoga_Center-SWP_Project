package controller.course;

import model.dao.CoursesDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.EventDAO;
import model.dao.FeedbackDAO;
import model.dto.CoursesDTO;
import model.dto.EventDTO;
import model.dto.FeedbackDTO;

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
            String message = (String) request.getAttribute("Message");
            request.setAttribute("message", message);
            String phone = request.getParameter("phone");
            CoursesDAO dao = new CoursesDAO();
            List<CoursesDTO> listCoursesID = dao.getCourseIDByPhone(phone);
            request.setAttribute("coursesID", listCoursesID);

            EventDAO Edao = new EventDAO();
            String eventID = "";

            String id = request.getParameter("id");
            request.setAttribute("id", id);
            String ID = request.getParameter("ID");
            eventID = Edao.getEventByCourseID(id);
            if (eventID != null && ID == null) {
                request.setAttribute("d", Edao.getEventByID(eventID));
            } else {
                EventDTO discount = Edao.getEventByID(ID);
                request.setAttribute("d", discount);
            }
            CoursesDTO list = dao.getCourseDetail(id);
            int price = (int) list.getPrice();
            request.setAttribute("price", price);
            request.setAttribute("c", list);

            CoursesDTO course = dao.getCourses(id);
            request.setAttribute("course", course);
            List<FeedbackDTO> feedbackList = FeedbackDAO.getFeedbackByCourseID(id);
            request.setAttribute("feedbackList", feedbackList);
            request.getRequestDispatcher("view.customer/courseDetail.jsp").forward(request, response);
        } catch (SQLException | ClassNotFoundException ex) {
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
