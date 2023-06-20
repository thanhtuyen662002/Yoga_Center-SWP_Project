/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.event;


import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import model.dao.EventDAO;
import model.dto.EventDTO;
import org.apache.commons.io.IOUtils;
import utils.DBUtils;

/**
 *
 * @author nguye
 */
@WebServlet(name = "UpdateEventServlet", urlPatterns = {"/updateEvent"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2,
        maxFileSize = 1024 * 1024 * 10,
        maxRequestSize = 1024 * 1024 * 50)
public class UpdateEventServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String id = request.getParameter("id");
            EventDAO dao = new EventDAO();
            EventDTO event = dao.getEventByID(id);          
            request.setAttribute("e", event);
            request.getRequestDispatcher("updateEvent.jsp").forward(request, response);
        } catch (SQLException ex) {
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String id = request.getParameter("id");
        String ename = new String(request.getParameter("EventName").getBytes("ISO-8859-1"), "UTF-8");
        String eCourseName = new String(request.getParameter("Course").getBytes("ISO-8859-1"), "UTF-8");
        String ediscount = new String(request.getParameter("Discount").getBytes("ISO-8859-1"), "UTF-8");
        String edaystart = new String(request.getParameter("daystart").getBytes("ISO-8859-1"), "UTF-8");
        String edayend = new String(request.getParameter("dayend").getBytes("ISO-8859-1"), "UTF-8");

        try {
            
            EventDAO dao = new EventDAO();
            boolean checkDuplicate = dao.checkEventDuplicate(ename);
            boolean checkDuplicate2 = dao.checkEventDuplicate(ename);

            if (checkDuplicate) {
                if (checkDuplicate2) {
                    List<Part> fileParts = new ArrayList<>();
                    for (Part part : request.getParts()) {
                        String partName = new String(part.getName().getBytes("iso-8859-1"), "UTF-8");
                        if (partName.startsWith("image")) {
                            fileParts.add(part);
                        }
                    }

                    for (Part filePart : fileParts) {
                        String filename = filePart.getSubmittedFileName();                       
                        InputStream fileContent = filePart.getInputStream();

                        InputStream content = fileContent;
                        byte[] imageBytes = IOUtils.toByteArray(content);
                        String data = Base64.getEncoder().encodeToString(imageBytes);
                        dao.updateEvent(filename, eCourseName, ediscount, edaystart, edayend, ename, data, id);

                    }
                } else {
                    response.getWriter().println("Error: Event name already exists in Database!");
                    request.setAttribute("ErrorMessage", "Error: Event name already exists in Database!");
                    EventDTO list = dao.getEventByID(ename);
                    request.setAttribute("e", list);
                    request.getRequestDispatcher("updateEvent.jsp").forward(request, response);
                }

            } else {
                List<Part> fileParts = new ArrayList<>();
                for (Part part : request.getParts()) {
                    String partName = new String(part.getName().getBytes("iso-8859-1"), "UTF-8");
                    if (partName.startsWith("image")) {
                        fileParts.add(part);
                    }
                }

                for (Part filePart : fileParts) {
                    String fileName = filePart.getSubmittedFileName();
                    InputStream fileContent = filePart.getInputStream();

                    InputStream content = fileContent;
                    byte[] imageBytes = IOUtils.toByteArray(content);
                    String data = Base64.getEncoder().encodeToString(imageBytes);
//                    updateInforToDatabase(id,ename, eCourseName, ediscount, edaystart, edayend, fileName, data);
                    dao.updateEvent(fileName, eCourseName, ediscount, edaystart, edayend, fileName, data, id);
                }

            }
        } catch (SQLException ex) {
            response.getWriter().println("ERROR: " + ex.getMessage());
        }
        response.sendRedirect("event");
    }

  public void updateInforToDatabase(String id, String eventName, String CourseID, String discount, String daystart, String dayend, String image, String data) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql
                        = "UPDATE [dbo].[Event]\n"
                        + "   SET [eventName] = ?\n"
                        + "      ,[courseID] = ?\n"
                        + "      ,[discount] = ?\n"
                        + "      ,[daystart] = ?\n"
                        + "      ,[dayend] = ?\n"
                        + image + "', '" + data + "WHERE eventID = "+ id;                        
                ptm = conn.prepareStatement(sql);
                ptm.executeUpdate();
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
    }           

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}         