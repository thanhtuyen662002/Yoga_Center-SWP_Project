/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.schedule;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Date;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;
import model.dao.ClassSlotDAO_Nhat;
import model.dao.ScheduleDAO_Nhat;
import model.dao.UserDAO_Nhat;
import model.dto.ClassSlotDTO_Nhat;
import model.dto.ScheduleDTO_Nhat;
import model.dto.UserDTO;
import utils.BaseAuthentication_Nhat;

/**
 *
 * @author dell
 */
public class listScheduleController_Nhat extends BaseAuthentication_Nhat {

    public ArrayList<LocalDate> getAllMonday() {
        int year = 2023; // Năm bạn muốn lấy các ngày đầu tiên và cuối cùng của tuần

        List<LocalDate> firstDaysOfWeek = new ArrayList<>();

        LocalDate date = LocalDate.of(year, 1, 1);

        // Lặp qua từng ngày trong năm
        while (date.getYear() == year) {
            DayOfWeek dayOfWeek = date.getDayOfWeek();
            // Kiểm tra nếu ngày đó là ngày đầu tiên của tuần
            if (dayOfWeek == DayOfWeek.MONDAY) {
                firstDaysOfWeek.add(date);
            }
            date = date.plusDays(1);
        }
        return (ArrayList<LocalDate>) firstDaysOfWeek;
    }

    public static LocalDate getMondayOfWeek(LocalDate now) {
        // Create a LocalDate object for the specific date
        LocalDate date = now;

        // Get the day of the week for the given date
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        // Calculate the number of days to subtract to get to Monday (assuming Monday is the first day of the week)
        int daysToSubtract = (dayOfWeek.getValue() - DayOfWeek.MONDAY.getValue() + 7) % 7;

        // Subtract the calculated number of days from the given date to get the Monday of the week
        LocalDate mondayOfWeek = date.minusDays(daysToSubtract);
        return mondayOfWeek;
    }

    public static LocalDate getSundayOfWeek(LocalDate now) {
        // Create a LocalDate object for the specific date
        LocalDate date = now;

        // Get the day of the week for the given date
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        // Calculate the number of days to subtract to get to Monday (assuming Monday is the first day of the week)
        int daysToSubtract = (DayOfWeek.SUNDAY.getValue() - dayOfWeek.getValue() + 7) % 7;

        // Subtract the calculated number of days from the given date to get the Monday of the week
        LocalDate sundayOfWeek = date.plusDays(daysToSubtract);
        return sundayOfWeek;
    }

    public static ArrayList<LocalDate> getWeek(LocalDate day) {
        ArrayList<LocalDate> week = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            week.add(day);
            day = day.plusDays(1);
        }
        return week;
    }

    @Override
    protected void processGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        UserDAO_Nhat uDao = new UserDAO_Nhat();
//        UserDTO user = uDao.getUserByID("0987654444");
//        //ST 0987654444 0913277862 US 0987658686 0987657766
//        request.getSession().setAttribute("user", user);
//        get current date

        LocalDate currentDate = LocalDate.now();
        if (request.getSession().getAttribute("insert") != null) {
            request.setAttribute("msg", (String) request.getSession().getAttribute("insert"));
            request.getSession().setAttribute("insert", null);
        }
        else if (request.getSession().getAttribute("update") != null) {
            request.setAttribute("msg", (String) request.getSession().getAttribute("update"));
            request.getSession().setAttribute("update", null);
        }
        else if (request.getSession().getAttribute("delete") != null) {
            request.setAttribute("msg", (String) request.getSession().getAttribute("delete"));
            request.getSession().setAttribute("delete", null);
        }
        else{
            request.setAttribute("msg", null);
        }
        getScheduleByDate(currentDate, request, response);
    }

    @Override
    protected void processPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String selectedDate = request.getParameter("currentDay");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate curentDate = LocalDate.parse(selectedDate, formatter);
        getScheduleByDate(curentDate, request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void getScheduleByDate(LocalDate currentDate, HttpServletRequest request, HttpServletResponse response) {
        try {
            UserDTO user = (UserDTO) request.getSession().getAttribute("USER");

            ScheduleDAO_Nhat sDao = new ScheduleDAO_Nhat();
            ClassSlotDAO_Nhat slotDao = new ClassSlotDAO_Nhat();

            //Find the day on monday of the week
            LocalDate mondayOfWeek = getMondayOfWeek(currentDate);
            LocalDate sundayOfWeek = getSundayOfWeek(currentDate);
            Date monday = Date.valueOf(mondayOfWeek);
            Date sunday = Date.valueOf(sundayOfWeek);

            //get all monday
            ArrayList<LocalDate> mondays = getAllMonday();

            ArrayList<LocalDate> week = getWeek(mondayOfWeek);

            //get all schedule by date
            List<ScheduleDTO_Nhat> listSchedule
                    = new ArrayList<>();
            if (user.getRoleID().equals("US")) {
                listSchedule = sDao.getAllCustomerSchedule(user.getPhone(), monday, sunday);
            } else if (user.getRoleID().equals("TC")) {
                listSchedule = sDao.getAllPTSchedule(user.getPhone(), monday, sunday);
            }
            ArrayList<ClassSlotDTO_Nhat> slots = slotDao.getAll();

            ArrayList<Date> sqlDates = new ArrayList<>();
            for (LocalDate localDate : week) {
                Date sqlDate = Date.valueOf(localDate);
                sqlDates.add(sqlDate);
            }

            Collections.sort(listSchedule, (ScheduleDTO_Nhat o1, ScheduleDTO_Nhat o2) -> o1.getDate().compareTo(o2.getDate()));
            request.setAttribute("slots", slots);
            request.setAttribute("mondays", mondays);
            request.setAttribute("currentMonday", mondayOfWeek);
            request.setAttribute("week", sqlDates);
            request.setAttribute("schedule", listSchedule);
            request.getRequestDispatcher("/scheduleView/listSchedule.jsp").forward(request, response);
        } catch (ServletException | IOException ex) {
            Logger.getLogger(listScheduleController_Nhat.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
//
//

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();

        ScheduleDAO_Nhat sDao = new ScheduleDAO_Nhat();
        ClassSlotDAO_Nhat slotDao = new ClassSlotDAO_Nhat();

        //Find the day on monday of the week
        LocalDate mondayOfWeek = getMondayOfWeek(currentDate);
        LocalDate sundayOfWeek = getSundayOfWeek(currentDate);
        Date monday = Date.valueOf(mondayOfWeek);
        Date sunday = Date.valueOf(sundayOfWeek);

        ArrayList<LocalDate> week = getWeek(mondayOfWeek);

        List<ScheduleDTO_Nhat> listSchedule = sDao.getAllPTSchedule("0111111111", monday, sunday);
        for (ScheduleDTO_Nhat scheduleDTO_Nhat : listSchedule) {
            System.out.println(scheduleDTO_Nhat.getClassStudy().getCourse().getName());
        }
    }
//get => chajy dau tien
//post => xu ly cac su kien cua thk client tac dong
}
