<%@page import="model.dto.UserDTO"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <link rel="stylesheet" href="./css/insertNews1.css" />
        <title>Insert News</title>
    </head>
    <body>
        <c:if test="${empty sessionScope.STAFF}">
            <c:redirect url="login.jsp"></c:redirect>
        </c:if>
        <div class="wrapper d-flex align-items-stretch">

                <c:import url="./view.service/service_header.jsp"/>
            
            <!-- Page Content  -->
            <c:if test="${not empty sessionScope.STAFF}">
                <c:set var="USER" value="${sessionScope.STAFF}" scope="session"/>
                <div id="content">
                    <div class="course-link">
                        <ul>
                            <li><a href="">Staff</a></li>
                            <li><a href="">Khóa Học</a></li>
                            <li><a href="" id="active">Chỉnh Sửa</a></li>

                        </ul>
                    </div>
                    <div class="course-title" >
                        <div class="text">WELCOME STAFF</div>
                        <div class="insert"><a type="submit" name="insert">BACK</a></div>
                    </div>
                    <div class="table-name">
                        <h1>THÊM TIN TỨC</h1>
                    </div>
                    <form  id="myForm" action="insertnews" method="Post" enctype="multipart/form-data">
                        <div class="update-box">
                            <div class="update-title">
                                <label for="title">Title</label>
                                <input type="text" required = "required" name="title" />
                            </div>
                            <div class="update-select">
                                <label>Category</label>
                                <select name="categoryID">
                                    <option value="" selected>Chọn Loại Tin Tức</option>
                                    <option value="1">Blog</option>
                                    <option value="2">Product</option>
                                    <option value="3">Other</option>
                                </select>
                            </div>
                            <div class="update-cate">
                                <label>Image</label>
                                <input type="file" name="image" required = "required" id="fileInput" onchange="previewImage(event)" accept="image/*" />
                                <div class="file-img">                                
                                    <img id="preview" src="" width="50px" height="50px" alt="Preview">
                                </div>
                            </div>
                            <div class="update-content-wrapper">
                                <div class="update-content">
                                    <label for="">Content</label>
                                    <textarea id="myTextarea" required = "required" name="content"></textarea>

                                    <input type="hidden" name="newsID" value=""/>
                                </div>
                                <div id="errorMsg" style="display:none; color:red;">Vui lòng nhập nội dung tin tức</div>
                            </div>
                        </div>
                        <div class="table-btn">
                            <!--<a href="#">UPDATE</a>-->
                            <!--<input class="btn btn-danger btn-lg" type="submit" name="action" value="UPDATE" />--> 
                            <button type="submit">Insert</button>
                        </div>
                    </form>
                </div>
                <script>
                    var myTextarea = document.getElementById("myTextarea");
                    var errorMsg = document.getElementById("errorMsg");

                    myTextarea.addEventListener("input", function () {
                        if (myTextarea.value.trim() === "") {
                            errorMsg.style.display = "block";
                        } else {
                            errorMsg.style.display = "none";
                        }
                    });
                    var myForm = document.getElementById("myForm");
                    myForm.addEventListener("submit", function (event) {
                        if (myTextarea.value.trim() === "") {
                            errorMsg.style.display = "block";
                            event.preventDefault();
                        } else {
                            errorMsg.style.display = "none";
                        }
                    });
                </script>
                <script>
                    function previewImage(event) {
                        var reader = new FileReader();
                        reader.onload = function () {
                            var output = document.getElementById("preview");
                            output.src = reader.result;
                        };

                        var fileInput = event.target;
                        var files = fileInput.files;

                        if (files.length > 0) {
                            reader.readAsDataURL(files[0]);
                        } else {
                            // Nếu không có file được chọn, đặt lại ảnh về trạng thái ban đầu
                            var output = document.getElementById("preview");
                            output.src = "#";
                        }
                    }
                </script>
                <script src="./courseNav/bootstrap.min.js"></script>
                <script src="./courseNav/jquery.min.js"></script>
                <script src="./courseNav/main.js"></script>
                <script src="./courseNav/popper.js"></script>
                <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
                <script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
                <script src="./ckeditor/ckeditor.js"></script>
                <script>
                    CKEDITOR.replace("myTextarea");
                </script>
            </c:if>

    </body>
</html>