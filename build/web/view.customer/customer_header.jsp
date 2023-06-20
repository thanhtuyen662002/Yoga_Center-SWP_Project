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
                            <div id="dropDownMenu" class="d-inline-block position-relative">
                                <i class="fas fa-user me-2"></i>${sessionScope.USER.name}
                                <div id="dropDownContent" class="d-none bg-white text-start position-absolute shadow">
                                    <c:if test="${not empty sessionScope.USER}"> 
                                        <a href="account" class="nav-link mb-2 text-decoration-none p-2" id="item">Cài đặt tài khoản</a>
                                    </c:if>
                                    <c:if test="${sessionScope.USER.roleID eq 'ST'}">
                                        <a href="sellerPage" class="nav-link mb-2 text-decoration-none p-2" id="item">Quản lý</a>
                                    </c:if>
                                    <c:if test="${sessionScope.USER.roleID eq 'AD'}">
                                        <a href="dashboard" class="nav-link mb-2 text-decoration-none p-2" id="item">Quản lý cửa hàng</a>
                                    </c:if>
                                    <!--<a href="logOut" class="nav-link text-decoration-none p-2" id="item">Đăng xuất</a>-->
                                </div>
                                <c:if test="${sessionScope.USER.roleID eq 'ST'}">
                                    <a href="homeStaff.jsp" class="nav-link mb-2 text-decoration-none p-2" id="item">Quản lý</a>
                                </c:if>
                                <a href="logout" class="nav-link text-decoration-none p-2" id="item">Đăng xuất</a>
                            </div>
                        </c:if>
                        <c:if test="${empty sessionScope.USER}"><div><a href="login.jsp" class="btn_contact">Đăng nhập</a></div>
                        </c:if>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
