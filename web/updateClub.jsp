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
        <link rel="stylesheet" href="./css/updateClub.css" />
        <title>Update Course</title>
    </head>
    <body>
        <% String ErrorMessage = (String) request.getAttribute("ErrorMessage");%>
        <c:if test="${empty sessionScope.STAFF}">
            <c:redirect url="login.jsp"></c:redirect>
        </c:if>
        <div class="wrapper d-flex align-items-stretch">
            <c:import url="./views/Admin_Nhat/Header_Admin.jsp"/>
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
                        <li><a href="club">Câu lạc bộ</a></li>
                        <li><a href="" id="active">Cập nhật</a></li>

                    </ul>
                </div>
                <div class="course-title" >
                    <div class="text">Welcome ${sessionScope.USER.name}</div>
                    <div class="insert"><a type="submit" name="insert" href="club">BACK</a></div>
                </div>
                <div class="table-name">
                    <h1>CHỈNH SỬA CÂU LẠC BỘ</h1>
                </div>

                <form enctype="multipart/form-data" action="updateClub?clubID=${c.clubID}" method="POST">
                    <div class="update-box">
                        <div class="update-title">
                            <label for="title">Club Name</label>
                            <input type="text" name="clubName" value="${c.clubName}"/>
                        </div>
                        <div class="update-title">
                            <label for="title">Address</label>
                            <input type="text" name="address" value="${c.address}"/>
                        </div>
                        <div class="update-title">
                            <label for="title">District</label>
                            <input type="text" name="district" value="${c.district}"/>
                        </div>
                        <div class="update-title">
                            <label for="title">Hotline</label>
                            <input type="text" name="hotline" value="${c.hotline}"/>
                        </div>
                        <div></div>
                        <div class="update-img">
                            <label for="cate">Image</label>
                            <input type="file" name="image" id="fileInput"
                                   onchange="previewImage(event)" accept="image/*" />
                            <div class="file-img">
                                <img id="preview" src="data:image;base64,${c.dataImage}" alt="Preview"/>
                            </div>
                        </div>
                    </div>
                    <div class="table-button">
                        <button type="submit">UPDATE</button>
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
            <!--<script src="./course.js"></script>-->
    </body>
</html>
