<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">

    <c:if test="${not empty sessionScope.USER}">
        <c:redirect url=""></c:redirect>
    </c:if>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="./css/register.css">
        <link rel="icon" type="image/png" href="./image/newlogo.png">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.0.2/css/bootstrap.min.css" integrity="sha512-8qV1Bc/gqjKX4e6V9sJmGtBd4g1eJ6fj8v4mmlY5f8/zBBZSv8BCNB4JHfzrS7J9S9hVQZ+Pz+vp1l1z+LB8vA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <title>Sign Up</title>
    </head>

    <body>
            <div class="signin">
            <span class="boderLine">
                <form action="mainController" method="POST">
                    <h2>Sign Up</h2>
                    <div class="input">
                        <span>Họ và Tên</span>
                        <div class="input-right">
                            <input type="text" name="name" required="required" placeholder="6 - 30 ký tự">
                            <i></i>
                        </div>
                    

                    </div>
                    <div class="input male">
                        <span>Giới tính</span>
                        <div class="input1-right">
                            <span><input type="radio" name="gender" value="Male">Male</span>
                            <span><input type="radio" name="gender" value="Female">Female</span>
                            <span><input type="radio" name="gender" value="Other">Other</span>
                        </div>


                    </div>
                    <div class="input">
                        <span>Số điện thoại</span>
                        <div class="input-right">
                            <input type="text" name="phone" value="${requestScope.PHONE}" required="required" placeholder="10 chữ số">
                            <i id="error-tooltip" style="display:none;" class="fa-solid fa-circle-exclamation text-danger" data-bs-custom-class="error-tooltip" data-bs-toggle="tooltip" data-bs-placement="right" title="${requestScope.ERROR}"></i><br> 
                            <i></i>
                        </div>

                    </div>
                    <div class="input">
                        <span>Mật khẩu</span>
                        <div class="input-right">
                            <input type="password" name="password" required="required" placeholder="6 - 20 ký tự">
                            <i></i>
                        </div>

                    </div>
                    <div class="input">
                        <span for="password-confirm">Xác nhận mật khẩu</span>
                        <div class="input-right">
                            <input type="password" placeholder="Nhập lại mật khẩu" name="password-confirm" required>
                            <i></i>
                        </div>

                    </div>

                    <div class="input">
                        <span>Địa chỉ</span>
                        <div class="input-right">
                            <input type="text" name="address" required="required" placeholder="20 - 70 ký tự">
                            <i></i>
                        </div>

                    </div>
                    <a href="home.jsp"><input type="button" value="HUỶ" id="link-button"></a>
                    <input type="submit" name="action" value="SignUp">
                </form>
            </span>
        </div>
    </div>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.0.2/js/bootstrap.bundle.min.js" integrity="sha512-YsKfWz2CmJgUZ5fF7T3Xs/7E6dQp2Kx8OJ+eKZoT6uI2z+Qs4z5wMSTgC7WY/1B6RJ9E5WkYy2Z8K6e2Ll8vQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
</body>

</html>
