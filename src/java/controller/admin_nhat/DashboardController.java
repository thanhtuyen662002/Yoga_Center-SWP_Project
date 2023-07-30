/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.admin_nhat;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Calendar;
import model.dao.BillDAO;
import model.dao.CourseDAO_Nhat;
import model.dao.CoursesDAO;
import model.dao.ScheduleDAO_Nhat;
import model.dto.CourseDTO_Nhat;

/**
 *
 * @author dell
 */
public class DashboardController extends HttpServlet {

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

        //calculate total bill in this month
        LocalDate currentDate = LocalDate.now();

        BillDAO bDao = new BillDAO();

        //get all total bill of year
        int currentYear = currentDate.getYear();
        double totalPriceYear = bDao.getTotalPriceYear(currentYear);
        request.setAttribute("totalPriceYear", totalPriceYear);

        // Get the current month
        int currentMonth = currentDate.getMonthValue();
        double totalPriceMonth = bDao.getTotalPrice(currentMonth);
        request.setAttribute("totalPriceMonth", totalPriceMonth);

        //get total cource is studied in  this month
        CoursesDAO cDao = new CoursesDAO();
        int totalCourseStudy = cDao.getTotalCourseStudyMonth(currentMonth);
        request.setAttribute("totalCourseStudy", totalCourseStudy);

        for (int i = 1; i <= 12; i++) {
            double price = bDao.getTotalPrice(i);
            request.setAttribute("month" + i, price);
        }

        //get total coure
        double totalCourse = cDao.getTotalCourse();
        request.setAttribute("totalCourse", totalCourse);

        //get total current student is studying this month
        ScheduleDAO_Nhat scDao = new ScheduleDAO_Nhat();
        int totalStudent = scDao.getStudentStudy(currentMonth);
        request.setAttribute("totalStudent", totalStudent);

        double totalCourseBill = cDao.getTotalCourseStudy();
        double bestCourse = cDao.getBestCourse();
        double percentBest = (bestCourse / totalCourseBill) * 100;
        double percentOther = 100 - percentBest;
        
        CourseDAO_Nhat cDao_Nhat = new CourseDAO_Nhat();
        CourseDTO_Nhat getBestCourse = cDao_Nhat.getBestCourse();

        request.setAttribute("bestCourse", getBestCourse);
        request.setAttribute("percentOther", percentOther);
        request.setAttribute("percentBest", percentBest);
        request.getRequestDispatcher("views/Admin_Nhat/DashBoard.jsp").forward(request, response);
    }
//
//    public static void main(String[] args) {
//        CoursesDAO cDao = new CoursesDAO();
//        double bestCourse = cDao.getBestCourse();
//        double totalCourseBill = cDao.getTotalCourseStudy();
//        double percentBest = (bestCourse / totalCourseBill) * 100;
//        double percentOther = 100 - percentBest;
//        System.out.println(percentBest);
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
        processRequest(request, response);
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
