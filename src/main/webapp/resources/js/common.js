$(document).ready(function () {
   $(".navbar .navgation li:first").addClass("active");
    $(".navbar .navgation li").click(function () {
        $(".navbar .navgation li").removeClass("active");
        $(this).toggleClass("active");
    });
});