<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <link rel="stylesheet" href="./css/courses.css">
        <title>Document</title>
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
        <div class="container">
            <div class="course-body">
                <div class="course-body-title">
                    <h1>CÁC KHÓA HỌC</h1>
                    <table class="table table-hover">
                        <thead>
                                <th scope="col">ID</th>
                                <th scope="col">NAME</th>
                                <th scope="col">DESC</th>
                                <th scope="col">PRICE</th>
                                <th scope="col">IMAGE</th>
                                <th scope="col">UPDATE</th>
                                <th scope="col">DELETE</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="p" items="${list}">
                                <tr>

                                    <td>${p.getCourseID()}</td>
                                    <td>${p.getCourseName()}</td>
                                    <td>${p.getDescription()}</td>
                                    <td>${p.getPrice()}</td>
                                    <td>${p.getCourseImage()}</td>
                                    <td><button type="submit" name="update" class="update-button">Update</button></td>
                                    <td><button type="submit" name="delete" class="delete-button">Delete</button></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
                <button type="submit" name="insert" class="update-button">Insert</button>

            </div>

        </div>

    </body>
</html>