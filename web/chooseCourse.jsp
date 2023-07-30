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
        <link rel="stylesheet" href="./css/insertGuest.css" />
        <link rel="icon" type="image/png" href="./image/newlogo.png">
        <title>Insert Course</title>
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
            <!-- Page Content  -->
            <div id="content">

                <!--<div class="alert alert-danger" role="alert" style="text-align: center">-->
                <div style="text-align: center; color: red; font-size: 2rem;">
                    <% if (ErrorMessage != null) {%>
                    <p><%= ErrorMessage%></p>
                    <% }%>
                </div>
                <div class="course-link">
                    <ul>
                        <li><a href="mainController?action=Staff">Staff</a></li>
                        <li><a href="mainController?action=guest">Khách hàng</a></li>
                        <li><a href="#" id="active">Thêm</a></li>

                    </ul>
                </div>
                <div class="course-title" >
                    <div class="text">Welcome ${sessionScope.USER.name}</div>
                    <div class="insert"><a type="submit" name="insert" href="guest">BACK</a></div>
                </div>
                <div class="table-name">
                    <h1>TẠO TÀI KHOẢN</h1>
                </div>
                <form action="addGuestToBill" method="POST">
                    <div class="update-box">
                        <div class="update-title">
                            <label for="title">Full Name</label>
                            <input type="text" name="fullName" value="${fullName}" readonly=""/>
                        </div>
                        <div class="update-cate">
                            <label for="cate">Phone Number</label>
                            <input type="text" name="phone" value="${phone}" readonly=""/>
                        </div>
                        <div class="update-cate">
                            <label for="cate">Password</label>
                            <input type="text" name="password" value="123@" readonly=""/>
                        </div>
                        <div class="update-cate">
                            <label for="cate">Address</label>
                            <input type="text" name="address" value="${address}" readonly=""/>
                        </div>
                        <div class="update-cate">
                            <label for="cate">Gender</label>
                            <input type="text" name="gender" value="${gender}" readonly="">
                        </div>   
                        <div class="update-cate">
                            <label for="cate">Choose Course</label>
                            <select name="chooseCourse">
                                <c:forEach var="c" items="${listC}">
                                    <option value="${c.courseID}">${c.courseName}</option>
                                </c:forEach>
                            </select>
                        </div>   
                    </div>
                    <div class="table-button">
                        <button type="submit">CREATE</button>
                    </div>
                </form>
            </div>


            <script src="./courseNav/bootstrap.min.js"></script>
            <script src="./courseNav/jquery.min.js"></script>
            <script src="./courseNav/main.js"></script>
            <script src="./courseNav/popper.js"></script>
            <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
            <script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
            <script src="./ckeditor/ckeditor.js"></script>
            <script>
                CKEDITOR.replace("myTextarea");
            </script>
            <script src="./js/course.js"></script>
            </body>
            </html>
