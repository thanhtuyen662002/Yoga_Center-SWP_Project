function showMess(param) {
    var arr = param.split('-');
    var id = arr[0];
    var name = arr[1];
    var option = confirm("Bạn có chắc chắn muốn xóa khách hàng " + name + " hay không?");
    if (option === true) {
        window.location.href = 'deleteGuest?id=' + id;
    }
}