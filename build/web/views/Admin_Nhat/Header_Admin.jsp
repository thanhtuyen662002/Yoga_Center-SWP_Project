<%-- 
    Document   : Header_Admin
    Created on : Jun 21, 2023, 5:40:48 PM
    Author     : nhath
--%>

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
    <link
      rel="stylesheet"
      href="https://cdn.datatables.net/1.13.4/css/jquery.dataTables.min.css"
    />
    <link rel="stylesheet" href="./../../css/Header_Admin.css" />
    <title>Header</title>
  </head>
  <body>
    <div class="wrapper d-flex align-items-stretch">
      <nav id="sidebar">
        <div class="custom-menu">
          <button
            type="button"
            id="sidebarCollapse"
            class="btn btn-primary"
          ></button>
        </div>
        <div
          class="img bg-wrap text-center py-4"
          style="background-image: url(images/bg_1.jpg)"
        >
          <div class="user-logo">
            <div
              class="img"
              style="background-image: url(./../../image/logo-yoga.jpg)"
            ></div>
            <h3>YOGA CENTER</h3>
          </div>
        </div>
        <ul class="list-unstyled components mb-5">
          <li class="active">
            <a href="#"
              ><span class="fa-solid fa-chart-line mr-3"></span>Dashboard
            </a>
          </li>

          <li>
            <a href="#"
              ><span class="fa-solid fa-pen-to-square mr-3"></span> Edit
              Profile</a
            >
          </li>

          <li>
            <a href="listStaff"
              ><span class="fa-solid fa-person fa-xl mr-3"></span> Staff</a
            >
          </li>
          <li>
            <a href="#"
              ><span class="fa-solid fa-calendar-days mr-3"></span> Schedule</a
            >
          </li>
          <li>
            <a href="#"><span class="fa fa-sign-out mr-3"></span> Đăng Xuất</a>
          </li>
        </ul>
      </nav>
      <!-- Content ở đây -->
      <div id="content"></div>
    </div>
      <script src="./../../courseNav/bootstrap.min.js"></script>
    <script src="./../../courseNav/jquery.min.js"></script>
    <script src="./../../courseNav/main.js"></script>
    <script src="./../../courseNav/popper.js"></script>
    <script>
      $(document).ready(function () {
        $("#course").DataTable();
      });
    </script>
    <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
  </body>
</html>

