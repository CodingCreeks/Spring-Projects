$("document").ready(function() {

	/* $(".jumbotron").css("background-color", "red"); */
	/* $(".container-fluid").css("border", "2px solid red"); */
	/* $(".navbar navbar-default").wrap("<div class='container-fluid'/>"); */
	/*$("body").wrap("<div class='col-md-12'/>");*/

	/*$(function() {
		$('#datetimepicker1').datetimepicker();
	});*/

	/*$(function() {
		$('#datetimepicker10').datetimepicker({
			viewMode : 'years',
			format : 'MM/YYYY'
		});
	});*/
	
	/*$('.dropdown-toggle').dropdown();
	$('#divNewNotifications li > a').click(function(){
	    $('#text').text($(this).html());
	});*/
	
	$('.dropdown-toggle').dropdown();
	$('#divNewNotifications li').on('click', function() {
	    $('#dropdown_title').html($(this).find('a').html());
	});
	
	
	/* $(".dropdown-toggle").dropdown();*/
	
	$("#UploadPhoto").click(function() {
		var imgUrl = $(this).data('rel');
		$("#area").html("<img src='" + imgUrl + "' alt='Photo' />");
	});

	

	$(function() {
		$('#datetimepicker6').datetimepicker();
		$('#datetimepicker7').datetimepicker({
			useCurrent : false
		// Important! See issue #1075
		});
		$("#datetimepicker6").on("dp.change", function(e) {
			$('#datetimepicker7').data("DateTimePicker").minDate(e.date);
		});
		$("#datetimepicker7").on("dp.change", function(e) {
			$('#datetimepicker6').data("DateTimePicker").maxDate(e.date);
		});
	});
	
	/*$(".dropdown-toggle").dropdown();*/
});


/*
 * <script type="text/javascript"> $(function() {
 * $('#datetimepicker10').datetimepicker({ viewMode : 'years', format :
 * 'MM/YYYY' }); }); </script>
 * 
 * <script type="text/javascript"> $(function() {
 * $('#datetimepicker6').datetimepicker();
 * $('#datetimepicker7').datetimepicker({ useCurrent : false //Important! See
 * issue #1075 }); $("#datetimepicker6").on("dp.change", function(e) {
 * $('#datetimepicker7').data("DateTimePicker").minDate(e.date); });
 * $("#datetimepicker7").on("dp.change", function(e) {
 * $('#datetimepicker6').data("DateTimePicker").maxDate(e.date); }); });
 * </script>
 * 
 * 
 * 
 */