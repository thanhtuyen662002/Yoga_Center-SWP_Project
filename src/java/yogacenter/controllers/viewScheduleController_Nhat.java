/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package yogacenter.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Date;
import java.util.ArrayList;
import yogacenter.dao.ClassDAO_Nhat;
import yogacenter.dao.ClassSlotDAO_Nhat;
import yogacenter.dao.RoomDAO_Nhat;
import yogacenter.dao.ScheduleDAO_Nhat;
import yogacenter.dao.UserDAO_Nhat;
import yogacenter.dto.ClassDTO_Nhat;
import yogacenter.dto.ClassSlotDTO_Nhat;
import yogacenter.dto.RoomDTO_Nhat;
import yogacenter.dto.ScheduleDTO_Nhat;
import yogacenter.dto.UserDTO_Nhat;

/**
 *
 * @author dell
 */
public class viewScheduleController_Nhat extends HttpServlet {

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
            out.println("<title>Servlet viewScheduleController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet viewScheduleController at " + request.getContextPath() + "</h1>");
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
        int id = Integer.parseInt(request.getParameter("id"));
        ScheduleDAO_Nhat sDao = new ScheduleDAO_Nhat();

        ClassDAO_Nhat cDao = new ClassDAO_Nhat();
        UserDAO_Nhat uDao = new UserDAO_Nhat();
        ClassSlotDAO_Nhat slotDao = new ClassSlotDAO_Nhat();
        RoomDAO_Nhat rDao = new RoomDAO_Nhat();

        ArrayList<ClassDTO_Nhat> listClass = cDao.getAll();
        ArrayList<UserDTO_Nhat> listPT = uDao.getAll();
        ArrayList<ClassSlotDTO_Nhat> listSlot = slotDao.getAll();
        ArrayList<RoomDTO_Nhat> listRoom = rDao.getAll();

        ScheduleDTO_Nhat schedule = sDao.getScheduleById(id);
        request.setAttribute("schedule", schedule);
        request.setAttribute("className", listClass);
        request.setAttribute("pt", listPT);
        request.setAttribute("room", listRoom);
        request.setAttribute("slot", listSlot);
        request.getRequestDispatcher("/scheduleView/scheduleDetails.jsp").forward(request, response);
    }

//    public static void main(String[] args) {
//        ClassDAO_Nhat cDao = new ClassDAO_Nhat();
//        UserDAO_Nhat uDao = new UserDAO_Nhat();
//        ClassSlotDAO_Nhat slotDao = new ClassSlotDAO_Nhat();
//        RoomDAO_Nhat rDao = new RoomDAO_Nhat();
//
//        ArrayList<ClassDTO_Nhat> listClass = cDao.getAll();
//        System.out.println(listClass.get(0).getId());
//    }
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
        String action = request.getParameter("action");
        int id = Integer.parseInt(request.getParameter("id"));

        ScheduleDAO_Nhat scheDao = new ScheduleDAO_Nhat();
        switch (action) {
            case "update":
                int classId = Integer.parseInt(request.getParameter("class"));
                String phonePT = request.getParameter("pt");
                String roomId = request.getParameter("room");
                int slotId = Integer.parseInt(request.getParameter("slot"));
                Date date = Date.valueOf(request.getParameter("day"));
                scheDao.update(id, classId, phonePT, roomId, slotId, date);
                response.sendRedirect("listSchedule");
                break;
            case "delete":
                scheDao.delete(id);
                response.sendRedirect("listSchedule");
                break;
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
