<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css"
            />
        <link
            href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css"
            rel="stylesheet"
            />

        <link
            href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
            rel="stylesheet"
            />
        <link
            rel="stylesheet"
            href="https://cdn.datatables.net/1.13.4/css/jquery.dataTables.min.css"
            />
        <link rel="icon" type="image/png" href="./image/newlogo.png">
        <link rel="stylesheet" href="./../../css/editProfile.css" />
        <title>Edit Profile</title>
    </head>
    <body>
        <c:import url="./view.service/service_header.jsp"/>
        <!-- Content ? ?ây -->
        <div id="content">
            <div class="container bootstrap snippets bootdey">
                <h1 class="text-primary">Edit Profile</h1>
                <hr />
                <div class="row">
                    <!-- left column -->
                    <div class="col-md-3">
                        <div class="text-center">
                            <img
                                src="https://bootdey.com/img/Content/avatar/avatar7.png"
                                class="avatar img-circle img-thumbnail"
                                alt="avatar"
                                />
                            <h3 style="font-weight: 700;">SERVICE MANAGER</h3>
                        </div>
                    </div>

                    <!-- edit form column -->
                    <div class="col-md-9 personal-info">
                        <h2>Personal Information</h2>

                        <form id="frm-edit" method="post" action="editProfileAdmin" class="form-horizontal" role="form">
                            <div class="form-group">
                                <h4>Information</h4>
                                <div class="form-group-item">
                                    <label class="col-lg-3 control-label">Name :</label>
                                    <div class="col-lg-9">
                                        <input type="text" class="form-control" oninput="validateFullName()" id="input-fullname" placeholder="Enter full name" name="fullName" value="${account.name}" required=""/>
                                    </div>
                                    <span id="error-fullname" class="error-message" style="color: red;"></span>
                                </div>
                                <div class="form-group-item">
                                    <label class="col-lg-3 control-label"
                                           >Phone :</label
                                    >
                                    <div class="col-lg-9">
                                        <input type="tel" class="form-control" oninput="validatePhone()" maxlength="10" id="input-phone" placeholder="Enter Phone" name="phone" value="${account.phone}" required/>
                                    </div>
                                </div>
                                <div class="form-group-item">
                                    <label class="col-lg-3 control-label">Address :</label>
                                    <div class="col-lg-9">
                                        <input class="form-control" type="text" name="address" value="${account.address}" />
                                    </div>
                                </div>
                            </div>

                            <div class="form-group">
                                <h4>Security Information</h4>
                                <div class="form-group-item">
                                    <label class="col-lg-3 control-label"
                                           >Old Password :
                                    </label>
                                    <div class="col-lg-9">
                                        <input id="oldPwd" class="form-control" type="password" name="oldPwd">
                                    </div>
                                </div>
                                <div class="form-group-item">
                                    <label class="col-lg-3 control-label"
                                           >New Password :
                                    </label>
                                    <div class="col-lg-9">
                                        <input type="password" oninput="validatePassword()" class="form-control" id="input-pwd" placeholder="Enter Password" name="newPwd" required>
                                        <span id="errorText" class="error-message" style="color: red"></span>
                                    </div>
                                </div>
                                <div class="form-group-item">
                                    <label class="col-lg-3 control-label"
                                           >Confirm Password :
                                    </label>
                                    <div class="col-lg-9">
                                        <input type="password" class="form-control" id="confirmPwd" oninput="confirmPasswords()" placeholder="Enter Password" required>
                                        <span id="passwordError" style="color: red;"></span>
                                    </div>
                                </div>
                            </div>
                            <div class="form-btn d-flex justify-content-start">
                                <c:if test="${oldPwd == false}">
                                    <span id="passwordError" style="color: red;">Can't update profile because wrong old password</span>
                                </c:if>
                                <button type="button" onclick="submitForm()" class="btn-outline-success rounded-pill border ml-4" style="font-size: 20px">Save</button></br>

                            </div>
                        </form>

                        <c:if test="${isSuccess == true}">
                            <span id="passwordError" style="color: green;">Update Succesfull!</span>
                        </c:if>
                    </div>
                </div>
            </div>
            <hr />
        </div>
    </div>
    <script src="./../../courseNav/bootstrap.min.js"></script>
    <script src="./../../courseNav/jquery.min.js"></script>
    <script src="./../../courseNav/main.js"></script>
    <script src="./../../courseNav/popper.js"></script>
    <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>

    <!-- Bootstrap core JavaScript-->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    <script>
                                    var checkFullName = true;
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

                                    var pwd = true;
                                    var confirmPwd = true;

                                    function validateFullName() {
                                        var input = document.getElementById('input-fullname');
                                        var value = input.value;
                                        var isValid = /^[a-zA-Z\s]+$/.test(value); // Check for only alphabet characters and blank spaces
                                        if (!isValid) {
                                            checkFullName = false;
                                            // Invalid input
                                            document.getElementById('error-fullname').textContent = "Input must contain only alphabet characters and blank space";
                                        } else {
                                            checkFullName = true;
                                            // Clear the error message
                                            document.getElementById('error-fullname').textContent = "";
                                        }
                                    }

                                    function submitForm() {
                                        if (checkFullName) {
                                            if (document.getElementById('oldPwd').value !== '') {
                                                if (document.getElementById('input-pwd').value !== '') {
                                                    if (pwd && confirmPwd) {
                                                        document.getElementById('frm-edit').submit();
                                                    } else {
                                                        alert("Please check your information again!");
                                                    }
                                                } else {
                                                    alert("Please input your new password!");
                                                }
                                            } else {
                                                document.getElementById('frm-edit').submit();
                                            }
                                        } else {
                                            alert("Please check your information again!");
                                        }
                                    }

                                    var password = document.getElementById('input-pwd').value;
                                    function validatePassword() {
                                        var input = document.getElementById('input-pwd');
                                        var value = input.value;
                                        var btnSubmit = document.getElementById('btn-submit');
                                        var hasNumber = /\d/.test(value); // Check for at least one digit
                                        var hasUppercase = /[A-Z]/.test(value); // Check for at least one uppercase letter

                                        if (value.length < 8 || !hasNumber || !hasUppercase) {
                                            // Invalid input
                                            document.getElementById('errorText').textContent = "Input must be at least 8 characters long and contain at least 1 number and 1 uppercase letter";
                                            pwd = false;
                                        } else {
                                            // Clear the error message
                                            document.getElementById('errorText').textContent = "";
                                            pwd = true;
                                        }
                                    }

                                    var confirmPassword = document.getElementById('confirmPwd').value;
                                    function confirmPasswords()
                                    {
                                        var password = document.getElementById('input-pwd').value;
                                        var confirmPassword = document.getElementById('confirmPwd').value;
                                        var passwordError = document.getElementById('passwordError');
                                        var btnSubmit = document.getElementById('btn-submit');

                                        if (password !== confirmPassword) {
                                            passwordError.textContent = 'Passwords do not match.';
                                            confirmPwd = false;
                                        } else {
                                            passwordError.textContent = ''; // Clear the error message
                                            confirmPwd = true;
                                        }
                                    }
    </script>
</body>
</html>
