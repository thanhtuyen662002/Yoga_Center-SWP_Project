<%-- 
    Document   : insertCourse
    Created on : 02-06-2023, 16:51:52
    Author     : HP Pro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="insertCourse" method="POST">
            <h1>Thêm khóa học</h1>
            <table>
                <tr>
                    <td>Tên khóa học</td>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <td>Mô tả khóa học</td>
                    <td><input type="text" name="description"></td>
                </tr>
                <tr>
                    <td>Hình ảnh</td>
                    <td><input type="text" name="image"></td>
                </tr>
                <tr>
                    <td>Giá khóa học</td>
                    <td><input type="text" name="price"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><button type="submit">THÊM</button></td>
                </tr>
            </table>
        </form>
    </body>
</html>
