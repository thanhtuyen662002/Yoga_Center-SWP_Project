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
                            style="background-image: url(${pageContext.request.contextPath}/image/newlogo.png)"
                            ></div>
                        <h3>YOGA CENTER</h3>
                    </div>
                </div>
                <ul class="list-unstyled components mb-5">
                    <li >
                        <a href="dashBoard"
                           ><span class="fa-solid fa-chart-line mr-3"></span>Dashboard
                        </a>
                    </li>

                    <li >
                        <a href="editProfileAdmin"
                           ><span class="fa-solid fa-pen-to-square mr-3"></span> Edit
                            Profile</a
                        >
                    </li>

<!--                    <li >
                        <a href="listStaff"
                           ><span class="fa-solid fa-person fa-xl mr-3"></span>Staff</a
                        >
                    </li>
                    <li>
                        <a href="listTeacher">
                            <span class="fa-solid fa-person fa-xl mr-3"></span>Teacher</a>
                    </li>
                    <li>
                        <a href="showListServiceManager">
                            <span class="fa-solid fa-person fa-xl mr-3"></span>Service Manager</a>
                    </li>
                    <li >
                        <a href="listService"
                           ><span class="fa-solid fa-person fa-xl mr-3"></span> Service</a
                        >
                    </li>-->
                    <li onmouseover="showDropdown('listStaff')" onmouseout="hideDropdown('listStaff')">
                        <a><span class="fa-solid fa-people-group mr-3"></span>Users</a>
                        <ul id="listStaff" class="dropdown">
                            <li><a href="listStaff">Staff</a></li>
                            <li><a href="listTeacher">Teacher</a></li>
                            <li><a href="listService">Service</a></li>
                        </ul>
                    </li>
                    <li >
                        <a href="listScheduleAdmin"
                           ><span class="fa-solid fa-calendar-days mr-3"></span> Schedule</a
                        >
                    </li>

                    <li onmouseover="showDropdown('showclass')" onmouseout="hideDropdown('showclass')">
                        <a href="mainController?action=showclass"><span class="fa-solid fa-people-group mr-3"></span> LỚP HỌC</a>
                        <ul id="showclass" class="dropdown">
                            <li><a href="createClass">Tạo lớp học</a></li>
                            <li><a href="showDeleteClass">Lớp học đã xóa</a></li>
                        </ul>
                    </li>
                    <li onmouseover="showDropdown('showclub')" onclick="hideDropdown('showclub')">
                        <a href="mainController?action=club"><span class="fa-solid fa-house-chimney mr-3"></span> CÂU LẠC BỘ</a>
                        <ul id="showclub" class="dropdown">
                            <li><a href="insertClub">Tạo câu lạc bộ</a></li>
                            <li><a href="showDeleteClub">Câu lạc bộ đã xóa</a></li>
                        </ul>
                    </li>
                    <li onmouseover="showDropdown('learner')" onclick="hideDropdown('learner')">
                        <a href="mainController?action=learner"><span class="fa-solid fa-user-graduate mr-3"></span> HỌC VIÊN</a>
                    </li>                 
                    <li onmouseover="showDropdown('bill')" onclick="hideDropdown('bill')">
                        <a href="mainController?action=bill"><span class="fa-solid fa-money-bill-1-wave mr-3"></span> HÓA ĐƠN</a>
                    </li> 
                    <li >
                        <a href="logout"><span class="fa fa-sign-out mr-3"></span> Logout</a>
                    </li>
                </ul>
            </nav>
    </body>
    <script src="${pageContext.request.contextPath}/js/staffDropdown.js"></script>
</html>

