function showMess(name) {
    var option = confirm("Bạn có chắc chắn muốn xóa khóa học " + name + " hay không?");
    if (option === true) {
        window.location.href = 'deleteCourse?name=' + name;
    }
}

