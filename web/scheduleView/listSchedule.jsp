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
                        <c:set var="dayc" value="${week}" />
                        <c:forEach var="slot" items="${slots}">
                            <tr style="background-color: gray;">
                                <th>Slot ${slot.id}</th>
                                    <c:forEach var="i" begin="0" step="1" end="6">
                                        <c:forEach var="j" begin="0" step="1" end="7">
                                            <c:if test="${dayc[i] eq sche[j].date}">
                                            <th>${sche[j].date}-${dayc[i]}</th>
                                            </c:if>
                                            <c:if test="${dayc[i] ne sche[j].date}">
                                            <th>${sche[j].date}</th>
                                            </c:if>
                                        </c:forEach>
                                    </c:forEach>
                            </tr>
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