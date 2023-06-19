
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" />
        <link rel="stylesheet" href="./css/clb.css">
        <title>Câu lạc bộ</title>
    </head>

    <body>
        <!-- Header -->
        <c:import url="customer_header.jsp"/>
        <!-- Banner -->
        <div class="banner">
            <div class="banner-bg"> <img src="./image/bannerClb.jpg" alt=""></div>
            <div class="banger-bg-color"></div>
            <div class="container">
                <div class="title-bg">CÂU LẠC BỘ</div>
            </div>
        </div>
        <!-- Title -->
        <div class="clb">
            <div class="container">
                <div class="clb-title">TẬP LUYỆN Ở CÂU LẠC BỘ GẦN BẠN</div>
                <br class="clb-detail">Hệ thống phòng tập của YOGA có mặt khắp các quận TPHCM.</br>Lựa chọn phòng tập gần
                bạn nhất để có thể tập luyện dễ dàng và tiết kiệm thời gian
            </div>
            <select class="form-select" id = "district-select" aria-label="Default select example">
                <option value="" selected>Chọn quận gần bạn</option>
                <option value="Quận 1">Quận 1</option>
                <option value="Quận 3">Quận 3</option>
                <option value="Quận 4">Quận 4</option>
                <option value="Quận 5">Quận 5</option>
                <option value="Quận 6">Quận 6</option>
                <option value="Quận 7">Quận 7</option>
                <option value="Quận 9">Quận 9</option>
                <option value="Quận 10">Quận 10</option>
                <option value="Quận 11">Quận 11</option>
                <option value="Quận 12">Quận 12</option>
                <option value="Quận Gò Vấp">Quận Gò Vấp</option>
                <option value="Quận Bình Thạnh">Quận Bình Thạnh</option>
                <option value="Quận Phú Nhuận">Quận Phú Nhuận</option>
                <option value="Quận Tân Phú">Quận Tấn Phú</option>


            </select>
        </div>
        <!-- Form control -->
        <div class="container">

            <div class="form-content" id="clb-container">
                <c:forEach var="c" items="${list}">
                    <div class="clb-card">

                        <div class="clb-card-img"><img src="data:image;base64,${c.dataImage}" alt=""></div>
                        <div class="clb-card-content">

                            <div class="clb-card-title">${c.clubName}</div>
                            <div class="clb-card-position">
                                <span> <i class="fas fa-map-marker-alt"></i></span>
                                    ${c.address}
                            </div>
                            <div class="clb-card-phone">
                                <span><i class="fas fa-phone-alt"></i>
                                    ${c.hotline}</span>
                            </div>

                        </div>
                    </div>
                </c:forEach>
            </div>

            <ul class="listPage">
            </ul>
        </div>

        <!-- FOOTER -->
        <c:import url="customer_footer.jsp"/>
        <script>
            document.addEventListener('DOMContentLoaded', function () {
                // Lấy các phần tử cần tương tác
                var selectElement = document.getElementById('district-select');
                var clbContainer = document.getElementById('clb-container');
                var clbCards = clbContainer.getElementsByClassName('clb-card');

                // Xử lý sự kiện khi người dùng thay đổi giá trị trong dropdown
                selectElement.addEventListener('change', function () {
                    var selectedValue = selectElement.value;
                    var regex = new RegExp("\\b" + selectedValue + "\\b");

                    // Tạo danh sách mới chỉ chứa các CLB card phù hợp với tìm kiếm
                    var filteredList = [];
                    for (var i = 0; i < clbCards.length; i++) {
                        var card = clbCards[i];
                        var position = card.querySelector(".clb-card-position");
                        var district = position.textContent.trim();

                        if (selectedValue === "" || regex.test(district)) {
                            card.style.display = "block"; // Hiển thị thẻ clb-card
                            filteredList.push(card); // Thêm vào danh sách phù hợp
                        } else {
                            card.style.display = "none"; // Ẩn thẻ clb-card
                        }
                    }

                    // Cập nhật danh sách phân trang với danh sách đã lọc
                    updatePagination(filteredList);
                });

                function updatePagination(filteredList) {
                    let thisPage = 1;
                    let limit = 6;
                    let list = filteredList;

                    function loadItem() {
                        let beginGet = limit * (thisPage - 1);
                        let endGet = limit * thisPage - 1;

                        list.forEach((item, key) => {
                            if (key >= beginGet && key <= endGet) {
                                item.style.display = "block";
                            } else {
                                item.style.display = "none";
                            }
                        });

                        listPage();
                    }

                    loadItem();

                    function listPage() {
                        let count = Math.ceil(list.length / limit);
                        document.querySelector(".listPage").innerHTML = "";

                        if (thisPage != 1) {
                            let prev = document.createElement("li");
                            prev.innerText = "PREV";
                            prev.addEventListener("click", function () {
                                changePage(thisPage - 1);
                            });
                            document.querySelector(".listPage").appendChild(prev);
                        }

                        for (let i = 1; i <= count; i++) {
                            let newPage = document.createElement("li");
                            newPage.innerText = i;

                            if (i == thisPage) {
                                newPage.classList.add("actived");
                            }

                            newPage.addEventListener("click", function () {
                                changePage(i);
                            });
                            document.querySelector(".listPage").appendChild(newPage);
                        }

                        if (thisPage != count) {
                            let next = document.createElement("li");
                            next.innerText = "NEXT";
                            next.addEventListener("click", function () {
                                changePage(thisPage + 1);
                            });
                            document.querySelector(".listPage").appendChild(next);
                        }
                    }

                    function changePage(i) {
                        thisPage = i;
                        loadItem();
                    }
                }
            });
        </script>
        <script>
            document.addEventListener("DOMContentLoaded", function () {
                let thisPage = 1;
                let limit = 6;
                let list = document.querySelectorAll(".form-content .clb-card");

                function loadItem() {
                    let beginGet = limit * (thisPage - 1);
                    let endGet = limit * thisPage - 1;

                    list.forEach((item, key) => {
                        if (key >= beginGet && key <= endGet) {
                            item.style.display = "block";
                        } else {
                            item.style.display = "none";
                        }
                    });

                    listPage();
                }

                loadItem();

                function listPage() {
                    let count = Math.ceil(list.length / limit);
                    document.querySelector(".listPage").innerHTML = "";

                    if (thisPage != 1) {
                        let prev = document.createElement("li");
                        prev.innerText = "PREV";
                        prev.addEventListener("click", function () {
                            changePage(thisPage - 1);
                        });
                        document.querySelector(".listPage").appendChild(prev);
                    }

                    for (let i = 1; i <= count; i++) {
                        let newPage = document.createElement("li");
                        newPage.innerText = i;

                        if (i == thisPage) {
                            newPage.classList.add("actived");
                        }

                        newPage.addEventListener("click", function () {
                            changePage(i);
                        });
                        document.querySelector(".listPage").appendChild(newPage);
                    }

                    if (thisPage != count) {
                        let next = document.createElement("li");
                        next.innerText = "NEXT";
                        next.addEventListener("click", function () {
                            changePage(thisPage + 1);
                        });
                        document.querySelector(".listPage").appendChild(next);
                    }
                }

                function changePage(i) {
                    thisPage = i;
                    loadItem();
                }
            });
        </script> 
    </body>

</html>