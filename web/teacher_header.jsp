<%-- 
    Document   : staff_header
    Created on : 18-06-2023, 10:41:22
    Author     : HP Pro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./css/staffDropdown.css">
        <link rel="stylesheet" href="./css/courseStaff.css" />
        <title>JSP Page</title>
    </head>
    <body>
        
        <nav id="sidebar">
                <div class="custom-menu">
                    <button type="button" id="sidebarCollapse" class="btn btn-primary">
                    </button>
                </div>
                <div class="img bg-wrap text-center py-4" style="background-image: url(./image/bg_1.jpg);">
                    <div class="user-logo">
                        <div class="img" style="background-image: url(./image/logo-yoga.jpg);"></div>
                        <h3>YOGA CENTER</h3>
                    </div>
                </div>
                <ul class="list-unstyled components mb-5">
                    <li onmouseover="showDropdown('showclass')" onmouseout="hideDropdown('showclass')">
                        <a href="mainController?action=showclass"><span class="fa-solid fa-people-group mr-3"></span> LỚP HỌC</a>
                    </li> 
                    <li>
                        <a href="mainController?action=listSchedule"><span class="fa-solid fa-calendar-days mr-3"></span> LỊCH DẠY</a>
                    </li>
                    <li>
                        <a href="logout"><span class="fa fa-sign-out mr-3"></span> Đăng Xuất</a>
                    </li>
                </ul>

            </nav>
        
    </body>
    <script src="./js/staffDropdown.js"></script>
</html>
