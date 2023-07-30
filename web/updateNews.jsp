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
        <link rel="stylesheet" href="./css/updateNews1.css" />
        <link rel="icon" type="image/png" href="./image/newlogo.png">
        <title>Update News</title>
    </head>
    <body>
        <c:if test="${empty sessionScope.STAFF}">
            <c:redirect url="login.jsp"></c:redirect>
        </c:if>
        <div class="wrapper d-flex align-items-stretch">
            <c:import url="./view.service/service_header.jsp"/>

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
                    <div class="text">Welcome ${sessionScope.USER.name}</div>
                    <div class="insert"><a type="submit" href="news">BACK</a></div>
                </div>
                <div class="table-name">
                    <h1>CHỈNH SỬA TIN TỨC</h1>
                </div>
                    <form id="myForm" action="updatenews" method="Post" enctype="multipart/form-data">
                    <div class="update-box">
                        <div class="update-title">
                            <label for="title">Title</label>
                            <input value="${ns.title}" type="text" name="title" id="name-input"/>
                        </div>
                        <div class="update-select">
                            <label>Category</label>
                            <select name="categoryID">
                                <c:if test="${ns.categoryID == '1'}">
                                    <option value="" selected>Chọn Loại Tin Tức</option>
                                    <option value="1" selected="">Blog</option>
                                    <option value="2">Product</option>
                                    <option value="3">Other</option>
                                </c:if>
                                <c:if test="${ns.categoryID == '2'}">
                                    <option value="" selected>Chọn Loại Tin Tức</option>
                                    <option value="1">Blog</option>
                                    <option value="2" selected="">Product</option>
                                    <option value="3">Other</option>
                                </c:if>
                                <c:if test="${ns.categoryID == '3'}">
                                    <option value="" selected>Chọn Loại Tin Tức</option>
                                    <option value="1">Blog</option>
                                    <option value="2">Product</option>
                                    <option value="3" selected="">Other</option>
                                </c:if>
                            </select>
                        </div>

                        <div class="update-cate">
                            <label>Image</label>
                            <input type="file" name="image" id="fileInput" onchange="previewImage(event)" accept="image/*" />

                            <div class="file-img">
                                    <img id="preview" src="data:image;base64,${ns.data}" width="50px" height="50px" alt="Preview">
                            </div>
                        </div>
                        <div class="update-content-wrapper">
                            <div class="update-content">
                                <label for="">Content</label>
                                <textarea id="myTextarea" name="content" required="required">${ns.content}</textarea>

                                <input type="hidden" name="newsID" value="${ns.newsID}"/>
                            </div>
                            <div>
                                <div id="errorMsg" style="display:none; color:red;">Please enter description!</div>
                            </div>
                        </div>
                    </div>
                    <div class="table-btn">
                        <button type="submit">Update</button>
                    </div>
                </form>
            </div>
            <script>
                const nameInput = document.getElementById('name-input');
                const myTextarea = document.getElementById("myTextarea");
                var errorMsg = document.getElementById("errorMsg");

                nameInput.addEventListener('input', function () {
                    let value = this.value;
                    if (value.charAt(0).trim() !== value.charAt(0).toUpperCase()) {
                        alert("The first character shoule be uppercase!");
                        this.value = "";
                    }
                    if (/[!@#$%^&*()+{}[\]|\\:;'<>?,./]/.test(value)) {
                        alert("You are not allowed to use special characters to name the club!");
                        this.value = value.replace(/[^a-zA-Z0-9\s]/g, '');
                    }
                });
                myTextarea.addEventListener('input', function () {
                    if (myTextarea.value.trim() === "") {
                        errorMsg.style.display = "block";
                    } else {
                        errorMsg.style.display = "none";
                    }
                });
                var myForm = document.getElementById("myForm");
                myForm.addEventListener("submit", function (event) {
                    if (myTextarea.value.trim() === "") {
                        errorMsg.style.display = "block";
                        event.preventDefault();
                    } else {
                        errorMsg.style.display = "none";
                    }

                    if (nameInput.value.trim() === "") {
                        alert("Please input course name!");
                        event.preventDefault();
                    }
                });
            </script>
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