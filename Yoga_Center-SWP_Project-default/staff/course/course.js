let buttonTag = document.querySelector(".header-button");
let btn1 = document.querySelector(".btn1");
let btn2 = document.querySelector(".btn2");
let btn3 = document.querySelector(".btn3");
let nav = document.getElementById("nav");
let logo = document.getElementById("logo");
let logoH2 = document.querySelector(".h2");
let navSpan = document.querySelectorAll(".nav-content-list   li span");
let courseBody = document.querySelector(".course-body");
buttonTag.addEventListener("click", () => {
  btn1.classList.toggle("line1");
  btn2.classList.toggle("line2");
  btn3.classList.toggle("line3");
  nav.classList.toggle("logo-btn");
  nav.classList.toggle("widthLess");
  logo.classList.toggle("logo-btn");
  logo.classList.toggle("widthLess");
  courseBody.classList.toggle("hihi");
});
