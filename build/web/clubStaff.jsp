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
        <link rel="stylesheet" href="./css/clubStaff.css" />

        <title>Course</title>

    </head>
    <body>
        <% String ErrorMessage = (String) request.getAttribute("ErrorMessage"); %>
        <c:if test="${empty sessionScope.STAFF}">
            <c:redirect url="login.jsp"></c:redirect>
        </c:if>
        <div class="wrapper d-flex align-items-stretch">
            <c:if test="${sessionScope.ROLE == 'AD'}">
                <c:import url="./views/Admin_Nhat/Header_Admin.jsp"/>
            </c:if>
            <div id="content">
                <div style="text-align: center; color: red; font-size: 2rem;">
                    <% if (ErrorMessage != null) {%>
                    <p><%= ErrorMessage%></p>
                    <% }%>
                </div>
                <div class="course-link">
                    <ul>
                        <li><a href="courses">Staff</a></li>
                        <li><a href="club" id="active">Câu lạc bộ</a></li>
                    </ul>
                </div>
                <div class="course-title" >
                    <div class="text">WELCOME STAFF</div>

                </div>
                <div class="table-name">
                    <h1>BẢNG DỮ LIỆU CÂU LẠC BỘ</h1>
                </div>
                <table id="course" class="display" style="width:100%" >
                    <thead>
                        <tr>
                            <th>Club Name</th>
                            <th>Address</th>
                            <th>Image</th>
                            <th>District</th>
                            <th>Hotline</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${list}" var="c">
                            <tr>
                                <td>${c.clubName}</td>
                                <td>${c.address}</td>
                                <td id="table-img"><img src="data:image;base64,${c.dataImage}"/></td>
                                <td>${c.district}</td>
                                <td>${c.hotline}</td>
                                <td id="tool">
                                    <a href="updateClub?clubID=${c.clubID}"><i class="fa-regular fa-pen-to-square" style="color: #33e31c;"></i></a>
                                    |
                                    <a onclick="showMess('${c.clubName}')" href="#" > <i class="fa-sharp fa-solid fa-trash"></i></a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>

            </div>

            <script src="./js/courseStaff.js"></script>
            <script src="/courseNav/bootstrap.min.js"></script>
            <script src="/courseNav/jquery.min.js"></script>
            <script src="/courseNav/main.js"></script>
            <script src="/courseNav/popper.js"></script>
            <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
            <script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
            <script>
                $(document).ready(function () {
                    $('#course').DataTable();
                });
            </script>

    </body>
</html>