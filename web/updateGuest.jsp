<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <link rel="stylesheet" href="./css/updateGuest1.css" />
        <title>Update News</title>
    </head>
    <body>
        <c:if test="${empty sessionScope.STAFF}">
            <c:redirect url="login.jsp"></c:redirect>
        </c:if>
        <div class="wrapper d-flex align-items-stretch">
            <c:if test="${sessionScope.ROLE == 'ST'}">
                <c:import url="cashier_header.jsp"/>
            </c:if>

            <!-- Page Content  -->
            <div id="content">
                <div class="course-link">
                    <ul>
                        <li><a href="">Staff</a></li>
                        <li><a href="">Khóa Học</a></li>
                        <li><a href="" id="active">Chỉnh Sửa</a></li>

                    </ul>
                </div>
                <div class="course-title" >
                    <div class="text">Welcome ${sessionScope.USER.name}</div>
                    <div class="insert"><a type="submit" name="guest">BACK</a></div>
                </div>
                <div class="table-name">
                    <h1>CHỈNH SỬA THÔNG TIN KHÁCH HÀNG</h1>
                </div>
                <form action="updateguest?id=${list_guest.signupID}" method="Post" >
                    <div class="update-box">
                        <div class="update-title">
                            <label for="title">Full Name</label>
                            <input value="${list.fullName}" type="text" name="fullName" required = "required"/>
                        </div>
                        <div class="update-title">
                            <label for="title">Phone Number</label>
                            <input value="${list.phone}" type="text" name="phone" required = "required"/>
                        </div>
                        <div class="update-title">
                            <label for="title">Address</label>
                            <input value="${list.address}" type="text" name="address" required = "required"/>
                        </div>
                        <div class="update-title">
                            <label for="cate">Course Name</label>
                            <select name="courseID" class="red-select">
                                <c:forEach var="c" items="${clist}">
                                    <option value="${c.courseID}" <c:if test="${c.courseID == list.courseID}">selected=""</c:if>
                                            >${c.courseName}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="update-title">
                            <label for="cate">Gender</label>
                            <select name="gender" class="red-select">
                                <option value="Male" <c:if test="${list.gender == 'Male'}">selected=""</c:if>>Male</option>
                                <option value="Female" <c:if test="${list.gender == 'Female'}">selected=""</c:if>>Female</option>
                                <option value="Other" <c:if test="${list.gender == 'Other'}">selected=""</c:if>>Other</option>
                            </select>
                        </div>  
                    </div>
                    <div class="table-btn">
                        <button type="submit">UPDATE</button>
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
    </body>
</html>