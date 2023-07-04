<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Trang JSP</title>
    <script>
        function init() {
            // Lấy danh sách các thẻ li
            var listItem = document.querySelectorAll("li");

            // Lặp qua từng thẻ li để gắn sự kiện click
            listItem.forEach(function(li) {
                li.addEventListener("click", function() {
                    // Loại bỏ class active từ tất cả các thẻ li
                    listItem.forEach(function(item) {
                        item.classList.remove("active");
                    });

                    // Thêm class active cho thẻ li được chọn
                    this.classList.add("active");
                });
            });
        }

        // Gọi hàm init sau khi web đã xử lý xong thông tin từ servlet
        window.addEventListener("load", init);
    </script>
    <style>
        .active {
            background-color: yellow;
        }
    </style>
</head>
<body>
    <ul>
        <li>Item 1</li>
        <li>Item 2</li>
        <li>Item 3</li>
    </ul>
</body>
</html>