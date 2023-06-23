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
        <div class="wrapper d-flex align-items-stretch">
            <c:import url="staff_header.jsp"/>

            <!-- Page Content  -->
            <div id="content">
                <div class="course-link">
                    <ul>
                        <li><a href="">Staff</a></li>
                        <li><a href="" id="active">Tin Tức</a></li>
                    </ul>
                </div>
                <div class="course-title" >
                    <div class="text">WELCOME STAFF</div>
                    <div class="insert"><a value="" type="submit" name="">Insert</a></div>
                </div>
                <div class="table-name">
                    <h1>BẢNG DỮ LIỆU LỚP HỌC</h1>
                </div>
                <table id="course" class="display" style="width:100%">
                    <thead>
                        <tr>
                            <!--<th>ID</th>-->
                            <th>KHÓA HỌC</th>
                            <th>PT</th>
                            <th>TÊN LỚP </th>
                            <th>NỘI DUNG</th>
                            <th>SỐ SLOT</th>
                            <th>SỐ HỌC VIÊN</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${list_class}" var="x">
                            <tr>
                                <!--<th scope="row" id="id">${x.classID}</th>-->

                                <td>
                                    <c:if test="${x.courseID == 2}"> Basic</c:if>
                                    <c:if test="${x.courseID == 60}"> Advance</c:if>
                                    <c:if test="${x.courseID == 61}"> Teacher</c:if>
                                    <c:if test="${x.courseID == 62}"> Therapy</c:if>

                                    </td>
                                <td>${x.ptName}</td>
                                <td id="title">${x.className}</td>
                                <td >${x.description}</td>
                                <td >${x.capacity}</td>
                                <th scope="row" id="id">${x.totalSession}</th>
                                <td>                              


                                </td>
                            </tr>
                        </c:forEach>
                        </tfoot>

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
                    var table = $('#course').DataTable();
                });
            </script>

    </body>
</html>