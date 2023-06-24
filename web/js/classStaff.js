function showMess(name) {
    var option = confirm("Bạn có chắc chắn muốn xóa lớp học " + name + " hay không?");
    if (option === true) {
        window.location.href = 'deleteClass?name=' + name;
    }
}

