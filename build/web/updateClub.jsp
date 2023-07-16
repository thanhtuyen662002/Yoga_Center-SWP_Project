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

                    <form id="my-form" enctype="multipart/form-data" action="updateClub?clubID=${c.clubID}" method="POST">
                    <div class="update-box">
                        <div class="update-title">
                            <label for="title">Club Name</label>
                            <input type="text" name="clubName" id="name-input" value="${c.clubName}" required=""/>
                        </div>
                        <div class="update-title">
                            <label for="title">Address</label>
                            <input type="text" name="address" id="address" value="${c.address}" required="required"/>
                        </div>
                        <div class="update-title">
                            <label for="title">District</label>
                            <select name="district">
                                <c:forEach var="d" items="${district}">
                                    <option value="${d.district}" 
                                            <c:if test="${d.district == c.district}">selected=""</c:if>
                                            >${d.district}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="update-title">
                            <label for="title">Hotline</label>
                            <input type="text" name="hotline" id="hotline" value="${hotline}" required="required"/>
                        </div>
                        <div></div>
                        <div class="update-img">
                            <label for="cate">Image</label>
                            <input type="file" name="image" id="fileInput"
                                   onchange="previewImage(event)" accept="image/*"/>
                            <div class="file-img">
                                <img id="preview" src="data:image;base64,${c.dataImage}" alt="Preview"/>
                            </div>
                        </div>
                    </div>
                    <div class="table-button">
                        <button type="submit" onclick="hotlineCheck(event)">UPDATE</button>
                    </div>
                </form>

            </div>
            <script>
                const nameInput = document.getElementById('name-input');
                const address = document.getElementById('address');
                const hotline = document.getElementById('hotline');
                let check = false;

                nameInput.addEventListener('input', function () {
                    let value = this.value;
                    if (value.charAt(0).trim() !== value.charAt(0).toUpperCase()) {
                        alert("The first character shoule be uppercase!");
                        this.value = "";
                        check = false;
                    }
                    if (/[!@#$%^&*()+{}[\]|\\:;'<>?,./]/.test(value)) {
                        alert("You are not allowed to use special characters to name the club!");
                        this.value = value.replace(/[^a-zA-Z0-9_\s]/g, '');
                        check = false;
                    }

                });
                address.addEventListener('input', function () {
                    let value = this.value;
                    if (/[!@#$%^&*()+{}[\]|\\:;'<>?/]/.test(value)) {
                        alert("You are not allowed to use special characters to address!");
                        this.value = value.replace(/[^a-zA-Z0-9.,\s]/g, '');
                        check = false;
                    }

                });
                hotline.addEventListener('input', function () {
                    let value = this.value;
                    if (/[!@#$%^&*()+{}[\]|\\:;'<>?,./]/.test(value)) {
                        alert("You are not allowed to use special characters in the hotline!");
                        this.value = value.replace(/[^0-9\s]/g, '');
                        check = true;
                    } else if (/[^0-9\s]/.test(value)) {
                        alert("Only numbers are allowed in the hotline!");
                        this.value = value.replace(/[^0-9\s]/g, '');
                        check = true;
                    } else if (value.length > 12) {
                        alert("The hotline must be maximum 10 digits!");
                        value = value.replace(/(\d{4})(\d{3})(\d{3})/, '$1 $2 $3');
                        this.value = value.slice(0, 12);
                        check = true;
                    } else {
                        value = value.replace(/\s/g, '');
                        value = value.replace(/(\d{4})(\d{3})(\d+)/, '$1 $2 $3');
                        this.value = value;
                        check = true;
                    }
                });
                hotline.addEventListener('blur', function () {
                    let value = this.value;
                    if (value.length < 12 && !check) {
                        alert("The hotline must be at least 10 digits!");
                    }
                });

                function hotlineCheck(event) {
                    let value = hotline.value;
                    if (value.length < 12) {
                        alert("The hotline must be at least 10 digits!");
                        event.preventDefault();
                    } else {
                        document('my-form').submit();
                    }
                };
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
