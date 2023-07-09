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
        <link rel="stylesheet" href="./css/updateGuest1.css" />
        <title>Update News</title>
    </head>
    <body>
        <c:if test="${empty sessionScope.STAFF}">
            <c:redirect url="login.jsp"></c:redirect>
        </c:if>
        <div class="wrapper d-flex align-items-stretch">
            <c:if test="${sessionScope.ROLE == 'AD'}">
                <c:import url="./views/Admin_Nhat/Header_Admin.jsp"/>
            </c:if>

            <!-- Page Content  -->
            <div id="content">
                <div class="course-link">
                    <ul>
                        <li><a href="">ADMIN</a></li>
                        <li><a href="">PT</a></li>
                        <li><a href="" id="active">UPDATE</a></li>

                    </ul>
                </div>
                <div class="course-title" >
                    <div class="text">WELCOME ADMIN</div>
                    <div class="insert"><a type="submit" name="showListTeacher" href="showListTeacher">BACK</a></div>
                </div>
                <div class="table-name">
                    <h1>CHỈNH SỬA THÔNG TIN PT</h1>
                </div>
                    <form action="updateTeacher?rootPhone=${x.phone}" method="POST" >
                        <div class="update-box">
                            <div class="update-title">
                                <label for="title">TÊN PT</label>
                                <input value="${x.name}" type="text" name="name" />
                            </div>
                            <div class="update-title">
                                <label for="title">SỐ ĐIỆN THOẠI</label>
                                <input value="${x.phone}" type="text" name="phone" />
                            </div>
                            <div class="update-title">
                                <label for="title">ĐỊA CHỈ</label>
                                <input value="${x.address}" type="text" name="address" />
                            </div>
                            <div class="update-title">
                                <label for="title">GIỚI TÍNH</label>
                                <select name="gender">
                                    <c:if test="${x.gender == 'Male'}">
                                        <option value="Male" selected="">Male</option>
                                        <option value="Female">Female</option>
                                        <option value="Other">Other</option>
                                    </c:if>
                                    <c:if test="${x.gender == 'Female'}">
                                        <option value="Male">Male</option>
                                        <option value="Female" selected="">Female</option>
                                        <option value="Other">Other</option>
                                    </c:if>
                                    <c:if test="${x.gender == 'Other'}">
                                        <option value="Male">Male</option>
                                        <option value="Female">Female</option>
                                        <option value="Other" selected="">Other</option>
                                    </c:if>
                                </select>
                            </div>
                        </div>
                        <div class="table-btn">
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
                </body>
                </html>