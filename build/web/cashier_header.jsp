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
                    <div class="img" style="background-image: url(./image/newlogo.png);"></div>
                    <h3>YOGA CENTER</h3>
                </div>
            </div>
            <ul class=" components mb-5">
                <li >
                    <a href="editprofilecus?phone=${sessionScope.USER.phone}"
                       ><span class="fa-solid fa-pen-to-square mr-3"></span> Edit
                        Profile</a
                    >
                </li>
                <li onmouseover="showDropdown('courses')" onmouseout="hideDropdown('courses')" class="">
                    <a href="mainController?action=courses"><span class="fa-solid fa-book mr-3"></span> KHÓA HỌC</a>
                </li>
                <li onmouseover="showDropdown('event')" onmouseout="hideDropdown('event')" class="">
                    <a href="mainController?action=event"><span class="fa fa-gift mr-3"></span> KHUYẾN MÃI</a>   
                </li>
                <li onmouseover="showDropdown('showclass')" onmouseout="hideDropdown('showclass')" class="">
                    <a href="mainController?action=showclass"><span class="fa-solid fa-people-group mr-3"></span> LỚP HỌC</a>
                </li> 
                <!--                <li>
                                    <a href="mainController?action=listSchedule"><span class="fa-solid fa-calendar-days mr-3" ></span> LỊCH DẠY</a>
                                </li>-->
                <li onmouseover="showDropdown('learner')" onmouseout="hideDropdown('learner')" class="">
                    <a href="mainController?action=learner"><span class="fa-solid fa-user-graduate mr-3"></span> HỌC VIÊN</a>
                </li> 
                <li onmouseover="showDropdown('guest')" onmouseout="hideDropdown('guest')" class="">
                    <a href="mainController?action=guest"><span class="fa-solid fa-user-group mr-3"></span> KHÁCH HÀNG</a>
                    <ul id="guest" class="dropdown">
                        <li><a href="insertGuest.jsp" class="">Tạo tài khoản</a></li>
                    </ul>
                </li>
                <li onmouseover="showDropdown('feedback')" onmouseout="hideDropdown('feedback')">
                    <a href="mainController?action=feedback"><span class="fa-solid fa-comments mr-3"></span> ĐÁNH GIÁ KHÓA HỌC</a>
                    <ul id="feedback" class="dropdown">
                        <li><a href="pendingfeedback">Đánh giá đang chờ</a></li>
                    </ul>
                </li>
                <li>
                    <a href="logout"><span class="fa fa-sign-out mr-3"></span> Đăng Xuất</a>
                </li>
            </ul>

        </nav>

    </body>
    <script src="./js/staffDropdown.js"></script>

</html>
