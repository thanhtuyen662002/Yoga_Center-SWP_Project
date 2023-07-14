<%-- 
    Document   : insertCourse
    Created on : 02-06-2023, 16:51:52
    Author     : HP Pro
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
        <link rel="stylesheet" href="./css/updateCourse.css" />
        <title>Update Course</title>
    </head>
    <body>
        <% String ErrorMessage = (String) request.getAttribute("ErrorMessage");%>
        <c:if test="${empty sessionScope.STAFF}">
            <c:redirect url="login.jsp"></c:redirect>
        </c:if>
        <div class="wrapper d-flex align-items-stretch">
            <c:import url="./view.service/service_header.jsp"/>
            <!-- Page Content  -->
            <div id="content">
                <div style="text-align: center; color: red; font-size: 2rem;">
                    <% if (ErrorMessage != null) {%>
                    <p><%= ErrorMessage%></p>
                    <% }%>
                </div>
                <div class="course-link">
                    <ul>
                        <li><a href="courses">Staff</a></li>
                        <li><a href="courses">Khóa Học</a></li>
                        <li><a href="" id="active">Cập nhật</a></li>

                    </ul>
                </div>
                <div class="course-title" >
                    <div class="text">Welcome ${sessionScope.USER.name}</div>
                    <div class="insert"><a type="submit" name="insert" href="courses">BACK</a></div>
                </div>
                <div class="table-name">
                    <h1>CHỈNH SỬA KHÓA HỌC</h1>
                </div>

                <form id="myForm" enctype="multipart/form-data" action="updateCourse" method="POST">
                    <input type="text" name="id" value="${c.courseID}" hidden=""/>
                    <div class="update-box">
                        <div class="update-title">
                            <label for="title">Name</label>
                            <input type="text" name="name" value="${c.courseName}" id="name-input" required=""/>
                        </div>
                        <div class="update-cate">
                            <label for="cate">Price</label>
                            <input type="number" name="price" value="${price}" id="price-course"/>
                        </div>
                        <div class="update-cate">
                            <label for="cate">Number of months</label>
                            <input type="number" name="numberOfMonths" value="${c.numberOfMonths}" id="months-input"/>
                        </div>
                        <div class="update-img">
                            <label for="cate">Image</label>
                            <input type="file" name="image" id="fileInput" onchange="previewImage(event)" accept="image/*" />

                            <div class="file-img">
                                <img id="preview" src="data:image;base64,${c.courseData}" alt="Preview" />
                            </div>
                        </div>
                        <div class="update-content-wrapper">
                            <div class="update-content">
                                <label for="">Describe</label>
                                <textarea id="myTextarea" name="description">${c.description}</textarea>
                            </div>
                            <div id="errorMsg" style="display:none; color:red;">Please enter description!</div>
                        </div>
                    </div>
                    <div class="table-button">
                        <button type="submit">UPDATE</button>
                    </div>
                </form>

            </div>
            <script>
                const priceInput = document.getElementById('price-course');
                const monthsInput = document.getElementById('months-input');
                const nameInput = document.getElementById('name-input');
                const myTextarea = document.getElementById("myTextarea");
                var errorMsg = document.getElementById("errorMsg");

                priceInput.step = '100000';
                priceInput.max = '100000000';

                monthsInput.step = '0';
                monthsInput.max = '36';

                const specialCharacters = "!@#$%^&*()_+{}[]|\\:;'<>?,./";

                priceInput.addEventListener('input', function () {
                    let value = this.value;

                    if (value < 0) {
                        alert("Please enter a non-negative value!");
                        this.value = "";
                    }
                    if (value > 100000000) {
                        alert("Max value is 100.000.000đ!");
                        this.value = "";
                    }
                });

                monthsInput.addEventListener('input', function () {
                    let value = this.value;

                    if (value < 0) {
                        alert("Please enter a non-negative value!");
                        this.value = "";
                    }
                    if (value > 36) {
                        alert("Max value is 36!");
                        this.value = "";
                    }
                });

                nameInput.addEventListener('input', function () {
                    let value = this.value;

                    if (value.charAt(0).trim() !== value.charAt(0).toUpperCase()) {
                        alert("The first character shoule be uppercase!");
                        this.value = "";
                    }
                    if (/[!@#$%^&*()_+{}[\]|\\:;'<>?,./]/.test(value)) {
                        alert("You are not allowed to use special characters to name the course!");
                        this.value = "";
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
            <!--<script src="./course.js"></script>-->
    </body>
</html>
