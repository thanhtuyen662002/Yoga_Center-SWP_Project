<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
            <form action="updateCourse" method="POST">
            <h1>CẬP NHẬT KHÓA HỌC</h1>
            <table>
                <tr>
                    <td>ID</td>
                    <td><input value="${c.courseID}" type="text" name="ID" readonly></td>
                </tr>
                <tr>
                    <td>Tên khóa học</td>
                    <td><input value="${c.courseName}" type="text" name="name"></td>
                </tr>
                <tr>
                    <td>Mô tả khóa học</td>
                    <td><input value="${c.description}" type="text" name="description"></td>
                </tr>
                <tr>
                    <td>Hình ảnh</td>
                    <td><input value="${c.courseImage}" type="text" name="image"></td>
                </tr>
                <tr>
                    <td>Giá khóa học</td>
                    <td><input value="${c.price}" type="text" name="price"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><button type="submit">CẬP NHẬT</button></td>
                </tr>
            </table>
        </form>
    </body>
</html>
