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
                    <div class="text">Welcome ${sessionScope.USER.name}</div>
                    <div class="insert"><a class="btn-back" type="button" style="margin-left: 0px;border-radius: 5px;border: none" onclick="goBack()">Back</a></div>                   
                </div>
                <div class="table-name">
                    <h1>THÊM LỚP HỌC</h1>
                </div>
                <form action="createClass" method="POST">
                    <div class="update-box">
                        <div class="update-cate">
                            <label for="cate">Class Name</label>
                            <input type="text" required = "required" name="className" id="name-input"/>
                        </div>                       
                        <div class="update-cate">
                            <label for="cate">PT Name</label>
                            <select name="ptPhone">
                                <c:forEach var="s" items="${staff}">
                                    <option value="${s.phone}">${s.name}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="update-cate">
                            <label for="cate">Capacity</label>
                            <input type="number" required = "required" name="capacity" id="capacity"/>
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
                                <textarea id="myTextarea" name="description" required="required"></textarea>
                            </div>
                        </div>

                    </div>
                    <div class="table-btn">
                        <input type="submit" value="CREATE">
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
            <script>
                const nameInput = document.getElementById('name-input');
                const capacity = document.getElementById('capacity');
                const myTextarea = document.querySelector('#myTextarea');

                capacity.step = '1';
                capacity.max = '30';


                capacity.addEventListener('input', function () {
                    let value = this.value;

                    if (value < 1) {
                        alert("Please enter least at 1 capacity!");
                        this.value = "";
                    }
                    if (value > 30) {
                        alert("Max value is 30 capacity!");
                        this.value = "";
                    }
                    if (/^0+$/.test(value)) {
                        this.value = "0";
                    }
                    if (value.startsWith('0') && value.length > 1) {
                        value = value.slice(1);
                        this.value = value;
                    }
                });

                nameInput.addEventListener('input', function () {
                    let value = this.value;

                    if (value.charAt(0).trim() !== value.charAt(0).toUpperCase()) {
                        alert("The first character shoule be uppercase!");
                        this.value = "";
                    }
                    if (/[!@#$%^&*()_+{}[\]|\\:;'<>?,./]/.test(value)) {
                        alert("You are not allowed to use special characters to name the class!");
                        this.value = "";
                    }

                });

                myTextarea.addEventListener('input', function (event) {
                    const regex = /^[a-zA-Z0-9]+$/; // Chỉ chấp nhận chữ và số
                    const input = event.target.value;
                    
                    if (!regex.test(input)) {
                        event.target.value = input.replace(/[^a-zA-Z0-9]/g, ''); // Loại bỏ các ký tự khác chữ và số
                    }
                });
            </script>
    </body>
</html>