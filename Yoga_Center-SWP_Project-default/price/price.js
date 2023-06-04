const priceTitle = [
  { value: "CLASSIC", id: "classic" },
  { value: "CLASSIC-PLUS", id: "classicPlus" },
  { value: "ROYAL", id: "royal" },
  { value: "SIGNATURE", id: "signature" },
];

const priceData = [
  {
    priceTitle: "classic",
    part: "12",
    price: "10600000",
    perMonth: "883333",
    perDay: "29444",
  },
  {
    priceTitle: "classic",
    part: "6",
    price: "1600000",
    perMonth: "83333",
    perDay: "29444",
  },
  {
    priceTitle: "classic",
    part: "3",
    price: "10000",
    perMonth: "83333",
    perDay: "29444",
  },
  {
    priceTitle: "classic",
    part: "1",
    price: "163333",
    perMonth: "83333",
    perDay: "29444",
  },
  {
    priceTitle: "classicPlus",
    part: "12",
    price: "163333",
    perMonth: "83333",
    perDay: "29444",
  },
  {
    priceTitle: "royal",
    part: "12",
    price: "163333",
    perMonth: "83333",
    perDay: "29444",
  },
  {
    priceTitle: "royal",
    part: "24",
    price: "163333",
    perMonth: "83333",
    perDay: "29444",
  },
  {
    priceTitle: "signature",
    part: "12",
    price: "163333",
    perMonth: "83333",
    perDay: "29444",
  },
  {
    priceTitle: "signature",
    part: "36",
    price: "163333",
    perMonth: "83333",
    perDay: "29444",
  },
  {
    priceTitle: "signature",
    part: "42",
    price: "163333",
    perMonth: "83333",
    perDay: "29444",
  },
];
let currPriceTitle = "";
let prePriceTitleNode;
let prePartNode;

//render price title
const renderPriceTitle = () => {
  const priceListUI = document.getElementById("price-title-list");
  priceTitle.forEach((element) => {
    const list_item = document.createElement("li");
    list_item.id = element.id;
    list_item.className = "price-title-li";
    list_item.innerHTML = `${element.value}`;
    priceListUI.appendChild(list_item);
  });
};

//click vào danh sách Title và render part tương ứng, từ đó render  price Detail(bằng renderPriceInforInit)
const renderPart = () => {
  const priceListUI = document.getElementById("price-title-list");

  //khi mà click vào 1 price title thì mình cũng render price-detail
  priceListUI.addEventListener("click", (event) => {
    //xóa active trong title
    if (prePriceTitleNode) prePriceTitleNode.classList.remove("active");

    const idPriceTitle =
      event.target.className == "price-title-li" ? event.target.id : "";

    if (idPriceTitle) {
      currPriceTitle = idPriceTitle; //lưu lại cái priceTitle hiện tại
      prePriceTitleNode = event.target; //lưu lại pt price title sẽ active
      prePriceTitleNode.classList.add("active"); //thêm active cho price title
      //tìm những thằng có price title giống thằng bị actived
      const listPart = priceData.filter(
        (item) => item.priceTitle == idPriceTitle
      );

      //render ra những thằng part tương ứng
      const partListUI = document.getElementById("price-detail-left");
      partListUI.innerHTML = "";
      listPart.forEach((element, index) => {
        const partNode = document.createElement("a");
        if (index == 0) {
          prePartNode = partNode;
          partNode.classList.add("active");
        }
        partNode.href = "#";
        partNode.id = element.part;
        partNode.innerHTML = `<div class="left-months">${element.part}</div> THÁNG`;
        partListUI.appendChild(partNode);
      });
      //render
      renderPriceInforInit(prePriceTitleNode, prePartNode);
    }
  });
};

// render price Detail dựa vào pricetile đã click và prePartNode đã click
const renderPriceInforInit = (prePriceTitleNode, prePartNode) => {
  const priceInforUI = document.getElementById("price-info");
  console.log("prePriceTitleNode = ", prePriceTitleNode);
  console.log("prePartNode = ", prePartNode);
  //tìm price detail tương ứng
  const priceDetail = priceData.find((item) => {
    if (item.priceTitle == prePriceTitleNode.id && item.part == prePartNode.id)
      return item;
  });
  //render
  priceInforUI.innerHTML = `
          <li>
              <div class="price-detail-right-text">
              Thời gian tập luyện:
              </div>
              <div class="price-detail-right-price">${
                priceDetail.part
              } THÁNG</div>
          </li>
          <li>
              <div class="price-detail-right-text">Tổng chi phí:</div>
              <div class="price-detail-right-price">${Number(
                priceDetail.price
              ).toLocaleString()} VNĐ</div>
          </li>
          <li>
              <div class="price-detail-right-text">Chi phí / tháng</div>
              <div class="price-detail-right-price">${Number(
                priceDetail.perMonth
              ).toLocaleString()} VNĐ</div>
          </li>
          <li>
              <div class="price-detail-right-text">Chí phí / ngày</div>
              <div class="price-detail-right-price">${Number(
                priceDetail.perDay
              ).toLocaleString()} VNĐ</div>
          </li>
          <li>
              <button type="submit" id='${priceDetail.priceTitle}-${
    priceDetail.part
  }'>ĐĂNG KÝ NGAY</button>
          </li>
      `;
};
//click vào part và render price Detail
const renderPriceInfor = () => {
  const partListUI = document.getElementById("price-detail-left");
  //nếu có ai click vào part bất kỳ thì render price detail tương ứng
  partListUI.addEventListener("click", (event) => {
    //xóa active cho part trước đó
    if (prePartNode) prePartNode.classList.remove("active");
    const idPart =
      event.target.closest("a") == null ? "" : event.target.closest("a").id;

    if (idPart) {
      prePartNode = event.target.closest("a"); //lưu prePartNode mới
      prePartNode.classList.add("active");
      renderPriceInforInit(prePriceTitleNode, prePartNode);
    }
  });
};

// main
window.addEventListener("DOMContentLoaded", function () {
  renderPriceTitle();
  renderPart();
  renderPriceInfor();
});
