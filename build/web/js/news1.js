let thisPage = 1;
let limit = 6;
let list = document.querySelectorAll(".news-content .news-card");
let listCate = document.querySelectorAll(".news-title a");
var cards = document.querySelectorAll(".news-card");

document.addEventListener("DOMContentLoaded", function () {
  function loadItem() {
    let beginGet = limit * (thisPage - 1);
    let endGet = limit * thisPage - 1;

    list.forEach((item, key) => {
      if (key >= beginGet && key <= endGet) {
        item.style.display = "block";
      } else {
        item.style.display = "none";
      }
    });

    listPage();
  }

  loadItem();

  function listPage() {
    let count = Math.ceil(list.length / limit);
    document.querySelector(".listPage").innerHTML = "";

    if (thisPage != 1) {
      let prev = document.createElement("li");
      prev.innerText = "PREV";
      prev.addEventListener("click", function () {
        changePage(thisPage - 1);
      });
      document.querySelector(".listPage").appendChild(prev);
    }

    for (let i = 1; i <= count; i++) {
      let newPage = document.createElement("li");
      newPage.innerText = i;

      if (i == thisPage) {
        newPage.classList.add("actived");
      }

      newPage.addEventListener("click", function () {
        changePage(i);
      });
      document.querySelector(".listPage").appendChild(newPage);
    }

    if (thisPage != count) {
      let next = document.createElement("li");
      next.innerText = "NEXT";
      next.addEventListener("click", function () {
        changePage(thisPage + 1);
      });
      document.querySelector(".listPage").appendChild(next);
    }
  }

  function changePage(i) {
    thisPage = i;
    loadItem();
  }

  listCate.forEach((link) => {
    link.addEventListener("click", (event) => {
      event.preventDefault();
      listCate.forEach(function (otherLink) {
        otherLink.classList.remove("active");
      });
      link.classList.add("active");
      var cardId = link.textContent.trim().toLowerCase();
      var filteredList = [];
      cards.forEach((cardItem) => {
        cardArr = cardItem
          .querySelector(".news-card-id")
          .textContent.trim()
          .toLowerCase();
        if (cardId === cardArr) {
          cardItem.style.display = "block";
          filteredList.push(cardItem);
        } else if (cardId === "all") {
          cardItem.style.display = "block";
          filteredList.push(cardItem);
        } else {
          cardItem.style.display = "none";
        }
      });
      updatePagination(filteredList);
    });
  });
  function updatePagination(filteredList) {
    let thisPage = 1;
    let limit = 6;
    let list = filteredList;
    function loadItem() {
      let beginGet = limit * (thisPage - 1);
      let endGet = limit * thisPage - 1;

      list.forEach((item, key) => {
        if (key >= beginGet && key <= endGet) {
          item.style.display = "block";
        } else {
          item.style.display = "none";
        }
      });

      listPage();
    }

    loadItem();

    function listPage() {
      let count = Math.ceil(list.length / limit);
      document.querySelector(".listPage").innerHTML = "";

      if (thisPage != 1) {
        let prev = document.createElement("li");
        prev.innerText = "PREV";
        prev.addEventListener("click", function () {
          changePage(thisPage - 1);
        });
        document.querySelector(".listPage").appendChild(prev);
      }

      for (let i = 1; i <= count; i++) {
        let newPage = document.createElement("li");
        newPage.innerText = i;

        if (i == thisPage) {
          newPage.classList.add("actived");
        }

        newPage.addEventListener("click", function () {
          changePage(i);
        });
        document.querySelector(".listPage").appendChild(newPage);
      }

      if (thisPage != count) {
        let next = document.createElement("li");
        next.innerText = "NEXT";
        next.addEventListener("click", function () {
          changePage(thisPage + 1);
        });
        document.querySelector(".listPage").appendChild(next);
      }
    }

    function changePage(i) {
      thisPage = i;
      loadItem();
    }
  }
});
