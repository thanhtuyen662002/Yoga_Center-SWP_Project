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
            <c:if test="${sessionScope.ROLE == 'AD'}">
                <c:import url="./views/Admin_Nhat/Header_Admin.jsp"/>
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
                <form action="loadGuest" method="POST" id="my-form">
                    <div class="update-box">
                        <div class="update-title">
                            <label for="title">Full Name</label>
                            <input type="text" required = "required" name="fullName" value="${g.fullName}" id="fullname"/>
                        </div>
                        <div class="update-cate">
                            <label for="cate">Phone Number</label>
                            <input type="text" required = "required" name="phone" value="${phone}" id="phone"/>
                        </div>
                        <div class="update-cate">
                            <label for="cate">Password</label>
                            <input type="text" name="password" value="123@" readonly="" 
                                   style="background-color: #808080"/>
                        </div>
                        <div class="update-cate">
                            <label for="cate">Address</label>
                            <input type="text" required = "required" name="address" value="${g.address}" id="address"/>
                        </div>
                        <div class="update-cate">
                            <label for="cate">Gender</label>
                            <select name="gender">
                                <option value="Male">Male</option>
                                <option value="Female">Female</option>
                                <option value="Other">Other</option>
                            </select>
                        </div>   
                    </div>
                    <div class="table-button">
                        <button type="submit" onclick="hotlineCheck(event)">CREATE</button>
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
                const fullname = document.getElementById('fullname');
                const phone = document.getElementById('phone');
                const address = document.getElementById('address');

                fullname.addEventListener('input', function () {
                    let value = this.value;

                    value = value.toLowerCase();
                    const words = value.split(/\s+/);
                    for (let i = 0; i < words.length; i++) {
                        const word = words[i];
                        const firstChar = word.charAt(0);
                        words[i] = firstChar.toUpperCase() + word.slice(1);
                    }
                    value = words.join(' ');
                    this.value = value;
                    if (/[!@#$%^&*()_+{}[\]|\\:;'<>?,./]/.test(value)) {
                        alert("You are not allowed to use special characters to name the class!");
                        this.value = "";
                    }
                });

                address.addEventListener('input', function () {
                    let value = this.value;

                    if (/[!@#$%^&*()_+{}[\]|\\:;'<>?/]/.test(value)) {
                        alert("You are not allowed to use special characters to name the class!");
                        this.value = value.replace(/[^a-zA-Z0-9\s]/g, '');
                    }

                });

                phone.addEventListener('input', function () {
                    let value = this.value;

                    if (/[!@#$%^&*()+{}[\]|\\:;'<>?,./]/.test(value)) {
                        alert("You are not allowed to use special characters in the phone number!");
                        this.value = value.replace(/[^0-9\s]/g, '');
                    } else if (/[^0-9\s]/.test(value)) {
                        alert("Only numbers are allowed in the phone number!");
                        this.value = value.replace(/[^0-9\s]/g, '');
                    } else if (value.length > 12) {
                        alert("The phone number must be maximum 10 digits!");
                        value = value.replace(/(\d{4})(\d{3})(\d{3})/, '$1 $2 $3');
                        this.value = value.slice(0, 12);
                    } else if (value.charAt(0) !== '0') {
                        alert("The first digit of phone number must be start with 0!");
                        this.value = '';
                    } else if (value.charAt(1) === '0') {
                        alert("Invalid phone number!");
                        this.value = '';
                    } else {
                        value = value.replace(/\s/g, '');
                        value = value.replace(/(\d{4})(\d{3})(\d{3})/, '$1 $2 $3');
                        this.value = value;
                    }
                });
                function hotlineCheck(event) {
                    let value = phone.value;
                    if (value.length < 12) {
                        alert("The phone number must be 10 digits!");
                        event.preventDefault();
                    } else {
                        document('my-form').submit();
                    }
                }
                ;
            </script>
            <script>
                CKEDITOR.replace("myTextarea");
            </script>
            <script src="./js/course.js"></script>
    </body>
</html>
