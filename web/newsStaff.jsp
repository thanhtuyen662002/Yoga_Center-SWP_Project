<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css"
            />

        <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
            crossorigin="anonymous"
            />
        <link rel="stylesheet" href="./css/courseStaff.css" />
        <title>News Staff</title>
    </head>
    <body>
        <div class="header-nav logo widthLess" id="logo">
            <button class="header-button">
                <div class="header-button-li btn1"></div>
                <div class="header-button-li btn2"></div>
                <div class="header-button-li btn3"></div>
            </button>
            <h2 class="h2">RO<span>LE</span> STA<span>FF</span></h2>
        </div>
        <nav class="nav-content1 widthLess" id="nav">
            <ul class="nav-content-list">
                <li>
                    <i class="fa-solid fa-book"></i>
                    <span><a href="mainController?action=courses">KHÓA HỌC</a></span>
                </li>
                <li>
                    <i class="fa-solid fa-newspaper"></i>
                    <span><a href="mainController?action=news">TIN TỨC</a></span>
                </li>
            </ul>
            <ul class="nav-content-list">
                <li>
                    <i class="fa-solid fa-calendar-days"></i>
                    <span><a>LỊCH DẠY</a></span>
                </li>
                <li>
                    <i class="fa-solid fa-people-group"></i>
                    <span><a>KHÁCH HÀNG</a></span>
                </li>
                <li>
                    <i class="fa-sharp fa-solid fa-tag"></i>
                    <span><a href="mainController?action=event">SỰ KIỆN</a></span>
                </li>
                <li>
                    <i class="fa-solid fa-arrow-right-from-bracket"></i>
                    <span><a href="logout">ĐĂNG XUẤT</a></span>
                </li>
            </ul>
        </nav>
        <div class="container">
            <div class="course-body ">
                <div class="course-body-title">
                    <h1>CÁC TIN TỨC</h1>
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th></th>
                                <th></th>
                                <th></th>
                                <th></th>
                                <th scope="col">ID</th>
                                <th scope="col">SỐ ĐIỆN THOẠI NHÂN VIÊN</th>
                                <th scope="col">TIÊU ĐỀ</th>
                                <th scope="col">NGÀY ĐĂNG</th>
                                <th scope="col" >HÌNH ẢNH</th>
                                <th scope="col">NỘI DUNG</th>
                                <th scope="col">ID PHÂN LOẠI</th>
                                <th scope="col">HÀNH ĐỘNG</th>
                            </tr>
                        </thead>
                        <tbody>  
                            <c:forEach items="${list}" var="x">
                                <tr>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <th scope="row" id="id">${x.newsID}</th>
                                    <td>${x.stPhone}</td>
                                    <td id="title">${x.title}</td>
                                    <td >${x.postDate}</td>
                                    <td  id="image">${x.image}</td>
                                    <td id="content">${x.content}</td>
                                    <td>
                                        <c:if test="${x.categoryID == 1}"> Blog</c:if>
                                        <c:if test="${x.categoryID == 2}"> Sản phẩm</c:if>
                                        <c:if test="${x.categoryID == 3}"> Khác</c:if>

                                        </td>
                                        <td>
                                            <a href="#"><i class="fa-solid fa-eye" style="color: #90401d;"></i></a>
                                            <a href="update?newsID=${x.newsID}"><i class="fa-solid fa-pen"></i></a>
                                        <a href="delete?nid=${x.newsID}"> <i class="fa-sharp fa-solid fa-trash"></i></a>

                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                    <a href="insertNews.jsp" style="margin-left: 8rem">THÊM</a>
                </div>
            </div>

        </div>
    <script src="./js/courseStaff.js"></script>
</body>
</html>