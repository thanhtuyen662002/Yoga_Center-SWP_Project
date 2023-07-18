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
        <link rel="stylesheet" href="./css/updateClass.css" />
        <title>Update Class</title>
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
                        <li><a href="">Staff</a></li>
                        <li><a href="">Lớp học</a></li>
                        <li><a href="" id="active">Cập nhật</a></li>

                    </ul>
                </div>
                <div class="course-title" >
                    <div class="text">Welcome ${sessionScope.USER.name}</div>
                    <div class="insert"><a type="submit" name="insert" href="showclass">BACK</a></div>
                </div>
                <div class="table-name">
                    <h1>CHỈNH SỬA LỚP HỌC</h1>
                </div>

                    <form id="myForm"  action="updateClass?classID=${cls.classID}" method="POST">

                    <div class="update-box">
                        <div class="update-title">
                            <label for="title">Class Name</label>
                            <input type="text" name="className" value="${cls.className}" id="name-input" required="required"/>
                        </div>
                        <div class="update-cate">
                            <label for="cate">PT Name</label>
                            <select name="PT">
                                <c:forEach var="tc" items="${listTC}">
                                    <option value="${tc.phone}" 
                                            <c:if test="${tc.phone == ptPhone}">selected=""</c:if>
                                            >${tc.name}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="update-cate">
                            <label for="cate">Course Name</label>
                            <select name="courseID">
                                <c:forEach var="c" items="${listCourse}">
                                    <option value="${c.courseID}" <c:if test="${c.courseID == courseID}">selected=""</c:if>
                                            >${c.courseName}</option>
                                </c:forEach>
                            </select>
                        </div>

                        <div class="update-cate">
                            <label for="cate">Total Session</label>
                            <input type="number" name="totalSession" value="${cls.totalSession}" readonly=""
                                   style="background-color: #808080"/>
                        </div>
                        <div class="update-cate">
                            <label for="cate">Capacity</label>
                            <input type="number" name="capacity" value="${cls.capacity}" id="capacity" required="required"/>
                        </div>
                        <div></div>
                        <div class="update-content-wrapper">
                            <div class="update-content">
                                <label for="cate">Describe</label>
                                <textarea id="myTextarea" name="description" required="required">${cls.description}</textarea>
                            </div>
                            <div>
                                <div id="errorMsg" style="display:none; color:red;">Please enter description!</div>
                            </div>
                        </div>
                    </div>
                    <div class="table-button">
                        <button type="submit">UPDATE</button>
                    </div>
                </form>

            </div>
            <script>
                const nameInput = document.getElementById('name-input');
                const capacity = document.getElementById('capacity');
                const myTextarea = document.getElementById('myTextarea');
                var errorMsg = document.getElementById("errorMsg");

                capacity.step = '1';
                capacity.max = '50';


                capacity.addEventListener('input', function () {
                    let value = this.value;

                    if (value < 1) {
                        alert("Please enter least at 1 capacity!");
                        this.value = "";
                    }
                    if (value > 50) {
                        alert("Max value is 50 capacity!");
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
                        alert("You are not allowed to use special characters to name the class!");
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
