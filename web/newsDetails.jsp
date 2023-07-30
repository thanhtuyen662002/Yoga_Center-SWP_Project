<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <c:if test="${empty requestScope.NEWS}" >
        <c:redirect url="shownews"></c:redirect>
    </c:if>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
        <link rel="stylesheet" href="./css/newsDetail1.css">
        <link rel="icon" type="image/png" href="./image/newlogo.png">
        <title>${requestScope.NEWS.title}</title>
    </head>
    <body>
        <!-- Header -->

        <div class="nav-background">
            <div class="container">
                <div class="nav">
                    <div class="nav-logo">
                        <a href="#">YO<span>GA</span> </a>
                    </div>
                    <input type="checkbox" id="toggler">
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
            <div class="banner-bg"> <img src="./image/news-detail.jpg" alt=""></div>
            <div class="banger-bg-color"></div>
        </div>
        <!-- main -->
        <div class="container">
            <div class="main">
                <div class="left">
                    <div class="left-title">
                        <ul>
                            <li><a href="../news/news.html">Tin tức</a></li>
                            <li><a href="">Blog</a></li>
                        </ul>
                        <h1>${requestScope.NEWS.title}</h1>
                    </div>
                    <div class="time"> 

                        <span><i class="fas fa-calendar-alt"></i> Ngày đăng: ${requestScope.NEWS.postDate}</span>
                    </div>
                    <div class="left-content">
                        ${requestScope.NEWS.content}
                    </div>

                    <div class="left-bottom">
                        <h2>
                            BÀI VIẾT LIÊN QUAN
                        </h2>

                        <div class="news-content">
                            <c:forEach items="${requestScope.RELATED_NEWS}" var = "news">
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
                                            <!--<div class="news-card-detail">${news.content} </div>-->
                                        </div>
                                    </a>
                                </div>

                            </c:forEach>
                        </div>

                    </div>
                </div>

                
                    <div class="right">
                        <c:if test = "${not empty requestScope.RECOMMEND_NEWS}">
                        <h2> TIN TỨC KHÁC</h2>

                        <c:forEach items="${requestScope.RECOMMEND_NEWS}" var = "news">
                            <c:url var="newsLink" value="loadnews">
                                <c:param name="newsID" value="${news.newsID}"/>     
                            </c:url>
                            <div class="list-news-card">
                                <a href="${newsLink}" class="nav-link text-decoration-none" id="article-link">
                                    <div class="news-card-right">
                                        <div class="news-card-right-img">
                                            <img src="./image/${news.image}" alt="">
                                        </div>
                                        <div class="news-card-right-content">
                                            <h3>${news.title}</h3>
                                            <div class="time"> 
                                                <span><i class="fas fa-calendar-alt"></i> ${news.postDate}</span>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </c:forEach>
                        </div>
                    </c:if>
                </div>


            </div>
        </div>
    </div>
</div>
        <!-- FOOTER -->
        <div class="footer">
            <div class="container">
                <div class="footer-content">
                    <div class="footer-content-col">
                        <div class="footer-title">Y O G A</div>
                        <div class="footer-block">
                            <ul>
                                <li>
                                    <span>
                                        <i class="fas fa-phone-alt"></i></span>
                                    <a href="tel:1900633638">1900 633 638</a>
                                </li>
                                <li>
                                    <span>
                                        <i class="fas fa-map-marker-alt"></i> 151-155 Bến Vân Đồn, Phường 6, Quận 4,
                                        TP.HCM</span>
                                </li>
                                <li>
                                    <span>
                                        <i class="fas fa-clock"></i> Thứ Hai - Chủ Nhật: 6:00 - 22:00</span>

                                </li>
                            </ul>
                        </div>
                    </div>
                    <div class="footer-content-col">
                        <div class="footer-title"></div>
                        <div class="footer-block middle">
                            <div class="footer-between-left">
                                <ul>
                                    <li>
                                        <a href="#">Phương thức thanh toán</a>
                                    </li>
                                    <li><a href="#"> Dịch Vụ</a></li>

                                    <li><a href="#"> Chính sách giá</a></li>
                                    <li> <a href="#">Chính sách bảo mật</a>
                                    </li>
                                </ul>
                            </div>
                            <div class="footer-between-right">
                                <ul>

                                    <li>
                                        <a href="#">Tuyển Dụng</a>
                                    </li>
                                    <li><a href="#">Tin Tức</a></li>

                                    <li><a href="#">Liên hệ</a></li>
                                    <li> <a href="#">Câu Lạc bộ</a>
                                    </li>

                                </ul>

                            </div>

                        </div>
                    </div>
                    <div class="footer-content-col">
                        <div class="footer-title">MẠNG XÃ HỘI</div>
                        <div class="footer-block right">
                            <li><i class="fab fa-instagram-square"></i></li>
                            <li><i class="fab fa-facebook-square"></i></li>
                            <li><i class="fab fa-youtube"></i></li>
                        </div>
                    </div>
                </div>
            </div>
        </div>    
    </body>
</html>