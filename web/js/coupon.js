let thisPage = 1;
let limit = 4;
let list = document.querySelectorAll(".list-coupon-card .card-item");
let searchInput = document.getElementById("searchInput");
let sortSelect = document.getElementById("sortSelect");
let currentSort = "default";

function loadItem() {
  let beginGet = limit * (thisPage - 1);
  let endGet = limit * thisPage - 1;
  let searchValue = searchInput.value.toLowerCase().trim();

  let filteredList = Array.from(list).filter((item) => {
    let cardContentCourse = item
      .querySelector(".card-content-course")
      .innerText.toLowerCase();
    return cardContentCourse.includes(searchValue);
  });

  if (currentSort !== "default") {
    if (currentSort === "asc") {
      filteredList.sort((a, b) => {
        let couponA = parseFloat(a.querySelector(".coupon-value").innerText);
        let couponB = parseFloat(b.querySelector(".coupon-value").innerText);
        return couponA - couponB;
      });
    } else if (currentSort === "desc") {
      filteredList.sort((a, b) => {
        let couponA = parseFloat(a.querySelector(".coupon-value").innerText);
        let couponB = parseFloat(b.querySelector(".coupon-value").innerText);
        return couponB - couponA;
      });
    }
  }

  let count = Math.ceil(filteredList.length / limit);
  document.querySelector(".listPage").innerHTML = "";

  if (thisPage != 1) {
    let prev = document.createElement("li");
    prev.innerText = "PREV";
    prev.setAttribute("onclick", "changePage(" + (thisPage - 1) + ")");
    document.querySelector(".listPage").appendChild(prev);
  }

  for (let i = 1; i <= count; i++) {
    let newPage = document.createElement("li");
    newPage.innerText = i;
    if (i == thisPage) {
      newPage.classList.add("actived");
    }
    newPage.setAttribute("onclick", "changePage(" + i + ")");
    document.querySelector(".listPage").appendChild(newPage);
  }

  if (thisPage != count) {
    let next = document.createElement("li");
    next.innerText = "NEXT";
    next.setAttribute("onclick", "changePage(" + (thisPage + 1) + ")");
    document.querySelector(".listPage").appendChild(next);
  }

  // Ẩn tất cả các mục
  list.forEach((item) => {
    item.style.display = "none";
  });

  // Hiển thị các mục tìm thấy cho trang hiện tại
  filteredList.forEach((item, key) => {
    if (key >= beginGet && key <= endGet) {
      item.style.display = "block";
    }
  });
}

loadItem();

function listPage() {
  let count = Math.ceil(list.length / limit);
  document.querySelector(".listPage").innerHTML = "";

  if (thisPage != 1) {
    let prev = document.createElement("li");
    prev.innerText = "PREV";
    prev.setAttribute("onclick", "changePage(" + (thisPage - 1) + ")");
    document.querySelector(".listPage").appendChild(prev);
  }

  for (let i = 1; i <= count; i++) {
    let newPage = document.createElement("li");
    newPage.innerText = i;
    if (i == thisPage) {
      newPage.classList.add("actived");
    }
    newPage.setAttribute("onclick", "changePage(" + i + ")");
    document.querySelector(".listPage").appendChild(newPage);
  }

  if (thisPage != count) {
    let next = document.createElement("li");
    next.innerText = "NEXT";
    next.setAttribute("onclick", "changePage(" + (thisPage + 1) + ")");
    document.querySelector(".listPage").appendChild(next);
  }
}

function changePage(i) {
  thisPage = i;
  loadItem();
}

searchInput.addEventListener("input", function () {
  thisPage = 1;
  loadItem();
});

sortSelect.addEventListener("change", function () {
  currentSort = sortSelect.value;
  loadItem();
});
// let thisPage = 1;
// let limit = 4;
// let list = document.querySelectorAll(".list-coupon-card .card-item");
// let searchInput = document.getElementById("searchInput");
// let sortSelect = document.getElementById("sortSelect");
// let currentSort = "default";
// let sortValue = sortSelect.value;
// function loadItem() {
//   let beginGet = limit * (thisPage - 1);
//   let endGet = limit * thisPage - 1;
//   let searchValue = searchInput.value.toLowerCase().trim();
//   let filteredList = Array.from(list).filter((item) => {
//     let cardContentCourse = item
//       .querySelector(".card-content-course")
//       .innerText.toLowerCase();

//     return cardContentCourse.includes(searchValue);
//   });

//   console.log("FilteredList before sorting:", filteredList);
//   if (sortValue === "asc") {
//     filteredList.sort((a, b) => {
//       let valueA = parseFloat(
//         a.querySelector(".discount").textContent.replace("%", "")
//       );
//       let valueB = parseFloat(
//         b.querySelector(".discount").textContent.replace("%", "")
//       );
//       return valueA - valueB;
//     });
//   } else if (sortValue === "desc") {
//     filteredList.sort((a, b) => {
//       let valueA = parseFloat(
//         a.querySelector(".discount").textContent.replace("%", "")
//       );
//       let valueB = parseFloat(
//         b.querySelector(".discount").textContent.replace("%", "")
//       );
//       return valueB - valueA;
//     });
//   }

//   console.log("FilteredList after sorting:", filteredList);
//   let count = Math.ceil(filteredList.length / limit);
//   document.querySelector(".listPage").innerHTML = "";

//   if (thisPage != 1) {
//     let prev = document.createElement("li");
//     prev.innerText = "PREV";
//     prev.setAttribute("onclick", "changePage(" + (thisPage - 1) + ")");
//     document.querySelector(".listPage").appendChild(prev);
//   }

//   for (let i = 1; i <= count; i++) {
//     let newPage = document.createElement("li");
//     newPage.innerText = i;
//     if (i == thisPage) {
//       newPage.classList.add("actived");
//     }
//     newPage.setAttribute("onclick", "changePage(" + i + ")");
//     document.querySelector(".listPage").appendChild(newPage);
//   }

//   if (thisPage != count) {
//     let next = document.createElement("li");
//     next.innerText = "NEXT";
//     next.setAttribute("onclick", "changePage(" + (thisPage + 1) + ")");
//     document.querySelector(".listPage").appendChild(next);
//   }

//   // Ẩn tất cả các mục
//   list.forEach((item) => {
//     item.style.display = "none";
//   });

//   // Hiển thị các mục tìm thấy cho trang hiện tại
//   filteredList.forEach((item, key) => {
//     if (key >= beginGet && key <= endGet) {
//       item.style.display = "block";
//     }
//   });
// }

// function listPage() {
//   let count = Math.ceil(list.length / limit);
//   document.querySelector(".listPage").innerHTML = "";

//   if (thisPage != 1) {
//     let prev = document.createElement("li");
//     prev.innerText = "PREV";
//     prev.setAttribute("onclick", "changePage(" + (thisPage - 1) + ")");
//     document.querySelector(".listPage").appendChild(prev);
//   }

//   for (let i = 1; i <= count; i++) {
//     let newPage = document.createElement("li");
//     newPage.innerText = i;
//     if (i == thisPage) {
//       newPage.classList.add("actived");
//     }
//     newPage.setAttribute("onclick", "changePage(" + i + ")");
//     document.querySelector(".listPage").appendChild(newPage);
//   }

//   if (thisPage != count) {
//     let next = document.createElement("li");
//     next.innerText = "NEXT";
//     next.setAttribute("onclick", "changePage(" + (thisPage + 1) + ")");
//     document.querySelector(".listPage").appendChild(next);
//   }
// }

// function changePage(i) {
//   thisPage = i;
//   loadItem();
// }

// searchInput.addEventListener("input", function () {
//   thisPage = 1;
//   loadItem();
// });

// sortSelect.addEventListener("change", function () {
//   currentSort = sortSelect.value;
//   loadItem();
// });

// loadItem();