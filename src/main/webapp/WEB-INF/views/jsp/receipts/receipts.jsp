<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags/" %>


<t:layout>

<div>
	<a href="./receipt/add" class="glyphicon glyphicon-plus btn btn-primary" >Add Receipt</a>
</div>
	<div class="row">
	 		<div class="col-xs-4 containerLeft">
		  <c:choose> 
		  		<c:when test="${empty receiptList}">No receipts found</c:when>
		  		<c:otherwise>
		  			<table class="table table-striped table-pressable">
				<thead>
				<tr>
					<th width="80">ReceiptSequence</th>
					<th width="120">OriginalReceiptNumber</th>
					<th width="120">LastUpdate</th>
					<th width="60">Edit</th>
					<th width="60">Delete</th>
				</tr>
				</thead>
				<tbody>
				<c:forEach items="${receiptList}" var="receipt">
					<tr>
						<td>${receipt.sqReceipt}</td>
						<td>${receipt.acOriginalReceiptNumber}</td>
						<td>${receipt.tsLastUpdate}</td>
						<td><a href="<c:url value='/edit/${receipt.sqReceipt}' />" >Edit</a></td>
						<td><a href="<c:url value='/remove/${receipt.sqReceipt}' />" >Delete</a></td>
					</tr>
					</c:forEach>
				</tbody>
				</table>
		  		</c:otherwise>
		  	</c:choose>			  		
		</div>
		
		<div class="col-xs-8 containerRight">
			<div class="data"> 
			</div>
		</div>
	</div>
	 

 </t:layout>
