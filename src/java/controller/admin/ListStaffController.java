/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.admin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import model.dao.UserDAO;
import model.dao.UserDAO_Nhat;
import model.dto.UserDTO;
import utils.AdminAuthentication_Nhat;

/**
 *
 * @author dell
 */
public class ListStaffController extends AdminAuthentication_Nhat {

    String gender = "All";
    String status = "All";
    String textSearch = "";
    int page;
    final int recordsPerPage = 2;

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
    protected void processGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        page = 1;
        UserDAO_Nhat uDao = new UserDAO_Nhat();

        //check current page of user
        if (request.getParameter("page") != null) {
            page = Integer.parseInt(
                    request.getParameter("page"));
        }

        ArrayList<UserDTO> listStaff = uDao.
                getAllStaff((page - 1) * recordsPerPage, recordsPerPage,
                        gender, status, textSearch);
        int noOfRecords = uDao.getTotalRecords(gender, status, textSearch);
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
        request.setAttribute("listStaff", listStaff);
        request.getRequestDispatcher("views/Admin_Nhat/ListStaff.jsp").forward(request, response);
    }
//

//    public static void main(String[] args) {
//        UserDAO_Nhat uDao = new UserDAO_Nhat();
//
//        ArrayList<UserDTO> listStaff = uDao.
//                getAllStaff(0, 2,
//                        "Male", "All", "");
//        System.out.println(listStaff.get(0).getPhone());
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
    protected void processPost(HttpServletRequest request, HttpServletResponse response)
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
            case "create":
                response.sendRedirect("insertStaff");
                break;
            case "deactive":
                phone = request.getParameter("phone");
                uDao.updateStatusUser(phone, false);
                doGet(request, response);
                break;
            case "active":
                phone = request.getParameter("phone");
                uDao.updateStatusUser(phone, true);
                doGet(request, response);
                break;
            case "delete":
                phone = request.getParameter("phone");
                uDao.delete(phone);
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
