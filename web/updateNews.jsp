<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <link rel="stylesheet" href="https://cdn.datatables.net/1.13.4/css/jquery.dataTables.min.css">
        <link rel="stylesheet" href="./css/updateNews.css" />
        <title>Update News</title>
    </head>
    <body>
        <div class="wrapper d-flex align-items-stretch">
            <nav id="sidebar">
                <div class="custom-menu">
                    <button type="button" id="sidebarCollapse" class="btn btn-primary">
                    </button>
                </div>
                <div class="img bg-wrap text-center py-4" style="background-image: url(images/bg_1.jpg);">
                    <div class="user-logo">
                        <div class="img" style="background-image: url(./image/logo-yoga.jpg);"></div>
                        <h3>YOGA CENTER</h3>
                    </div>
                </div>
                <ul class="list-unstyled components mb-5">
                    <li class="active">
                        <a href="#"><span class="fa-solid fa-book mr-3"></span> KHÓA HỌC</a>
                    </li>
                    <li>
                        <a href="#"><span class="fa fa-gift mr-3"></span> KHUYẾN MÃI</a>
                    </li>
                    <li>
                        <a href="#"><span class="fa-solid fa-calendar-days mr-3"></span> LỊCH DẠY</a>
                    </li>
                    <li>
                        <a href="#"><span class="fa-solid fa-newspaper mr-3"></span> TIN TỨC</a>
                    </li> 
                    <li>
                        <a href="#"><span class="fa-solid fa-people-group mr-3"></span> KHÁCH HÀNG</a>
                    </li> 
                    <li>
                        <a href="#"><span class="fa fa-sign-out mr-3"></span> Đăng Xuất</a>
                    </li>
                </ul>

            </nav>

            <!-- Page Content  -->
            <div id="content">
                <div class="course-link">
                    <ul>
                        <li><a href="">Staff</a></li>
                        <li><a href="">Khóa Học</a></li>
                        <li><a href="" id="active">Chỉnh Sửa</a></li>

                    </ul>
                </div>
                <div class="course-title" >
                    <div class="text">WELCOME STAFF</div>
                    <div class="insert"><a type="submit" name="insert">BACK</a></div>
                </div>
                <div class="table-name">
                    <h1>CHỈNH SỬA TIN TỨC</h1>
                </div>
                <form action="updatenews" method="Post" enctype="multipart/form-data">
                    <div class="update-box">
                        <div class="update-title">
                            <label for="title">Title</label>
                            <input value="${ns.title}" type="text" name="title" />
                        </div>
                        <div class="update-select">
                            <label>Title</label>
                            <select name="categoryID">
                                <option value="" selected>Chọn Loại Tin Tức</option>
                                <option value="1">Blog</option>
                                <option value="2">Product</option>
                                <option value="3">Other</option>
                            </select>
                        </div>

                        <div class="update-cate">
                            <label>Image</label>
                            <input type="file" name="image" id="fileInput" onchange="previewImage(event)" accept="image/*" />
                            <div class="file-img">

                                <c:if test="${not empty ns.image}">
                                    <img id="preview" src="data:image;base64,${ns.data}" width="50px" height="50px" alt="Preview">
                                </c:if>

                                <!--<img id="preview" src="#" alt="Preview" />-->
                            </div>
                        </div>
                        <div class="update-content-wrapper">
                            <div class="update-content">
                                <label for="">Content</label>
                                <textarea id="myTextarea" name="content">${ns.content}</textarea>

                                <input type="hidden" name="newsID" value="${ns.newsID}"/>
                            </div>
                        </div>
                    </div>
                    <div class="table-btn">
                        <!--<a href="#">UPDATE</a>-->
                        <!--<input class="btn btn-danger btn-lg" type="submit" name="action" value="UPDATE" />--> 
                        <button type="submit">Update</button>
                    </div>
                </form>
            </div>
            <script>
                function previewImage(event) {
                    var reader = new FileReader();
                    reader.onload = function () {
                        var output = document.getElementById("preview");
                        output.src = reader.result;
                    };

                    var fileInput = event.target;
                    var files = fileInput.files;

                    if (files.length > 0) {
                        reader.readAsDataURL(files[0]);
                    } else {
                        // Nếu không có file được chọn, đặt lại ảnh về trạng thái ban đầu
                        var output = document.getElementById("preview");
                        output.src = "#";
                    }
                }
            </script>
            <script src="./courseNav/bootstrap.min.js"></script>
            <script src="./courseNav/jquery.min.js"></script>
            <script src="./courseNav/main.js"></script>
            <script src="./courseNav/popper.js"></script>
            <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
            <script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
            <script src="./ckeditor/ckeditor.js"></script>
            <script>
                CKEDITOR.replace("myTextarea");
            </script>
    </body>
</html>