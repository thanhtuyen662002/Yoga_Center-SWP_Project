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
    <link rel="icon" type="image/png" href="./image/newlogo.png">
    <link rel="stylesheet" href="./css/coupon.css" />
    <title>KHUYẾN MÃI</title>
  </head>
  <body>
      <c:import url="customer_header.jsp"/>
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
                <form action="courseCustomer?id=${event.courseID}&ID=${event.eventID}" method="POST">
          <div class="card-item">
            <div class="card-img">
              <img src="data:image;base64,${event.data}" alt="" />
            </div>
            <div class="card-coupon">
              <span class="discount">${event.discount}%</span>
            </div>
            <div class="card-content">
              <div class="card-content-course">${event.courseName}</div>
              <div class="card-content-event">${event.eventName}</div>              
              <div class="card-content-date">
                <span>${event.daystart}</span> 
                <span class="arrow">&#8594;</span>
                <span class="end-day">${event.dayend}</span>
              </div>
              <div class="card-content-btn"><button type="submit">Đăng Ký Ngay</button></div>
            </div>
          </div>
              </form>
          </c:forEach>
        </div>
          
        <ul class="listPage" style="text-align: center; padding-top: 5rem"></ul>
      </div>
    </div>

    <!-- FOOTER -->
    <c:import url="customer_footer.jsp"/>
    <script src="./js/coupon.js"></script>
  </body>
</html>