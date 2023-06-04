function showMess(id){
    var option = confirm("Bạn có chắc chắn muốn xóa dữ liệu của dòng ID = " + id + " hay không?");
    if (option === true){
        window.location.href = 'deleteCourse?id=' +id;
    }
}


