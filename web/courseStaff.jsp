<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" />

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
        <link rel="stylesheet" href="./css/courseStaff.css">
        <title>Document</title>
    </head>
    <body>
        <div class="nav-background">
            <div class="container">
                <div class="nav">
                    <div class="nav-logo">
                        <a href="./home.html">YO<span>GA</span> </a>
                    </div>
                    <input type="checkbox" id="toggler">
                    <label for="toggler"><i class="fas fa-bars fa-2xl"></i></label>
                    <div class="nav-menu">
                        <ul class="nav-menu-list">
                            <li class="nav-menu-item">
                                <a class="nav-menu-link" href="mainController?action=club">CLB</a>
                            </li>
                            <li class="nav-menu-item">
                                <a class="nav-menu-link" href="mainController?action=courses">KHÓA HỌC</a>
                            </li>
                            <li class="nav-menu-item">
                                <a class="nav-menu-link" href="mainController?action=schedule">LỊCH HỌC</a>
                            </li>
                            <li class="nav-menu-item">
                                <a class="nav-menu-link" href="mainController?action=voucher">KHUYẾN MÃI</a>
                            </li>
                            <li class="nav-menu-item">
                                <a class="nav-menu-link" href="mainController?action=news">TIN TỨC</a>
                            </li>
                        </ul>
                        <button class="btn_contact">ĐĂNG NHẬP</button>
                    </div>
                </div>
            </div>
        </div>

        <div class="container">
            <div class="course-body">
                <div class="course-body-title">
                    <h1>CÁC KHÓA HỌC</h1>
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th scope="col">ID</th>
                                <th scope="col">TÊN</th>
                                <th scope="col">MÔ TẢ</th>
                                <th scope="col">GIÁ</th>
                                <th scope="col">HÌNH ẢNH</th>
                                <th scope="col">CẬP NHẬT</th>
                                <th scope="col">XÓA</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="p" items="${list}">
                                <tr>
                                    <td>${p.courseID}</td>
                                    <td>${p.courseName}</td>
                                    <td>${p.description}</td>
                                    <td>${p.price}</td>
                                    <td>${p.courseImage}</td>
                                    <td><a href="updateCourse?id=${p.courseID}">CẬP NHẬT</a></td>
                                    <td><a href="#" onclick="showMess(${p.courseID})">XÓA</a></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                    <a href="insertCourse.jsp">THÊM</a>
                </div>
            </div>
        </div>

    </body>
    <script src="./js/courses.js"></script>
</html>
