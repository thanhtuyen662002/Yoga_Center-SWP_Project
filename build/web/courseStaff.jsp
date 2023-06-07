<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <link rel="stylesheet" href="./css/courseStaff.css" />
    <title>Course</title>
  </head>
  <body>
    <div class="wrapper d-flex align-items-stretch">
			<nav id="sidebar">
				<div class="custom-menu">
					<button type="button" id="sidebarCollapse" class="btn btn-primary">
	        </button>
        </div>
	  		<div class="img bg-wrap text-center py-4" style="background-image: url(images/bg_1.jpg);">
	  			<div class="user-logo">
	  				<div class="img" style="background-image: url(/image/logo-yoga.jpg);"></div>
	  				<h3>YOGA CENTER</h3>
	  			</div>
	  		</div>
        <ul class="list-unstyled components mb-5">
          <li class="active">
            <a href="#"><span class="fa-solid fa-book mr-3"></span> KHÓA HỌC</a>
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

    	</nav>

        <!-- Page Content  -->
      <div id="content">
        <div class="course-link">
          <ul>
            <li><a href="">Staff</a></li>
            <li><a href="" id="active">Khóa Học</a></li>
          </ul>
        </div>
        <div class="course-title" >
        <div class="text">WELCOME STAFF</div>
       <div class="insert"><a type="submit" name="insert">Insert</a></div>
        </div>
        <div class="table-name">
          <h1>BẢNG DỮ LIỆU KHÓA HỌC</h1>
        </div>
        <table id="course" class="display" style="width:100%">
          <thead>
              <tr>
                  <th>Course ID</th>
                  <th>Name</th>
                  <th>Description</th>
                  <th>Price</th>
                  <th>Image</th>
                  <th>Status</th>
                  <th>Action</th>
              </tr>
          </thead>
          <tbody>
              <c:forEach items="${list}" var="c">
              <tr>
                  <td>${c.courseID}</td>
                  <td>${c.courseName}</td>
                  <td>${c.description}</td>
                  <td>${c.courseImage}</td>
                  <td>${c.price}</td>
                  <td>${c.status}</td>
                  <td id="tool">
                    <a href="#"><i class="fa-solid fa-eye "></i></a>
                    <a href="#"><i class="fa-solid fa-pen"></i></a>
                    <a href="#"> <i class="fa-sharp fa-solid fa-trash"></i></a>
                  </td>
              </tr>
              </c:forEach>
          </tbody>
          <tfoot>
              <tr>
                  <th>Course ID</th>
                  <th>Name</th>
                  <th>Description</th>
                  <th>Image</th>
                  <th>Price</th>
                  <th>Status</th>
                  <th>Action</th>

              </tr>
          </tfoot>
      </table>
       
      </div>

      <script src="/courseNav/bootstrap.min.js"></script>
      <script src="/courseNav/jquery.min.js"></script>
      <script src="/courseNav/main.js"></script>
      <script src="/courseNav/popper.js"></script>
      <script>
       $(document).ready(function () {
    $('#course').DataTable();
});
    </script>
          <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
          <script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
  </body>
</html>