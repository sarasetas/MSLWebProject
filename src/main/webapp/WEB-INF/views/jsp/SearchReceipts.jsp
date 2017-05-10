<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Page</title>
 
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
<div class="jumbotron">
  <div class="container">
	<h1>${title}</h1>
<c:url var="addAction" value="/receipt/add" ></c:url>

<h3>Add Receipts</h3>
  <form action="${addAction}" commandName="receipt">
   <!--   <div class="form-group">
      <label for="receiptSequence">ReceiptSequence:</label>
      <input type="receiptSequence" class="form-control" id="receiptSequence"  name="receiptSequence">
    </div> -->
    <div class="form-group">
      <label for="originalReceiptNumberCode">OriginalReceiptNumber:</label>
			<input type="originalReceiptNumberCode" class="form-control" id="originalReceiptNumberCode" placeholder="Enter originalReceiptNumber" name="originalReceiptNumberCode">      
    </div>
   
    	<button type="submit" class="btn btn-default">Add Receipt</button>
   
  </form>
<br>
<br>	</div>
</div>
 <!--  <a class="btn btn-primary btn-lg" href="<c:url value='/receipt/add' />" role="button">Adicionar</a> -->
  
<div class="container">

  <div class="row">
	<c:if test="${!empty receiptList}">
		<table class="tg">
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
 
<spring:url value="/resources/core/css/hello.js" var="coreJs" />
<spring:url value="/resources/core/css/bootstrap.min.js" var="bootstrapJs" />
 
<script src="${coreJs}"></script>
<script src="${bootstrapJs}"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
 
</body>
</html>