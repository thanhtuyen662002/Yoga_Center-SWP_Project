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
        <link rel="stylesheet" href="./css/insertCourse.css" />
        <title>Insert Course</title>
    </head>
    <body>
        <% String ErrorMessage = (String) request.getAttribute("ErrorMessage"); %>
        <c:if test="${empty sessionScope.STAFF}">
            <c:redirect url="login.jsp"></c:redirect>
        </c:if>
        <div class="wrapper d-flex align-items-stretch">
            <c:if test="${sessionScope.ROLE == 'SV'}">
                <c:import url="./view.service/service_header.jsp"/>
            </c:if>
     
            <!-- Page Content  -->
            <div id="content">
                
                <!--<div class="alert alert-danger" role="alert" style="text-align: center">-->
                <div style="text-align: center; color: red; font-size: 2rem;">
                    <% if( ErrorMessage != null) { %>
                    <p><%= ErrorMessage %></p>
                    <% } %>
                </div>
                <div class="course-link">
                    <ul>
                        <li><a href="mainController?action=Staff">Staff</a></li>
                        <li><a href="mainController?action=courses">Khóa Học</a></li>
                        <li><a href="mainController?action=insertCourse" id="active">Thêm</a></li>

                    </ul>
                </div>
                <div class="course-title" >
                    <div class="text">WELCOME STAFF</div>
                    <div class="insert"><a type="submit" name="insert" href="courses">BACK</a></div>
                </div>
                <div class="table-name">
                    <h1>THÊM KHÓA HỌC</h1>
                </div>
                <form enctype="multipart/form-data" action="insertCourse" method="POST">
                <div class="update-box">
                    <div class="update-title">
                        <label for="title">Name</label>
                        <input type="text" name="name" />
                    </div>
                    <div class="update-cate">
                        <label for="cate">Price</label>
                        <input type="number" name="price" />
                    </div>
                    <div class="update-cate">
                        <label for="cate">Number of months</label>
                        <input type="number" name="numberOfMonths" />
                    </div>
                    <div class="update-img">
                        <label for="cate">Image</label>
                        <input type="file" name="image" id="fileInput" onchange="previewImage(event)" accept="image/*" />
                        <div class="file-img">
                            <img id="preview" src="#" alt="Preview"/>
                        </div>
                    </div>
                    <div class="update-content-wrapper">
                        <div class="update-content">
                            <label for="">Describe</label>
                            <textarea id="myTextarea" name="description"></textarea>
                        </div>
                    </div>
                </div>
                <div class="table-button">
                    <button type="submit">INSERT</button>
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
            <script src="./js/course.js"></script>
    </body>
</html>
