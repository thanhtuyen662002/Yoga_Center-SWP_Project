function showDropdown(id) {
  var dropdown = document.getElementById(id);
  dropdown.classList.add("active");
}

function hideDropdown(id) {
  var dropdown = document.getElementById(id);
  dropdown.classList.remove("active");
}



//  $(document).ready(function() {
//    $('.submenu').hide();
//    var submenuOpen = 0;
//    
//    $('.list-unstyled li').click(function(e) {
//      e.preventDefault();
//
//      if (submenuOpen && $(this).hasClass('active')) {
//        // Đóng submenu khi cùng một thẻ li được nhấp vào
//        $(this).find('.subMenu').slideUp();
//        $(this).removeClass('active');
//        $(this).find('i').toggleClass('fa-caret-down fa-caret-up');
//        submenuOpen = 0;
//      } else {
//        // Đóng submenu hiện tại
//        $('.subMenu').slideUp();
//        $('.list-unstyled li').removeClass('active');
//        $('.list-unstyled li i').removeClass('fa-caret-up').addClass('fa-caret-down');
//        
//        // Mở submenu mới và thêm lớp active
//        $(this).find('.subMenu').slideDown();
//        $(this).addClass('active');
//        $(this).find('i').toggleClass('fa-caret-down fa-caret-up');
//        submenuOpen = 1;
//      }
//    });
//  });
//
