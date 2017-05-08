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
	<p>
		<c:if test="${not empty receiptExample}">
			Receipt: ${receiptExample}
		</c:if>
    </p>
<c:url var="addAction" value="/receipt/add" ></c:url>

<form:form action="${addAction}" commandName="receipt">
<table>
	<c:if test="${!empty receipt.originalReceiptNumberCode}">
	
	</c:if>
	<tr>
		<td>
			<form:label path="id">
				<spring:message text="ID"/>
			</form:label>
		</td>
		<td>
			<form:input path="id" readonly="true" size="8"  disabled="true" />
			<form:hidden path="id" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="name">
				<spring:message text="Name"/>
			</form:label>
		</td>
		<td>
			<form:input path="name" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="country">
				<spring:message text="Country"/>
			</form:label>
		</td>
		<td>
			<form:input path="country" />
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<c:if test="${!empty receipt.originalReceiptNumberCode}">
				<input type="submit"
					value="<spring:message text="Edit Receipt"/>" />
			</c:if>
			<c:if test="${empty receipt.originalReceiptNumberCode}">
				<input type="submit"
					value="<spring:message text="Add Receipt"/>" />
			</c:if>
		</td>
	</tr>
</table>	
</form:form>
<br>
<br>	</div>
</div>
 <!-- <a class="btn btn-primary btn-lg" href="<c:url value='/receipt/add' />" role="button">Adicionar</a> -->
<div class="container">

  <div class="row">
	<c:if test="${!empty receiptList}">
		<table class="tg">
		<tr>
			<th width="80">ReceiptSequence</th>
			<th width="120">OriginalReceiptNumber</th>
			<th width="120">LastUpdate</th>
			<th width="60">Edit</th>
			<th width="60">Delete</th>
		</tr>
		<c:forEach items="${receiptList}" var="receipt">
			<tr>
				<td>${receipt.receiptSequence}</td>
				<td>${receipt.originalReceiptNumberCode}</td>
				<td>${receipt.lastUpdateTimestamp}</td>
				<td><a href="<c:url value='/edit/${receipt.receiptSequence}' />" >Edit</a></td>
				<td><a href="<c:url value='/remove/${receipt.receiptSequence}' />" >Delete</a></td>
			</tr>
			</c:forEach>
		</table>
	</c:if>
		
  </div>
  <footer>
	<p>&copy;</p>
  </footer>
</div>
 
<spring:url value="/resources/core/css/hello.js" var="coreJs" />
<spring:url value="/resources/core/css/bootstrap.min.js" var="bootstrapJs" />
 
<script src="${coreJs}"></script>
<script src="${bootstrapJs}"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
 
</body>
</html>