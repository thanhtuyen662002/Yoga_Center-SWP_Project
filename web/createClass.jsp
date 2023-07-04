<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <link rel="stylesheet" href="./css/createClass.css" />
        <title>Create Class</title>
    </head>
    <body>
        <c:if test="${empty sessionScope.STAFF}">
            <c:redirect url="login.jsp"></c:redirect>
        </c:if>
        <div class="wrapper d-flex align-items-stretch">
            <c:import url="./views/Admin_Nhat/Header_Admin.jsp"/>
            <!-- Page Content  -->
            <div id="content">
                <form >
                    <div class="course-link">
                        <ul>
                            <li><a href="mainController?action=class">Staff</a></li>
                            <li><a href="class">Lớp Học</a></li>
                            <li><a href="" id="active">Thêm Lớp Học</a></li>

                        </ul>
                    </div>
                </form>
                <div class="course-title" >
                    <div class="text">WELCOME STAFF</div>
                    <div class="insert"><a class="btn-back" type="button" style="margin-left: 0px;border-radius: 5px;border: none" onclick="goBack()">Back</a></div>                   
                </div>
                <div class="table-name">
                    <h1>THÊM LỚP HỌC</h1>
                </div>
                <form action="createClass" method="POST" onsubmit="return validateForm()">
                    <div class="update-box">
                        <div class="update-cate">
                            <label for="cate">Class Name</label>
                            <input type="text" name="className"/>
                        </div>                       
                        <div class="update-cate">
                            <label for="cate">PT Name</label>
                            <select name="ptPhone">
                                <c:forEach var="s" items="${staff}">
                                    <option value="${s.cusPhone}" onchange="">${s.cusName}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="update-cate">
                            <label for="cate">Capacity</label>
                            <input type="number" name="capacity"/>
                        </div>
                        <div class="update-cate">
                            <label for="cate">Course Name</label>
                            <select name="course" onchange="updateTotalSession()">
                                <c:forEach var="c" items="${course}">
                                    <option value="${c.courseID}" >${c.courseName}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="update-content-wrapper">
                            <div class="update-content">
                                <label for="cate">Describe</label>
                                <textarea id="myTextarea" name="description"></textarea>
                            </div>
                        </div>

                    </div>
                    <div class="table-btn">
                        <input type="submit" value="CREATE">
                    </div>
                </form>
            </div>

            <script>
                function validateForm() {
                    var inputs = document.getElementsByTagName("input");
                    for (var i = 0; i < inputs.length; i++) {
                        if (inputs[i].value == "") {
                            alert("Vui lòng nhập đầy đủ thông tin vào các trường!");
                            return false;
                        }
                    }
                    return true;
                }
            </script>
            <script src="/courseNav/bootstrap.min.js"></script>
            <script src="/courseNav/jquery.min.js"></script>
            <script src="/courseNav/main.js"></script>
            <script src="/courseNav/popper.js"></script>
            <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
            <script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>

    </body>
</html>