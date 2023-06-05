<%-- 
    Document   : home
    Created on : 30-05-2023, 18:40:01
    Author     : HP Pro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                        <form action="MainController" method="post">
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
                                    <a class="nav-menu-link" href="news.jsp">TIN TỨC</a>
                                </li>
                            </ul>
                        </form>
                        <a class="btn_contact" href="login.jsp">ĐĂNG NHẬP</a>
                    </div>
                </div>
            </div>
        </div>

        <div class="service">
            <div class="service-title">CÁC KHÓA HỌC CỦA CHÚNG TÔI</div>
            <div class="service-detail">Luyện tập Yoga sẽ giúp bạn đạt được mục tiêu sức khỏe và hình thể</div>
            <div class="service-choose">
                <div class="service-option">
                    <div class="service-img">
                        <img src="./image/pt.jpg" alt="">
                    </div>
                    <div class="service-content">BASIC</div>
                    <div class="service-overlay"></div>

                </div>
                <div class="service-option">
                    <div class="service-img">
                        <img src="./image/yoga.jpg" alt="">
                    </div>
                    <div class="service-content">ADVANCE</div>
                    <div class="service-overlay"></div>

                </div>
                <div class="service-option">
                    <div class="service-img">
                        <img src="./image/dotap.jpg" alt="">
                    </div>
                    <div class="service-content">TEACHER</div>
                    <div class="service-overlay"></div>
                </div>
                <div class="service-option">
                    <div class="service-img">
                        <img src="./image/xem thêm.jpg" alt="">
                    </div>
                    <div class="service-content">THERAPY</div>
                    <div class="service-overlay"></div>
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
