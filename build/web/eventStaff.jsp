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
        <link rel="stylesheet" href="./css/voucher1.css" />
        <title>Event</title>
    </head>
    <body>
        <div class="wrapper d-flex align-items-stretch">
            <nav id="sidebar">
                <div class="custom-menu">
                    <button type="button" id="sidebarCollapse" class="btn btn-primary">
                    </button>
                </div>
                <div class="img bg-wrap text-center py-4" style="background-image: url(images/bg_1.jpg);">
                    <div class="user-logo">
                        <div class="img" style="background-image: url(/image/logo-yoga.jpg);"></div>
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

            </nav>

            <!-- Page Content  -->
            <div id="content">
                <div class="course-link">
                    <ul>
                        <li><a href="http://localhost:8080/Yoga_Center/">Staff</a></li>
                        <li><a href="" id="active">Khuyến Mãi</a></li>
                    </ul>
                </div>
                <div class="course-title" >
                    <div class="text">WELCOME STAFF</div>
                    <div class="insert"><a type="submit" href="insertEvent.jsp" name="insert">Insert</a></div>
                </div>
                <div class="table-name">
                    <h1>BẢNG DỮ LIỆU KHUYẾN MÃI</h1>
                </div>
                <table id="event" class="display" style="width:100%">
                    <thead>
                        <tr>
                            <th>EventID</th>
                            <th>EventName</th>
                            <th>CourseName</th>
                            <th>Discount</th>
                            <th>DayStart</th>
                            <th>DayEnd</th>
                            <th>Image</th>
                            <th>Data</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${list}" var="e">
                            <tr>
                                <td>${e.eventID}</td>
                                <td>${e.eventName}</td>
                                <td>${e.courseName}</td>
                                <td>${e.discount}</td>
                                <td>${e.daystart}</td>
                                <td>${e.dayend}</td>
                                <td>${e.image}</td>
                                <td class="event-img"><img src="data:image;base64,${e.data}" /></td>
                                <td id="tool">
                                    <a href="#"><i class="fa-solid fa-eye "></i></a>
                                    <a href="updateEvent?id=${e.eventID}"><i class="fa-solid fa-pen"></i></a>
                                    <a href="#" onclick="showMess(${e.eventID})"><i class="fa-sharp fa-solid fa-trash"></i></a>

                                </td>
                            </tr>
                        </c:forEach>

                    </tbody>
                    <script>
                    </script>
                    <tfoot>
                        <tr>
                            <th>ID</th>
                            <th>Name</th>
                            <th>Course</th>
                            <th>Discount</th>
                            <th>DayStart</th>
                            <th>DayEnd</th>
                             <th>Image</th>
                            <th>Data</th>
                            <th>Action</th>

                        </tr>
                    </tfoot>
                </table>
                

            </div>

            <script src="/courseNav/bootstrap.min.js"></script>
            <script src="/courseNav/jquery.min.js"></script>
            <script src="/courseNav/main.js"></script>
            <script src="/courseNav/popper.js"></script>
            <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
            <script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
            <script>
                        $(document).ready(function () {
                            $('#event').DataTable();
                        });
            </script>
            <script>
                function showMess(id) {
                    var option = confirm('are you sure to delete');
                    if (option === true) {
                        window.location.href = 'deleteEvent?sid=' + id;
                    }
                }
            </script>
           
           
    </body>
</html>