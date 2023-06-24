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
import java.util.ArrayList;
import model.dao.ScheduleDAO_Nhat;
import model.dao.UserDAO_Nhat;
import model.dto.ScheduleDTO_Nhat;
import model.dto.UserDTO;

/**
 *
 * @author dell
 */
public class ScheduleDetailsAdminContrller extends HttpServlet {

    String gender = "All";
    String status = "All";
    String textSearch = "";
    int page;
    final int recordsPerPage = 7;
    int classID;

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
            out.println("<title>Servlet ListStaffController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ListStaffController at " + request.getContextPath() + "</h1>");
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
        if (request.getParameter("classID") != null) {
            classID = Integer.parseInt(request.getParameter("classID"));
        }

        page = 1;
        UserDAO_Nhat uDao = new UserDAO_Nhat();

        //check current page of user
        if (request.getParameter("page") != null) {
            page = Integer.parseInt(
                    request.getParameter("page"));
        }

        ArrayList<UserDTO> listCustomer = uDao.
                getAllCustomer((page - 1) * recordsPerPage, recordsPerPage, classID,
                        gender, status, textSearch);
        int noOfRecords = uDao.getTotalRecords(classID, gender, status, textSearch);
        int noOfPages = (int) Math.ceil((double) noOfRecords
                / recordsPerPage);

        request.setAttribute("textSearch", textSearch);
        request.setAttribute("gender", gender);
        request.setAttribute("status", status);

        String insert = (String) request.getSession().getAttribute("insert");
        if (insert != null) {
            request.setAttribute("msg", "insert");
            request.getSession().setAttribute("insert", null);
        }

        String update = (String) request.getSession().getAttribute("update");
        if (update != null) {
            request.setAttribute("msg", "update");
            request.getSession().setAttribute("update", null);
        }

        request.setAttribute("noOfPages", noOfPages);
        request.setAttribute("currentPage", page);
        request.setAttribute("classID", classID);
        request.setAttribute("listCustomer", listCustomer);
        request.getRequestDispatcher("views/Admin_Nhat/ListCustomerClass.jsp").forward(request, response);
    }
////
//

//    public static void main(String[] args) {
//        UserDAO_Nhat uDao = new UserDAO_Nhat();
//        ArrayList<UserDTO> listCustomer = uDao.
//                getAllCustomer(0, 1, 2,
//                        "All", "All", "");
//        System.out.println(listCustomer.size());
//
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
        UserDAO_Nhat uDao = new UserDAO_Nhat();
        String action = request.getParameter("action");
        String phone;
        switch (action) {
            case "search":
                textSearch = request.getParameter("textSearch");
                gender = request.getParameter("gender");
                status = request.getParameter("status");
                doGet(request, response);
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
