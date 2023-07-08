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
        <link rel="stylesheet" href="./css/addUserToClass.css" />
        <title>Lớp Học</title>
    </head>
    <body>
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
                <div class="course-link">
                    <ul>
                        <c:if test="${sessionScope.ROLE == 'ST'}">
                            <li><a href="">Staff</a></li>
                            </c:if>
                            <c:if test="${sessionScope.ROLE == 'TC'}">
                            <li><a href="">Teacher</a></li>
                            </c:if>
                        <li><a href="">Lớp học</a></li>
                        <li><a href="" id="active"></a></li>
                    </ul>
                </div>
                <div class="table-name">
                    <h1>DANH SÁCH HỌC VIÊN</h1>
                </div>
                <table id="class" class="display" style="width:100%">
                    <thead>
                        <tr>
                            <th>TÊN HỌC VIÊN </th>
                            <th>SỐ ĐIỆN THOẠI</th>
                    </thead>
                    <tbody>
                        <c:forEach var="l" items="${list}">
                            <tr>
                                <td>${l.name}</td>
                                <td>${l.phone}</td>
                            </c:forEach>
                    </tbody>
                </table>

            </div>

            <script src="/courseNav/bootstrap.min.js"></script>
            <script src="/courseNav/main.js"></script>
            <script src="/courseNav/popper.js"></script>
            <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
            <script src="/courseNav/jquery.min.js"></script>

            <script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
            <script>
                $(document).ready(function () {
                    var table = $('#class').DataTable();
                });
            </script>

    </body>
</html>