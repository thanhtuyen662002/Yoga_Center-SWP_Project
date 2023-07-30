<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
        <link rel="icon" type="image/png" href="./image/newlogo.png">
        <link rel="stylesheet" href="./css/billStaff.css" />
        <title>Hóa đơn</title>
    </head>
    <body>
        <c:if test="${empty sessionScope.STAFF}">
            <c:redirect url="login.jsp"></c:redirect>
        </c:if>
        <div class="wrapper d-flex align-items-stretch">
            <c:import url="./views/Admin_Nhat/Header_Admin.jsp"/>



            <!-- Page Content  -->
            <div id="content">
                <div class="course-link">
                    <ul>
                        <li><a href="">Staff</a></li>
                        <li><a href="" id="active">Hóa đơn</a></li>
                    </ul>
                </div>
                <div class="table-name">
                    <h1>BẢNG DỮ LIỆU HÓA ĐƠN</h1>
                </div>
                <table id="bill1" class="display" style="width:100%">
                    <thead>
                        <tr>
                            <th>TÊN KHÁCH HÀNG</th>
                            <th>SỐ ĐIỆN THOẠI</th>
                            <th>TÊN KHÓA HỌC</th>
                            <th>GIÁ KHÓA HỌC</th>
                            <th>NGÀY THANH TOÁN</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${list}" var="x">
                            <tr>
                                <td>${x.name}</td>
                                <td>${x.phone}</td>
                                <td>${x.courseName}</td>
                                <td><fmt:formatNumber type="currency" currencyCode="VND" value="${x.price}" /></td>
                                <td>${x.time}</td>
                            </tr>
                        </c:forEach>
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
                    var table = $('#bill1').DataTable();
                });
            </script>

    </body>
</html>