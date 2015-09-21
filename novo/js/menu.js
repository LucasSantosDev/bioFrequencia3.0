$(document).ready(function(){
	$(".menu2").css("visibility","hidden");
	$(".menu2").css("height","0px");
    
    $(".btn-menu").click(function(){
    	$(".menu2").css("visibility","visible");
    	$(".menu2").toggle();
    	$(".menu2").css("height","30px");
	});
});