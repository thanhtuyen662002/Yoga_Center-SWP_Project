<%-- 
    Document   : insertCourse
    Created on : 02-06-2023, 16:51:52
    Author     : HP Pro
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css"
            />
        <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
            crossorigin="anonymous"
            />
        <link rel="stylesheet" href="./css/updateInsertCourse.css" />
        <title>Update|Insert Course</title>
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
                    <span><a href="mainController?action=listSchedule">LỊCH DẠY</a></span>
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

        <!-- Body -->
        <div class="container">
            <div class="updateNews">
                <h1>CẬP NHẬT KHÓA HỌC</h1>
                <div class="update-box">
                    <form action="updateCourse" method="POST">
                        <div class="update-title">                      
                            <label for="title">ID</label>
                            <input type="text" name="ID" value="${c.courseID}" readonly=""/>                 
                        </div>
                        <div class="update-title">                      
                            <label for="title">TÊN</label>
                            <input type="text" name="name" value="${c.courseName}"/>                 
                        </div>
                        <div class="update-cate">                    
                            <label for="cate">GIÁ</label>
                            <input type="number" name="price" value="${c.price}"/>                       
                        </div>
                        <div class="update-image">                       
                            <label for="img">HÌNH ẢNH</label>
                            <input type="file" name="image" value="${c.courseImage}"/>                       
                        </div>
                        <div class="update-content">                       
                            <label for="">MÔ TẢ</label>
                            <input type="text" name="description" value="${c.description}"/>                     
                        </div>
                        <div class="update-btn">                                                  
                            <button type="submit">CẬP NHẬT</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <!--<script src="./js/ckeditor.js"></script>-->
        <script>
            CKEDITOR.replace("myTextarea");
        </script>
        <script src="./js/updateInsert.js"></script>
    </body>
</html>