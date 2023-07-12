<%-- 
    Document   : Header_Admin
    Created on : Jun 21, 2023, 5:40:48 PM
    Author     : nhath
--%>

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
            rel="stylesheet"
            href="https://cdn.datatables.net/1.13.4/css/jquery.dataTables.min.css"
            />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/Header_Admin.css" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/staffDropdown.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/courseStaff.css" />
        <title>Header</title>
    </head>
    <body>
        <div class="wrapper d-flex align-items-stretch"> 
            <nav id="sidebar">
                <div
                    class="img bg-wrap text-center py-4"
                    style="background-image: url(${pageContext.request.contextPath}/images/bg_1.jpg)"
                    >
                    <div class="user-logo">
                        <div
                            class="img"
                            style="background-image: url(${pageContext.request.contextPath}/image/logo-yoga.jpg)"
                            ></div>
                        <h3>YOGA CENTER</h3>
                    </div>
                </div>
                <ul class="list-unstyled components mb-5">
                    <li >
                        <a href="editProfileAdmin"
                           ><span class="fa-solid fa-pen-to-square mr-3"></span> Edit
                            Profile</a
                        >
                    </li>
                    <li onmouseover="showDropdown('courses')" onmouseout="hideDropdown('courses')">
                        <a href="mainController?action=courses"><span class="fa-solid fa-book mr-3"></span> KHÓA HỌC</a>
                        <ul id="courses" class="dropdown">
                            <li><a href="insertCourse.jsp">Thêm khóa học</a></li>
                            <li><a href="getDelete">Khóa học đã xóa</a></li>
                        </ul>
                    </li>
                    <li onmouseover="showDropdown('event')" onmouseout="hideDropdown('event')">
                        <a href="mainController?action=event"><span class="fa-solid fa-tag mr-3"></span> KHUYẾN MÃI</a>
                        <ul id="event" class="dropdown">
                            <li><a href="insertEvent">Thêm khuyến mãi</a></li>
                            <li><a href="pendingevent">Khuyến mãi đã xóa</a></li>
                        </ul>
                    </li>
                    <li onmouseover="showDropdown('news')" onmouseout="hideDropdown('news')">
                        <a href="mainController?action=news"><span class="fa-solid fa-newspaper mr-3"></span> TIN TỨC</a>
                        <ul id="news" class="dropdown">
                            <li><a href="insertnews">Thêm tin tức</a></li>
                            <li><a href="pendingnews">Tin tức đã xóa</a></li>
                        </ul>
                    </li>
                    <li >
                        <a href="logout"><span class="fa fa-sign-out mr-3"></span> Logout</a>
                    </li>
                </ul>
            </nav>
    </body>
    <script src="${pageContext.request.contextPath}/js/staffDropdown.js"></script>
</html>

