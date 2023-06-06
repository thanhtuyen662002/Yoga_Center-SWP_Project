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
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
      crossorigin="anonymous"
    />
    <link rel="stylesheet" href="../web/css/courseStaff.css" />
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

    <!-- Body -->
    <div class="container">
      <div class="updateNews">
        <h1>Chỉnh Sửa Khóa Học</h1>
        <div class="update-box">
          <div class="update-title">
            <form action="">
              <label for="title">Name</label>
              <input type="text" name="title" />
            </form>
          </div>

          <div class="update-cate">
            <form action="">
              <label for="cate">Price</label>
              <input type="number" name="cate" />
            </form>
          </div>
          <div class="update-image">
            <form action="">
              <label for="img">Image</label>
              <input type="file" name="img" />
            </form>
          </div>
          <div class="update-content">
            <form action="">
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
    <script src="../web/js/updateInsert.js"></script>
  </body>
</html>