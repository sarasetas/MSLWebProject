<%@ tag description="Main Page" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Page</title>
 
<spring:url value="/resources/core/css/hello.css" var="coreCss" />
<spring:url value="/resources/core/css/bootstrap.min.css" var="bootstrapCss" />
<link href="${bootstrapCss}" rel="stylesheet" />
<link href="${coreCss}" rel="stylesheet" />
</head>
 <body>
	<nav class="navbar navbar-default navbar-inverse">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="./home">Brand</a>
    </div>
 
    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li ><a href="./Receipts">Receipts <span class="sr-only">(current)</span></a></li>
        <li><a href="#">Seguradoras</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Apolices <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Em Curso</a></li>
            <li><a href="#">Em Falta de Pagamento</a></li>
            <li><a href="#">A Expirar</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Criar Nova Apolice</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Terminadas</a></li>
          </ul>
        </li>
      </ul>
      <form class="navbar-form navbar-left" role="search">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Search Apolices">
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
      </form>
    </div>
    <!-- /.navbar-collapse -->
  </div>
  <!-- /.container-fluid -->
</nav>
	 
	 
	<jsp:doBody/>
	 
	<spring:url value="/resources/core/css/hello.js" var="coreJs" />
	<spring:url value="/resources/core/css/bootstrap.min.js" var="bootstrapJs" />
	 
	<script src="${coreJs}"></script>
	<script src="${bootstrapJs}"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
 
</body>
</html>