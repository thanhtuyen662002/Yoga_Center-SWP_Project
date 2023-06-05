<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" />

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
        <link rel="stylesheet" href="./css/voucher.css">
        <title>Voucher</title>
    </head>
    <body>
        <div class="nav-background">
            <div class="container">
                <div class="nav">
                    <div class="nav-logo">
                        <a href="home.jsp">YO<span>GA</span> </a>
                    </div>
                    <input type="checkbox" id="toggler">
                    <label for="toggler"><i class="fas fa-bars fa-2xl"></i></label>
                    <div class="nav-menu">
                        <ul class="nav-menu-list">
                            <li class="nav-menu-item">
                                    <a class="nav-menu-link" href="mainController?action=club">CLB</a>
                                </li>
                                <li class="nav-menu-item">
                                     <a class="nav-menu-link" href="mainController?action=courses">KHÓA HỌC</a>
                                </li>
                                <li class="nav-menu-item">
                                    <a class="nav-menu-link" href="mainController?action=schedule">LỊCH HỌC</a>
                                </li>
                                <li class="nav-menu-item">
                                    <a class="nav-menu-link" href="mainController?action=voucher">KHUYẾN MÃI</a>
                                </li>
                                <li class="nav-menu-item">
                                    <a class="nav-menu-link" href="mainController?action=news">TIN TỨC</a>
                                </li>
                        </ul>
                        <button class="btn_contact">ĐĂNG NHẬP</button>
                    </div>
                </div>
            </div>
        </div>

        <div class="voucher">
            <div> <H1>CẬP NHẬT KHUYẾN MÃI TẠI ĐÂY</H1></div>
            <table>
                <thead>
                    <tr>
                        <th>EventID</th>
                        <th>Event Name</th>
                        <th>CourseID</th>
                        <th>Discount </th>
                        <th>DayStart</th>
                        <th>Update</th>
                        <th>Delete</th>

                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="c" items="${list}">
                        <tr>
                            <td>Cell 1</td>
                            <td>Cell 2</td>
                            <td>Cell 3</td>
                            <td>Cell 4</td>
                            <td>Cell 5</td>
                            <td><button type="submit" name="update" class="btn-update">Update</button></td>
                            <td><button type="submit" name="delete" class="btn-delete">Delete</button></td>

                        </tr>
                    </c:forEach>


                </tbody>
            </table>
            
        
    </body>
    <script src="./js/voucher.js"></script>
</html>
