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
        <c:import url="Header_Admin.jsp"/>
        <!-- Page Content  -->
        <div id="content">
            <div>
                <div class="course-link">
                    <ul>
                        <li><a href="listScheduleAdmin">Schedule Admin</a></li>
                        <li><a href="listScheduleClass">Schedule List Class</a></li>
                    </ul>
                </div>
                <div class="table-name border" style="height: 15%">
                    <h4>Day ${day} (<span style="color: red">Slot ${slotID}</span>)</h4>
                </div>
            </div>
            <div class="text-center pt-2 d-flex w-100 justify-content-end pr-4">
                <button class="btn-outline-info rounded-2 border-0 pr-2 pl-2 rounded-pill" style="font-size: 24px;background-color: lightblue" onclick="goBack()">Back</button>
            </div>
            <form action="listStaff" method="post">
                <input type="hidden" value="create" name="action"/>
            </form>
            <form action="listScheduleClass" method="post">
                <input type="hidden" value="search" name="action"/>
                <div class="row m-3 justify-content-center d-flex">
                    <div class="col-6">
                        <div class="input-group">
                            <input type="hidden" name="slotID" value="${slotID}"/>
                            <input type="hidden" name="day" value="${day}"/>
                            <input type="text" name="textSearch"  class="form-control" aria-label="Recipient's username" aria-describedby="button-addon2" value="${textSearch}">
                            <button class="btn btn-outline-secondary border-0 " type="submit" id="button-addon2" style="background-color: #00FFFF;">Search</button>
                        </div>
                    </div>
                </div>
            </form>
            <div class="m-3 parent vh-80" style="background-color: white;border-radius: 10px;padding-top: 2%">
                <table class="table caption-top">
                    <thead>
                        <tr>
                            <th scope="col">Class Name</th>
                            <th scope="col">Course Name</th>
                            <th scope="col">PT Name</th>
                            <th scope="col">Room</th>
                            <th scope="col"></th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${listSchedule}" var="s">
                            <tr>
                                <th scope="col">${s.classStudy.name}</th>
                                <th scope="col">${s.classStudy.course.name}</th>
                                <th scope="col">${s.pt.phone}</th>
                                <th scope="col">${s.room.id}</th>
                                <th scope="col">
                                    <form action="scheduleDetailsAdmin" method="get">
                                        <input type="hidden" name="classID" value="${s.classStudy.id}" />
                                        <button type="submit" class="btn-primary rounded-4 border pr-2 pl-2" style="background-color: white;color: black">View Details</button>
                                    </form>
                                </th>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>

                <div class="d-flex justify-content-center">
                    <c:if test="${listSchedule.size() == 0}">
                        <h4>This slot does not have any schedule today!<h4>
                    </c:if>
                </div>
            </div>
            <div class="d-flex justify-content-center w-100" style="width: 100%">
                <%--For displaying Previous link except for the 1st page --%>
                <c:if test="${currentPage != 1}">
                    <td><a class="a-page" href="listScheduleClass?page=${currentPage - 1}&slotID=${slotID}&day=${day}">Previous</a></td>
                </c:if>
                <%--For displaying Page numbers. The when condition does not display
                            a link for the current page--%>
                <c:forEach begin="1" end="${noOfPages}" var="i">
                    <c:choose>
                        <c:when test="${currentPage eq i}">
                            <a class="a-page" href="#" style="background-color: white;color: black">${i}</a>
                        </c:when>
                        <c:otherwise>
                            <a class="a-page" href="listScheduleClass?page=${i}&slotID=${slotID}&day=${day}">${i}</a>
                        </c:otherwise>
                    </c:choose>
                </c:forEach>

                <%--For displaying Next link --%>
                <c:if test="${currentPage lt noOfPages}">
                    <a class="a-page" href="listScheduleClass?page=${currentPage + 1}&slotID=${slotID}&day=${day}">Next</a>
                </c:if>
            </div>
        </div>

        <script src="./../../courseNav/bootstrap.min.js"></script>
        <script src="./../../courseNav/jquery.min.js"></script>
        <script src="./../../courseNav/main.js"></script>
        <script src="./../../courseNav/popper.js"></script>
        <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
        <script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
        <script src="./../../ckeditor/ckeditor.js"></script>
        <script>
                    CKEDITOR.replace("myTextarea");
        </script>
        <script src="./course.js"></script>
        <script>
                    function myFunction() {
                        var x = document.getElementById("snackbar");
                        x.className = "show";
                        setTimeout(function () {
                            x.className = x.className.replace("show", "");
                        }, 3000);
                    }
                    function confirmSubmit() {
                        // Display a confirmation dialog
                        var confirmation = confirm("Are you sure you want to submit the form?");

                        // If the user confirms, return true to submit the form
                        // If the user cancels, return false to prevent form submission
                        return confirmation;
                    }
                    function goBack() {
                        window.history.back();
                    }
        </script>
    </body>
</html>