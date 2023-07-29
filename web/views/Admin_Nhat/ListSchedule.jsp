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
        <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css"
            />
        <link rel="stylesheet" href="https://cdn.datatables.net/1.13.4/css/jquery.dataTables.min.css">
        <link rel="stylesheet" href="./css/updateCourse.css" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
        <title>List Schedule Admin</title>
        <style>
            .a-page {
                background-color: #00FFFF;
                color: white;
                padding: 5px 10px;
                text-decoration: none;
                border-radius: 5px;
                margin: 2px;
            }
            #snackbar {
                visibility: hidden;
                min-width: 250px;
                margin-left: -125px;
                background-color: #333;
                color: #fff;
                text-align: center;
                border-radius: 2px;
                padding: 16px;
                position: fixed;
                z-index: 1;
                left: 50%;
                top: 30px; /* Change bottom to top and adjust the distance from the top */
            }

            #snackbar.show {
                visibility: visible;
                -webkit-animation: fadein 0.5s, fadeout 0.5s 2.5s;
                animation: fadein 0.5s, fadeout 0.5s 2.5s;
            }

            @-webkit-keyframes fadein {
                from {
                    top: 0;
                    opacity: 0;
                }
                to {
                    top: 30px;
                    opacity: 1;
                } /* Change bottom to top and adjust the distance from the top */
            }

            @keyframes fadein {
                from {
                    top: 0;
                    opacity: 0;
                }
                to {
                    top: 30px;
                    opacity: 1;
                } /* Change bottom to top and adjust the distance from the top */
            }

            @-webkit-keyframes fadeout {
                from {
                    top: 30px;
                    opacity: 1;
                }
                to {
                    top: 0;
                    opacity: 0;
                } /* Change bottom to top and adjust the distance from the top */
            }

            @keyframes fadeout {
                from {
                    top: 30px;
                    opacity: 1;
                }
                to {
                    top: 0;
                    opacity: 0;
                } /* Change bottom to top and adjust the distance from the top */
            }
        </style>
    </head>
    <body>
        <%@ include file="Header_Admin.jsp" %>
        <section class="table-section vw-100" style="padding: 40px">
            <p style="text-align: center; font-size: 24px; font-style: italic;font-weight: bold" >Schedule List</p>
            <div style="width: 100%; display: block">
            </div>
            <table class="table ">
                <thead>
                    <tr style="background-color: #6b90d9;">
                        <th rowspan="2" class="select-year-custom" style="max-width: 50px;">
                            <div class="d-flex gap-2 align-items-center">
                                <h8 class="text-danger mb-0">YEAR</h8>
                                <select class="form-select" style="height: fit-content;"
                                        aria-label="Default select example">
                                    <option selected>2023</option>
                                    <option >2024</option>
                                </select>
                            </div>
                            <div class="d-flex gap-2 align-items-center">
                                <h8 class="mb-0">Week</h8>
                                <form id="myForm" action="listScheduleAdmin" method="post">
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
                        <form id="frm${i}${j}" action="mainController" method="get">
                            <input type="hidden" name="id" id="id${i}${j}"/>
                            <input type="hidden" name="action" value="ViewDetails"/>
                        </form>
                        <th id="${i}${j}">
                            <div id='div-${i}${j}' style="display: none">
                                <form id="frm-details-${i}${j}" action="listScheduleClass" method="post">
                                    <input type="hidden" name="slotID" value="${slot[i].id}"/>
                                    <input type="hidden" name="day" value="${day[j]}"/>
                                    <button type="submit" class="badge-pill badge-light btn-outline-info border-0">
                                        View Slot Schedule
                                    </button>
                                </form>
                            </div>
                        </th>
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
                        var header = document.getElementById('div-${row}${column}');
                        header.style.display = "block";
                    </script>
                </c:forEach>
                </tbody>
            </table>
        </section>



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
                        function goBack() {
                            window.history.back();
                        }
        </script>
        <script src="./../../courseNav/bootstrap.min.js"></script>
        <script src="./../../courseNav/jquery.min.js"></script>
        <script src="./../../courseNav/main.js"></script>
        <script src="./../../courseNav/popper.js"></script>
        <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
        <script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
        <script src="./../../ckeditor/ckeditor.js"></script>
        <script src="./course.js"></script>
    </body>
</html>