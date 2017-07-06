<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<div class="row">
	  <table id="table" class="table table-striped">
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
					<td>${receipt[0].receiptSequence}</td>
					<td>${receipt.originalReceiptNumberCode}</td>
					<td>${receipt.lastUpdateTimestamp}</td>
					<td><a href="<c:url value='/edit/${receipt.receiptSequence}' />" >Edit</a></td>
					<td><a href="<c:url value='/remove/${receipt.receiptSequence}' />" >Delete</a></td>
				</tr>
				</c:forEach>
			</tbody>
			</table>
		
	  </div>
</html>