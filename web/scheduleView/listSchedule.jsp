<%-- 
    Document   : listSchedule
    Created on : May 30, 2023, 7:29:59 PM
    Author     : dell
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.time.LocalDate" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Document</title>
        <link rel="stylesheet" href="qlns.css" type="text/css" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
        <script src="script.js"></script>
    </head>

    <body>
        <div class="back" style="background-image: url(	https://img6.thuthuatphanmem.vn/uploads/2022/07/01/anh-nen-dep-yoga_011708114.jpg);
             width: 100%; position: absolute; top: 0; bottom: 0;
             ">
            <section class="table-section" style="padding: 40px">
                <p style="text-align: center; font-size: 24px; font-style: italic;font-weight: bold" >Schedule Details</p>
                <table class="table">
                    <thead>
                        <tr style="background-color: #6b90d9;">
                            <th rowspan="2" class="select-year-custom" style="max-width: 100px;">
                                <div class="d-flex gap-2 align-items-center">
                                    <h6 class="text-danger mb-0">YEAR</h6>
                                    <select class="form-select" style="height: fit-content;"
                                            aria-label="Default select example">
                                        <option selected>2023</option>
                                        <option >2024</option>
                                    </select>
                                </div>
                                <div class="d-flex gap-2 align-items-center">
                                    <h6 class="mb-0">Week</h6>
                                    <form id="myForm" action="listSchedule" method="post">
                                        <select id="mySelect" name="currentDay"
                                                class="form-select" style="height: fit-content;margin-top: 3%"
                                                aria-label="Default select example">
                                            <c:forEach items="${mondays}" var="monday">
                                                <c:set var="sunday" value="${monday.plusDays(6)}" />
                                                <option ${(monday eq currentMonday)?"selected":""} value="${monday}">${monday} to ${sunday}</option>
                                            </c:forEach>
                                        </select>
                                    </form>
                                </div>
                            </th>
                            <th>
                                MON
                            </th>
                            <th>
                                TUE
                            </th>
                            <th>
                                WED
                            </th>
                            <th>
                                THU
                            </th>
                            <th>
                                FRI
                            </th>
                            <th>
                                SAT
                            </th>
                            <th>SUN</th>
                        </tr>
                        <tr style="background-color: #6b90d9;">
                            <c:forEach var="day" items="${requestScope.week}">
                                <th>
                                    ${day}
                                </th>
                            </c:forEach>
                        </tr>
                    </thead>
                    <tbody>
                        <c:set var="sche" value="${schedule}" />
                        <c:set var="day" value="${week}" />
                        <c:set var="slot" value="${slots}" />
                        <c:set var="slotsSize" value="${fn:length(slots)}" />
                        <c:forEach var="i" begin="0" end="${slotsSize-1}" step="1">
                            <tr style="background-color: white;">
                                <th>Slot ${slot[i].id}<br>(${slot[i].startTime}-${slot[i].endTime})</th>
                                    <c:forEach var="j" begin="0" end="6" step="1">
                            <form id="frm${i}${j}" action="viewSchedule" method="get">
                                <input type="hidden" name="id" id="id${i}${j}"/>
                                <input type="hidden" name="action" value="ViewDetails"/>
                            </form>
                            <th id="${i}${j}">-</th>
                            </c:forEach>
                        </tr>
                    </c:forEach>
                    <c:forEach var="sc" items="${schedule}">
                        <c:forEach var="i" begin="0" end="${slotsSize-1}" step="1">
                            <c:if test="${sc.slot.id eq slot[i].id}">
                                <c:set var="row" value="${i}" />
                            </c:if>
                        </c:forEach>
                        <c:forEach var="j" begin="0" end="6" step="1">
                            <c:if test="${sc.date eq day[j]}">
                                <c:set var="column" value="${j}" />
                            </c:if>
                        </c:forEach>
                        <script>
                            var header = document.getElementById("${row}${column}");
                            header.innerHTML = "<c:out value='${sc.classStudy.course.name}'/>" + "<br>" + "at" + "<br>" +
                                    "<c:out value='${sc.room.id}'/>";
                            var input = document.getElementById("id${row}${column}");
                            // Set the value of the input element
                            input.value = "<c:out value='${sc.id}'/>";

                            var frm = document.getElementById("frm${i}${j}");

                            var thElement = document.getElementById("${row}${column}");
                            // Add onclick event listener
                            thElement.addEventListener("click", function () {
                                document.getElementById("frm${row}${column}").submit();
                            });
                        </script>
                    </c:forEach>
                    </tbody>
                </table>
            </section>
        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
        crossorigin="anonymous"></script>
        <script src="https://kit.fontawesome.com/8d39de38b8.js" crossorigin="anonymous"></script>
        <script>
                            // Get the select element
                            var selectElement = document.getElementById("mySelect");

                            // Add an event listener for the change event
                            selectElement.addEventListener("change", function () {
                                // Submit the form when the option changes
                                document.getElementById("myForm").submit();
                            });
        </script>
    </body>

</html>