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
        <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
            crossorigin="anonymous"
            />
        <link rel="stylesheet" href="./css/classStaff.css" />
        <title>Lớp Học</title>
    </head>
    <body>
        <% String ErrorMessage = (String) request.getAttribute("ErrorMessage"); %>
        <c:if test="${empty sessionScope.STAFF}">
            <c:redirect url="login.jsp"></c:redirect>
        </c:if>
        <div class="wrapper d-flex align-items-stretch">
            <c:if test="${sessionScope.ROLE == 'ST'}">
                <c:import url="cashier_header.jsp"/>
            </c:if>
            <c:if test="${sessionScope.ROLE == 'TC'}">
                <c:import url="teacher_header.jsp"/>
            </c:if>
            <c:if test="${sessionScope.ROLE == 'AD'}">
                <c:import url="./views/Admin_Nhat/Header_Admin.jsp"/>
            </c:if>

            <!-- Page Content  -->
            <div id="content">
                <div style="text-align: center; color: red; font-size: 2rem;">
                    <% if (ErrorMessage != null) {%>
                    <p><%= ErrorMessage%></p>
                    <% }%>
                </div>
                <div class="course-link">
                    <ul>
                        <c:if test="${sessionScope.ROLE == 'ST'}">
                            <li><a href="">Staff</a></li>
                            </c:if>
                            <c:if test="${sessionScope.ROLE == 'TC'}">
                            <li><a href="">Teacher</a></li>
                            </c:if>
                        <li><a href="" id="active">Lớp học</a></li>
                    </ul>
                </div>
                <div class="table-name">
                    <h1>BẢNG DỮ LIỆU LỚP HỌC</h1>
                </div>
                <table id="class1" class="display" style="width:100%">
                    <thead>
                        <tr>
                            <th>TÊN LỚP </th>
                            <th>PT</th>
                            <th>KHÓA HỌC</th>
                            <th>NỘI DUNG</th>
                            <th>SỐ SLOT</th>
                            <th>SỐ HỌC VIÊN</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:if test="${sessionScope.ROLE == 'TC'}">
                            <c:forEach items="${list_class}" var="x">
                                <c:if test="${sessionScope.USER.name == x.name}">
                                    <tr>
                                        <td>${x.className}</td>
                                        <td>${x.name}</td>
                                        <td>${x.courseName}</td>
                                        <td>${x.description}</td>
                                        <td>${x.totalSession}</td>
                                        <td>${x.countTT} / ${x.capacity}</td>
                                        <td>
                                            <a href="showStudent?classID=${x.classID}"><i class="fa-solid fa-graduation-cap fa-bounce" style="color: #34ea10;"></i></i></a>
                                            <c:if test="${sessionScope.ROLE == 'AD'}">
                                                |
                                                <a onclick="showMess('${x.className}')" href="#" > <i class="fa-sharp fa-solid fa-trash"></i></a>
                                                </c:if>
                                        </td>
                                    </tr>
                                </c:if>
                            </c:forEach>
                        </c:if>
                        <c:if test="${sessionScope.ROLE == 'AD'|| sessionScope.ROLE == 'ST'}">
                            <c:forEach items="${list_class}" var="x">
                                <tr>
                                    <td>${x.className}</td>
                                    <td>${x.name}</td>
                                    <td>${x.courseName}</td>
                                    <td>${x.description}</td>
                                    <td>${x.totalSession}</td>
                                    <td>${x.countTT} / ${x.capacity}</td>
                                    <td>
                                        <c:if test="${sessionScope.ROLE == 'AD'|| sessionScope.ROLE == 'ST'}">
                                            <a href="showStudent?classID=${x.classID}"><i class="fa-solid fa-graduation-cap fa-bounce" style="color: #34ea10;"></i></i></a>
                                        </c:if>
                                        <c:if test="${sessionScope.ROLE == 'ST' && x.countTT < x.capacity}">
                                            |
                                            <a href="showLearner?id=${x.courseID}&classID=${x.classID}&countTT=${x.countTT}&total=${x.capacity}&message="><i class="fa-solid fa-users-line fa-fade" style="color: #300edd;"></i></i></a>
                                        </c:if>
                                        <c:if test="${sessionScope.ROLE == 'AD'}">
                                            |
                                            <a href="updateClass?classID=${x.classID}"><i class="fa-regular fa-pen-to-square" style="color: #33e31c;"></i></a>
                                            |
                                            <a onclick="showMess('${x.className}')" href="#" > <i class="fa-sharp fa-solid fa-trash"></i></a>
                                        </c:if>
                                    </td>
                                </tr>
                            </c:forEach>
                        </c:if>
                    </tbody>

                </table>

            </div>
            <script src="./js/classStaff.js"></script>
            <script src="/courseNav/bootstrap.min.js"></script>
            <script src="/courseNav/main.js"></script>
            <script src="/courseNav/popper.js"></script>
            <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
            <script src="/courseNav/jquery.min.js"></script>

            <script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
            <script>
                                            $(document).ready(function () {
                                                var table = $('#class1').DataTable();
                                            });
            </script>

    </body>
</html>