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
    <link rel="stylesheet" href="./cus.css" />
    <title>Customer</title>
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
                  <a href="#"><div><span class="fa-solid fa-book mr-3"></span>KHÓA H?C</div> <i class="fa-solid fa-caret-down "></i></a>
                  <ul  class="subMenu" style="display: none;">
                    <li><a href="#">Khóa h?c 1</a></li>
                    <li><a href="#">Khóa h?c 2</a></li>
                    <li><a href="#">Khóa h?c 3</a></li>
                  </ul>
                </li>
                <li>
                  <a href="#"><div><span class="fa-solid fa-gift mr-3"></span>KHUY?N MÃI</div> <i class="fa-solid fa-caret-down"></i></a>
                  <ul class="subMenu" style="display: none;">
                    <li><a href="#">Khóa h?c 1</a></li>
                    <li><a href="#">Khóa h?c 2</a></li>
                    <li><a href="#">Khóa h?c 3</a></li>
                  </ul>
                </li>
                <li>
                  <a href="#"><div><span class="fa-solid fa-calendar-days mr-3"></span>L?CH D?Y</div><i class="fa-solid fa-caret-down"></i></a>
                  <ul  class="subMenu" style="display: none;">
                    <li><a href="#">Khóa h?c 1</a></li>
                    <li><a href="#">Khóa h?c 2</a></li>
                    <li><a href="#">Khóa h?c 3</a></li>
                  </ul>
                </li>
                <li>  
                  <a href="#"><div><span class="fa-solid fa-newspaper mr-3"></span>TIN T?C</div><i class="fa-solid fa-caret-down" ></i></a>
                  <ul  class="subMenu" style="display: none;">
                    <li><a href="#">Khóa h?c 1</a></li>
                    <li><a href="#">Khóa h?c 2</a></li>
                    <li><a href="#">Khóa h?c 3</a></li>
                  </ul>
                </li> 
                <li>
                  <a href="#" ><div><span class="fa-solid fa-people-group mr-3"></span>KHÁCH HÀNG</div> <i class="fa-solid fa-caret-down" ></i></a>
                  <ul  class="subMenu" style="display: none;">
                    <li><a href="#">Khóa h?c 1</a></li>
                    <li><a href="#">Khóa h?c 2</a></li>
                    <li><a href="#">Khóa h?c 3</a></li>
                  </ul>
                </li> 
                <li>
                  <a href="#" ><div><span class="fa-solid fa-sign-out mr-3"></span>??ng Xu?t</div></a>
                </li>
              </ul>

    	</nav>
        <!-- Content ? ?ây -->
        <div id="content">
            <div class="course-link">
              <ul>
                <li><a href="">Staff</a></li>
                <li><a href="" id="active">Tin T?c</a></li>
              </ul>
            </div>
            <div class="course-title" >
            <div class="text">WELCOME STAFF</div>
           <div class="insert"><a type="submit" name="insert">Insert</a></div>
            </div>
            <div class="table-name">
              <h1>B?NG D? LI?U KHÁCH HÀNG</h1>
            </div>
            <table id="course" class="display" style="width:100%">
              <thead>
                  <tr>
                      <th>H? VÀ TÊN</th>
                      <th>??A CH?</th>
                      <th>NGÀY SINH</th>
                      <th>GI?I TÍNH</th>
                      <th>Action</th>
                  </tr>
              </thead>
              <tbody>
                  <tr>
                      <td>Jena Gaines</td>
                      <td>Office Manager tieeu dwad anaks nnd saknd aln  lsad nls nas nl dn snl dsanla ddl nldsak la sml ms daml asml damsd</td>
                      <td>2023/12/05</td>
                
                      <td>N?</td>
    
                      <td id="tool">
                        <a href="#"><i class="fa-solid fa-pen" style="color: darkgrey;"></i></a>
                        <a href="#"> <i class="fa-sharp fa-solid fa-trash"  style="color: #a50000;"></i></a>
                      </td>
                  </tr>
                  <tr>
                    <td>Jena Gaines</td>
                    <td>Office Manager</td>
                    <td>2023/12/05</td>
    
                    <td>Nam</td>
    
                    <td id="tool">  
                      <a href="#"><i class="fa-solid fa-pen" style="color: darkgrey;"></i></a>
                      <a href="#"> <i class="fa-sharp fa-solid fa-trash"  style="color: #a50000;"></i></a>
                    </td>
                </tr>
                <tr>
                  <td>Jena Gaines</td>
                  <td>Office Manager</td>
                  <td>2023/12/05</td>
                  <td>N?</td>
    
                  <td id="tool">
                    <a href="#"><i class="fa-solid fa-pen" style="color: darkgrey;"></i></a>
                    <a href="#"> <i class="fa-sharp fa-solid fa-trash" style="color: #a50000;"></i></a>
                  </td>
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
        <script>
    $(document).ready(function() {
      $('.submenu').hide();
      var submenuOpen = 0;
      
      $('.list-unstyled li').click(function(e) {
        e.preventDefault();
  
        if (submenuOpen && $(this).hasClass('active')) {
          // ?óng submenu khi cùng m?t th? li ???c nh?p vào
          $(this).find('.subMenu').slideUp();
          $(this).removeClass('active');
          $(this).find('i').toggleClass('fa-caret-down fa-caret-up');
          submenuOpen = 0;
        } else {
          // ?óng submenu hi?n t?i
          $('.subMenu').slideUp();
          $('.list-unstyled li').removeClass('active');
          $('.list-unstyled li i').removeClass('fa-caret-up').addClass('fa-caret-down');
          
          // M? submenu m?i và thêm l?p active
          $(this).find('.subMenu').slideDown();
          $(this).addClass('active');
          $(this).find('i').toggleClass('fa-caret-down fa-caret-up');
          submenuOpen = 1;
        }
      });
    });
  
        </script>
      
            <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
            <script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
            
    </body>
  </html>
  