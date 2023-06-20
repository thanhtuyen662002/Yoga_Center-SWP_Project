<%-- 
    Document   : home
    Created on : 30-05-2023, 18:40:01
    Author     : HP Pro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" />
        <link
            rel="stylesheet"
            type="text/css"
            href="https://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css"
            />
        <link rel="stylesheet" href="./css/home.css">
    </head>

    <body>
        <!-- Header -->
        <div class="nav-background">
            <div class="container">
                <div class="nav">
                    <div class="nav-logo">
                        <a href="home.jsp">YO<span>GA</span> </a>
                    </div>
                    <input type="checkbox" id="toggler">
                    <label for="toggler"><i class="fas fa-bars fa-2xl"></i></label>
                    <div class="nav-menu">
<!--                        <form action="MainController" method="post">-->
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
                                    <a class="nav-menu-link" href="coupon.jsp">SỰ KIỆN</a>
                                </li>
                                <li class="nav-menu-item">
                                    <a class="nav-menu-link" href="shownews">TIN TỨC</a>
                                </li>
                            </ul>
                        <!--</form>-->
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
                                            <a href="courseStaff.jsp" class="nav-link mb-2 text-decoration-none p-2" id="item">Quản lý</a>
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
        <!--Slide quảng cáo -->
        <div id="carouselExampleIndicators" class="carousel slide">
            <div class="carousel-indicators">
                <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active"
                        aria-current="true" aria-label="Slide 1"></button>
                <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1"
                        aria-label="Slide 2"></button>
                <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2"
                        aria-label="Slide 3"></button>
            </div>
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src="./image/slide1.jpg" class="d-block w-100" alt="...">
                </div>
                <div class="carousel-item">
                    <img src="./image/slide2.png" class="d-block w-100" alt="...">
                </div>
                <!-- <div class="carousel-item">
                <img src="..." class="d-block w-100" alt="...">
              </div> -->
            </div>
            <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators"
                    data-bs-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators"
                    data-bs-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Next</span>
            </button>
        </div>
        <!-- Dịch vụ -->
        <!-- <div class="service">
                <div class="row">
                  <div class="col-md-4">
                    <div class="thumbnail">
                      <a href="#">
                        <img src="./image/slide1.jpg" alt="Your Image">
                        <div class="caption">
                          <p>Hover caption</p>
                        </div>
                      </a>
                    </div>
                  </div>
                </div>
        </div> -->
        <div class="service">
            <div class="service-title">CÁC DỊCH VỤ CỦA CHÚNG TÔI</div>
            <div class="service-detail">Luyện tập Yoga sẽ giúp bạn đạt được mục tiêu sức khỏe và hình thể</div>
            <div class="service-choose">
                <div class="service-option">
                    <div class="service-img">
                        <img src="./image/pt.jpg" alt="">
                    </div>
                    <div class="service-content">PERSONAL TRAINER</div>
                    <div class="service-overlay"></div>

                </div>
                <div class="service-option">
                    <div class="service-img">
                        <img src="./image/yoga.jpg" alt="">
                    </div>
                    <div class="service-content">YOGA</div>
                    <div class="service-overlay"></div>

                </div>
                <div class="service-option">
                    <div class="service-img">
                        <img src="./image/dotap.jpg" alt="">
                    </div>
                    <div class="service-content">DỤNG CỤ</div>
                    <div class="service-overlay"></div>
                </div>
                <div class="service-option">
                    <div class="service-img">
                        <img src="./image/xem thêm.jpg" alt="">
                    </div>
                    <div class="service-content">XEM THÊM</div>
                    <div class="service-overlay"></div>
                </div>
            </div>
        </div>
        <!-- Tin Tức -->
   <div class="news" style="background-image: url('./image/bg.jpg');">
        <div class="news-bg"></div>
        <div class="news-content">
            <div class="news-title">CÂU CHUYỆN HỘI VIÊN</div>
            <div class="news-detail">YOGA dùng toàn bộ nỗ lực để giúp bạn yêu cơ thể mình hơn, đều đặn mỗi ngày</div>
           <div class="container">
            <div class="news-slider">
                <div class="card">
                    <div class="card-img">
                        <img src="./image/pt.jpg" alt="">
                    </div>
                    <div class="card-content">
                        <p>Some text here fasf fba afb bà anaskf nà àn knfasfn án f kasfnsk á k kfnaskfnas k </p>
                    </div>
                </div>
                <div class="card">
                    <div class="card-img">
                        <img src="./image/xem thêm.jpg" alt="">
                    </div>
                    <div class="card-content">
                        <p>Some text here fasf fba afb bà anaskf nà àn knfasfn án f kasfnsk á k kfnaskfnas k </p>
                    </div>
                </div>
                <div class="card">
                    <div class="card-img">
                        <img src="./image/dotap.jpg" alt="">
                    </div>
                    <div class="card-content">
                        <p>Some text here fasf fba afb bà anaskf nà àn knfasfn án f kasfnsk á k kfnaskfnas k </p>
                    </div>
                </div>
                <div class="card">
                    <div class="card-img">
                        <img src="./image/xem thêm.jpg" alt="">
                    </div>
                    <div class="card-content">
                        <p>Some text here fasf fba afb bà anaskf nà àn knfasfn án f kasfnsk á k kfnaskfnas k </p>
                    </div>
                </div>
                <div class="card">
                    <div class="card-img">
                        <img src="./image/pt.jpg" alt="">
                    </div>
                    <div class="card-content">
                        <p>Some text here fasf fba afb bà anaskf nà àn knfasfn án f kasfnsk á k kfnaskfnas k </p>
                    </div>
                </div>
            </div>
           </div> 
           

        </div>
    </div>
        <!-- GÓI TẬP -->
        <div class="plan">
            <div class="container">
                <div class="plan-title">
                    <img src="./image/logo-icon.png.webp" alt="">
                    <h2>CÁC GÓI TẬP</h2>
                </div>
                <div class="plan-detail">Luyện tập Yoga sẽ giúp bạn đạt được mục tiêu sức khỏe và hình thể</div>
                <div class="plan-content">
                    <div class="plan-content-col begginer">
                        <div class="plan-content-title">BEGGINER</div>
                        <div class="plan-content-price">
                            <h3>499k</h3>
                            <p>PER MONTH</p>
                            </span>
                        </div>
                        <div class="plan-content-list">
                            <ul>
                                <li>text</li>
                                <li>text</li>
                                <li>text</li>
                                <li>text</li>
                            </ul>
                        </div>
                        <div class="plan-content-btn"><a href="#">GET STARTED</a></div>
                    </div>
                    <div class="plan-content-col entermediate">
                        <div class="plan-content-title">ENTERMEDIATE</div>
                        <div class="plan-content-price">
                            <h3>799k</h3>
                            <p>PER MONTH</p>
                        </div>
                        <div class="plan-content-list">
                            <ul>
                                <li>text</li>
                                <li>text</li>
                                <li>text</li>
                                <li>text</li>
                            </ul>
                        </div>
                        <div class="plan-content-btn"><a href="#">GET STARTED</a></div>
                    </div>
                    <div class="plan-content-col advanced">
                        <div class="plan-content-title">ADVANCED</div>
                        <div class="plan-content-price">
                            <h3>999k</h3>
                            <p>PER MONTH</p>
                        </div>
                        <div class="plan-content-list">
                            <ul>
                                <li>text</li>
                                <li>text</li>
                                <li>text</li>
                                <li>text</li>
                            </ul>
                        </div>
                        <div class="plan-content-btn"><a href="#">GET STARTED</a></div>
                    </div>
                    <div class="plan-content-col professional">
                        <div class="plan-content-title">PROFESSIONAL</div>
                        <div class="plan-content-price">
                            <h3>1499k</h3>
                            <p>PER MONTH</p>
                        </div>
                        <div class="plan-content-list">
                            <ul>
                                <li>text</li>
                                <li>text</li>
                                <li>text</li>
                                <li>text</li>
                            </ul>
                        </div>
                        <div class="plan-content-btn"><a href="#">GET STARTED</a></div>
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
        <script src="./home.js"></script>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
        <!-- Slide quảng cáo -->
        <script
            type="text/javascript"
            src="https://code.jquery.com/jquery-1.11.0.min.js"
        ></script>
        <script
            type="text/javascript"
            src="https://code.jquery.com/jquery-migrate-1.2.1.min.js"
        ></script>
        <script
            type="text/javascript"
            src="https://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.min.js"
        ></script>
        <script src="https://cdn.jsdelivr.net/npm/remixicon@2.5.0/remixicon.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
        crossorigin="anonymous"></script>
        <script src="./js/home.js"></script>




    </body>

</html>
