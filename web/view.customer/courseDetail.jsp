<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta2/css/all.min.css"
    />

    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
      crossorigin="anonymous"
    />
    <link rel="stylesheet" href="./css/courseDetail.css" />
    <link rel="stylesheet" href="./css/course.css" />
    <title>Document</title>
  </head>
  <body>
    <!-- Header -->
    <c:import url="customer_header.jsp"/>
    
    <div class="container">
       
      <div class="priceDetail">
          
        <div class="price-title">
          <ul>
              <li><a href="#">Khóa Học</a></li>
              <li><a href="#">Chi Tiết</a></li>
          </ul>
          
          <h1>${c.courseName}</h1>
        </div>
          
        <div class="price-detail-main">
          <div class="price-detail-main-left">
            <div class="price-detail-img">
                <img src="data:image;base64,${c.courseData}" alt="" />
            </div>
            <div class="price-detail-content">
              <h1>Nội dung của gói</h1>
              <ul>
                <li>
                  ${c.description}
                </li>
                
              </ul>
            </div>
            <div class="price-detail-rating">
              <h1>Đánh Giá Khóa Học</h1>
              <div class="rating-box">
                <h3 id="notice">Viết bình luận thành công!!!</h3>
                <h2>Viết Bình Luận ...<i class="fa-solid fa-pen fa-sm"></i></h2>
                <form action="">
                  <input
                    id="inputContent"
                    type="text"
                    placeholder="Mời bạn bình luận và đánh giá khóa học"
                    required
                  />
                  <button id="mess">Gửi</button>
                </form>
              </div>
              <div class="rating-box-question">
                <div class="question-card">
                  <div class="question-title">
                    <div class="nameUser">Phú</div>
                    <div class="timeQuestion">2016-06-16 14:25:59</div>
                  </div>
                  <div class="question-content">Khóa học này ok</div>
                </div>
                <div class="question-card">
                  <div class="question-title">
                    <div class="nameUser">Phú</div>
                    <div class="timeQuestion">2016-06-16 14:25:59</div>
                  </div>
                  <div class="question-content">Khóa học này ok</div>
                </div>
                <div class="question-card">
                  <div class="question-title">
                    <div class="nameUser">Phú</div>
                    <div class="timeQuestion">2016-06-16 14:25:59</div>
                  </div>
                  <div class="question-content">Khóa học này ok</div>
                </div>
                <div class="question-card">
                  <div class="question-title">
                    <div class="nameUser">Phú</div>
                    <div class="timeQuestion">2016-06-16 14:25:59</div>
                  </div>
                  <div class="question-content">
                    Khóa học này oksssssssssssssssssssssssssssssssssss
                  </div>
                </div>
              </div>
            </div>
          </div>
            
          <div class="price-detail-right">
            <div class="aa">
              <div class="price-detail-box">
                <div class="price-detail-head">
                  <h2>GIÁ KHÓA HỌC</h2>
                  <h1><fmt:formatNumber type="currency" value="${c.numberOfMonths * c.price}" />VND</h1>
                </div>
                <div class="price-detail-bottom">
                  <ul>
                    <li>
                      <div class="price-detail-right-text">
                        Thời gian tập luyện:
                      </div>
                      <div class="price-detail-right-price">${c.numberOfMonths} THÁNG</div>
                    </li>
                    <li>
                      <div class="price-detail-right-text">Chi phí / tháng</div>
                      <div class="price-detail-right-price"><fmt:formatNumber type="currency"  value="${c.price}" currencyCode="VND"/></div>
                    </li>
                    <li>
                      <div class="price-detail-right-text">Chí phí / ngày</div>
                      <div class="price-detail-right-price"><fmt:formatNumber type="currency"  value="${c.price/30}" currencyCode="VND"/></div>
                    </li>
                    <li>- Giá gói chưa áp dụng ưu đãi</li>
                    <li>- Được sử dụng toàn bộ dịch vụ trung tâm</li>
                    <li>
                        <a href="signupCourse">ĐĂNG KÝ NGAY</a>
                    </li>
                  </ul>
                </div>
              </div>
            </div>
          </div>
            
        </div>
         
      </div>
                    
    </div>
    
    <script src="./js/courseDetail.js"></script>
    <c:import url="customer_footer.jsp"/>
  </body>
</html>