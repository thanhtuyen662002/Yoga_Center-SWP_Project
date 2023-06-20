<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
      crossorigin="anonymous"
    />
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
    />
    <link
      rel="stylesheet"
      type="text/css"
      href="https://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css"
    />
    <link rel="stylesheet" href="./css/coupon.css" />
    <title>Coupon</title>
  </head>
  <body>
    <div class="nav-background">
      <div class="container">
        <div class="nav">
          <div class="nav-logo">
            <a href="./home.html">YO<span>GA</span> </a>
          </div>
          <input type="checkbox" id="toggler" />
          <label for="toggler"><i class="fas fa-bars fa-2xl"></i></label>
          <div class="nav-menu">
            <ul class="nav-menu-list">
              <li class="nav-menu-item">
                <a class="nav-menu-link" href="#">CLB</a>
              </li>
              <li class="nav-menu-item">
                <a class="nav-menu-link" href="#">DỊCH VỤ</a>
              </li>
              <li class="nav-menu-item">
                <a class="nav-menu-link" href="#">LỊCH HỌC</a>
              </li>
              <li class="nav-menu-item">
                <a class="nav-menu-link" href="#">KHUYẾN MÃI</a>
              </li>
              <li class="nav-menu-item">
                <a class="nav-menu-link" href="#">TIN TỨC</a>
              </li>
            </ul>
            <button class="btn_contact">ĐĂNG NHẬP</button>
          </div>
        </div>
      </div>
    </div>
    <div class="banner">
      <div class="banner-color"></div>
      <div class="banner-bg">
        <img src="./image/real.jpg" alt="" />
      </div>

      <div class="title-bg">THÔNG TIN KHUYẾN MÃI</div>
    </div>

    <!-- CONTENT -->
    <div class="container">
      <div class="content-bar">
        <div class="search">
          <input
            type="search"
            id="searchInput"
            class="form-control rounded"
            placeholder="Search"
            aria-label="Search"
            aria-describedby="search-addon"
          />
          <span class="input-group-text border-0" id="search-addon">
            <i class="fas fa-search"></i>
          </span>
        </div>
        <div class="sort">
          <select id="sortSelect" class="form-select rounded">
            <option value="asc">Tăng dần</option>
            <option value="desc">Giảm dần</option>
          </select>
        </div>
      </div>
    </div>
    <div class="content-main">
      <div class="container">
          
        <div class="list-coupon-card">
            <c:forEach items="${list}" var="event">
          <div class="card-item">
            <div class="card-img">
              <img src="data:image;base64,${event.data}" alt="" />
            </div>
            <div class="card-coupon">
              <span class="discount">${event.discount}}</span>
            </div>
            <div class="card-content">
              <div class="card-content-course">${event.courseName}</div>
              <div class="card-content-event">
                ${event.eventName}
              </div>
              <div class="card-content-date">
                <span>${event.daystart}</span> 
                <span class="arrow">&#8594;</span>
                <span class="end-day">${event.dayend}</span>
              </div>
              <div class="card-content-btn"><button>Đăng Ký Ngay</button></div>
            </div>
          </div>
          </c:forEach>
        </div>
        <ul class="listPage" style="text-align: center; padding-top: 5rem"></ul>
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
                  <span> <i class="fas fa-phone-alt"></i></span>
                  <a href="tel:1900633638">1900 633 638</a>
                </li>
                <li>
                  <span>
                    <i class="fas fa-map-marker-alt"></i> 151-155 Bến Vân Đồn,
                    Phường 6, Quận 4, TP.HCM</span
                  >
                </li>
                <li>
                  <span>
                    <i class="fas fa-clock"></i> Thứ Hai - Chủ Nhật: 6:00 -
                    22:00</span
                  >
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
                  <li><a href="#">Chính sách bảo mật</a></li>
                </ul>
              </div>
              <div class="footer-between-right">
                <ul>
                  <li>
                    <a href="#">Tuyển Dụng</a>
                  </li>
                  <li><a href="#">Tin Tức</a></li>

                  <li><a href="#">Liên hệ</a></li>
                  <li><a href="#">Câu Lạc bộ</a></li>
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
    <script src="./js/coupon.js"></script>
  </body>
</html>