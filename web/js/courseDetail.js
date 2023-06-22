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
