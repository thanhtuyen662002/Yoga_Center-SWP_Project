/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.guest;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.GuestDAO;
import model.dto.GuestDTO;

/**
 *
 * @author HP Pro
 */
@WebServlet(name = "LoadGuestListServlet", urlPatterns = {"/loadGuest"})
public class LoadGuestListServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        try {
            GuestDAO dao = new GuestDAO();
        GuestDTO list = dao.getListGuestByID(id);
        request.setAttribute("g", list);
        request.getRequestDispatcher("insertGuest.jsp").forward(request, response);
        } catch (Exception e) {
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String fullName = new String(request.getParameter("fullName").getBytes("ISO-8859-1"),"UTF-8");
        String phone = request.getParameter("phone");
        String password = request.getParameter("password");
        String address = new String(request.getParameter("address").getBytes("ISO-8859-1"),"UTF-8");
        String gender = request.getParameter("gender");
        try {
            GuestDAO dao = new GuestDAO();
            boolean checkDuplicate = dao.checkDuplicate(phone);
            if (!checkDuplicate) {
                boolean checkInsertUser = dao.insertGuest(fullName, phone, password, address, gender);
                boolean checkInsertUserCourse = dao.insertUserCourse(phone);
                if (checkInsertUser && checkInsertUserCourse) {
                    dao.setStatus(phone);
                } else {
                    System.out.println("Thêm khách hàng thất bại!");
                }
            } else {
                System.out.println("Số điện thoại đã tồn tại!");
            }
        } catch (Exception e) {
        }
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
