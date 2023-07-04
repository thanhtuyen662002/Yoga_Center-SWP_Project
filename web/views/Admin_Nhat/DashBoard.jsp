<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css"
    />
    <!-- <link
    href="vendor/fontawesome-free/css/all.min.css"
    rel="stylesheet"
    type="text/css"
  /> -->
  <link
  href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
  rel="stylesheet"
/>
    <link
      rel="stylesheet"
      href="https://cdn.datatables.net/1.13.4/css/jquery.dataTables.min.css"
    />
    <link rel="stylesheet" href="./../../css/dashboard.css">
    <link rel="stylesheet" href="./../../css/Header_Admin.css" />
    <title>Header</title>
  </head>
  <body>
      <c:import url="Header_Admin.jsp"/>
      <!-- Content ? ?ây -->
      <div id="content">
       <!-- Topbar -->
       <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">
       <!-- Topbar Search -->
       <form class="d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search">
         <div class="input-group">
           <input
             type="text"
             class="form-control bg-light border-0 small"
             placeholder="Search for..."
             aria-label="Search"
             aria-describedby="basic-addon2"
           />
           <div class="input-group-append">
             <button class="btn btn-primary" type="button">
               <i class="fas fa-search fa-sm"></i>
             </button>
           </div>
         </div>
       </form>

       <!-- Topbar Navbar -->
       <ul class="navbar-nav ml-auto">
         <!-- Nav Item - User Information -->
         <li class="nav-item dropdown no-arrow">
             <span class="mr-2 d-none d-lg-inline text-gray-600 ">Douglas McGee</span>
         </li>
       </ul>
     </nav>
     <!-- End of Topbar -->

     <!-- Begin Page Content -->
     <div class="container-fluid">
       <!-- Page Heading -->
       <div
         class="d-sm-flex align-items-center justify-content-between mb-4"
       >
         <h1 class="h3 mb-0 text-gray-800">Dashboard</h1>
         <a
           href="#"
           class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"
           ><i class="fas fa-download fa-sm text-white-50"></i> Generate
           Report</a
         >
       </div>

       <!-- Content Row -->
       <div class="row">
         <!-- Earnings (Monthly) Card Example -->
         <div class="col-xl-3 col-md-6 mb-4">
           <div class="card border-left-primary shadow h-100 py-2">
             <div class="card-body">
               <div class="row no-gutters align-items-center">
                 <div class="col mr-2">
                   <div
                     class="text-xs font-weight-bold text-primary text-uppercase mb-1"
                   >
                     Earnings (Monthly)
                   </div>
                   <div class="h5 mb-0 font-weight-bold text-gray-800">
                     $40,000
                   </div>
                 </div>
                 <div class="col-auto">
                   <i class="fas fa-calendar fa-2x text-gray-300"></i>
                 </div>
               </div>
             </div>
           </div>
         </div>

         <!-- Earnings (Monthly) Card Example -->
         <div class="col-xl-3 col-md-6 mb-4">
           <div class="card border-left-success shadow h-100 py-2">
             <div class="card-body">
               <div class="row no-gutters align-items-center">
                 <div class="col mr-2">
                   <div
                     class="text-xs font-weight-bold text-success text-uppercase mb-1"
                   >
                     Earnings (Annual)
                   </div>
                   <div class="h5 mb-0 font-weight-bold text-gray-800">
                     $215,000
                   </div>
                 </div>
                 <div class="col-auto">
                   <i class="fas fa-dollar-sign fa-2x text-gray-300"></i>
                 </div>
               </div>
             </div>
           </div>
         </div>

         <!-- Earnings (Monthly) Card Example -->
         <div class="col-xl-3 col-md-6 mb-4">
           <div class="card border-left-info shadow h-100 py-2">
             <div class="card-body">
               <div class="row no-gutters align-items-center">
                 <div class="col mr-2">
                   <div
                     class="text-xs font-weight-bold text-info text-uppercase mb-1"
                   >
                     Tasks
                   </div>
                   <div class="row no-gutters align-items-center">
                     <div class="col-auto">
                       <div
                         class="h5 mb-0 mr-3 font-weight-bold text-gray-800"
                       >
                         50%
                       </div>
                     </div>
                     <div class="col">
                       <div class="progress progress-sm mr-2">
                         <div
                           class="progress-bar bg-info"
                           role="progressbar"
                           style="width: 50%"
                           aria-valuenow="50"
                           aria-valuemin="0"
                           aria-valuemax="100"
                         ></div>
                       </div>
                     </div>
                   </div>
                 </div>
                 <div class="col-auto">
                   <i
                     class="fas fa-clipboard-list fa-2x text-gray-300"
                   ></i>
                 </div>
               </div>
             </div>
           </div>
         </div>

         <!-- Pending Requests Card Example -->
         <div class="col-xl-3 col-md-6 mb-4">
           <div class="card border-left-warning shadow h-100 py-2">
             <div class="card-body">
               <div class="row no-gutters align-items-center">
                 <div class="col mr-2">
                   <div
                     class="text-xs font-weight-bold text-warning text-uppercase mb-1"
                   >
                     Pending Requests
                   </div>
                   <div class="h5 mb-0 font-weight-bold text-gray-800">
                     18
                   </div>
                 </div>
                 <div class="col-auto">
                   <i class="fas fa-comments fa-2x text-gray-300"></i>
                 </div>
               </div>
             </div>
           </div>
         </div>
       </div>

       <!-- Content Row -->

       <div class="row">
         <!-- Này là chart bên trái -->
         <div class="col-xl-8 col-lg-7">
           <div class="card shadow mb-4">
             <!-- Card Header - Dropdown -->
             <div
               class="card-header py-3 d-flex flex-row align-items-center justify-content-between"
             >
               <h6 class="m-0 font-weight-bold text-primary">
                 Earnings Overview
               </h6>
               <div class="dropdown no-arrow">
                 <a
                   class="dropdown-toggle"
                   href="#"
                   role="button"
                   id="dropdownMenuLink"
                   data-toggle="dropdown"
                   aria-haspopup="true"
                   aria-expanded="false"
                 >
                   <i
                     class="fas fa-ellipsis-v fa-sm fa-fw text-gray-400"
                   ></i>
                 </a>
                 <div
                   class="dropdown-menu dropdown-menu-right shadow animated--fade-in"
                   aria-labelledby="dropdownMenuLink"
                 >
                   <div class="dropdown-header">Dropdown Header:</div>
                   <a class="dropdown-item" href="#">Action</a>
                   <a class="dropdown-item" href="#">Another action</a>
                   <div class="dropdown-divider"></div>
                   <a class="dropdown-item" href="#"
                     >Something else here</a
                   >
                 </div>
               </div>
             </div>
             <!-- Card Body -->
             <div class="card-body">
               <div class="chart-area">
                 <canvas id="myAreaChart"></canvas>
               </div>
             </div>
           </div>
         </div>

         <!-- Này là  Pie Chart bên ph?i -->
         <div class="col-xl-4 col-lg-5">
           <div class="card shadow mb-4">
             <!-- Card Header - Dropdown -->
             <div
               class="card-header py-3 d-flex flex-row align-items-center justify-content-between"
             >
               <h6 class="m-0 font-weight-bold text-primary">
                 Revenue Sources
               </h6>
               <div class="dropdown no-arrow">
                 <a
                   class="dropdown-toggle"
                   href="#"
                   role="button"
                   id="dropdownMenuLink"
                   data-toggle="dropdown"
                   aria-haspopup="true"
                   aria-expanded="false"
                 >
                   <i
                     class="fas fa-ellipsis-v fa-sm fa-fw text-gray-400"
                   ></i>
                 </a>
                 <div
                   class="dropdown-menu dropdown-menu-right shadow animated--fade-in"
                   aria-labelledby="dropdownMenuLink"
                 >
                   <div class="dropdown-header">Dropdown Header:</div>
                   <a class="dropdown-item" href="#">Action</a>
                   <a class="dropdown-item" href="#">Another action</a>
                   <div class="dropdown-divider"></div>
                   <a class="dropdown-item" href="#"
                     >Something else here</a
                   >
                 </div>
               </div>
             </div>
             <!-- Card Body -->
             <div class="card-body">
               <div class="chart-pie pt-4 pb-2">
                 <canvas id="myPieChart"></canvas>
               </div>
               <div class="mt-4 text-center small">
                 <span class="mr-2">
                   <i class="fas fa-circle text-primary"></i> Direct
                 </span>
                 <span class="mr-2">
                   <i class="fas fa-circle text-success"></i> Social
                 </span>
                 <span class="mr-2">
                   <i class="fas fa-circle text-info"></i> Referral
                 </span>
               </div>
             </div>
           </div>
         </div>
       </div>
    </div>
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

      <!-- Page level plugins -->
      <script src="./../../js/Chart.min.js"></script>
  
      <!-- Page level custom scripts -->
      <script src="./../../js/chart-area-demo.js"></script>

      <script src="./../../js/chart-pie-demo.js"></script>
  </body>
</html>
