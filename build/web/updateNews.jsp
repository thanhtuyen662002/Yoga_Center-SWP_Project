<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
            <form action="update" method="POST">
            <h1>CẬP NHẬT TIN TỨC</h1>
            <table>
                <tr>
                    <td>newsID</td>
                    <td><input value="${ns.newsID}" type="text" name="newsID" readonly></td>
                </tr>
<!--                <tr>
                    <td>StPhone</td>
                    <td><input value="" type="text" name="name"></td>
                </tr>-->
                <tr>
                    <td>Title</td>
                    <td><input value="${ns.title}" type="text" name="title"></td>
                </tr>
<!--                <tr>
                    <td>postDate</td>
                    <td><input value="" type="text" name="image"></td>
                </tr>-->
                <tr>
                    <td>Image</td>
                    <td><input value="${ns.image}" type="text" name="image"></td>
                </tr>
                <tr>
                    <td>Content</td>
                    <td><input value="${ns.content}" type="text" name="content"></td>
                </tr>
                <tr>
                    <td>Category</td>
                    <td><input value="${ns.categoryID}" type="text" name="categoryID"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><button type="submit">CẬP NHẬT</button></td>
                </tr>
            </table>
        </form>
    </body>
</html>