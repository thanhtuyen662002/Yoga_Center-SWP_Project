
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" />
    <link rel="stylesheet" href="./css/clb.css">
    <title>Document</title>
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
                    <ul class="nav-menu-list">
                        <li class="nav-menu-item">
                                    <a class="nav-menu-link" href="mainController?action=club">CLB</a>
                                </li>
                                <li class="nav-menu-item">
                                     <a class="nav-menu-link" href="mainController?action=courses">KHÓA HỌC</a>
                                </li>
                                <li class="nav-menu-item">
                                    <a class="nav-menu-link" href="mainController?action=schedule">LỊCH HỌC</a>
                                </li>
                                <li class="nav-menu-item">
                                    <a class="nav-menu-link" href="mainController?action=voucher">KHUYẾN MÃI</a>
                                </li>
                                <li class="nav-menu-item">
                                    <a class="nav-menu-link" href="mainController?action=news">TIN TỨC</a>
                                </li>
                    </ul>
                    <button class="btn_contact">ĐĂNG NHẬP</button>
                </div>
            </div>
        </div>
    </div>
    <!-- Banner -->
    <div class="banner">
        <div class="banner-bg"> <img src="./image/bannerClb.jpg" alt=""></div>
        <div class="banger-bg-color"></div>
        <div class="container">
            <div class="title-bg">CÂU LẠC BỘ</div>
        </div>
    </div>
    <!-- Title -->
    <div class="clb">
        <div class="container">
            <div class="clb-title">TẬP LUYỆN Ở CÂU LẠC BỘ GẦN BẠN</div>
            <br class="clb-detail">Hệ thống phòng tập của YOGA có mặt khắp các quận TPHCM.</br>Lựa chọn phòng tập gần
            bạn nhất để có thể tập luyện dễ dàng và tiết kiệm thời gian
        </div>
        <select class="form-select" aria-label="Default select example">
            <option selected>Open this select menu</option>
            <option value="1">One</option>
            <option value="2">Two</option>
            <option value="3">Three</option>
        </select>
    </div>
    <!-- Form control -->
    <div class="container">
        <div class="form-content">
            <div class="clb-card">
                <div class="clb-card-img"><img src="./image/news-title.jpg" alt=""></div>
                <div class="clb-card-content">
                    <div class="clb-card-title">YOGA THÀNH THÁI</div>
                    <div class="clb-card-position">
                        <span> <i class="fas fa-map-marker-alt"></i></span>
                        52 Thành Thái, Phường 12 Quận 10, Thành Phố Hồ Chí Minh
                    </div>
                    <div class="clb-card-phone">
                        <span><i class="fas fa-phone-alt"></i>
                        1900633638</span>
                    </div>
                </div>
            </div>
            <div class="clb-card">
                <div class="clb-card-img"><img src="./image/news-title.jpg" alt=""></div>
                <div class="clb-card-content">
                    <div class="clb-card-title">YOGA THÀNH THÁI</div>
                    <div class="clb-card-position">
                        <span> <i class="fas fa-map-marker-alt"></i></span>
                        52 Thành Thái, Phường 12 Quận 10, Thành Phố Hồ Chí Minh
                    </div>
                    <div class="clb-card-phone">
                        <span><i class="fas fa-phone-alt"></i>
                        1900633638</span>
                    </div>
                </div>
            </div>
            <div class="clb-card">
                <div class="clb-card-img"><img src="./image/news-title.jpg" alt=""></div>
                <div class="clb-card-content">
                    <div class="clb-card-title">YOGA THÀNH THÁI</div>
                    <div class="clb-card-position">
                        <span> <i class="fas fa-map-marker-alt"></i></span>
                        52 Thành Thái, Phường 12 Quận 10, Thành Phố Hồ Chí Minh
                    </div>
                    <div class="clb-card-phone">
                        <span><i class="fas fa-phone-alt"></i>
                        1900633638</span>
                    </div>
                </div>
            </div>
            <div class="clb-card">
                <div class="clb-card-img"><img src="./image/news-title.jpg" alt=""></div>
                <div class="clb-card-content">
                    <div class="clb-card-title">YOGA THÀNH THÁI</div>
                    <div class="clb-card-position">
                        <span> <i class="fas fa-map-marker-alt"></i></span>
                        52 Thành Thái, Phường 12 Quận 10, Thành Phố Hồ Chí Minh
                    </div>
                    <div class="clb-card-phone">
                        <span><i class="fas fa-phone-alt"></i>
                        1900633638</span>
                    </div>
                </div>
            </div>
            <div class="clb-card">
                <div class="clb-card-img"><img src="./image/news-title.jpg" alt=""></div>
                <div class="clb-card-content">
                    <div class="clb-card-title">YOGA THÀNH THÁI</div>
                    <div class="clb-card-position">
                        <span> <i class="fas fa-map-marker-alt"></i></span>
                        52 Thành Thái, Phường 12 Quận 10, Thành Phố Hồ Chí Minh
                    </div>
                    <div class="clb-card-phone">
                        <span><i class="fas fa-phone-alt"></i>
                        1900633638</span>
                    </div>
                </div>
            </div>
            <div class="clb-card">
                <div class="clb-card-img"><img src="./image/news-title.jpg" alt=""></div>
                <div class="clb-card-content">
                    <div class="clb-card-title">YOGA THÀNH THÁI</div>
                    <div class="clb-card-position">
                        <span> <i class="fas fa-map-marker-alt"></i></span>
                        52 Thành Thái, Phường 12 Quận 10, Thành Phố Hồ Chí Minh
                    </div>
                    <div class="clb-card-phone">
                        <span><i class="fas fa-phone-alt"></i>
                        1900633638</span>
                    </div>
                </div>
            </div>
            <div class="clb-card">
                <div class="clb-card-img"><img src="./image/news-title.jpg" alt=""></div>
                <div class="clb-card-content">
                    <div class="clb-card-title">YOGA THÀNH THÁI</div>
                    <div class="clb-card-position">
                        <span> <i class="fas fa-map-marker-alt"></i></span>
                        52 Thành Thái, Phường 12 Quận 10, Thành Phố Hồ Chí Minh
                    </div>
                    <div class="clb-card-phone">
                        <span><i class="fas fa-phone-alt"></i>
                        1900633638</span>
                    </div>
                </div>
            </div>
            <div class="clb-card">
                <div class="clb-card-img"><img src="./image/news-title.jpg" alt=""></div>
                <div class="clb-card-content">
                    <div class="clb-card-title">YOGA THÀNH THÁI</div>
                    <div class="clb-card-position">
                        <span> <i class="fas fa-map-marker-alt"></i></span>
                        52 Thành Thái, Phường 12 Quận 10, Thành Phố Hồ Chí Minh
                    </div>
                    <div class="clb-card-phone">
                        <span><i class="fas fa-phone-alt"></i>
                        1900633638</span>
                    </div>
                </div>
            </div>
            <div class="clb-card">
                <div class="clb-card-img"><img src="./image/news-title.jpg" alt=""></div>
                <div class="clb-card-content">
                    <div class="clb-card-title">YOGA THÀNH THÁI</div>
                    <div class="clb-card-position">
                        <span> <i class="fas fa-map-marker-alt"></i></span>
                        52 Thành Thái, Phường 12 Quận 10, Thành Phố Hồ Chí Minh
                    </div>
                    <div class="clb-card-phone">
                        <span><i class="fas fa-phone-alt"></i>
                        1900633638</span>
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
