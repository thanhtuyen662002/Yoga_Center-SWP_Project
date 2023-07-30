<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
        <link rel="stylesheet" href="./css/courseStaff.css" />
        <link rel="icon" type="image/png" href="./image/newlogo.png">
        <title>Course</title>
    </head>
    <body>
        <% String ErrorMessage = (String) request.getAttribute("ErrorMessage"); %>
        <c:if test="${empty sessionScope.STAFF}">
            <c:redirect url="login.jsp"></c:redirect>
        </c:if>
        <div class="wrapper d-flex align-items-stretch">
                <c:import url="./view.service/service_header.jsp"/>
            <!-- Page Content  -->
            <div id="content">
                <div style="text-align: center; color: red; font-size: 2rem;">
                    <% if (ErrorMessage != null) {%>
                    <p><%= ErrorMessage%></p>
                    <% }%>
                </div>
                <div class="course-link">
                    <ul>
                        <li><a href="courses">Staff</a></li>
                        <li><a href="courses" id="active">Khóa Học Đã Xóa</a></li>
                    </ul>
                </div>
                <div class="course-title" >
                    <div class="text">Welcome ${sessionScope.USER.name}</div>
                 
                </div>
                <div class="table-name">
                    <h1>BẢNG DỮ LIỆU KHÓA HỌC ĐÃ XÓA</h1>
                </div>
                
                <table id="course" class="display" style="width:100%" >
                    <thead>
                        <tr>
                            <th>Name</th>
                            <th>Description</th>
                            <th>Image</th>
                            <th>Price</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                    
                        <c:forEach items="${list}" var="c">
                            <c:set var="money" value="${c.price}" />
                            <fmt:setLocale value="vi_VN"/>
                            <c:set var="price"> 
                                <fmt:formatNumber type="currency" value="${money}"/>
                            </c:set>
                            <tr>
                                <td>${c.courseName}</td>
                                <td><div class="table-noidung">${c.description}</div></td>
                                <td id="table-img"><img src="data:image;base64,${c.courseData}"/></td>
                                <td><c:out value="${price}"/></td>
                                <td id="tool">
                                    <a href="restoreCourse?name=${c.courseName}"><i class="fa-solid fa-trash-arrow-up fa-bounce" style="color: #1dd33b;"></i></a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                    <tfoot>
                        <tr>
                            <th>Name</th>
                            <th>Description</th>
                            <th>Image</th>
                            <th>Price</th>
                            <th>Action</th>
                        </tr>
                    </tfoot>
                </table>
            </div>
            <script src="./courseNav/bootstrap.min.js"></script>
            <script src="./courseNav/jquery.min.js"></script>
            <script src="./courseNav/main.js"></script>
            <script src="./courseNav/popper.js"></script>
            <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
            <script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
            <script>
                                        $(document).ready(function () {
                                            $('#course').DataTable();
                                        });
            </script>
            <script src="./js/staffDropdown.js"></script>
    </body>
</html>