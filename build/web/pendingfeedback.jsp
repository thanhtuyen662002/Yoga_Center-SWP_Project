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
        <link rel="stylesheet" href="./css/feedbackStaff.css" />
        <title>Đánh Giá Khóa Học</title>
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
                        <li><a href="">Staff</a></li>
                        <li><a href="" id="active">Đánh Giá</a></li>
                    </ul>
                </div>
                <div class="course-title" >
                    <div class="text">Welcome ${sessionScope.USER.name}</div>
                </div>
                <div class="table-name">
                    <h1>BẢNG ĐÁNH GIÁ</h1>
                </div>
                <table id="course" class="display" style="width:100%">
                    <thead>
                        <tr>
                            <th>TÊN HỌC VIÊN</th>
                            <th>SỐ ĐIỆN THOẠI</th>
                            <th>TÊN KHÓA HỌC</th>
                            <th>NGÀY ĐĂNG</th>
                            <th>ĐÁNH GIÁ</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${list_pendingfeedback}" var="x">
                            <tr>                                
                                <td>${x.cusName}</td>
                                <td id="title">${x.cusPhone}</td>
                                <td >${x.courseName}</td>                               
                                <td >${x.dayup}</td>
                                <td ><div class="table-noidung">${x.comment}</div> </td>
                                <td>                             
                                    <a href="acceptfeedback?status=accept&cusPhone=${x.cusPhone}"><i class="fa-sharp fa-solid fa-check fa-beat" style="color: #91ff00;"></i></a>
                                    |
                                    <a  href="acceptfeedback?status=deny&cusPhone=${x.cusPhone}"><i class="fa-solid fa-xmark" style="color: #ff0000;"></i></a>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>

                </table>

            </div>
            <script src="./js/newsStaff.js"></script>
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
            <script>
                function showMess(param) {
                    var arr = param.split('-');
                    var id = arr[0];
                    var name = arr[1];
                    var option = confirm("Bạn có chắc chắn muốn xóa đánh giá của " + name + " hay không?");
                    if (option === true) {
                        window.location.href = 'acceptfeedback?status=deny&cusPhone=' + id;
                    }
                }
            </script>

    </body>
</html>