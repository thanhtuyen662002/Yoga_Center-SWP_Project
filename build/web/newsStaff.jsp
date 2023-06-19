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
        <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
            crossorigin="anonymous"
            />
        <link rel="stylesheet" href="./css/newsStaff.css" />
        <title>Tin Tức</title>
    </head>
    <body>
        <div class="wrapper d-flex align-items-stretch">
            <c:import url="staff_header.jsp"/>

            <!-- Page Content  -->
            <div id="content">
                <div class="course-link">
                    <ul>
                        <li><a href="">Staff</a></li>
                        <li><a href="" id="active">Tin Tức</a></li>
                    </ul>
                </div>
                <div class="course-title" >
                    <div class="text">WELCOME STAFF</div>
                    <div class="insert"><a value="action?news" type="submit" name="insert">Insert</a></div>
                </div>
                <div class="table-name">
                    <h1>BẢNG DỮ LIỆU TIN TỨC</h1>
                </div>
                <table id="course" class="display" style="width:100%">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>TIÊU ĐỀ</th>
                            <th>NGÀY ĐĂNG</th>
                            <th>HÌNH ẢNH </th>
                            <!--<th>NỘI DUNG</th>-->
                            <th>THỂ LOẠI</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${list_news}" var="x">
                            <tr>
                                <th scope="row" id="id">${x.newsID}</th>
                                <!--<td>${x.stPhone}</td>-->
                                <td id="title">${x.title}</td>
                                <td >${x.postDate}</td>
                                <td id="table-img"><img src="./image/${x.image}" alt=""></td>
                                <!--<td ><div class="table-noidung">${x.content}</div> </td>-->
                                <td>
                                    <c:if test="${x.categoryID == 1}"> Blog</c:if>
                                    <c:if test="${x.categoryID == 2}"> Product</c:if>
                                    <c:if test="${x.categoryID == 3}"> Other</c:if>

                                    </td>
                                    <td>                              
                                        <a href="updatenews?newsID=${x.newsID}"><i class="fa-solid fa-pen"></i></a>
                                    <a href="deletenews?newsID=${x.newsID}"> <i class="fa-sharp fa-solid fa-trash"></i></a>

                                </td>
                            </tr>
                        </c:forEach>
                        </tfoot>

                </table>

            </div>

            <script src="/courseNav/bootstrap.min.js"></script>
            <script src="/courseNav/main.js"></script>
            <script src="/courseNav/popper.js"></script>
            <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
            <script src="/courseNav/jquery.min.js"></script>

            <script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
            <script>
                $(document).ready(function () {
                    var table = $('#course').DataTable();
                });
            </script>

    </body>
</html>