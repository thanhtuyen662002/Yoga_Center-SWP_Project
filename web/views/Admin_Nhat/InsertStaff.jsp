<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
        <title>Insert Course</title>
    </head>
    <body>
<!--        <div class="wrapper d-flex align-items-stretch h-100">
            <nav id="sidebar">
                <div class="img bg-wrap text-center py-2" style="background-image: url(images/bg_1.jpg);">
                    <div class="user-logo">
                        <div class="img" style="background-image: url(../../image/logo-yoga.jpg);"></div>
                        <h3>YOGA CENTER</h3>
                    </div>
                </div>
                <ul class="list-unstyled components mb-5">
                    <li class="active">
                        <a href="#"><span class="fa-solid fa-book mr-3"></span> KHÓA HỌC</a>
                    </li>
                    <li>
                        <a href="#"><span class="fa fa-gift mr-3"></span> KHUYẾN MÃI</a>
                    </li>
                    <li>
                        <a href="#"><span class="fa-solid fa-calendar-days mr-3"></span> LỊCH DẠY</a>
                    </li>
                    <li>
                        <a href="#"><span class="fa-solid fa-newspaper mr-3"></span> TIN TỨC</a>
                    </li> 
                    <li>
                        <a href="#"><span class="fa-solid fa-people-group mr-3"></span> KHÁCH HÀNG</a>
                    </li> 
                    <li>
                        <a href="#"><span class="fa fa-sign-out mr-3"></span> Đăng Xuất</a>
                    </li>
                </ul>

            </nav>-->
            <c:import url="Header_Admin.jsp"/>
            <!-- Page Content  -->
            <div id="content">
                <div>
                    <div class="course-link">
                        <ul>
                            <li><a href="listStaff">Admin</a></li>
                            <li><a href="listStaff">List Staff</a></li>
                            <li><a href="insertStaff">Create Staff</a></li>
                        </ul>
                    </div>
                    <div class="table-name border" style="height: 15%">
                        <h4>Create Staff</h4>
                    </div>
                </div>
                <div class="text-center pt-2 d-flex w-100 justify-content-end pr-4">
                    <button onclick="goBack()" class="btn-primary rounded-2 border-0 pr-2 pl-2" style="font-size: 24px">Back</button>
                </div>
                <div class="m-3 parent pl-3" style="height: 60%;background-color: white;border-radius: 10px;padding-top: 2%">
                    <div class="justify-content-center d-flex">
                        <c:if test="${fn:length(msgError) >= 1}">
                            <span id="error-fullname" class="error-message" style="color: red;">${msgError}</span>
                        </c:if>
                    </div> 
                    <form id="frm-submit" action="insertStaff" method="post" style="padding-right: 30%">
                        <div class="mb-3 row">  
                            <label for="inputPassword" class="col-sm-2 col-form-label">Phone<i style="color: red">*</i></label>
                            <div class="col-sm-10">
                                <input type="tel" class="form-control" oninput="validatePhone()" maxlength="10" id="input-phone" placeholder="Enter Phone" name="phone" value="${phone}" required>
                            </div>
                        </div>
                        <div class="mb-3 row">
                            <label for="inputPassword"  class="col-sm-2 col-form-label">Password<i style="color: red">*</i></label>
                            <div class="col-sm-10">
                                <input type="password" oninput="validatePassword()" class="form-control" id="input-pwd" placeholder="Enter Password" name="pws" required>
                            </div>       
                            <span id="errorText" class="error-message" style="color: red"></span>
                        </div>
                        <div class="mb-3 row">
                            <label for="inputPassword" class="col-sm-2 col-form-label">Confirm Password<i style="color: red">*</i></label>
                            <div class="col-sm-10">
                                <input type="password" class="form-control" id="confirmPwd" oninput="confirmPasswords()" placeholder="Enter Password" name="confirmPws" required>
                                <span id="passwordError" style="color: red;"></span>
                            </div>
                        </div>
                        <div class="mb-3 row">
                            <label for="inputPassword" class="col-sm-2 col-form-label">Full Name<i style="color: red">*</i></label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="input-fullname" placeholder="Enter full name" name="fullName" value="${fullName}" required>
                            </div>
                            <span id="error-fullname" class="error-message" style="color: red;"></span>
                        </div>
                        <div class="mb-3 row">
                            <label for="inputPassword" class="col-sm-2 col-form-label">Address</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="inputPassword" placeholder="Enter address" name="address" value="${address}">
                            </div>
                        </div>
                        <div class="row">
                            <label for="inputPassword" class="col-sm-2 col-form-label">Gender</label>
                            <div class="col-sm-10">
                                <input type="radio" name="gender" value="Male" 
                                       <c:if test="${gender == 'Male'}"></c:if>
                                           checked
                                           > Male
                                       <input type="radio" name="gender" value="FeMale"
                                       <c:if test="${gender == 'FeMale'}">
                                           checked
                                       </c:if>
                                       > FeMale
                            </div>
                        </div>    
                </div>
                <div class="text-center w-100 mt-2">
                    </form>
                    <button type="button" onclick="checkValidate()" class="btn-primary rounded-4 border-0 pr-2 pl-2" id="btn-submit" style="font-size: 24px;background-color: grey">Create</button>
                </div>
            </div>
        </div>

        <script src="./../../courseNav/bootstrap.min.js"></script>
        <script src="./../../courseNav/jquery.min.js"></script>
        <script src="./../../courseNav/main.js"></script>
        <script src="./../../courseNav/popper.js"></script>
        <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
        <script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
        <script src="./../../ckeditor/ckeditor.js"></script>
        <script>
                        CKEDITOR.replace("myTextarea");
        </script>
        <script src="./course.js"></script>
        <script>
                        function goBack() {
                            window.history.back();
                        }

                        var checkPass = false;
                        var checkCfPass = false;
                        var checkUsername = false;

                        function confirmPasswords()
                        {
                            var password = document.getElementById('input-pwd').value;
                            var confirmPassword = document.getElementById('confirmPwd').value;
                            var passwordError = document.getElementById('passwordError');
                            var btnSubmit = document.getElementById('btn-submit');

                            if (password !== confirmPassword) {
                                passwordError.textContent = 'Passwords do not match.';
                                checkCfPass = false;
                            } else {
                                passwordError.textContent = ''; // Clear the error message
                                checkCfPass = true;
                            }
                        }

                        function validatePhone() {
                            var input = document.getElementById('input-phone');
                            var value = input.value;

                            // Remove any non-numeric characters
                            var numericValue = value.replace(/[^0-9]/g, '');

                            // Truncate the value if it exceeds the maximum length
                            if (numericValue.length > 10) {
                                numericValue = numericValue.substring(0, 10);
                            }

                            // Update the input value
                            input.value = numericValue;
                        }

                        function validatePassword() {
                            var input = document.getElementById('input-pwd');
                            var value = input.value;
                            var btnSubmit = document.getElementById('btn-submit');
                            var hasNumber = /\d/.test(value); // Check for at least one digit
                            var hasUppercase = /[A-Z]/.test(value); // Check for at least one uppercase letter

                            if (value.length < 8 || !hasNumber || !hasUppercase) {
                                // Invalid input
                                document.getElementById('errorText').textContent = "Input must be at least 8 characters long and contain at least 1 number and 1 uppercase letter";
                                checkPass = false;
                            } else {
                                // Clear the error message
                                document.getElementById('errorText').textContent = "";
                                checkPass = true;
                            }
                        }

                        function validateUserName() {
                            var input = document.getElementById('input-username');
                            var value = input.value;

                            var isValid = /^[a-zA-Z0-9]+$/.test(value); // Check for alphabet characters and numbers

                            if (!isValid) {
                                // Invalid input
                                document.getElementById('error-username').textContent = "Input must contain only alphabet characters and numbers";
                                checkUsername = false;
                            } else {
                                // Clear the error message
                                document.getElementById('error-username').textContent = "";
                                checkUsername = true;
                            }
                        }


                        function checkValidate() {
                            if (checkCfPass && checkPass) {
                                var frm = document.getElementById("frm-submit");
                                frm.submit();
                            } else {
                                alert("Please check your information again");
                            }
                        }
        </script>
    </body>
</html>