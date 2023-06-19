<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <link
            rel="stylesheet"
            type="text/css"
            href="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css"
            />
        <link rel="stylesheet" href="./css/course.css" />
        <title>Course</title>
    </head>

    <body>
        <div>
            <!-- Header -->
            <c:import url="customer_header.jsp" />
            <!-- Banner -->
            <div class="banner">
                <div class="banner-bg">
                    <img src="./image/news-detail.jpg" alt="" />
                </div>
                <div class="banger-bg-color"></div>
            </div>
        </div>

        <div class="price">

            <div class="price-card-title"><h1>CÁC KHÓA HỌC</h1></div>
            <div class="price-card">
                <div class="container card-list">

                    <c:forEach items="${list}" var="c" varStatus="status">
                        <form action="courseCustomer?id=${c.courseID}" method="POST">
                            <c:set var="index" value="${status.index + 1}"/>
                            <c:if test="${index < 10}">
                                <c:set var="index" value="0${status.index + 1}"/>
                            </c:if>
                            <div class="card-item">
                                <div class="box">
                                    <div class="content">
                                        <h2>${index}</h2>
                                        <h3>${c.courseName}</h3>
                                        ${c.description}
                                        <button type="submit">XEM THÊM</button>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </c:forEach>
                </div>
            </div>

        </div>
        <!-- Footer -->
        <c:import url="customer_footer.jsp" />
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
        <script
            type="text/javascript"
            src="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.min.js"
        ></script>
  <script>
      const colors = ["#2196f3", "#e91e63", "#97dc47", "#e98"];
      const cards = Array.from(document.querySelectorAll(".box"));

      cards.forEach((card, index) => {
        const button = card.querySelector(".box button");
        const originalColor = button.style.backgroundColor;
        const colorIndex = index % colors.length;
        const color = colors[colorIndex];

        // Lưu trạng thái ban đầu của mỗi thẻ
        card.dataset.hovered = "false";

        card.addEventListener("mouseenter", () => {
          // Kiểm tra trạng thái của thẻ, nếu đã hover trước đó thì không thay đổi màu sắc
          if (card.dataset.hovered === "false") {
            button.style.backgroundColor = color;
            card.dataset.hovered = "true";
          }
        });

        card.addEventListener("mouseleave", () => {
          // Khôi phục màu sắc ban đầu khi thẻ được hover lại sau khi đã được hover trước đó
          if (card.dataset.hovered === "true") {
            button.style.backgroundColor = originalColor;
            card.dataset.hovered = "false";
          }
        });
      });
    </script>
        <script src="./js/course.js"></script>
    </body>
</html>