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
        <link rel="stylesheet" href="./css/guestStaff.css" />
        <link rel="icon" type="image/png" href="./image/newlogo.png">
        <title>Guest Manager</title>
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
                        <li><a href="courses">Staff</a></li>
                        <li><a href="courses" id="active">Khách hàng</a></li>
                    </ul>
                </div>
                <div class="course-title" >
                    <div class="text">Welcome ${sessionScope.USER.name}</div>

                </div>
                <div class="table-name">
                    <h1>BẢNG DỮ LIỆU KHÁCH HÀNG</h1>
                </div>
                <table id="course" class="display" style="width:100%" >
                    <thead>
                        <tr>
                            <th>Full Name</th>
                            <th>Phone Number</th>
                            <th>Address</th>
                            <th>Gender</th>
                            <th>Course</th>
                            <th>Price</th>
                            <th>Action</th>

                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${list}" var="g">
                            <c:set var="money" value="${g.price}" />
                            <fmt:setLocale value="vi_VN"/>
                            <c:set var="price"> 
                                <fmt:formatNumber type="currency" value="${money}"/>
                            </c:set>

                            <tr>
                                <td>${g.fullName}</td>
                                <td>${g.phone}</td>
                                <td><div class="table-noidung">${g.address}</div></td>
                                <td>${g.gender}</td>
                                <td>${g.courseName}</td>
                                <td><c:out value="${price}"/></td>



                                <td id="tool">
                                    <a href="loadGuest?id=${g.signupID}"><i class="fa-solid fa-circle-plus fa-bounce" style="color: #14d72b;"></i></a>                                
                                    |
                                    <a href="updateguest?signupID=${g.signupID}"><i class="fa-regular fa-pen-to-square" style="color: #33e31c;"></i></a>
                                    |
                                    <a onclick="showMess('${g.signupID}-${g.fullName}')" href="#" > <i class="fa-sharp fa-solid fa-trash"></i></a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                    <tfoot>
                        <tr>
                            <th>Full Name</th>
                            <th>Phone Number</th>
                            <th>Address</th>
                            <th>Gender</th>
                            <th>Course</th>
                            <th>Price</th>
                            <th>Action</th>

                        </tr>
                    </tfoot>
                </table>

            </div>

            <script src="./js/guestStaff.js"></script>
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
            <script src="./js/staffDropdown.js"></script>
    </body>
</html>