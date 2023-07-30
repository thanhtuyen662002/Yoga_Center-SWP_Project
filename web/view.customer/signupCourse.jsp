<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <link rel="stylesheet" href="./css/signupCourse.css" />

        <title>Sign Up Course</title>
    </head>
    <body>
        <c:import url="customer_header.jsp"/>
        <div class="banner">
            <div class="banner-color"></div>
            <div class="banner-bg"><img src="./image/news.jpg" alt="" /></div>

            <div class="title-bg">ĐĂNG KÝ KHÓA HỌC</div>
        </div>

        <div class="form-signup-course">
            <div class="container">
                <div class="course-signup-box">
                    <div class="course-signup-left">
                        <div class="left-img">
                            <img src="./image/price.webp" alt="" />
                        </div>
                    </div>
                    <div class="course-signup-right">
                        <h2
                            style="
                            text-align: center;
                            font-weight: 700;
                            font-family: Arial, sans-serif;
                            font-size: 3rem;
                            "
                            >
                            Điền Thông Tin Tại Đây
                        </h2>
                        <form id="registration-form" action="signupCourse" method="POST">
                            <label for="name">Họ tên:</label>
                            <input type="text" id="name" name="name" required />

                            <label for="phone">Số điện thoại:</label>
                            <input type="number" id="phone" name="phone" required />

                            <label for="course">Khoá học</label>
                            <select class="courseSelect" name="course" id="">
                                <option value="" selected>Chọn Khoá học muốn đăng ký</option>
                                <c:forEach var="c" items="${course}">
                                    <option value="${c.courseID}">${c.courseName}</option>
                                </c:forEach>
                            </select>

                            <label for="preferred-time">Thời gian muốn học:</label>
                            <select class="timeStudy" name="time" id="">
                                <option value="" selected>Chọn thời gian học</option>
                                <c:forEach var="t" items="${time}">
                                    <option value="${t.slotID}">${t.startTime} - ${t.endTime}</option>
                                </c:forEach>
                            </select>
                            
                            <label for="available-time">Thời gian có thể đến trung tâm Yoga:</label>
                            <select class="timeCome" name="timeToCome" id="">
                                <option value="" selected>
                                    Chọn thời gian có thể đến trung tâm
                                </option>
                                <c:forEach var="T" items="${timeToCome}">
                                    <option value="${T.timeToCome}">${T.timeToCome}</option>
                                </c:forEach>
                            </select>

                            <div class="btn-submit"><button>Đăng Ký</button></div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <!-- FOOTER -->
        <c:import url="customer_footer.jsp"/>
    </body>
</html>
