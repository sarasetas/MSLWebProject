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
 
<spring:url value="/resources/core/js/jquery-3.2.1.js"
	var="jqueryJs" />
<script src="${jqueryJs}"></script>

</head>
 
<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container">
	<div class="navbar-header">
		<a class="navbar-brand" href="#">MSL Web Project</a>
	</div>
  </div>
</nav>

<div class="container">

<!-- <c:url var="search" value="searchReceipts" ></c:url> -->
<c:url var="addReceipts" value="/receipt/add" ></c:url>
<br><br>
	<div>
		<div class="row">
			<div class="col-md-4">
				<h3>Search Receipts</h3>
			</div>	
		</div>
		<form>
			<div class="form-group">
				<div class="row">
					<div class="col-md-4">
						<label for="originalReceiptNumberCode">OriginalReceiptNumber</label>
					</div>			
				</div>
				<div class="row">
					<div class="col-sm-6 col-md-4">
						<input type="originalReceiptNumberCode" class="form-control" id="originalReceiptNumberCode" value = "" placeholder="Enter originalReceiptNumber" name="originalReceiptNumberCode">
					</div>			
				</div>
				<br>
				<div class="row">
					<div class="col-md-1">
						<button type="button" id="buttonSearch"  class="btn btn-default">Search</button>					
					</div>
						<form action="${addReceipts}">
	<!-- 						<div class="col-sm-2 col-md-4">
  								<button type="submit" class="btn btn-primary">Add Receipt</button>
   							</div>	  	
   						</form> -->
				</div>
			</div>
		</form>
	</div>
	
	
	<div>
		<jsp:include page="resultsTable.jsp" />
 	</div>
  <footer>
	
  </footer>

<spring:url value="/resources/core/js/receipt.js"
	var="receiptJs" />

<script src="${receiptJs}"></script>
 
</body>
</html>