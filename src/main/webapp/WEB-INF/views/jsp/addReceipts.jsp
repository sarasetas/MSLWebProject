<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>MSL</title>
 
<spring:url value="/resources/core/css/hello.css" var="coreCss" />
<spring:url value="/resources/core/css/bootstrap.min.css" var="bootstrapCss" />
<link href="${bootstrapCss}" rel="stylesheet" />
<link href="${coreCss}" rel="stylesheet" />
</head>
 
<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container">
	<div class="navbar-header">
		<a class="navbar-brand" href="#">MSL Web Project</a>
	</div>
  </div>
</nav>
<div class="container">

<c:url var="voltar" value="/searchReceipts" ></c:url>
<c:url var="addAction" value="/receipt/add" ></c:url>
<br><br>
	<div>
		<div class="row">
			<div class="col-md-4">
				<h3>Add Receipts</h3>
			</div>	
		</div>
		
			<div class="form-group">
				<div class="row">
					<form action="${addAction}" commandName="receipt" method="post">
						<div class="row">
						<div class="row">
							<div class="col-md-4">
								<label for="sqReceipt">sqReceipt</label>
							</div>		
							<div class="col-md-4">
								<input type="text" class="form-control" id="sqReceipt" name="sqReceipt" required>
							</div>
						 		
				 			<div class="col-md-offset-4">
					 
							</div>	
					  	</div>
					  	<div class="row">
							<div class="col-md-4">
								<label for="acCompany">acCompany</label>
							</div>		
							<div class="col-md-4">
								<input type="number" class="form-control" id="acCompany" name="acCompany" required>
							</div>
						 		
				 			<div class="col-md-offset-4">
					 
							</div>	
					  	</div>
					  	<div class="row">
							<div class="col-md-4">
								<label for="sqOperation">sqOperation</label>
							</div>		
							<div class="col-md-4">
								<input type="text" class="form-control" id="sqOperation" name="sqOperation" required>
							</div>
						 		
				 			<div class="col-md-offset-4">
					 
							</div>	
					  	</div>
					  	<div class="row">
							<div class="col-md-4">
								<label for="acOperationType">acOperationType</label>
							</div>		
							<div class="col-md-4">
								<input type="text" class="form-control" id="acOperationType" name="acOperationType" required>
							</div>
						 		
				 			<div class="col-md-offset-4">
					 
							</div>	
					  	</div>
							<div class="col-md-4">
								<label for="acOriginalReceiptNumber">OriginalReceiptNumberCode</label>
							</div>		
							<div class="col-md-4">
								<input type="text" class="form-control" id="acOriginalReceiptNumber" name="acOriginalReceiptNumber" required>
							</div>
						 		
				 			<div class="col-md-offset-4">
					 
							</div>	
					  	</div>
					  	<div class="row">
							<div class="col-md-4">
								<label for="acReceiptType">acReceiptType</label>
							</div>		
							<div class="col-md-4">
								<input type="text" class="form-control" id="acReceiptType" name="acReceiptType" required>
							</div>
						 		
				 			<div class="col-md-offset-4">
					 
							</div>	
					  	</div>
					  	<div class="row">
							<div class="col-md-4">
								<label for="acReceiptSubtype">acReceiptSubtype</label>
							</div>		
							<div class="col-md-4">
								<input type="text" class="form-control" id="acReceiptSubtype" name="acReceiptSubtype" required>
							</div>
						 		
				 			<div class="col-md-offset-4">
					 
							</div>	
					  	</div>
					  	<div class="row">
							<div class="col-md-4">
								<label for="sqPolicyHolder">sqPolicyHolder</label>
							</div>		
							<div class="col-md-4">
								<input type="number" class="form-control" id="sqPolicyHolder" name="sqPolicyHolder" required>
							</div>
						 		
				 			<div class="col-md-offset-4">
					 
							</div>	
					  	</div>
					  	<div class="row">
							<div class="col-md-4">
								<label for="acPolicyNumber">acPolicyNumber</label>
							</div>		
							<div class="col-md-4">
								<input type="text" class="form-control" id="acPolicyNumber" name="acPolicyNumber" required>
							</div>
						 		
				 			<div class="col-md-offset-4">
					 
							</div>	
					  	</div>
					  	<div class="row">
							<div class="col-md-4">
								<label for="dtEmission">dtEmission</label>
							</div>		
							<div class="col-md-4">
								<input type="date" class="form-control" id="dtEmission" name="dtEmission" required>
							</div>
						 		
				 			<div class="col-md-offset-4">
					 
							</div>	
					  	</div>
					  	<div class="row">
							<div class="col-md-4">
								<label for="dtDueDate">dtDueDate</label>
							</div>		
							<div class="col-md-4">
								<input type="date" class="form-control" id="dtDueDate" name="dtDueDate" required>
							</div>
						 		
				 			<div class="col-md-offset-4">
					 
							</div>	
					  	</div>
					  	<div class="row">
							<div class="col-md-4">
								<label for="dtMaturityDate">dtMaturityDate</label>
							</div>		
							<div class="col-md-4">
								<input type="date" class="form-control" id="dtMaturityDate" name="dtMaturityDate" required>
							</div>
						 		
				 			<div class="col-md-offset-4">
					 
							</div>	
					  	</div>
					  	<div class="row">
							<div class="col-md-4">
								<label for="acPremiumPeriod">acPremiumPeriod</label>
							</div>		
							<div class="col-md-4">
								<input type="text" class="form-control" id="acPremiumPeriod" name="acPremiumPeriod" required>
							</div>
						 		
				 			<div class="col-md-offset-4">
					 
							</div>	
					  	</div>
					  	<div class="row">
							<div class="col-md-4">
								<label for="acBranch">acBranch</label>
							</div>		
							<div class="col-md-4">
								<input type="text" class="form-control" id="acBranch" name="acBranch" required>
							</div>
						 		
				 			<div class="col-md-offset-4">
					 
							</div>	
					  	</div>
					  	<div class="row">
							<div class="col-md-4">
								<label for="acProduct">acProduct</label>
							</div>		
							<div class="col-md-4">
								<input type="text" class="form-control" id="acProduct" name="acProduct" required>
							</div>
						 		
				 			<div class="col-md-offset-4">
					 
							</div>	
					  	</div>
					  	<div class="row">
							<div class="col-md-4">
								<label for="amReceiptTotal">amReceiptTotal</label>
							</div>		
							<div class="col-md-4">
								<input type="number" class="form-control" id="amReceiptTotal" name="amReceiptTotal" required>
							</div>
						 		
				 			<div class="col-md-offset-4">
					 
							</div>	
					  	</div>
					  	<div class="row">
							<div class="col-md-4">
								<label for="acCurrency">acCurrency</label>
							</div>		
							<div class="col-md-4">
								<input type="text" class="form-control" id="acCurrency" name="acCurrency" required>
							</div>
						 		
				 			<div class="col-md-offset-4">
					 
							</div>	
					  	</div>
					  	<div class="row">
							<div class="col-md-4">
								<label for="acIds">acIds</label>
							</div>		
							<div class="col-md-4">
								<input type="text" class="form-control" id="acIds" name="acIds" required>
							</div>
						 		
				 			<div class="col-md-offset-4">
					 
							</div>	
					  	</div>
					    
					 
				 			<br>
							<div class="row col-md-1">
								<button type="submit" class="btn btn-info">Add</button>
							</div>
					</form>	
					<form action="${voltar}">
						<div class="col-md-1">
 								<button type="submit" class="btn btn-default">Return</button>
 							</div>		
 						</form>
				 
				</div>
			</div>
		</div>
	
	<div id="list">
	  <div class="row">
		<c:if test="${!empty receiptList}">
			<table class="table table-striped">
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
					<td>${receipt.receiptSequence}</td>
					<td>${receipt.originalReceiptNumberCode}</td>
					<td>${receipt.lastUpdateTimestamp}</td>
					<td><a href="<c:url value='/edit/${receipt.receiptSequence}' />" >Edit</a></td>
					<td><a href="<c:url value='/remove/${receipt.receiptSequence}' />" >Delete</a></td>
				</tr>
				</c:forEach>
			</tbody>
			</table>
		</c:if>			
	  </div>
	  <footer>
	<!-- 	<p>&copy;</p>  -->
	  </footer>
	</div>
</div>

  

 
<spring:url value="/resources/core/css/hello.js" var="coreJs" />
<spring:url value="/resources/core/css/bootstrap.min.js" var="bootstrapJs" />
 
<script src="${coreJs}"></script>
<script src="${bootstrapJs}"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
 
</body>
</html>