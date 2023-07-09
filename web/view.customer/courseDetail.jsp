<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
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
        <link rel="icon" type="image/x-icon" href="../image/logo-yoga.jpg">
        <link rel="stylesheet" href="./css/showCourseDetails1.css" />
        <link rel="stylesheet" href="./css/course.css" />
        <title>Khóa Học</title>
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
                            <ul style="font-size: 2rem">
                                ${c.description}

                            </ul>
                        </div>
                        <div class="price-detail-rating">
                            <h1>Đánh Giá Khóa Học</h1>
                            <form  action="insertfb" method="Post">
                                <div class="rating-box">
                                    <!--                                    <h3 id="notice">Viết bình luận thành công!!!</h3>-->
                                    <h2>Viết Bình Luận ...<i class="fa-solid fa-pen fa-sm"></i></h2>

                                    <input name="comment" id="inputContent" type="text" 
                                           placeholder="Mời bạn bình luận và đánh giá khóa học" required />
                                    <input name="cusPhone" type="hidden" value="${sessionScope.USER.phone}"/>
                                    <input name="courseID" type="hidden" value="<%= request.getParameter("id")%>">
                                    <button  type="submit">Gửi</button>
                                </div>
                            </form>
                            <div class="rating-box-question">
                                <c:forEach var="feedback" items="${feedbackList}">
                                    <div class="question-card">
                                        <div class="question-title">
                                            <div class="nameUser">${feedback.cusName}</div>
                                            <div class="timeQuestion">${feedback.dayup}</div>
                                        </div>
                                        <div class="question-content">${feedback.comment}</div>
                                    </div>
                                </c:forEach>
                            </div>
                        </div>
                    </div>

                    <div class="price-detail-right">
                        <div class="aa">
                            <div class="price-detail-box">
                                <div class="price-detail-head">
                                    <h2>GIÁ KHÓA HỌC</h2>
                                    <c:set var="persent" value="${d.discount/100}"/>
                                    <c:set var="ID" value="${d.eventID}"/>
                                    <c:set var="total" value="${c.numberOfMonths * price}"/>
                                    <c:set var="discount" value="${total - (total * persent)}"/>
                                    <c:set var="totalPrice">
                                        <fmt:formatNumber type="currency" value="${total}"/>
                                    </c:set>
                                    <c:set var="discountPrice" >
                                        <fmt:formatNumber type="currency" value="${discount}"/>
                                    </c:set>
                                    <c:set var="rootPriceOfMonths" >
                                        <fmt:formatNumber type="currency"  value="${price}" />
                                    </c:set>
                                    <c:set var="discountPriceOfMonths" >
                                        <fmt:formatNumber type="currency"  value="${price - (price * persent)}" />
                                    </c:set>
                                    <c:set var="rootPriceOfSlot" >
                                        <fmt:formatNumber type="currency"  value="${price/8}" />
                                    </c:set>
                                    <c:set var="discountPriceOfSlot" >
                                        <fmt:formatNumber type="currency"  value="${(price - (price * persent))/8}" />
                                    </c:set>

                                    <c:if test="${persent != 0 || persent != '0.0' || persent != 0.0 || persent != '0'}">
                                        <del style="color: #A50000"><h2><c:out value="${totalPrice}"/></h2></del>
                                            </c:if>
                                    <h1><c:out value="${discountPrice}"/></h1>
                                </div>
                                <div class="price-detail-bottom">
                                    <ul>
                                        <li>
                                            <div class="price-detail-right-text">
                                                Thời gian tập luyện:
                                            </div>
                                            <c:if test="${c.numberOfMonths > 0}">
                                                <div class="price-detail-right-price">${c.numberOfMonths} THÁNG</div>
                                            </c:if>
                                            <c:if test="${c.numberOfMonths <= 0}">
                                                <div class="price-detail-right-price">7 NGÀY</div>
                                            </c:if>
                                        </li>
                                        <li>
                                            <div class="price-detail-right-text">Chi phí / tháng</div>
                                            <div class="price-detail-right-price">
                                                <c:if test="${persent != 0 || persent != '0.0' || persent != 0.0 || persent != '0'}">
                                                    <del style="color: #A50000"><h2><c:out value="${rootPriceOfMonths}"/></h2></del>
                                                        </c:if>
                                                        <c:out value="${discountPriceOfMonths}"/>
                                            </div>
                                        </li>
                                        <li>
                                            <div class="price-detail-right-text">Chí phí / buổi học</div>
                                            <div class="price-detail-right-price">
                                                <c:if test="${persent != 0 || persent != '0.0' || persent != 0.0 || persent != '0'}">
                                                    <del style="color: #A50000"><h2><c:out value="${rootPriceOfSlot}"/></h2></del>
                                                        </c:if>
                                                        <c:out value="${discountPriceOfSlot}"/>
                                            </div>
                                        </li>
                                        <li>- Áp dụng ưu đãi giảm: ${persent*100}%</li>
                                        <li>- Được sử dụng toàn bộ dịch vụ trung tâm</li>
                                        <li>
                                            <button type="submit" id="submit">ĐĂNG KÝ NGAY</button>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>

                        <div class="bb">
                            <div class="price-detail-form">
                                <div class="price-detail-form-head">
                                    <h1>Điền Thông Tin Tại Đây !!!</h1>
                                    <div id="back"><i class="fa-solid fa-arrow-left"></i></div>
                                </div>
                                <form id="registration-form" action="signupCourse?id=${course.courseID}&ID=${ID}&discount=${discount}" method="POST"
                                      onload="handleServletError(${ERROR})">

                                    <div class="price-detail-form-bottom">
                                        <ul>
                                            <li>
                                                <div class="price-detail-right-label">Họ và tên:</div>
                                                <div class="price-detail-right-input">
                                                    <input type="text" id="name" name="name" required />
                                                </div>
                                            </li>
                                            <li>
                                                <div class="price-detail-right-label">Số điện thoại:</div>
                                                <div class="price-detail-right-input">
                                                    <input type="number" id="phone" name="phone" required />
                                                </div>
                                            </li>
                                            <li>
                                                <div class="price-detail-right-label">Khoá học:</div>
                                                <div class="price-detail-right-input">
                                                    <option value="${course.courseID}">${course.courseName}</option>
                                                </div>
                                            </li>
                                            <li>
                                                <div class="price-detail-right-label">Địa chỉ:</div>
                                                <div class="price-detail-right-input">
                                                    <input type="text" id="name" name="address" required />
                                                </div>
                                            </li>
                                            <li>
                                                <div class="price-detail-right-label">Giới tính:</div>
                                                <div class="price-detail-right-input">
                                                    <select class="timeStudy" name="gender" id="">
                                                        <option value="Male" selected="">Male</option>
                                                        <option value="Female">Female</option>
                                                        <option value="Orther">Orther</option>
                                                    </select>
                                                </div>
                                            </li>
                                            <li>
                                                <div class="price-detail-right-label">
                                                    Thời gian muốn học:
                                                </div>
                                                <div class="price-detail-right-input">
                                                    <select class="timeStudy" name="time" id="">
                                                        <option value="" selected>Chọn thời gian học</option>
                                                        <c:forEach var="t" items="${time}">
                                                            <option value="${t.slotID}">${t.startTime} - ${t.endTime}</option>
                                                        </c:forEach>
                                                    </select>
                                                </div>
                                            </li>
                                            <li>
                                                <div class="price-detail-right-label">
                                                    Thời gian có thể đến trung tâm Yoga:
                                                </div>
                                                <div class="price-detail-right-input">
                                                    <select class="timeCome" name="timeToCome" id="">
                                                        <option value="" selected>
                                                            Chọn thời gian có thể đến trung tâm
                                                        </option>
                                                        <c:forEach var="T" items="${timeToCome}">
                                                            <option value="${T.timeToCome}">${T.timeToCome}</option>
                                                        </c:forEach>
                                                    </select>
                                                </div>
                                            </li>
                                            <div class="price-detail-price-button">
                                                <button type="submit" >ĐĂNG KÝ</button>
                                            </div>
                                        </ul>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <c:import url="customer_footer.jsp"/>
        <script>
            function handleServletError(errorMessage) {
                if (errorMessage === "ERROR") {
                    alert("Số điện thoại bạn vừa nhập đã có tài khoản!");
                } else {
                    // Xử lý các trường hợp khác nếu cần thiết
                }
            }
        </script>
        <script>
            let qc = document.getElementsByClassName("aa")[0];
            let form = document.getElementsByClassName("bb")[0];
            let submit = document.getElementById("submit");
            let back = document.getElementById("back");

            submit.addEventListener("click", function (event) {
                event.preventDefault();
                qc.style.display = "none";
                form.style.display = "block";
            });
            back.addEventListener("click", (event) => {
                event.preventDefault();
                qc.style.display = "block";
                form.style.display = "none";
            });
        </script>
        <script src="../js/showCourseDetails.js"></script>

    </body>
</html>