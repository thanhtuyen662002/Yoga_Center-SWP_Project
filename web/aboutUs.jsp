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
      href="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css"
    />
    <link rel="stylesheet" href="./css/AboutUs.css" />

    <title>Document</title>
  </head>
  <body>
        <%--<c:import url="customer_header.jsp" />--%>

    <div class="banner">
      <div class="title-bg">ABOUT US</div>
    </div>
    <div class="about wow fadeInUp" data-wow-delay="0.1s">
      <div class="container">
        <div class="row align-items-center">
          <div class="col-lg-5 col-md-6">
            <div class="about-img">
              <img src="./image/about2.png" alt="Image" />
            </div>
          </div>
          <div class="col-lg-7 col-md-6">
            <div class="section-header text-left">
              <p>Learn About Us</p>
              <h2>Welcome to Yooga</h2>
            </div>
            <div class="about-text">
              <p>
                Lorem ipsum dolor sit amet, consectetur adipiscing elit.
                Phasellus nec pretium mi. Curabitur facilisis ornare velit non
                vulputate. Aliquam metus tortor, auctor id gravida condimentum,
                viverra quis sem.
              </p>
              <p>
                Lorem ipsum dolor sit amet, consectetur adipiscing elit.
                Phasellus nec pretium mi. Curabitur facilisis ornare velit non
                vulputate. Aliquam metus tortor, auctor id gravida condimentum,
                viverra quis sem. Curabitur non nisl nec nisi scelerisque
                maximus.
              </p>
              <a class="btn" href="">Learn More</a>
            </div>
          </div>
        </div>
      </div>
    </div>

    <div class="feedback wow fadeInUp" data-wow-delay="0.1s">
      <div class="container">
        <div class="section-header text-center">
          <p>FEEDBACK</p>
          <h2>Our Client Say!</h2>
        </div>
        <div class="feedback-list">
          <div class="feedback-item">
            <div class="feedback-img">
              <img src="./image/avatar.webp" alt="Image" />
            </div>
            <div class="feedback-text">
              <p>
                Lorem ipsum dolor sit amet consec adipis elit. Etiam accums
                lacus eget velit tincid, quis suscip justo dictum.Lorem ipsum
                dolor sit amet consec adipis elit. Etiam accums lacus eget velit
                tincid, quis suscip justo dictum.
              </p>
              <h3>Customer Name</h3>
              <h4>Profession</h4>
            </div>
          </div>
          <div class="feedback-item">
            <div class="feedback-img">
              <img src="./image/avatar.webp" alt="Image" />
            </div>
            <div class="feedback-text">
              <p>Lorem ipsum dolor sit amet consec adipis elit. Etiam accums</p>
              <h3>Customer Name</h3>
              <h4>Profession</h4>
            </div>
          </div>
          <div class="feedback-item">
            <div class="feedback-img">
                <img src="./image/avatar.webp" alt="Image" />
            </div>
            <div class="feedback-text">
              <p>
                Lorem ipsum dolor sit amet consec adipis elit. Etiam accums
                lacus eget velit tincid, quis suscip justo dictum.
              </p>
              <h3>Customer Name</h3>
              <h4>Profession</h4>
            </div>
          </div>
          <div class="feedback-item">
            <div class="feedback-img">
              <img src="./image/avatar.webp" alt="Image" />
            </div>
            <div class="feedback-text">
              <p>
                Lorem ipsum dolor sit amet consec adipis elit. Etiam accums
                lacus eget velit tincid, quis suscip justo dictum.
              </p>
              <h3>Customer Name</h3>
              <h4>Profession</h4>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="feedback-form">
      <div class="container">
         <div class="feedback-form-content">
          <h1>Chào Bạn,</h2>
          <h2>Hãy để lại bình luận của bạn bên dưới</h2>
          <div class="feedback-form-content-form">
            <label for="message">Bình Luận</label>
            <textarea class="form-control" id="message" cols="5" rows="7"></textarea>
          </div>
        <div class="feedback-btn"><button>Gửi</button></div>
        </div> 
        <div class="feedback-form-content2">
          <div class="feedback-form-content-login">
            <img src="../image/notice.png" alt="" />
          </div>
          <h2 style="font-weight: 700">Bạn Phải Đăng Nhập Trước</h2>
          <div class="feedback-btn2"><button>Đăng Nhập</button></div>
        </div>
        <div class="feedback-form-right">
          <div class="feedback-form-right-img">
            <img
              src="http://127.0.0.1:5501/free-yoga-website-template/img/blog-1.jpg"
              alt=""
            />
          </div>
          <div class="feedback-form-right-content">POST COMMENT</div>
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
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script
      type="text/javascript"
      src="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.min.js"
    ></script>
    <script src="./js/aboutUs.js"></script>
  </body>
</html>
