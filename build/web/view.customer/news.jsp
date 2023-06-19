<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>News</title>
        <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
            />

        <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
            crossorigin="anonymous"
            />
        <link rel="stylesheet" href="./css/news1.css" />
    </head>
    <body>
        <!-- Header -->
        <div class="nav-background">
            <div class="container">
                <div class="nav">
                    <div class="nav-logo">
                        <a href="#">YO<span>GA</span> </a>
                    </div>
                    <input type="checkbox" id="toggler" />
                    <label for="toggler"><i class="fas fa-bars fa-2xl"></i></label>
                    <div class="nav-menu">
                        <ul class="nav-menu-list">
                            <li class="nav-menu-item">
                                <a class="nav-menu-link" href="clb.jsp">CLB</a>
                            </li>
                            <li class="nav-menu-item">
                                <a class="nav-menu-link" href="courses.jsp">KHÓA HỌC</a>
                            </li>
                            <li class="nav-menu-item">
                                <a class="nav-menu-link" href="listSchedule">LỊCH HỌC</a>
                            </li>
                            <li class="nav-menu-item">
                                <a class="nav-menu-link" href="event.jsp">SỰ KIỆN</a>
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
        <!-- Banner -->
        <div class="banner">
            <div class="banner-bg"> <img src="./image/news.jpg" alt=""></div>\
            <div class="container">
                <div class="title-bg">TIN TỨC</div>
                <div class="title">TIN TỨC</div>
            </div>
        </div>
        <!-- Tiêu đề -->
        <div class="container">
            <div class="news">
                <div class="news-title"><a href="">TẤT CẢ</a></div>
                <div class="news-title"> <a href="">BLOG</a></div>
                <div class="news-title"><a href="">DINH DƯỠNG</a></div>
                <div class="news-title"><a href="">KHÁC</a></div>
                <!--<div class="news-title"><a href="">SỰ KIỆN</a></div>-->

            </div>
        </div>
        <!-- Card -->
        <div class="container">
            <div class="news-content">
                <c:if test="${ not empty requestScope.list_news}" >
                    <c:forEach items="${list_news}" var="news">
                        <c:url var="newsLink" value="loadnews">
                            <c:param name="newsID" value="${news.newsID}"/>     
                        </c:url>

                        <div class="news-card">
                            <a href="${newsLink}" class="nav-link col mb-4" id="news">
                                <div class="news-card-img"><img src="./image/${news.image}" alt=""></div>
                                <div class="news-card-content">
                                    <div class="news-card-id">
                                        <c:if test="${news.categoryID == 1}"> Blog</c:if>
                                        <c:if test="${news.categoryID == 2}"> Product</c:if>
                                        <c:if test="${news.categoryID == 3}"> Other</c:if>
                                        </div>
                                        <div class="news-card-title">${news.title}</div>
                                    <div class="news-card-time">${news.postDate}</div>

                                </div>
                            </a>
                        </div>

                    </c:forEach> 
                </c:if>
                <c:if test="${empty requestScope.list_news}">
                    <div style="height:50vh;" class="d-flex align-items-center justify-content-center">
                        <h2 class="text-muted text-center pb-5">Chưa có bài viết nào</h2>
                    </div>
                </c:if>
            </div>
        </div>
        <ul class="listPage" style = "text-align:center">
        </ul>
    </div>

    <!-- Footer -->
    <c:import url="cutomer_footer.jsp"/>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="./js/news.js"></script>
</body>
</html>
