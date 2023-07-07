$(".feedback-list").slick({
  centerMode: true,
  centerPadding: "60px",
  slidesToShow: 3,
  //   center: true,
  autoplay: true,
  dots: true,
  prevArrow: null,
  nextArrow: null,
  autoplaySpeed: 2000,
  customPaging: function (slider, i) {
    return "<button></button>"; // Trả về HTML cho từng dot, trong trường hợp này là một span trống
  },
  loop: true,
  responsive: [
    {
      breakpoint: 768,
      settings: {
        arrows: false,
        centerMode: true,
        centerPadding: "40px",
        slidesToShow: 3,
      },
    },
    {
      breakpoint: 480,
      settings: {
        arrows: false,
        centerMode: true,
        centerPadding: "40px",
        slidesToShow: 1,
      },
    },
  ],
});
