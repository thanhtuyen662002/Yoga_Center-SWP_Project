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
import java.sql.SQLException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    static int totalWeek = 10;

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

        //-----------------------------------------
        LocalDate now = LocalDate.now();
        LocalDate nextDate = now.plusDays(1);
        request.setAttribute("minDate", nextDate);

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
        UserDTO user = (UserDTO) request.getSession().getAttribute("USER");
        String phonePT = user.getPhone();
        ScheduleDAO_Nhat scheDao = new ScheduleDAO_Nhat();
        int classId = Integer.parseInt(request.getParameter("class"));
        String roomId = request.getParameter("room");
        int slotId = Integer.parseInt(request.getParameter("slot"));
        Date startDate = Date.valueOf(request.getParameter("day"));

        //get the start date
        LocalDate startDay = startDate.toLocalDate();

        //determind the start of next week
        LocalDate nextMonday = startDay;
        if (startDay.getDayOfWeek() != DayOfWeek.MONDAY) {
            //find the next monday
            while (nextMonday.getDayOfWeek() != DayOfWeek.MONDAY) {
                nextMonday = nextMonday.plusDays(1);
            }
        } else {
            nextMonday = nextMonday.plusDays(7);
        }

        //get all the day study in week
        String[] weekDays = request.getParameterValues("weekDay");
        ArrayList<Date> studyDate = new ArrayList<>();

        for (String weekDay : weekDays) {
            response.getWriter().print(weekDay);
        }
        //add alll date study to list
        for (String weekDay : weekDays) {
            LocalDate firstDay = nextMonday;
            switch (weekDay) {
                case "Monday":
                    addStudyDate(studyDate, firstDay);
                    break;
                case "Tuesday":
                    firstDay = firstDay.plusDays(1);
                    addStudyDate(studyDate, firstDay);
                    break;
                case "Wednesday":
                    firstDay = firstDay.plusDays(2);
                    addStudyDate(studyDate, firstDay);
                    break;
                case "Thursday":
                    firstDay = firstDay.plusDays(3);
                    addStudyDate(studyDate, firstDay);
                    break;
                case "Friday":
                    firstDay = firstDay.plusDays(4);
                    addStudyDate(studyDate, firstDay);
                    break;
                case "Saturday":
                    firstDay = firstDay.plusDays(5);
                    addStudyDate(studyDate, firstDay);
                    break;
                case "Sunday":
                    firstDay = firstDay.plusDays(6);
                    addStudyDate(studyDate, firstDay);
                    break;
            }
        }

        //check if the schedule exist or not
        boolean isExist = scheDao.isScheduleExist(phonePT, studyDate, slotId);
        if (!isExist) {
            for (Date date : studyDate) {
                scheDao.insert(classId, phonePT, roomId, slotId, date);
            }
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

    private static void addStudyDate(ArrayList<Date> studyDate, LocalDate date) {
        for (int i = 0; i < totalWeek; i++) {
            studyDate.add(Date.valueOf(date));
            date = date.plusDays(7);
        }
    }

//    public static void main(String[] args) {
//        ScheduleDAO_Nhat scheDao = new ScheduleDAO_Nhat();
//
//        //get the start date
//        LocalDate startDay = LocalDate.now();
//
//        //determind the start of next week
//        LocalDate nextMonday = startDay;
//        if (startDay.getDayOfWeek() != DayOfWeek.MONDAY) {
//            //find the next monday
//            while (nextMonday.getDayOfWeek() != DayOfWeek.MONDAY) {
//                nextMonday = nextMonday.plusDays(1);
//            }
//        } else {
//            nextMonday = nextMonday.plusDays(7);
//        }
//
//        //get all the day study in week
//        String[] weekDays = new String[]{"Monday", "Tuesday"};
//        ArrayList<Date> studyDate = new ArrayList<>();
//
//        //add alll date study to list
//        for (String weekDay : weekDays) {
//            LocalDate firstDay = nextMonday;
//            switch (weekDay) {
//                case "Monday":
//                    addStudyDate(studyDate, firstDay);
//                    break;
//                case "Tuesday":
//                    firstDay = firstDay.plusDays(1);
//                    addStudyDate(studyDate, firstDay);
//                    break;
//                case "Wednesday":
//                    firstDay = firstDay.plusDays(2);
//                    addStudyDate(studyDate, firstDay);
//                    break;
//                case "Thursday":
//                    firstDay = firstDay.plusDays(3);
//                    addStudyDate(studyDate, firstDay);
//                    break;
//                case "Friday":
//                    firstDay = firstDay.plusDays(4);
//                    addStudyDate(studyDate, firstDay);
//                    break;
//                case "Saturday":
//                    firstDay = firstDay.plusDays(5);
//                    addStudyDate(studyDate, firstDay);
//                    break;
//                case "Sunday":
//                    firstDay = firstDay.plusDays(6);
//                    addStudyDate(studyDate, firstDay);
//                    break;
//            }
//        }
//
//        //check if the schedule exist or not
//        boolean isExist = scheDao.isScheduleExist("0987654444", studyDate, 3);
//        if (!isExist) {
//            System.out.println("oke");
//        } else {
//            System.out.println("not oke");
//        }
//
//    }
}
