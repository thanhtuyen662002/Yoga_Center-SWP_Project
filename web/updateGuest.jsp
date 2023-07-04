<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css"
            />
        <link rel="stylesheet" href="https://cdn.datatables.net/1.13.4/css/jquery.dataTables.min.css">
        <link rel="stylesheet" href="./css/updateGuest1.css" />
        <title>Update News</title>
    </head>
    <body>
        <c:if test="${empty sessionScope.STAFF}">
            <c:redirect url="login.jsp"></c:redirect>
        </c:if>
        <div class="wrapper d-flex align-items-stretch">
            <c:if test="${sessionScope.ROLE == 'ST'}">
                <c:import url="cashier_header.jsp"/>
            </c:if>

            <!-- Page Content  -->
            <div id="content">
                <div class="course-link">
                    <ul>
                        <li><a href="">Staff</a></li>
                        <li><a href="">Khóa Học</a></li>
                        <li><a href="" id="active">Chỉnh Sửa</a></li>

                    </ul>
                </div>
                <div class="course-title" >
                    <div class="text">WELCOME STAFF</div>
                    <div class="insert"><a type="submit" name="guest">BACK</a></div>
                </div>
                <div class="table-name">
                    <h1>CHỈNH SỬA THÔNG TIN KHÓA HỌC ĐĂNG KÝ</h1>
                </div>
                <%@ page import="model.dto.CoursesDTO" %>
                <%@ page import="java.util.List" %>
                <%@ page import="model.dao.GuestDAO" %>
                <% GuestDAO dao = new GuestDAO(); %>
                <% List<CoursesDTO> courses = dao.getCourseName(); %>
                <form action="updateguest?id=${list_guest.signupID}" method="Post" >
                    <div class="update-box">
                        <div class="update-title">
                            <label for="title">Tên Khách Hàng</label>
                            <input value="${list_guest.fullName}" type="text" name="fullName" />
                        </div>
                        <div class="update-title">
                            <label for="title">Số Điện Thoại</label>
                            <input value="${list_guest.phone}" type="text" name="phone" />
                        </div>
                        <div class="update-title">
                            <label for="title">Địa Chỉ</label>
                            <input value="${list_guest.address}" type="text" name="address" />
                        </div>
<!--                        <div class="update-title">
                            <label for="title">Giới Tinh</label>
                            <select>
                                <option name="gender" value="Male">Male</option>
                                <option name="gender" value="FeMale">FeMale</option>
                                <option name="gender" value="Other">Other</option>
                            </select>
                        </div>-->
                        <div class="update-title">
                            <label for="cate">Course Name</label>
                             <select name="courseID">
                                <% for (CoursesDTO course : courses) {%>
                                <option value="<%= course.getCourseID()%>"><%= course.getCourseName()%></option>
                                <% }%>
                            </select>
                        </div>
            </div>
                    <div class="table-btn">
                        <button type="submit">Update</button>
                    </div>
                </form>
            </div>
            <script>
                function previewImage(event) {
                    var reader = new FileReader();
                    reader.onload = function () {
                        var output = document.getElementById("preview");
                        output.src = reader.result;
                    };

                    var fileInput = event.target;
                    var files = fileInput.files;

                    if (files.length > 0) {
                        reader.readAsDataURL(files[0]);
                    } else {
                        // Nếu không có file được chọn, đặt lại ảnh về trạng thái ban đầu
                        var output = document.getElementById("preview");
                        output.src = "#";
                    }
                }
            </script>
            <script src="./courseNav/bootstrap.min.js"></script>
            <script src="./courseNav/jquery.min.js"></script>
            <script src="./courseNav/main.js"></script>
            <script src="./courseNav/popper.js"></script>
            <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
            <script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
            <script src="./ckeditor/ckeditor.js"></script>
            <script>
                CKEDITOR.replace("myTextarea");
            </script>
    </body>
</html>