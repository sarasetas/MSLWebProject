<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>MSL</title>
 
<spring:url value="/resources/core/css/hello.css" var="coreCss" />
<spring:url value="/resources/core/css/bootstap.min.css" var="bootstrapCss" />
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

<!-- <c:url var="search" value="clientsList" ></c:url> -->
<c:url var="addReceipts" value="/receipt/add" ></c:url>
<br><br>
	<div>
		<div class="row">
			<div class="col-md-4">
				<h3>Search Receipts</h3>
			</div>	
		</div>
		<form action="${search}" commandName="receipt">
			<div class="form-group">
				<div class="row">
					<div class="col-md-4">
						<label for="N">Nome:</label>
					</div>			
					<div class="col-md-4">
						<label for="N">NIFCode:</label>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-6 col-md-4">
						<input type="partnerName" class="form-control" id="partnerName" placeholder="Enter originalReceiptNumber" name="partnerName">
					</div>
					<div class="col-sm-6 col-md-4">
						<input type="NIFCode" class="form-control" id="NIFCode" placeholder="Enter originalReceiptNumber" name="NIFCode">
					</div>					
				</div>
				<br>
				<div class="row">
					<div class="col-md-1">
						<button type="submit" onsubmit="showHide()" class="btn btn-default">Search</button>					
					</div>
						<form action="${addReceipts}">
							<div class="col-sm-2 col-md-4">
  								<button type="submit" class="btn btn-primary">Add Receipt</button>
   							</div>		
   						</form>
				</div>
			</div>
		</form>
	</div>
	
	
	<div id = "form" >
		<div class="row">
		  <c:choose> 
		  		<c:when test="${empty policyHolderList}">Não foram encontrados registos</c:when>
		  		<c:otherwise>
		  			<table class="table table-striped">
				<thead>
				<tr>
					<th width="80">ID</th>
					<th width="120">NIF</th>
					<th width="120">Nome</th>
					<th width="60">Edit</th>
					<th width="60">Delete</th>
				</tr>
				</thead>
				<tbody>
				<c:forEach items="${policyHolderList}" var="policyHolder">
					<tr>
						<td>${policyHolder.policyHolderSequence}</td>
						<td>${policyHolder.NIFCode}</td>
						<td>${policyHolder.partnerName}</td>
						<td><a href="<c:url value='/edit/${receipt.receiptSequence}' />" >Edit</a></td>
						<td><a href="<c:url value='/remove/${receipt.receiptSequence}' />" >Delete</a></td>
					</tr>
					</c:forEach>
				</tbody>
				</table>
		  		</c:otherwise>
		  	</c:choose>		
		</div>
	</div>
 </div>
  <footer>

  </footer>
<spring:url value="/resources/core/css/hello.js" var="coreJs" />
<spring:url value="/resources/core/css/bootstrap.min.js" var="bootstrapJs" />

<!--  <script src="${coreJs}"></script> -->
<script src="${bootstrapJs}"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
 
<script>window.onload = function(){
	document.getElementById('form').style.display="none";
	}
</script>
 <script>
function showHide() {
    var x = document.getElementById('form');
    
        x.style.display = 'block';
    
}
</script>
 
</body>
</html>