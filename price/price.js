
window.onload = function () {
    // Lấy danh sách tất cả các "price-detail-form"
    var detailForms = document.getElementsByClassName('price-detail-form');

    // Ẩn tất cả các "price-detail-form" trừ "classic"
    for (var i = 0; i < detailForms.length; i++) {
        if (detailForms[i].id !== 'classic') {
            detailForms[i].style.display = 'none';
        }
    }
};
window.addEventListener('DOMContentLoaded', function () {
    // Ẩn nội dung của tất cả các phần tử có id bắt đầu bằng "classic-"
    const priceDetailElements = document.querySelectorAll('[id^="classic-"]');
    priceDetailElements.forEach(function (element) {
        element.style.display = 'none';
    });

    // Hiển thị nội dung của phần tử có id "classic-12"
    const classic12Element = document.getElementById('classic-12');
    classic12Element.style.display = 'block';
    classic12Element.classList.add('active');
    // Thêm lớp "active" cho thẻ cha của phần tử có id "classic-12"
    // const parentElement = classic12Element.parentElement;
});
function showTab(formId, event) {
    event.preventDefault();
    console.log(formId);
    var detailForms = document.getElementsByClassName('price-detail-form');
    for (var i = 0; i < detailForms.length; i++) {
        var ulElements = detailForms[i].getElementsByTagName('ul');
        //    console.log(ulElements);
        for (var j = 0; j < ulElements.length; j++) {
            ulElements[j].style.display = 'none';
        }
        detailForms[i].style.display = 'none';
    }
    var form = document.getElementById(formId);
    form.style.display = 'flex';
    var firstTab = document.querySelector(' .price-detail-left a:first-child');
    firstTab.classList.add('active');

    var ulId = form.querySelector('.price-info').id;
    var detailLeft = form.querySelector('.price-detail-left a');
    detailLeft.setAttribute('data-ul-id', ulId);

    var firstTabId = detailLeft.getAttribute('data-ul-id');
    var firstTabInfo = document.getElementById(firstTabId);
    firstTabInfo.style.display = 'block';
}

function showInfo(event) {
    // Ngăn chặn hành vi mặc định của thẻ <a>
    event.preventDefault();

    // Ẩn tất cả các phần tử có class "price-info"
    const priceDetailElements = document.querySelectorAll('.price-info');
    priceDetailElements.forEach(element => {
        element.style.display = 'none';
    });

    // Xóa lớp "active" khỏi tất cả các phần tử <a> trong .price-detail-left
    const allLinks = document.querySelectorAll('.price-detail-left a');
    allLinks.forEach(function (link) {
        link.classList.remove('active');
    });
    console.log(event.target.classList.contains('active'))
    // Thêm lớp "active" cho phần tử <a> được nhấp vào
    const clickedLink = event.target.closest('a');
    clickedLink.classList.add('active');
    // event.target.className = 'active'
    // event.target.classList.toggle('active')
    console.log(clickedLink.classList.contains('active'))

    // Hiển thị phần tử có id tương ứng với gói tập luyện được chọn
    const ulId = clickedLink.getAttribute('data-ul-id');
    // Lấy phần tử .price-detail-left tương ứng và thay đổi data-ul-id
    const detailLeft = clickedLink.closest('.price-detail-form').querySelector('.price-detail-left a');
    detailLeft.setAttribute('data-ul-id', ulId);
    const selectedElement = document.getElementById(ulId);
    selectedElement.style.display = 'block';
}



const priceData = [
    {
        priceTitle:'classic',
        part:'12',
        price:'10600000',
        perMonth: '883333',
        perDay:'29444'
    },
    {
        priceTitle:'classic',
        part:'6',
        price:'1600000',
        perMonth: '83333',
        perDay:'29444'
    },
    {
        priceTitle:'classic',
        part:'3',
        price:'10000',
        perMonth: '83333',
        perDay:'29444'
    },
    {
        priceTitle:'classic',
        part:'1',
        price:'163333',
        perMonth: '83333',
        perDay:'29444'
    },
    {
        priceTitle:'classicPlus',
        part:'12',
        price:'163333',
        perMonth: '83333',
        perDay:'29444'
    },
    {
        priceTitle:'royal',
        part:'12',
        price:'163333',
        perMonth: '83333',
        perDay:'29444'
    },
    {
        priceTitle:'royal',
        part:'12',
        price:'163333',
        perMonth: '83333',
        perDay:'29444'
    },
    {
        priceTitle:'signature',
        part:'12',
        price:'163333',
        perMonth: '83333',
        perDay:'29444'
    },
    {
        priceTitle:'signature',
        part:'36',
        price:'163333',
        perMonth: '83333',
        perDay:'29444'
    },
    {
        priceTitle:'signature',
        part:'42',
        price:'163333',
        perMonth: '83333',
        perDay:'29444'
    }
]