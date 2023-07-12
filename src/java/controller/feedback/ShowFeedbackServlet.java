package controller.feedback;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.CoursesDAO;
import model.dao.EventDAO;
import model.dao.FeedbackDAO;
import model.dto.CoursesDTO;
import model.dto.EventDTO;
import model.dto.FeedbackDTO;

@WebServlet(name = "ShowFeedbackServlet", urlPatterns = {"/showFeedback"})
public class ShowFeedbackServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String message = request.getParameter("Message");
            if (message != null) {
                request.setAttribute("Message", message);
            }
            

            CoursesDAO dao = new CoursesDAO();
            EventDAO Edao = new EventDAO();
            String eventID = "";

            String id = request.getParameter("id");
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
            List<CoursesDTO> time = dao.getTime();
            List<CoursesDTO> timeToCome = dao.getTimeToCome();
            request.setAttribute("course", course);
            request.setAttribute("time", time);
            request.setAttribute("timeToCome", timeToCome);
            List<FeedbackDTO> feedbackList = FeedbackDAO.getFeedbackByCourseID(id);
            request.setAttribute("feedbackList", feedbackList);
            request.getRequestDispatcher("view.customer/courseDetail.jsp").forward(request, response);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ShowFeedbackServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String message = (String) request.getAttribute("Message");
            if (message != null) {
                request.setAttribute("Message", message);
            }
           

            CoursesDAO dao = new CoursesDAO();
            EventDAO Edao = new EventDAO();
            String eventID = "";

            String id = request.getParameter("id");
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
            List<CoursesDTO> time = dao.getTime();
            List<CoursesDTO> timeToCome = dao.getTimeToCome();
            request.setAttribute("course", course);
            request.setAttribute("time", time);
            request.setAttribute("timeToCome", timeToCome);
            List<FeedbackDTO> feedbackList = FeedbackDAO.getFeedbackByCourseID(id);
            request.setAttribute("feedbackList", feedbackList);
            request.getRequestDispatcher("view.customer/courseDetail.jsp").forward(request, response);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ShowFeedbackServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
