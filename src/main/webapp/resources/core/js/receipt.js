/**
 * 
 */




$(document).ready(function(){
	$('#buttonSearch').click(function(){

		searchViaAjax();
	});
});

function searchViaAjax(){

	var searchParameters = 'originalReceiptNumberCode='+ $("#originalReceiptNumberCode").val();
	
	$.ajax({
		type:'GET',
		url:'search',
		data: searchParameters,
		success: function(response){
			console.log(response);
			//var obj = JSON.parse(response)
			var receiptList = response;
			console.log(receiptList);
			
			$('#seeResults').html(response[0].originalReceiptNumberCode);


	/*		    $.each(response, function(i, item) {
			    	
			    	trHTML += '<tr><td>' + item.receiptSequence + '</td><td>' + item.originalReceiptNumberCode + '</td><td>' + item.lastUpdateTimestamp + '</td></tr>';
			    });
			$('#listReceipts').html(trHTML); */
		},
		error: function(response){
			console.log(response);
			$(document.body).html(response.responseText);
		}			
	})
};