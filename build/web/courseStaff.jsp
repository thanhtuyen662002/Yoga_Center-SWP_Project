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
        <link rel="stylesheet" href="./css/updateInsertCourse.css">
        <title>Course Staff</title>
    </head>
    <body>
         <div class="header-nav logo widthLess" id="logo">
        <button class="header-button">
          <div class="header-button-li btn1"></div>
          <div class="header-button-li btn2"></div>
          <div class="header-button-li btn3"></div>
        </button>
        <h2 class="h2">RO<span>LE</span> STA<span>FF</span></h2>
      </div>
      <nav class="nav-content1 widthLess" id="nav">
            <ul class="nav-content-list">
                <li>
                    <i class="fa-solid fa-book"></i>
                    <span><a href="mainController?action=courses">KHÓA HỌC</a></span>
                </li>
                <li>
                    <i class="fa-solid fa-newspaper"></i>
                    <span><a href="mainController?action=news">TIN TỨC</a></span>
                </li>
            </ul>
            <ul class="nav-content-list">
                <li>
                    <i class="fa-solid fa-calendar-days"></i>
                    <span><a>LỊCH DẠY</a></span>
                </li>
                <li>
                    <i class="fa-solid fa-people-group"></i>
                    <span><a>KHÁCH HÀNG</a></span>
                </li>
                <li>
                    <i class="fa-sharp fa-solid fa-tag"></i>
                    <span><a href="mainController?action=event">SỰ KIỆN</a></span>
                </li>
                <li>
                    <i class="fa-solid fa-arrow-right-from-bracket"></i>
                    <span><a href="logout">ĐĂNG XUẤT</a></span>
                </li>
            </ul>
        </nav>

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
                    <a href="insertCourse.jsp" style="margin-left: 10rem">THÊM</a>
                </div>
            </div>
        </div>

    </body>
    <!--<script src="./js/updateInsert.js"></script>-->
    <script src="./js/courseStaff.js"></script>
</html>