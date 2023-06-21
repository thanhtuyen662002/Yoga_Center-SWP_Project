package controller.event;


import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.EventDAO;
import model.dto.EventDTO;

/**
 *
 * @author nguye
 */
@WebServlet(name = "EventCustomer", urlPatterns = {"/eventCustomer"})
public class EventCustomer extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            EventDAO dao = new EventDAO();
            dao.checkDayStart();
            dao.checkDayEnd();
            ArrayList<EventDTO> list = EventDAO.getCusEvent();
            request.setAttribute("list", list);
            request.getRequestDispatcher("view.customer/coupon.jsp").forward(request, response);
        } catch (SQLException ex) {
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String id =request.getParameter("id");
            EventDAO dao = new EventDAO();
            EventDTO list = dao.getEventDetail(id);
            request.setAttribute("c", list);
            request.getRequestDispatcher("courseDetail.jsp").forward(request, response);
        } catch (SQLException ex) {
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}