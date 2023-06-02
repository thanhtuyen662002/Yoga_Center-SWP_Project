<%-- 
    Document   : test
    Created on : 30-05-2023, 18:20:01
    Author     : HP Pro
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:forEach var="c" items="${list}">
           <h1>${c.name}</h1> 
        
        
        <ul>
            <c:forEach var="p" items="${list.courseID}">
        <li>
            ${p.CourseID}
        </li>
        </c:forEach>
        </ul>
           </c:forEach>
    </body>
</html>
