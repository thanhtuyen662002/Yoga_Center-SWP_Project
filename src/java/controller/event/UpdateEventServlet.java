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
import model.dao.CoursesDAO;
import model.dao.EventDAO;
import model.dto.CoursesDTO;
import model.dto.EventDTO;
import org.apache.commons.io.IOUtils;
import utils.DBUtils;

/**
 *
 * @author HP Pro
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
            String name = request.getParameter("name");
            String courseID = request.getParameter("courseID");
            EventDAO dao = new EventDAO();
            EventDTO event = dao.getEventByName(name);
            List<CoursesDTO> list = CoursesDAO.getAllCourses();
            request.setAttribute(name, dao);
            request.setAttribute("courseID", courseID);
            request.setAttribute("list", list);
            request.setAttribute("e", event);
            request.getRequestDispatcher("updateEvent.jsp").forward(request, response);
        } catch (SQLException ex) {
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String eventName = new String(request.getParameter("EventName").getBytes("ISO-8859-1"), "UTF-8");
        String discount = request.getParameter("Discount");
        String courseID = request.getParameter("Course");
        String daystart = request.getParameter("daystart");
        String dayend = request.getParameter("dayend");
        String eventID = request.getParameter("id");
        String message = "";
        boolean checkDuplicate;
        boolean checkDuplicate2;
        try {
            //Kiểm tra tên khóa học đã có trong database hay chưa
            EventDAO dao = new EventDAO();
            checkDuplicate = dao.checkEventDuplicate(eventName);
            checkDuplicate2 = dao.checkEventDuplicate2(eventID, eventName);
            EventDTO event = dao.getEventByID(eventID);
            String rootEventName = event.getEventName();
            String dataRoot = event.getData();
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
                        String fileName = filePart.getSubmittedFileName();
                        InputStream fileContent = filePart.getInputStream();

                        InputStream content = fileContent;
                        byte[] imageBytes = IOUtils.toByteArray(content);
                        String data = Base64.getEncoder().encodeToString(imageBytes);
                        if (data == null || data.equals("")) {
                            data = dataRoot;
                            
                        }
                        
                        checkDuplicate = dao.checkDuplicateCourse(courseID);
                    if (checkDuplicate) {
                        checkDuplicate = dao.checkDayStart(daystart  + " 00:00:00", dayend + " 00:00:00", courseID);
                        if (checkDuplicate) {
                            message = "The time the input event has existed. Please try again!";
                            
                        } else {
                            checkDuplicate = dao.checkDayEnd(daystart  + " 00:00:00", dayend  + " 00:00:00", courseID);
                            if (checkDuplicate) {
                                message = "The time the input event has existed. Please try again!";
                            } else {
                                boolean check = updateInforToDatabase(eventID, eventName, courseID, discount, daystart, dayend, fileName, data);
                                if (check) {
                                    message = "Update event successfully!";
                                } else {
                                    message = "Can't update event!";
                                }
                            }
                        }
                    }else {
                        boolean check = updateInforToDatabase(eventID, eventName, courseID, discount, daystart, dayend, fileName, data);
                        if (check) {
                            message = "Update event " + eventName + " successfully!";
                        } else {
                            message = "Can't update event " + eventName + " !";
                        }
                    }
                    }
                } else {
                    message = "This event name " + rootEventName + " alredy exist! Please try with other name!";
                }

            }
        } catch (SQLException ex) {
            response.getWriter().println("ERROR: " + ex.getMessage());
        }
        request.setAttribute("message", message);
        request.getRequestDispatcher("event").forward(request, response);
    }

    public boolean updateInforToDatabase(String eventID, String eventName, String courseID, String discount, String daystart, String dayend, String image, String data) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "UPDATE Event set eventName=  N'" + eventName + "', courseID=" + courseID + " , discount= " + discount + ",daystart='" + daystart + "',dayend='" + dayend + "',"
                        + "image='" + image + "', data='" + data + "' where eventID=" + eventID;
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
