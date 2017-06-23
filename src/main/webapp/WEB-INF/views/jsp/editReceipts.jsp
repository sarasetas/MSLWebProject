<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>MSL	</title>
 
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
<c:url var="addAction" value="/edit/save/" ></c:url>
<br><br>
	<div>
		<div class="row">
			<div class="col-md-4">
				<h3>Edit Receipts</h3>
			</div>	
		</div>
		<form action="${addAction}" commandName="receipt">
			<div class="form-group">
				<div class="row">
					<div class="col-md-4">
						<label for="receiptSequence">ReceiptSequence</label>
					</div>
					<div class="col-md-4">
						<label for="originalReceiptNumberCode">OriginalReceiptNumberCode</label>
					</div>			
				</div>
				<div class="row">
					<div class="col-sm-6 col-md-4">
						<input type="receiptSequence" class="form-control" id="receiptSequence" value="${receipt.receiptSequence}" name="receiptSequence">
					</div>
					<div class="col-sm-6 col-md-4">
						<input type="originalReceiptNumberCode" class="form-control" id="originalReceiptNumberCode" value="${receipt.originalReceiptNumberCode}" name="originalReceiptNumberCode" required>
					</div>			
				</div>
				<br>
				<div class="row">
					<div class="col-md-1">
						<button type="submit" class="btn btn-info">Update</button>
					</div>
						<form action="${voltar}">
							<div class="col-sm-2 col-md-1">
  								<button type="submit" class="btn btn-default">Return</button>
   							</div>		
   						</form>
				</div>
			</div>
		</form>	
	</div>
</div>
 
<spring:url value="/resources/core/css/hello.js" var="coreJs" />
<spring:url value="/resources/core/css/bootstrap.min.js" var="bootstrapJs" />
 
<script src="${coreJs}"></script>
<script src="${bootstrapJs}"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
 
</body>
</html>