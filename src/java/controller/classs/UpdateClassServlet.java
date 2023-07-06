package controller.classs;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.ClassDAO;
import model.dto.ClassDTO;
import utils.DBUtils;

@WebServlet(name = "UpdateClassServlet", urlPatterns = {"/updateClass"})
public class UpdateClassServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String ClassID = request.getParameter("classID");
            ClassDAO dao = new ClassDAO();
            List<ClassDTO> listC = dao.getListCourse();
            List<ClassDTO> listTC = dao.getStaff();
            ClassDTO cls = dao.getClassByClassID(ClassID);
            request.setAttribute("listCourse", listC);
            request.setAttribute("listTC", listTC);
            request.setAttribute("cls", cls);
            request.getRequestDispatcher("updateClass.jsp").forward(request, response);
        } catch (Exception e) {
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String message = "";
            String classID = request.getParameter("classID");
            String className = request.getParameter("className");
            String ptPhone = request.getParameter("PT");
            String courseID = request.getParameter("courseID");
            String description = new String(request.getParameter("description").getBytes("ISO-8859-1"), "UTF-8");
            String totalSession = request.getParameter("totalSession");
            String capacity = request.getParameter("capacity");
            
            boolean checkUpdateClass = updateClass(classID, className, ptPhone, courseID, description, totalSession, capacity);
            if (checkUpdateClass) {
                message = "Cập nhật lớp học thành công!";
                request.setAttribute("message", message);
                request.getRequestDispatcher("showclass").forward(request, response);
            } else {
                message = "Cập nhật lớp học thất bại!";
                request.setAttribute("message", message);
                request.getRequestDispatcher("showclass").forward(request, response);
            }
        } catch (Exception e) {
        }
    }

    public boolean updateClass(String classID, String className, String ptPhone, String courseID, String description, String totalSession, String capacity) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "UPDATE Class SET courseID = " + courseID + ", ptPhone = '" + ptPhone + "', name = '" + className + "', "
                        + "description = N'" + description + "', total_sessions = " + totalSession + ", capacity = " + capacity + "\n"
                        + "WHERE classID = '" + classID + "'";
                ptm = conn.prepareStatement(sql);
                int row = ptm.executeUpdate();
                if (row > 0) {
                    return true;
                }
            }
        } catch (Exception e) {
        } finally {
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return false;
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
