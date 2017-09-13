$(document).ready(function(){

	$(".table-pressable tbody tr").click(function() {
	
	  if ($(this).hasClass('active')) {
	    $(".table-pressable tbody tr").removeClass('active');
	    $(".data").addClass('hidden')
	    
	    $(".containerLeft").removeClass('col-xs-4');
	    $(".containerLeft").addClass('col-xs-12')
	    $('.data').html("");
	
	  } else {
	    $(".table-pressable tbody tr").removeClass('active');
	     $(".containerLeft").removeClass('col-xs-12');
	    $(".containerLeft").addClass('col-xs-4')
	    $(".data").removeClass('hidden')
	    editReceiptAjax($(this).find('td').html());
	    $(this).addClass('active');
	  }
	
	});
	
	
	
	
	function editReceiptAjax(id){
		
		
		$.ajax({
			type:'GET',
			url:'Receipts/Edit/'+ id,
			success: function(response){
				console.log(response); 
				var receiptList = response;
				console.log(receiptList);
				
				$('.data').html(response);
				

			    $('.date-picker-input').datepicker({
			        format: "dd/mm/yyyy",
			        language: "pt"
			    });
			},
			error: function(response){
				console.log(response);
				$(document.body).html(response.responseText);
			}			
		})
	};
	

    
});