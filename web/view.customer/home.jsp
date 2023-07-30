<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Home</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" />
        <link
            rel="stylesheet"
            type="text/css"
            href="https://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css"
            />
        <link rel="stylesheet" href="./css/home.css">
        <link rel="icon" type="image/png" href="./image/newlogo.png">

    </head>

    <body>
        <!-- Header -->
        <c:import url="customer_header.jsp"/>
        <!--Slide quảng cáo -->
        <section>
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
        </section>
        
        <section>
            <!-- Tin Tức -->
        <div class="news" style="background-image: url('./image/bg.jpg');">
            <div class="news-bg"></div>
            <div class="news-content">
                <div class="news-title">CÂU CHUYỆN HỘI VIÊN</div>
                <div class="news-detail">YOGA dùng toàn bộ nỗ lực để giúp bạn yêu cơ thể mình hơn, đều đặn mỗi ngày</div>
                <div class="container">  
                    
                        <div class="news-slider">
                            <c:forEach var="s" items="${list}">
                            <div class="card">
                                <div class="card-img">
                                    <img src="data:image;base64,${s.image}" alt="">
                                </div>
                                <div class="card-content">
                                    <p>${s.storyContent}</p>
                                </div>
                            </div>
                                </c:forEach>
                        </div> 
                    
                </div> 
            </div>
        </div>
        </section>
        
        <section>
            <!-- GÓI TẬP -->
        <div class="plan">
            <div class="container">
                <div class="plan-title">
                    <img src="./image/logo-icon.png.webp" alt="">
                    <h2>CÁC GÓI TẬP</h2>
                </div>
                <div class="plan-detail">Luyện tập Yoga sẽ giúp bạn đạt được mục tiêu sức khỏe và hình thể</div>
                <div class="plan-content">
                    <c:forEach var="c" items="${course}">
                        <form action="courseCustomer?id=${c.courseID}" method="POST"> 
                        <div class="plan-content-col begginer">
                            <div class="plan-content-title">${c.courseName}</div>
                            <div class="plan-content-price">
                                <h3>
                                    <c:choose>
                                        <c:when test="${c.price > 999}">
                                            <fmt:formatNumber value="${c.price div 1000}" pattern="#,##0"/>K
                                        </c:when>
                                        <c:otherwise>
                                            <fmt:formatNumber value="${c.price}" pattern="#,##0"/>
                                        </c:otherwise>
                                    </c:choose>
                                </h3>
                                <c:if test="${c.price > 0}">
                                <p>1 Tháng</p>
                                </c:if>
                                <c:if test="${c.price == 0}">
                                <p>1 Tuần</p>
                                </c:if>
                            </div>
                            <div class="plan-content-list">
                                <ul>
                                    <li>${c.description}</li>
                                </ul>
                            </div>
                            <div class="plan-content-btn">
                                <button type="submit">Đăng ký ngay</button>
                            </div>
                        </div>
                        </form>
                    </c:forEach>
                </div>
            </div>
        </div>
        </section>
        

        
        <section>
            <c:import url="customer_footer.jsp"/>
        </section>
        
        
       
    <script src="./js/home.js"></script>
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