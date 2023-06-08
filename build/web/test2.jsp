<%-- 
    Document   : test2
    Created on : 08-06-2023, 11:22:43
    Author     : HP Pro
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
  <link rel="stylesheet" href="https://cdn.datatables.net/1.13.4/css/jquery.dataTables.min.css">
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
      crossorigin="anonymous"
    />
    <link rel="stylesheet" href="./css/courseStaff.css" />
    <title>Tin Tức</title>
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
            <li><a href="" id="active">Tin Tức</a></li>
          </ul>
        </div>
        <div class="course-title" >
        <div class="text">WELCOME STAFF</div>
       <div class="insert"><a type="submit" name="insert">Insert</a></div>
        </div>
        <div class="table-name">
          <h1>BẢNG DỮ LIỆU TIN TỨC</h1>
        </div>
        <table id="course" class="display" style="width:100%">
          <thead>
              <tr>
                  <th>ID</th>
                  <th>TIÊU ĐỀ</th>
                  <th>NGÀY ĐĂNG</th>
                  <th>HÌNH ẢNH </th>
                  <th>NỘI DUNG</th>
                  <th>THỂ LOẠI</th>
                  <th>Action</th>
              </tr>
          </thead>
          <tbody>
              <tr>
                  <td>Jena Gaines</td>
                  <td>Office Manager</td>
                  <td>2023/12/05</td>
                  <td id="table-img"><img src="/image/dotap.jpg" alt=""></td>
                  <td ><div class="table-noidung">Lorem ipsum dolor sit amet consectetur adipisicing elit. Consequatur mollitia pariatur eius molestiae perferendis officia tempora laudantium suscipit, iure volup  tate ipsa explicabo quibusdam, delectus perspiciatis ducimus, excepturi impedit maiores sunt! m ipsum dolor sit amet consectetur, adipisicing elit. Ea sed, ab, quibusdam qui eum quos odit et modi maxime nostrum culpa a numquam quaerat nulla error iste? Repellat, perspiciatis non. Lorem ipsum dolor sit amet consectetur adipisicing elit. Modi, totam aperiam quo, perferendis magni minima tempora quos ullam quia possimus doloribus voluptatem quod necessitatibus cum blanditiis a dolores, debitis tempore! ket thuc</div> </td>
                  <td>$90,560</td>

                  <td id="tool">
                    <a href="#"><i class="fa-solid fa-eye "></i></a>
                    <a href="#"><i class="fa-solid fa-pen"></i></a>
                    <a href="#"> <i class="fa-sharp fa-solid fa-trash"></i></a>
                  </td>
              </tr>
              <tr>
                <td>Jena Gaines</td>
                <td>Office Manager</td>
                <td>2023/12/05</td>
                <td id="table-img"><img src="/image/dotap.jpg" alt=""></td>
                <td ><div class="table-noidung">Lorem ipsum dolor sit amet consectetur adipisicing elit. Consequatur mollitia pariatur eius molestiae perferendis officia tempora laudantium suscipit, iure volup  tate ipsa explicabo quibusdam, delectus perspiciatis ducimus, excepturi impedit maiores sunt! m ipsum dolor sit amet consectetur, adipisicing elit. Ea sed, ab, quibusdam qui eum quos odit et modi maxime nostrum culpa a numquam quaerat nulla error iste? Repellat, perspiciatis non. Lorem ipsum dolor sit amet consectetur adipisicing elit. Modi, totam aperiam quo, perferendis magni minima tempora quos ullam quia possimus doloribus voluptatem quod necessitatibus cum blanditiis a dolores, debitis tempore! ket thuc</div> </td>
                <td>$90,560</td>

                <td id="tool">
                  <a href="#"><i class="fa-solid fa-eye "></i></a>
                  <a href="#"><i class="fa-solid fa-pen"></i></a>
                  <a href="#"> <i class="fa-sharp fa-solid fa-trash"></i></a>
                </td>
            </tr>
            <tr>
              <td>Jena Gaines</td>
              <td>Office Manager</td>
              <td>2023/12/05</td>
              <td id="table-img"><img src="/image/dotap.jpg" alt=""></td>
              <td ><div class="table-noidung">Lorem ipsum dolor sit amet consectetur adipisicing elit. Consequatur mollitia pariatur eius molestiae perferendis officia tempora laudantium suscipit, iure volup  tate ipsa explicabo quibusdam, delectus perspiciatis ducimus, excepturi impedit maiores sunt! m ipsum dolor sit amet consectetur, adipisicing elit. Ea sed, ab, quibusdam qui eum quos odit et modi maxime nostrum culpa a numquam quaerat nulla error iste? Repellat, perspiciatis non. Lorem ipsum dolor sit amet consectetur adipisicing elit. Modi, totam aperiam quo, perferendis magni minima tempora quos ullam quia possimus doloribus voluptatem quod necessitatibus cum blanditiis a dolores, debitis tempore! ket thuc</div> </td>
              <td>$90,560</td>

              <td id="tool">
                <a href="#"><i class="fa-solid fa-eye "></i></a>
                <a href="#"><i class="fa-solid fa-pen"></i></a>
                <a href="#"> <i class="fa-sharp fa-solid fa-trash"></i></a>
              </td>
          </tr>
              
          </tfoot>
      </table>
       
      </div>

      <script src="/courseNav/bootstrap.min.js"></script>
      <script src="/courseNav/main.js"></script>
      <script src="/courseNav/popper.js"></script>
      <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
      <script src="/courseNav/jquery.min.js"></script>

      <script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
      <script>
        $(document).ready(function() {
          var table = $('#course').DataTable();
        });
      </script>

  </body>
</html>