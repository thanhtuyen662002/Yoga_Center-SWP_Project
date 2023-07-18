/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.guest;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.BillDAO;
import model.dao.CoursesDAO;
import model.dao.GuestDAO;
import model.dto.CoursesDTO;
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
            String phoneSub = list.getPhone();
            String phone = phoneSub.substring(0, 4) + " " + phoneSub.substring(4, 7) + " " + phoneSub.substring(7);
            request.setAttribute("g", list);
            request.setAttribute("phone", phone);
            request.getRequestDispatcher("insertGuest.jsp").forward(request, response);
        } catch (Exception e) {
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String fullName = new String(request.getParameter("fullName").getBytes("ISO-8859-1"), "UTF-8");
        String phoneTrim = request.getParameter("phone");
        String phone = phoneTrim.replace(" ", "");
        String password = request.getParameter("password");
        String address = new String(request.getParameter("address").getBytes("ISO-8859-1"), "UTF-8");
        String gender = request.getParameter("gender");
        try {
            GuestDAO dao = new GuestDAO();
            BillDAO bdao = new BillDAO();
            boolean checkDuplicate = dao.checkDuplicate(phone);
            if (!checkDuplicate) {
                boolean checkInsertUser = dao.insertGuest(fullName, phone, password, address, gender);
                if (checkInsertUser) {
                    boolean checkInsertUserCourse = dao.insertUserCourse(phone);
                    if (checkInsertUserCourse) {
                        boolean checkSetStatus = dao.setStatus(phone);
                        if (checkSetStatus) {
                            boolean checkInsertInToBill = bdao.insertUserToBill(phone);
                            if (checkInsertInToBill) {
                                System.out.println("Thêm vào hóa đơn thành công!");
                                request.setAttribute("message", "Create account successfully!");
                                request.getRequestDispatcher("guest").forward(request, response);
                            } else {
                                System.out.println("Không thể thêm vào hóa đơn!");
                                request.getRequestDispatcher("guest").forward(request, response);
                            }
                        } else {
                            System.out.println("Không thể cập nhật status trong bảng UserCourse!");
                            request.getRequestDispatcher("guest").forward(request, response);
                        }
                    } else {
                        System.out.println("Không thể tìm thấy khóa học trong bảng SignUp!");
                        request.setAttribute("fullName", fullName);
                        request.setAttribute("phone", phoneTrim);
                        request.setAttribute("address", address);
                        request.setAttribute("gender", gender);
                        List<CoursesDTO> list = CoursesDAO.getAllCourses();
                        request.setAttribute("listC", list);
                        request.setAttribute("ErrorMessage", "Please choose a course!");
                        request.getRequestDispatcher("chooseCourse.jsp").forward(request, response);
                    }
                } else {
                    System.out.println("Thêm khách hàng thất bại!");
                    request.setAttribute("message", "Can't create account!");
                    request.getRequestDispatcher("guest").forward(request, response);
                }
            } else {
                String error = "This number phone " + phone + " alredy exist!";
                request.setAttribute("message", error);
                request.getRequestDispatcher("guest").forward(request, response);
            }
        } catch (Exception e) {
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
