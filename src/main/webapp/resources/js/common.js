$(document).ready(function() {
	/*$(".navbar .navgation li:first").addClass("active");
	$(".navbar .navgation li").click(function() {
		$(".navbar .navgation li").removeClass("active");
		$(this).toggleClass("active");
	});*/
	var listCheckItems = $('input:checkbox');
	listCheckItems.on("click", function() {
		var count = $("[type='checkbox']:checked").length;
		document.getElementById("selected-number").innerHTML = count;
		var num=document.getElementById("price").innerHTML;
		document.getElementById("total-amount").innerHTML=num*count;
	});
});