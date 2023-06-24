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
import java.util.ArrayList;
import model.dao.ScheduleDAO_Nhat;
import model.dto.ScheduleDTO_Nhat;

/**
 *
 * @author dell
 */
public class ListScheduleClassController extends HttpServlet {

    int page = 1;
    final int recordsPerPage = 7;
    String textSearch = "";
    int slotID;
    Date day;

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

        //check current page of user
        if (request.getParameter("page") != null) {
            page = Integer.parseInt(
                    request.getParameter("page"));
        }

        if (request.getParameter("textSearch") != null) {
            textSearch = request.getParameter("textSearch");
        }

        slotID = Integer.parseInt(request.getParameter("slotID"));
        day = Date.valueOf(request.getParameter("day"));

        ScheduleDAO_Nhat sDao = new ScheduleDAO_Nhat();
        ArrayList<ScheduleDTO_Nhat> listSchedule = sDao.getScheduleBySlotAndDate((page - 1) * recordsPerPage, recordsPerPage, slotID, day, textSearch);

        int noOfRecords = sDao.getTotalScheduleBySlotAndDate(slotID, day, textSearch);
        int noOfPages = (int) Math.ceil((double) noOfRecords
                / recordsPerPage);

        request.setAttribute("noOfPages", noOfPages);
        request.setAttribute("currentPage", page);
        request.setAttribute("listSchedule", listSchedule);

        request.setAttribute("slotID", slotID);
        request.setAttribute("day", day);
        request.getRequestDispatcher("/views/Admin_Nhat/ScheduleListClass.jsp").forward(request, response);
    }

//    public static void main(String[] args) {
//        ScheduleDAO_Nhat sDao = new ScheduleDAO_Nhat();
//        ArrayList<ScheduleDTO_Nhat> listSchedule = sDao.getScheduleBySlotAndDate(0, 5, 1, Date.valueOf("2023-07-03"), "4444");
//        System.out.println(listSchedule.size());
//    }
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
        processRequest(request, response);
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
