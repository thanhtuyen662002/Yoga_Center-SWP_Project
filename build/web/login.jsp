<%-- 
    Document   : login
    Created on : 30-05-2023, 19:01:51
    Author     : HP Pro
--%>

<%@page import="model.dto.UserDTO"%>
<%@page import="model.dao.UserDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
    <c:if test="${not empty sessionScope.USER}">
        <c:redirect url=""></c:redirect>
    </c:if>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./css/login.css">
    <link rel="icon" type="image/png" href="./image/newlogo.png">
    <title>Login</title>
</head>
<body>
    <% String ErrorMessage = (String) request.getAttribute("ErrorMessage"); %>
    <div class="login"> 
        <div class="left">
            <div class="overlay"></div>
            <div class="left-img"><img src="./image/pt.jpg" alt=""></div>
            <div class="left-content">WELCOME TO THE YOGA</div>
        </div>
        <div class="right">
            <span class="boderLine">
                <form action="mainController" method="POST">
                <h2>Sign In</h2>
                <div class="right-input">
                    <input type="text" required = "required" name="txtPhone">
                    <span>Phone Number</span>
                    <i></i>
                </div>
                <div class="right-input">
                    <input type="password" required = "required" name="txtPassword">
                    <span>Password</span>
                    <i></i>
                </div>
                <div class="right-links">
                    <a href="homeCustomer">Back</a>       
                </div>
                <div style="text-align: center; color: red">
                    <% if (ErrorMessage != null) {%>
                    <p><%= ErrorMessage%></p>
                    <% }%>
                </div>
                <div></div>
                <input type="submit" value="LOGIN" name="action">
            </form>
        </span>
        </div>
    </div>
</body>
</html>