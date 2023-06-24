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
        <title>Insert Course</title>
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
        <!--        <div class="wrapper d-flex align-items-stretch h-100">
                    <nav id="sidebar">
                        <div class="img bg-wrap text-center py-2" style="background-image: url(images/bg_1.jpg);">
                            <div class="user-logo">
                                <div class="img" style="background-image: url(../../image/logo-yoga.jpg);"></div>
                                <h3>YOGA CENTER</h3>
                            </div>
                        </div>
                        <ul class="list-unstyled components mb-5">
                            <li class="active">
                                <a href="#"><span class="fa-solid fa-book mr-3"></span>Staff</a>
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
        
                    </nav>-->
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
                            <form id="frm-details-${i}${j}" action="listScheduleClass" method="post">
                                <input type="hidden" name="slotID" value="${slot[i].id}"/>
                                <input type="hidden" name="day" value="${day[j]}"/>
                                <button type="submit" class="badge-pill badge-light btn-outline-info border-0">
                                    View Slot Schedule
                                </button>

                            </form>
                        </th>
                    </c:forEach>
                    </tr>
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
    </body>
</html>