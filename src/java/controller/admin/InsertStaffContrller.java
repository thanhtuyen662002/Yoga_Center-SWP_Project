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
import model.dao.UserDAO_Nhat;
import model.dto.UserDTO;
import utils.AdminAuthentication_Nhat;

/**
 *
 * @author dell
 */
public class InsertStaffContrller extends AdminAuthentication_Nhat {

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
            out.println("<title>Servlet InsertStaff</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet InsertStaff at " + request.getContextPath() + "</h1>");
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
        request.getRequestDispatcher("views/Admin_Nhat/InsertStaff.jsp").forward(request, response);
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
    protected void processPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        UserDAO_Nhat uDao = new UserDAO_Nhat();
        String phone = request.getParameter("phone");
        String pwd = request.getParameter("pws");
        String fullName = new String(request.getParameter("fullName").getBytes("ISO-8859-1"), "UTF-8");
        String address = new String(request.getParameter("address").getBytes("ISO-8859-1"), "UTF-8");
        String gender = new String(request.getParameter("gender").getBytes("ISO-8859-1"), "UTF-8");

        String msgError = "";

        int count = 0;
        boolean existPhone = uDao.isPhoneExist(phone);
        if (existPhone) {
            msgError += "Phone";
            count++;
        }
        if (msgError.length() >= 1) {
            msgError += " is Exist! Try again";
            
            request.setAttribute("phone", phone);
            request.setAttribute("pwd", pwd);
            request.setAttribute("fullName", fullName);
            request.setAttribute("address", address);
            request.setAttribute("gender", gender);
            
            request.setAttribute("msgError", msgError);
            request.getRequestDispatcher("views/Admin_Nhat/InsertStaff.jsp").forward(request, response);
        }else{
            UserDTO staff = new UserDTO(phone, pwd, fullName, address, gender, "ST", true);
            uDao.insert(staff);
            request.getSession().setAttribute("insert", "insert");
            response.sendRedirect("listStaff");
        }
    }

//    public static void main(String[] args) {
//        UserDAO_Nhat uDao = new UserDAO_Nhat();
//        uDao.insert(new UserDTO("4568746468", "1", "Long he", "hehe", "Male", "ST", true));
//    }
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
