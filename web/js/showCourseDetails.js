let mess = document.getElementById("mess");
let notice = document.getElementById("notice");
let input = document.getElementById("inputContent");

mess.addEventListener("click", function (event) {
    event.preventDefault();
    const content = input.value;
    if (content.trim() !== "") {
        notice.style.display = "block";
        input.value = "";
    }
});

let qc = document.getElementsByClassName("aa")[0];
let form = document.getElementsByClassName("bb")[0];
let submit = document.getElementById("submit");
let back = document.getElementById("back");

submit.addEventListener("click", function (event) {
    event.preventDefault();
    qc.style.display = "none";
    form.style.display = "block";
});
back.addEventListener("click", (event) => {
    event.preventDefault();
    qc.style.display = "block";
    form.style.display = "none";
});

