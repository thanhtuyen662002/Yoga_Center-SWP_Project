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
                        <c:forEach items="${list}" var="x">
                            <tr>
                                <td>${x.className}</td>
                                <td>${x.ptName}</td>
                                <td>${x.courseName}</td>
                                <td>${x.description}</td>
                                <td>${x.totalSession}</td>
                                <td>${x.capacity}</td>
                                <td>
                                    <a href="restoreClass?name=${x.className}"><i class="fa-solid fa-trash-arrow-up fa-bounce" style="color: #1dd33b;"></i></a>
                                </td>
                            </tr>
                        </c:forEach>
                        </tfoot>

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