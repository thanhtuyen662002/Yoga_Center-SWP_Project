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
        <link rel="stylesheet" href="./css/updateInsertCourse.css" />
        <title>Insert Course</title>
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
            <div class="alert alert-${status}" role="alert">
                ${message}
            </div>

            <!-- Page Content  -->
            <div id="content">
                <div class="course-link">
                    <ul>
                        <li><a href="mainController?action=Staff">Staff</a></li>
                        <li><a href="mainController?action=courses">Khóa Học</a></li>
                        <li><a href="mainController?action=insertCourse" id="active">Thêm</a></li>

                    </ul>
                </div>
                <div class="course-title" >
                    <div class="text">WELCOME STAFF</div>
                    <div class="insert"><a type="submit" name="insert">BACK</a></div>
                </div>
                <div class="table-name">
                    <h1>THÊM KHÓA HỌC</h1>
                </div>
                <div class="update-box">
                    <div class="update-title">
                        <label for="title">Name</label>
                        <input type="text" name="name" />
                    </div>
                    <div class="update-cate">
                        <label for="cate">Price</label>
                        <input type="number" name="price" />
                    </div>
                    <div class="update-content-wrapper">
                        <div class="update-content">
                            <label for="">Describe</label>
                            <textarea id="myTextarea" name="description"></textarea>
                        </div>
                    </div>
                </div>
                <div class="table-btn">
                    <a href="mainController?action=insertCourse">INSERT</a>
                </div>
            </div>

            <script src="/courseNav/bootstrap.min.js"></script>
            <script src="/courseNav/jquery.min.js"></script>
            <script src="/courseNav/main.js"></script>
            <script src="/courseNav/popper.js"></script>
            <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
            <script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
            <script src="/ckeditor/ckeditor.js"></script>
            <script>
                CKEDITOR.replace("myTextarea");
            </script>
            <script src="./course.js"></script>
    </body>
</html>
<!-- <!DOCTYPE html>
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
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
      crossorigin="anonymous"
    />
    <link rel="stylesheet" href="./courseUpdateInsert.css" />
    <title>Update|Insert Course</title>
  </head>
  <body>
    <div class="header-nav logo widthLess" id="logo">
      <button class="header-button">
        <div class="header-button-li btn1"></div>
        <div class="header-button-li btn2"></div>
        <div class="header-button-li btn3"></div>
      </button>
      <h2 class="h2">RO<span>LE</span> STA<span>FF</span></h2>
    </div>
    <nav class="nav-content1 widthLess" id="nav">
      <ul class="nav-content-list">
        <li>
          <i class="fa-solid fa-book"></i>
          <span>KHÓA HỌC</span>
        </li>
        <li>
          <i class="fa-solid fa-newspaper"></i>
          <span>TIN TỨC</span>
        </li>
      </ul>
      <ul class="nav-content-list">
        <li>
          <i class="fa-solid fa-calendar-days"></i>
          <span>LỊCH HỌC</span>
        </li>
        <li>
          <i class="fa-solid fa-people-group"></i>
          <span>KHÁCH HÀNG</span>
        </li>
        <li>
          <i class="fa-sharp fa-solid fa-tag"></i>
          <span>KHUYẾN MÃI</span>
        </li>
      </ul>
    </nav>

    Body
    <div class="container">
      <div class="updateNews">
        <h1>Chỉnh Sửa Khóa Học</h1>
        <div class="update-box">
          <div class="update-title">
              <label for="title">Name</label>
              <input type="text" name="title" />
            </form>
          </div>

          <div class="update-cate">
              <label for="cate">Price</label>
              <input type="number" name="cate" />
            </form>
          </div>
          <div class="update-image">
              <label for="img">Image</label>
              <input type="file" name="img" />
            </form>
          </div>
          <div class="update-content">
              <label for="">Describe</label>
              <textarea id="myTextarea"></textarea>
            </form>
          </div>
          <div class="update-btn">
            <button type="submit" style="font-weight: 700">UPDATE</button>
          </div>
        </div>
      </div>
    </div>
    <script src="/ckeditor/ckeditor.js"></script>
    <script>
      CKEDITOR.replace("myTextarea");
    </script>
    <script src="../voucher/updateNews.js"></script>
  </body>
</html> -->