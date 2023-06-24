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
                    <li onmouseover="showDropdown('courses')" onmouseout="hideDropdown('courses')">
                        <a href="mainController?action=courses"><span class="fa-solid fa-book mr-3"></span> KHÓA HỌC</a>
                        <ul id="courses" class="dropdown">
                            <li><a href="insertCourse.jsp">Thêm khóa học</a></li>
                            <li><a href="getDelete">Khóa học đã xóa</a></li>
                        </ul>
                    </li>
                    <li onmouseover="showDropdown('event')" onmouseout="hideDropdown('event')">
                        <a href="mainController?action=event"><span class="fa fa-gift mr-3"></span> KHUYẾN MÃI</a>
                        <ul id="event" class="dropdown">
                            <li><a href="insertEvent">Thêm khuyến mãi</a></li>
                            <li><a href="pendingevent">Khuyến mãi đã xóa</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="mainController?action=listSchedule"><span class="fa-solid fa-calendar-days mr-3"></span> LỊCH DẠY</a>
                    </li>
                    <li onmouseover="showDropdown('news')" onmouseout="hideDropdown('news')">
                        <a href="mainController?action=news"><span class="fa-solid fa-newspaper mr-3"></span> TIN TỨC</a>
                        <ul id="news" class="dropdown">
                            <li><a href="#">Thêm tin tức</a></li>
                            <li><a href="pendingnews">Tin tức đã xóa</a></li>
                        </ul>
                    </li> 
                    <li onmouseover="showDropdown('showclass')" onmouseout="hideDropdown('showclass')">
                        <a href="mainController?action=showclass"><span class="fa-solid fa-people-group mr-3"></span> LỚP HỌC</a>
                        <ul id="showclass" class="dropdown">
                            <li><a href="createClass">Tạo lớp học</a></li>
                            <li><a href="showDeleteClass">Lớp học đã xóa</a></li>
                        </ul>
                    </li> 
                    <li onmouseover="showDropdown('learner')" onmouseout="hideDropdown('learner')">
                        <a href="mainController?action=learner"><span class="fa-solid fa-people-group mr-3"></span> HỌC VIÊN</a>
                        <ul id="learner" class="dropdown">
                            <li><a href="insertGuest.jsp">Tạo tài khoản</a></li>
                            <li><a href="#">Học viên đã xóa</a></li>
                        </ul>
                    </li> 
                    <li onmouseover="showDropdown('guest')" onmouseout="hideDropdown('guest')">
                        <a href="mainController?action=guest"><span class="fa-solid fa-people-group mr-3"></span> KHÁCH HÀNG</a>
                        <ul id="guest" class="dropdown">
                            <li><a href="insertGuest.jsp">Tạo tài khoản</a></li>
                            <li><a href="#">Khách hàng đã xóa</a></li>
                        </ul>
                    </li> 
                    <li onmouseover="showDropdown('bill')" onmouseout="hideDropdown('bill')">
                        <a href="mainController?action=bill"><span class="fa-solid fa-people-group mr-3"></span> HÓA ĐƠN</a>
<!--                        <ul id="bill" class="dropdown">
                            <li><a href="#">Tạo tài khoản</a></li>
                            <li><a href="#">Khách hàng đã xóa</a></li>
                        </ul>-->
                    </li> 
                    <li>
                        <a href="logout"><span class="fa fa-sign-out mr-3"></span> Đăng Xuất</a>
                    </li>
                </ul>

            </nav>
        
    </body>
    <script src="./js/staffDropdown.js"></script>
</html>
