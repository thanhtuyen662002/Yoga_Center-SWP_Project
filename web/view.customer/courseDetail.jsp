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
        <link rel="stylesheet" href="./css/showCourseDetails.css" />
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
                    <c:set var="discount" value="${d.discount}"/>
                    <c:set var="ID" value="${d.eventID}"/>
                    <div class="price-detail-right">
                        <div class="aa">
                            <div class="price-detail-box">
                                <div class="price-detail-head">
                                    <h2>GIÁ KHÓA HỌC</h2>
                                    <c:set var="total" value="${c.numberOfMonths * c.price}"/>
                                    <c:set var="d" value="${discount/100}"/>
                                    <c:set var="discount" value="${total - (total * d)}"/>

                                    <c:if test="${d != 0 || d != '0.0' || d != 0.0 || d != '0'}">
                                        <del style="color: #A50000"><h2><fmt:formatNumber type="currency" currencyCode="VND" value="${total}" /></h2></del>
                                            </c:if>
                                    <h1><fmt:formatNumber type="currency" currencyCode="VND" value="${discount}" /></h1>
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
                                            <div class="price-detail-right-price">
                                                <c:if test="${d != 0 || d != '0.0' || d != 0.0 || d != '0'}">
                                                    <del style="color: #A50000"><h2><fmt:formatNumber type="currency" currencyCode="VND" value="${c.price}" /></h2></del>
                                                        </c:if>
                                                        <fmt:formatNumber type="currency"  value="${c.price - (c.price * d)}" currencyCode="VND"/>
                                            </div>
                                        </li>
                                        <li>
                                            <div class="price-detail-right-text">Chí phí / ngày</div>
                                            <div class="price-detail-right-price">
                                                <c:if test="${d != 0 || d != '0.0' || d != 0.0 || d != '0'}">
                                                    <del style="color: #A50000"><h2><fmt:formatNumber type="currency" currencyCode="VND" value="${c.price/30}" /></h2></del>
                                                        </c:if>
                                                        <fmt:formatNumber type="currency"  value="${(c.price - (c.price * d))/30}" currencyCode="VND"/>
                                            </div>
                                        </li>
                                        <li>- Áp dụng ưu đãi giảm: ${d*100}%</li>
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
                                        <form id="registration-form" action="signupCourse?id=${course.courseID}&ID=${ID}&discount=${discount}" method="POST">
                                       
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
            <c:if test="${not empty message}">
                <div class="alert alert-success">
                    <c:out value="${message}" />
                </div>
            </c:if>
            <c:if test="${not empty message}">
                <script>
                    $(document).ready(function () {
                        $('#myModal').modal('show');
                    });
                </script>
                <!-- Modal -->
                <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                <h4 class="modal-title" id="myModalLabel">Thông báo</h4>
                            </div>
                            <div class="modal-body">
                                <c:out value="${message}" />
                            </div>
                        </div>
                    </div>
                </div>
            </c:if>
        </div>

        <script src="./js/showCourseDetails.js"></script>
        <c:import url="customer_footer.jsp"/>
    </body>
</html>