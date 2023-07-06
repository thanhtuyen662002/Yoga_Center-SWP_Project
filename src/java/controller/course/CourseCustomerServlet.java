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
            String error = (String) request.getAttribute("ERROR");
            request.setAttribute("ERROR", error);
            
            String message = (String) request.getAttribute("Message");
            request.setAttribute("message", message);
            
            CoursesDAO dao = new CoursesDAO();
            EventDAO Edao = new EventDAO();
              
            String id = request.getParameter("id");
            String ID = request.getParameter("ID");
            
            CoursesDTO list = dao.getCourseDetail(id);
            request.setAttribute("c", list);
            
            EventDTO discount = Edao.getEventByID(ID);
            request.setAttribute("d", discount);
            
            CoursesDTO course = dao.getCourses(id);
            List<CoursesDTO> time = dao.getTime();
            List<CoursesDTO> timeToCome = dao.getTimeToCome();
            request.setAttribute("course", course);
            request.setAttribute("time", time);
            request.setAttribute("timeToCome", timeToCome);
            ArrayList<FeedbackDTO> feedbackList = FeedbackDAO.getAllFeedback();
            ArrayList<FeedbackDTO> filteredFeedbackList = new ArrayList<>();
            for (FeedbackDTO feedback : feedbackList) {
                if (feedback.isStatus()) {
                    filteredFeedbackList.add(feedback);
                }
            }
            request.setAttribute("feedbackList", filteredFeedbackList);
            request.getRequestDispatcher("view.customer/courseDetail.jsp").forward(request, response);
        } catch (SQLException ex) {
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
