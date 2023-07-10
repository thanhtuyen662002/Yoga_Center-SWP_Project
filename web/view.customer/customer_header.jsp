<%-- 
    Document   : customer_header
    Created on : 17-06-2023, 16:45:05
    Author     : HP Pro
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./css/homecus.css"/>
        <title>Customer Header</title>
    </head>
    <body>
        <div class="nav-background">
            <div class="container">
                <div class="nav">
                    <div class="nav-logo">
                        <a href="homeCustomer">YO<span>GA</span> </a>
                    </div>
                    <input type="checkbox" id="toggler" />
                    <label for="toggler"><i class="fas fa-bars fa-2xl"></i></label>
                    <div class="nav-menu">
                        <ul class="nav-menu-list">
                            <li class="nav-menu-item">
                                <a class="nav-menu-link" href="clubCustomer">CLB</a>
                            </li>
                            <li class="nav-menu-item">
                                <a class="nav-menu-link" href="courseCustomer">KHÓA HỌC</a>
                            </li>
                            <li class="nav-menu-item">
                                <a class="nav-menu-link" href="listSchedule">LỊCH HỌC</a>
                            </li>
                            <li class="nav-menu-item">
                                <a class="nav-menu-link" href="eventCustomer">SỰ KIỆN</a>
                            </li>
                            <li class="nav-menu-item">
                                <a class="nav-menu-link" href="shownews">TIN TỨC</a>
                            </li>
                        </ul>
                        <c:if test="${not empty sessionScope.USER}">
                            <h1 onclick="toggleMenu()" 
                                style="color: green; font-weight: 600; cursor: pointer; padding-left: 2rem; user-select: none">
<!--                                <img src="./image/profile.png"/>-->
                                ${sessionScope.USER.name}</h1>
                            <div class="sub-menu-wrap" id="subMenu">
                                <div class="sub-menu">
                                    <div class="user-info"> 
                                        <c:if test="${sessionScope.USER.roleID eq 'US'}">
                                            <a href="editprofilecus" class="sub-menu-link"> 
                                                <img src="./image/setting.png"/>
                                                <p>Thay đổi thông tin</p>
                                            </a>
                                        </c:if>
                                        <a href="logout" class="sub-menu-link"> 
                                            <img src="./image/logout.png"/>
                                            <p>Đăng xuất</p>
                                        </a>
                                    </div>
                                </div>
                            </div>

                        </c:if>
                        <c:if test="${empty sessionScope.USER}"><div><a href="login.jsp" class="btn_contact">ĐĂNG NHẬP</a></div>
                        </c:if>
                    </div>
                </div>
            </div>
        </div>
    </body>
    <script>
        let subMenu = document.getElementById("subMenu");

        function toggleMenu() {
            subMenu.classList.toggle("open-menu");
        }
    </script>
</html>
