<%-- 
    Document   : viewScheduleCustomer
    Created on : Jun 4, 2023, 12:13:59 PM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>View Schedule</title>
        <link rel="stylesheet" href="qlns.css" type="text/css" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
        <script src="script.js"></script>
        <style>
            .btn-back:hover{
                background-color: grey;
            }
        </style>
    </head>

    <body>
        <div class="back" style="background-image: url(	https://img6.thuthuatphanmem.vn/uploads/2022/07/01/anh-nen-dep-yoga_011708114.jpg);
             width: 100%; position: absolute; top: 0; bottom: 0;
             ">
            <section class="table-section" style="padding: 40px">
                <div style="background-color: whitesmoke; border-radius: 5px;padding: 5%">
                    <button class="btn-back" type="button" style="margin-left: 0px;border-radius: 5px;border: none" onclick="goBack()">< Back</button>
                    <p style="text-align: center; font-size: 24px; font-style: italic;font-weight: bold" >Schedule Details</p>
                    <div class="mt-5 p-4">
                        <div class="">
                            <table class="table">
                                <tbody>
                                    <tr>
                                        <td class="text-success"><i class="fa fa-user"></i>PT Name:</td>
                                        <td>${schedule.pt.name}</td>
                                    </tr>
                                    <tr>
                                        <td class="text-success"><i class="glyphicon glyphicon-phone"></i>PT Phone:</td>
                                        <td>${schedule.pt.phone}</td>
                                    </tr>
                                    <tr>
                                        <td class="text-success"><i class="glyphicon glyphicon-phone"></i>Class:</td>
                                        <td>${schedule.classStudy.name}</td>
                                    </tr>
                                    <tr>
                                        <td class="text-success"><i class="glyphicon glyphicon-phone"></i>Total Sessions:</td>
                                        <td>${schedule.classStudy.total_sessions}</td>
                                    </tr>
                                    <tr>
                                        <td class="text-success"><i class="fa fa-flag"></i>Study at:</td>
                                        <td>${schedule.room.locate} - ${schedule.room.roomNumber}</td>
                                    </tr>
                                    <tr>
                                        <td class="text-success"><i class="glyphicon glyphicon-phone"></i>Time</td>
                                        <td>${schedule.slot.id} (From ${schedule.slot.startTime} To ${schedule.slot.endTime})</td>
                                    </tr>
                                    <tr>
                                        <td class="text-success"><i class="glyphicon glyphicon-phone"></i>Date:</td>
                                        <td>${schedule.date}</td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </section>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
        crossorigin="anonymous"></script>
        <script src="https://kit.fontawesome.com/8d39de38b8.js" crossorigin="anonymous"></script>
        <script>
                        function goBack() {
                            window.history.back();
                        }
        </script>
    </body>

</html>
