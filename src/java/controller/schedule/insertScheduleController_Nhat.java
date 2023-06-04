/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.schedule;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Date;
import java.util.ArrayList;
import model.dao.ClassDAO_Nhat;
import model.dao.ClassSlotDAO_Nhat;
import model.dao.RoomDAO_Nhat;
import model.dao.ScheduleDAO_Nhat;
import model.dao.UserDAO_Nhat;
import model.dto.ClassDTO_Nhat;
import model.dto.ClassSlotDTO_Nhat;
import model.dto.RoomDTO_Nhat;
import model.dto.UserDTO;

/**
 *
 * @author dell
 */
public class insertScheduleController_Nhat extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet insertScheduleController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet insertScheduleController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ScheduleDAO_Nhat sDao = new ScheduleDAO_Nhat();

        ClassDAO_Nhat cDao = new ClassDAO_Nhat();
        UserDAO_Nhat uDao = new UserDAO_Nhat();
        ClassSlotDAO_Nhat slotDao = new ClassSlotDAO_Nhat();
        RoomDAO_Nhat rDao = new RoomDAO_Nhat();

        ArrayList<ClassDTO_Nhat> listClass = cDao.getAll();
        ArrayList<UserDTO> listCustomer = uDao.getAllCustomer();
        ArrayList<ClassSlotDTO_Nhat> listSlot = slotDao.getAll();
        ArrayList<RoomDTO_Nhat> listRoom = rDao.getAll();

        request.setAttribute("className", listClass);
        request.setAttribute("customer", listCustomer);
        request.setAttribute("room", listRoom);
        request.setAttribute("slot", listSlot);
        request.getRequestDispatcher("/scheduleView/insertSchedule.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        UserDTO user = (UserDTO) request.getSession().getAttribute("user");
        String phonePT = user.getPhone();
        ScheduleDAO_Nhat scheDao = new ScheduleDAO_Nhat();
        int classId = Integer.parseInt(request.getParameter("class"));
        String roomId = request.getParameter("room");
        int slotId = Integer.parseInt(request.getParameter("slot"));
        Date date = Date.valueOf(request.getParameter("day"));
        String customerId = request.getParameter("cusId");
        boolean isExist = scheDao.isScheduleExist(slotId, phonePT,date);
        if (!isExist) {
            scheDao.insert(classId, phonePT, roomId, slotId, date, customerId);
            request.getSession().setAttribute("error", false);
            response.sendRedirect("listSchedule");
        } else {
            request.getSession().setAttribute("error", true);
            doGet(request, response);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
