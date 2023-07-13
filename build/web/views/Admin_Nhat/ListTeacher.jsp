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
                        <li><a href="listTeacher">Admin</a></li>
                        <li><a href="listTeacher">List Teacher</a></li>
                    </ul>
                </div>
                <div class="table-name border" style="height: 15%">
                    <h4>List Teacher</h4>
                </div>
            </div>
            <div id="snackbar"></div>

            <c:if test="${msg == 'insert'}">
                <script>
                    var x = document.getElementById("snackbar");
                    x.className = "show";
                    x.textContent = 'Create successfull!';
                    setTimeout(function () {
                        x.className = x.className.replace("show", "");
                    }, 3000);
                </script>
            </c:if>
            <c:if test="${msg == 'update'}">
                <script>
                    var x = document.getElementById("snackbar");
                    x.className = "show";
                    x.textContent = 'Update successfull!';
                    setTimeout(function () {
                        x.className = x.className.replace("show", "");
                    }, 3000);
                </script>
            </c:if>
            <form action="listTeacher" method="post">
                <input type="hidden" value="create" name="action"/>
                <div class="text-center pt-2 d-flex w-100 justify-content-end pr-4">
                    <button class="btn-primary rounded-2 border-0 pr-2 pl-2" style="font-size: 24px">Create Teacher</button>
                </div>
            </form>
            <form action="listTeacher" method="post">
                <input type="hidden" value="search" name="action"/>
                <div class="row m-3">
                    <div class="col-6 ">
                        <div class="row">
                            <div class="col-6 ">
                                <select name="gender" class="form-select" aria-label="Default select example">
                                    <option value="All" 
                                            <c:if test="${gender eq 'All'}">selected</c:if>
                                                >---All---</option>
                                            <option value="Male"
                                            <c:if test="${gender eq 'Male'}">selected</c:if>
                                                >Male</option>
                                            <option value="FeMale"
                                            <c:if test="${gender eq 'FeMale'}">selected</c:if>
                                                >Female</option>
                                    </select>
                                </div>
                                <div class="col-6 " >
                                    <select name="status" class="form-select" aria-label="Default select example">
                                        <option value="All" 
                                        <c:if test="${status eq 'All'}">selected</c:if>
                                            >---All---</option>
                                        <option value="true"
                                        <c:if test="${status eq 'true'}">selected</c:if>
                                            >Active</option>
                                        <option value="false"
                                        <c:if test="${status eq 'false'}">selected</c:if>
                                            >Deactive</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                        <div class="col-6">
                            <div class="input-group">
                                <input type="text" name="textSearch" class="form-control" placeholder="Enter staff name or phone" aria-label="Recipient's username" aria-describedby="button-addon2" value="${textSearch}">
                            <button class="btn btn-outline-secondary border-0" type="submit" id="button-addon2" style="background-color: #00FFFF;">Search</button>
                        </div>
                    </div>
                </div>
            </form>
            <div class="m-3 parent" style="height: 50%;background-color: white;border-radius: 10px;padding-top: 2%">
                <table class="table caption-top">
                    <thead>
                        <tr>
                            <th scope="col">Phone</th>
                            <th scope="col">Name</th>
                            <th scope="col">Address</th>
                            <th scope="col">Gender</th>
                            <th scope="col">Status</th>
                            <th scope="col"></th>
                            <th scope="col"></th>
                        </tr>
                    </thead>
                    <tbody>

                        <c:forEach var="tc" items="${listTeacher}">
                            <tr>
                                <th scope="row">${tc.phone}</th>
                                <td>${tc.name}</td>
                                <td>${tc.address}</td>
                                <td>${tc.gender}</td>
                                <td>
                                    <c:if test="${tc.status == true}">
                                        <form action="listTeacher" method="post">
                                            <input type="hidden" name="action" value="deactive"/>
                                            <input type="hidden" name="phone" value="${tc.phone}"/>
                                            <button type="submit" class="btn-primary rounded-4 border pr-2 pl-2" style="background-color: white; border-color: greenyellow;color: black">Active</button>
                                        </form>
                                    </c:if>
                                    <c:if test="${tc.status == false}">
                                        <form action="listTeacher" method="post">
                                            <input type="hidden" name="action" value="active"/>
                                            <input type="hidden" name="phone" value="${tc.phone}"/>
                                            <button type="submit" class="btn-primary rounded-4 border pr-2 pl-2" style="background-color: white; border-color: greenyellow;color: black">Deactive</button>
                                        </form>
                                    </c:if>
                                </td>
                                <td>
                                    <form action="updateTeacher" method="post">
                                        <input type="hidden" name="action" value="view"/>
                                        <input type="hidden" name="phone" value="${tc.phone}"/>
                                        <button class="btn-primary rounded-4 border-0 pr-2 pl-2" style="background-color: grey">View</button>
                                    </form>
                                </td>
                                <td>
                                    <form action="listTeacher" method="post">
                                        <input type="hidden" name="action" value="delete"/>
                                        <input type="hidden" name="phone" value="${tc.phone}"/>
                                        <button class="btn-primary rounded-4 border-0 pr-2 pl-2" style="background-color: grey" onclick="return confirmSubmit()">Delete</button>
                                    </form>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
            <div class="d-flex justify-content-center w-100" style="width: 100%">
                <%--For displaying Previous link except for the 1st page --%>
                <c:if test="${currentPage != 1}">
                    <td><a class="a-page" href="listTeacher?page=${currentPage - 1}">Previous</a></td>
                </c:if>
                <%--For displaying Page numbers. The when condition does not display
                            a link for the current page--%>
                <c:forEach begin="1" end="${noOfPages}" var="i">
                    <c:choose>
                        <c:when test="${currentPage eq i}">
                            <a class="a-page" href="#" style="background-color: white;color: black">${i}</a>
                        </c:when>
                        <c:otherwise>
                            <a class="a-page" href="listTeacher?page=${i}">${i}</a>
                        </c:otherwise>
                    </c:choose>
                </c:forEach>

                <%--For displaying Next link --%>
                <c:if test="${currentPage lt noOfPages}">
                    <a class="a-page" href="listTeacher?page=${currentPage + 1}">Next</a>
                </c:if>
            </div>
            <div class="text-center w-100 mt-2">
                <a class="btn-primary rounded-4 border-0 pr-2 pl-2" style="font-size: 24px;background-color: grey" type="submit" href="listTeacher">Home</a>
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
        </script>
    </body>
</html>