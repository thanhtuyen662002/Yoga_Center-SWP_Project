/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package yogacenter.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Date;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import yogacenter.dao.ClassSlotDAO_Nhat;
import yogacenter.dao.ScheduleDAO_Nhat;
import yogacenter.dto.ClassSlotDTO_Nhat;
import yogacenter.dto.ScheduleDTO_Nhat;

/**
 *
 * @author dell
 */
public class listScheduleController extends HttpServlet {

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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ScheduleDAO_Nhat sDao = new ScheduleDAO_Nhat();
        //get current date
        LocalDate currentDate = LocalDate.now();
        getScheduleByDate(currentDate, request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
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

            List<ScheduleDTO_Nhat> listSchedule
                    = sDao.getAllCustomerSchedule("C0001", monday, sunday);
            ArrayList<ClassSlotDTO_Nhat> slots = slotDao.getAll();

            ArrayList<Date> sqlDates = new ArrayList<>();
            for (LocalDate localDate : week) {
                Date sqlDate = Date.valueOf(localDate);
                sqlDates.add(sqlDate);
            }

            Collections.sort(listSchedule, new Comparator<ScheduleDTO_Nhat>() {
                @Override
                public int compare(ScheduleDTO_Nhat o1, ScheduleDTO_Nhat o2) {
                    return o1.getDate().compareTo(o2.getDate());
                }
            });

            request.setAttribute("slots", slots);
            request.setAttribute("mondays", mondays);
            request.setAttribute("currentMonday", mondayOfWeek);
            request.setAttribute("week", sqlDates);
            request.setAttribute("schedule", listSchedule);
            request.getRequestDispatcher("/scheduleView/listSchedule.jsp").forward(request, response);
        } catch (ServletException ex) {
            Logger.getLogger(listScheduleController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(listScheduleController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
//
//    public static void main(String[] args) {
//        LocalDate currentDate = LocalDate.now();
//        LocalDate mondayOfWeek = getMondayOfWeek(currentDate);
//        LocalDate sundayOfWeek = getSundayOfWeek(currentDate);
//        Date monday = Date.valueOf(mondayOfWeek);
//        Date sunday = Date.valueOf(sundayOfWeek);
//        ScheduleDAO_Nhat sDao = new ScheduleDAO_Nhat();
//        List< ScheduleDTO_Nhat> listSchedule
//                = sDao.getAllCustomerSchedule("C0001", monday, sunday);
//        for (ScheduleDTO_Nhat scheduleDTO_Nhat : listSchedule) {
//            System.out.println(scheduleDTO_Nhat.getId());
//        }
//    }
}
