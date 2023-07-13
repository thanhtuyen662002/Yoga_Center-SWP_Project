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
        <link rel="stylesheet" href="./css/updatevoucher.css" />
        <title>UpdateEvent</title>
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
                        <li><a href="mainController?action=event">Staff</a></li>
                        <li><a href="event">Khuyến Mãi</a></li>
                        <li><a href="" id="active">Chỉnh Sửa Khuyến Mãi</a></li>

                    </ul>
                </div>
                <div class="course-title" >
                    <div class="text">Welcome ${sessionScope.USER.name}</div>
                    <div class="insert"><a type="submit" name="insert" href="mainController?action=event">BACK</a></div>
                </div>
                <div class="table-name">
                    <h1>CHỈNH SỬA KHUYẾN MÃI</h1>
                </div>
                <%@ page import="model.dto.CoursesDTO" %>
                <%@ page import="java.util.List" %>
                <%@ page import="model.dao.EventDAO" %>
                <% EventDAO dao = new EventDAO(); %>
                <% List<CoursesDTO> courses = dao.getCourseName(); %>
                <form action="updateEvent" method="POST" enctype="multipart/form-data">
                    <div class="update-box">
                        <div class="update-title">
                            <label for="title">Event Name</label>
                            <input type="text" name="EventName" value="${e.eventName}" />
                        </div>
                        <div class="update-cate">
                            <label for="cate">Discount</label>
                            <input type="text" name="Discount" value="${e.discount}" />
                        </div>
                        <div class="update-course">
                            <label for="cate">Course Name</label>
                            <select name="Course">
                                <c:forEach var="c" items="${list}">
                                    <option value="${c.courseID}" 
                                            <c:if test="${c.courseID == e.courseID}">selected=""</c:if>
                                            >${c.courseName}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="update-cate">
                            <label for="cate">Day Start</label>
                            <input type="date" name="daystart" id="day-start" value="${e.daystart}" />
                        </div>

                        <div class="update-cate">
                            <label for="cate">Day End</label>
                            <input type="date" name="dayend" id="day-end" value="${e.dayend}"/>        
                        </div>
                        <div class="update-img">
                            <label for="cate">Image</label>
                            <input type="file" name="image" id="fileInput" onchange="previewImage(event)" accept="image/*" />
                           
                            <div class="file-img" >
                                <img id="preview"  src="data:image;base64,${e.data}" alt="Preview"/>
                                <input type="text" hidden="" name="id" value="${e.eventID}" />
                            </div>
                        </div>
                    </div>
                    <div class="table-btn">
                        <button type="submit">UPDATE</button>
                    </div>
                </form>
                <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
                <script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
                <script>
                                const dayStartInput = document.querySelector('input[name="day-start"]');
                                const dayEndInput = document.querySelector('input[name="day-end"]');
                                dayStartInput.addEventListener('change', validateDateRange);
                                dayEndInput.addEventListener('change', validateDateRange);
                                console.log(dayStartInput.value);
                                function validateDateRange() {
                                    const dayStart = new Date(dayStartInput.value);
                                    const dayEnd = new Date(dayEndInput.value);
                                    const currentDate = new Date();

                                    if (dayStart <= currentDate) {
                                        alert('Giá trị của DayStart phải lớn hơn ngày hiện tại.');
                                        dayStartInput.value = "";
                                        return;
                                    }

                                    if (dayEnd <= dayStart) {
                                        alert('Giá trị của DayEnd phải lớn hơn DayStart.');
                                        dayEndInput.value = "";
                                    }
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
                            var output = document.getElementById("preview");
                            output.src = "#";
                        }
                    }
                </script>
    </body>

</html>