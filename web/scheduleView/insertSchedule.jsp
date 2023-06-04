<%-- 
    Document   : listSchedule
    Created on : May 30, 2023, 7:29:59 PM
    Author     : dell
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                <div style="background-color: whitesmoke; border-radius: 5px;padding: 5%">
                    <p style="text-align: center; font-size: 24px; font-style: italic;font-weight: bold" >Create Schedule</p>
                    <form style="padding: 24px;" action="insertSchedule" method="post">
                        <div class="row">
                            <!-- Email input -->
                            <div class="col-md-6">
                                <div class="form-outline mb-4">
                                    <div class="form-floating mb-4">
                                        <select class="form-control" id="form6Example6" name="class">
                                            <c:forEach var="cl" items="${className}">
                                                <option value="${cl.id}">${cl.name}</option>
                                            </c:forEach>    
                                        </select>
                                        <label for="form6Example6">Class</label>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <!-- Email input -->
                            <div class="col-md-6">
                                <div class="form-outline mb-4">
                                    <div class="form-floating mb-4">
                                        <select class="form-control" id="form6Example6" name="room">
                                            <c:forEach var="r" items="${room}">
                                                <option value="${r.id}">${r.id}</option>
                                            </c:forEach>   
                                        </select>
                                        <label for="form6Example6">Room</label>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-outline mb-4">
                                    <div class="form-floating mb-4">
                                        <select class="form-control" id="form6Example6" name="slot">
                                            <c:forEach var="sl" items="${slot}">
                                                <option value="${sl.id}">${sl.id}</option>
                                            </c:forEach>  
                                        </select>
                                        <label for="form6Example6">Slot</label>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-outline mb-4">
                                    <div class="form-floating mb-4">
                                        <select class="form-control" id="form6Example6" name="cusId">
                                            <c:forEach var="c" items="${customer}">
                                                <option value="${c.phone}">${c.name}</option>
                                            </c:forEach>  
                                        </select>
                                        <label for="form6Example6">Customer</label>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-outline mb-4">
                                    <div class="form-floating mb-4">
                                        <input value="${schedule.date}"  name="day"
                                               type="date" id="dateInput" class="form-control" placeholder="Example" />
                                        <label for="form12">Day</label>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!--                         Form switch, radio button 
                                                <div class="row mb-4">
                                                    <div class="col-6 form-check form-switch">
                                                        <input class="form-check-input" type="checkbox" id="flexSwitchCheckChecked" checked>
                                                        <label class="form-check-label" for="flexSwitchCheckChecked">Checked switch checkbox input</label>
                                                    </div>
                                                    <div class="col-6">
                                                        <div class="form-check">
                                                            <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios1"
                                                                   value="option1" checked>
                                                            <label class="form-check-label" for="exampleRadios1">
                                                                Default radio
                                                            </label>
                                                        </div>
                                                        <div class="form-check">
                                                            <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios2"
                                                                   value="option2">
                                                            <label class="form-check-label" for="exampleRadios2">
                                                                Second default radio
                                                            </label>
                                                        </div>
                                                        <div class="form-check">
                                                            <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios3"
                                                                   value="option3" disabled>
                                                            <label class="form-check-label" for="exampleRadios3">
                                                                Disabled radio
                                                            </label>
                                                        </div>
                                                    </div>
                                                </div>
                        
                                                 Checkbox 
                                                <div class="form-check d-flex justify-content-center mb-4">
                                                    <input class="form-check-input me-2" type="checkbox" value="" id="form6Example8" checked />
                                                    <label class="form-check-label" for="form6Example8"> Create an account? </label>
                                                    <br>
                        
                                                </div>-->
                        <div id="error" class="justify-content-center" style="color: red;display: none">
                            Schedule is exist! Try again!
                        </div>
                        <c:if test="${error == true}">
                            <script>
                                var msg = document.getElementById("error");
                                msg.style.display = 'block';
                            </script>
                        </c:if>
                        <div class="form-check d-flex justify-content-center mb-4">
                            <!-- Submit button -->
                            <input type="hidden" value="update" name="action"/>
                            <button type="submit" class="btn btn-primary btn-block mb-4 w-40" style="margin-right: 2%">Save</button>
                    </form>
                </div>
                </form>
        </div>
    </section>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
crossorigin="anonymous"></script>
<script src="https://kit.fontawesome.com/8d39de38b8.js" crossorigin="anonymous"></script>
<script>
                                function validateInputDate() {
                                    var dateInput = document.getElementById("dateInput").value;
                                    var regex = /^\d{0,4}-\d{0,2}-\d{0,2}$/;
                                    var keyCode = event.which || event.keyCode;

                                    if (keyCode === 8) {
                                        // Allow Backspace key
                                        return;
                                    }

                                    if (!regex.test(dateInput)) {
                                        event.target.value = dateInput.slice(0, -1);
                                    }
                                }
</script>
</body>

</html>