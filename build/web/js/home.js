$(document).ready(function () {
  $(".news-slider").slick({
    // dots: true,
    infinite: true,
    slidesToShow: 3,
    slidesToScroll: 2,
    arrows: false,
    autoplay: true,
    autoplaySpeed: 1500,
  });
    $(".plan-content").slick({
    infinite: true,
    slidesToShow: 4,
    slidesToScroll: 2,
    arrows: false,
     autoplay: true,
    autoplaySpeed: 1500,
  });
});