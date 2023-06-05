<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
            <form action="updateEvent" method="POST">
            <h1>CẬP NHẬT SỰ KIỆN</h1>
            <table>
                <tr>
                    <td>ID</td>
                    <td><input value="${c.eventID}" type="text" name="ID" readonly></td>
                </tr>
                <tr>
                    <td>Tên sự kiện</td>
                    <td><input value="${c.eventName}" type="text" name="name"></td>
                </tr>
                <tr>
                    <td>ID khóa học</td>
                    <td><input value="${c.courseID}" type="text" name="cID"></td>
                </tr>
                <tr>
                    <td>Mô tả sự kiện</td>
                    <td><input value="${c.description}" type="text" name="description"></td>
                </tr>
                <tr>
                    <td>% Giảm giá</td>
                    <td><input value="${c.discount}" type="text" name="discount"></td>
                </tr>
                <tr>
                    <td>Ngày bắt đầu</td>
                    <td><input value="${c.daystart}" type="text" name="daystart"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><button type="submit">CẬP NHẬT</button></td>
                </tr>
            </table>
        </form>
    </body>
</html>
