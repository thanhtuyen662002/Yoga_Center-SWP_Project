<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <link rel="stylesheet" href="./css/insertEvent.css" />
        <link rel="icon" type="image/png" href="./image/newlogo.png">
        <title>InsertEvent</title>
    </head>
    <body>
        <c:if test="${empty sessionScope.STAFF}">
            <c:redirect url="login.jsp"></c:redirect>
        </c:if>
        <div class="wrapper d-flex align-items-stretch">
            <c:import url="./view.service/service_header.jsp"/>
            <!-- Page Content  -->
            <div id="content">
                <form >
                    <div class="course-link">
                        <ul>
                            <li><a href="mainController?action=event">Staff</a></li>
                            <li><a href="event">Khuyến Mãi</a></li>
                            <li><a href="" id="active">Thêm Khuyến Mãi</a></li>

                        </ul>
                    </div>
                </form>
                <div class="course-title" >
                    <div class="text">Welcome ${sessionScope.USER.name}</div>
                    <div class="insert"><a class="btn-back" type="button" style="margin-left: 0px;border-radius: 5px;border: none" onclick="goBack()">Back</a></div>                   
                </div>
                <div class="table-name">
                    <h1>THÊM KHUYẾN MÃI</h1>
                </div>
                <%@ page import="model.dto.CoursesDTO" %>  
                <%@ page import="java.util.List" %>
                <%@ page import="model.dao.EventDAO" %>
                <% EventDAO dao = new EventDAO(); %>
                <% List<CoursesDTO> courses = dao.getCourseName();%> 
                <form action="insertEvent" method="POST" enctype="multipart/form-data">
                    <div class="update-box">
                        <div class="update-cate">
                            <label for="cate">EventName</label>
                            <input type="Text" name="EventName" value ="${e.eventName}" required="required" id="name-input"/>
                        </div>                       
                        <div class="update-cate">
                            <label for="cate">CourseName</label>
                            <select name="Course" required="required">
                                <% for (CoursesDTO course : courses) {%>
                                <option value="<%= course.getCourseID()%>"><%= course.getCourseName()%></option>
                                <% }%>
                            </select>
                        </div>
                        <div class="update-cate">
                            <label for="cate">DayStart</label>
                            <input type="date" name="daystart" id="day-start" value="${e.daystart}" required="required"/>
                        </div>
                        <div class="update-cate">
                            <label for="cate">DayEnd</label>
                            <input type="date" name="dayend" id="day-end" value="${e.dayend}" required="required"/>
                        </div>     
                        <div class="update-img">
                            <label for="cate">Image</label>
                            <input type="file" name="image" id="fileInput" onchange="previewImage(event)" accept="image/*" required="required"/>
                            <div class="file-img" >
                                <img id="preview"  src="data:image;base64,${e.data}" alt="Preview"/>
                                <input type="text" hidden="" name="id" value="${e.eventID}" />
                            </div>
                        </div>
                        <div class="update-cate">
                            <label for="cate">Discount</label>
                            <input type="number" name="Discount" value="${e.discount}" required="required" id="discount-input"/>
                        </div>
                    </div>
                    <div class="table-btn">
                        <input type="submit" value="Insert">
                    </div>
                </form>
            </div>

            <script src="/courseNav/bootstrap.min.js"></script>
            <script src="/courseNav/jquery.min.js"></script>
            <script src="/courseNav/main.js"></script>
            <script src="/courseNav/popper.js"></script>
            <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
            <script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
            <script>
                const dayStartInput = document.querySelector('input[name="daystart"]');
                const dayEndInput = document.querySelector('input[name="dayend"]');
                const nameInput = document.getElementById('name-input');
                const discountInput = document.getElementById('discount-input');

                discountInput.step = '0';
                discountInput.max = '100';

                dayStartInput.addEventListener('change', validateDateRange);
                dayEndInput.addEventListener('change', validateDateRange);
                console.log(dayStartInput.value);
                function validateDateRange() {
                    const dayStart = new Date(dayStartInput.value);
                    const dayEnd = new Date(dayEndInput.value);
                    const currentDate = new Date();

                    if (dayStart <= currentDate) {
                        alert('The value of DayStart must be greater than the current date!');
                        dayStartInput.value = "";
                        return;
                    }

                    if (dayEnd <= dayStart) {
                        alert('The value of DayEnd must be greater than DayStart!');
                        dayEndInput.value = "";
                    }
                }
                nameInput.addEventListener('input', function () {
                    let value = this.value;

                    if (value.charAt(0).trim() !== value.charAt(0).toUpperCase()) {
                        alert("The first character shoule be uppercase!");
                        this.value = "";
                    }
                    if (/[!@#$%^&*()_+{}[\]|\\:;'<>?,./]/.test(value)) {
                        alert("You are not allowed to use special characters to name the event!");
                        this.value = value.replace(/[^a-zA-Z0-9\s]/g, '');
                    }

                });
                discountInput.addEventListener('input', function () {
                    let value = this.value;

                    if (value < 0) {
                        alert("Please enter a non-negative value!");
                        this.value = "";
                    }
                    if (value > 100) {
                        alert("Max discount is 100%!");
                        this.value = "";
                    }
                    if (/^0+$/.test(value)) {
                        this.value = "0";
                    }
                    if (value.startsWith('0') && value.length > 1) {
                        value = value.slice(1);
                        this.value = value;
                    }
                });
            </script>

            <script>
                function goBack() {
                    window.history.back();
                }
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
    </body>
</html>