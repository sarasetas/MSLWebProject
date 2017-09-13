<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

	<div class="row">
		<div class="col-md-4">
			<h3>Edit Receipts</h3>
		</div>	
	</div>
 
	<div class="form-group">
		<div class="row">
			<form id="SaveEditedReceipts" action="Receipts/Edit/save/" commandName="receipt" method="post">
				
				<div class="row">
					<div class="col-md-4">
						<label for="sqReceipt">sqReceipt</label>
					</div>		
					<div class="col-md-4">
						<input type="text" class="form-control" id="sqReceipt" name="sqReceipt" value="${receipt.sqReceipt}" required>
					</div>
				 		
		 			<div class="col-md-offset-4">
			 
					</div>	
			  	</div>
			  	<div class="row">
					<div class="col-md-4">
						<label for="acCompany">acCompany</label>
					</div>		
					<div class="col-md-4">
						<input type="number" class="form-control" id="acCompany" name="acCompany" value="${receipt.acCompany}" required>
					</div>
				 		
		 			<div class="col-md-offset-4">
			 
					</div>	
			  	</div>
			  	<div class="row">
					<div class="col-md-4">
						<label for="sqOperation">sqOperation</label>
					</div>		
					<div class="col-md-4">
						<input type="text" class="form-control" id="sqOperation" name="sqOperation" value="${receipt.sqOperation}" required>
					</div>
				 		
		 			<div class="col-md-offset-4">
			 
					</div>	
			  	</div>
			  	<div class="row">
					<div class="col-md-4">
						<label for="acOperationType">acOperationType</label>
					</div>		
					<div class="col-md-4">
						<input type="text" class="form-control" id="acOperationType" name="acOperationType" value="${receipt.acOperationType}" required>
					</div>
				 		
		 			<div class="col-md-offset-4">
			 
					</div>	
			  	</div>
			  	<div class="row">
					<div class="col-md-4">
						<label for="acOriginalReceiptNumber">OriginalReceiptNumberCode</label>
					</div>		
					<div class="col-md-4">
						<input type="text" class="form-control" id="acOriginalReceiptNumber" name="acOriginalReceiptNumber" value="${receipt.acOriginalReceiptNumber}" required>
					</div>
				 		
		 			<div class="col-md-offset-4">
			 
					</div>	
			  	</div>
			  	<div class="row">
					<div class="col-md-4">
						<label for="acReceiptType">acReceiptType</label>
					</div>		
					<div class="col-md-4">
						<input type="text" class="form-control" id="acReceiptType" name="acReceiptType" value="${receipt.acReceiptType}" required>
					</div>
				 		
		 			<div class="col-md-offset-4">
			 
					</div>	
			  	</div>
			  	<div class="row">
					<div class="col-md-4">
						<label for="acReceiptSubtype">acReceiptSubtype</label>
					</div>		
					<div class="col-md-4">
						<input type="text" class="form-control" id="acReceiptSubtype" name="acReceiptSubtype" value="${receipt.acReceiptSubtype}" required>
					</div>
			 		<spring:hasBindErrors name="Receipts/Edit/save/">
    					<c:if test="${errors.hasFieldErrors('acReceiptSubtype')}">
						    <div class="col-md-4">
						    	${errors.getFieldError('acReceiptSubtype').defaultMessage} 
						    </div>
					  	</c:if>
					  	<c:if test="${!errors.hasFieldErrors('acReceiptSubtype')}">
						   	<div class="col-md-offset-4">			 
							</div>
					  	</c:if>
					</spring:hasBindErrors>
		 				
			  	</div>
			  	<div class="row">
					<div class="col-md-4">
						<label for="sqPolicyHolder">sqPolicyHolder</label>
					</div>		
					<div class="col-md-4">
						<input type="number" class="form-control" id="sqPolicyHolder" name="sqPolicyHolder" value="${receipt.sqPolicyHolder}" required>
					</div>
				 		
		 			<div class="col-md-offset-4">
			 
					</div>	
			  	</div>
			  	<div class="row">
					<div class="col-md-4">
						<label for="acPolicyNumber">acPolicyNumber</label>
					</div>		
					<div class="col-md-4">
						<input type="text" class="form-control" id="acPolicyNumber" name="acPolicyNumber" value="${receipt.acPolicyNumber}" required>
					</div>
				 		
		 			<div class="col-md-offset-4">
			 
					</div>	
			  	</div>
			  	<div class="row">
					<div class="col-md-4">
						<label for="dtEmission">dtEmission</label>
					</div>		
					<div class="col-md-4">
						<input type="date" class="date-picker-input form-control" id="dtEmission" name="dtEmission" value="${receipt.dtEmission}" required>
					</div>
				 		
		 			<div class="col-md-offset-4">
			 
					</div>	
			  	</div>
			  	<div class="row">
					<div class="col-md-4">
						<label for="dtDueDate">dtDueDate</label>
					</div>		
					<div class="col-md-4">
						<input type="date" class="date-picker-input form-control" id="dtDueDate" name="dtDueDate" value="${receipt.dtDueDate}" required>
					</div>
				 		
		 			<div class="col-md-offset-4">
			 
					</div>	
			  	</div>
			  	<div class="row">
					<div class="col-md-4">
						<label for="dtMaturityDate">dtMaturityDate</label>
					</div>		
					<div class="col-md-4">
						<input type="date" class="date-picker-input form-control" id="dtMaturityDate" name="dtMaturityDate" value="${receipt.dtMaturityDate}" required>
					</div>
				 		
		 			<div class="col-md-offset-4">
			 
					</div>	
			  	</div>
			  	<div class="row">
					<div class="col-md-4">
						<label for="acPremiumPeriod">acPremiumPeriod</label>
					</div>		
					<div class="col-md-4">
						<input type="text" class="form-control" id="acPremiumPeriod" name="acPremiumPeriod" value="${receipt.acPremiumPeriod}" required>
					</div>
				 		
		 			<div class="col-md-offset-4">
			 
					</div>	
			  	</div>
			  	<div class="row">
					<div class="col-md-4">
						<label for="acBranch">acBranch</label>
					</div>		
					<div class="col-md-4">
						<input type="text" class="form-control" id="acBranch" name="acBranch" value="${receipt.acBranch}" required>
					</div>
				 		
		 			<div class="col-md-offset-4">
			 
					</div>	
			  	</div>
			  	<div class="row">
					<div class="col-md-4">
						<label for="acProduct">acProduct</label>
					</div>		
					<div class="col-md-4">
						<input type="text" class="form-control" id="acProduct" name="acProduct" value="${receipt.acProduct}" required>
					</div>
				 		
		 			<div class="col-md-offset-4">
			 
					</div>	
			  	</div>
			  	<div class="row">
					<div class="col-md-4">
						<label for="amReceiptTotal">amReceiptTotal</label>
					</div>		
					<div class="col-md-4">
						<input type="number" class="form-control" id="amReceiptTotal" name="amReceiptTotal" value="${receipt.amReceiptTotal}" required>
					</div>
				 		
		 			<div class="col-md-offset-4">
			 
					</div>	
			  	</div>
			  	<div class="row">
					<div class="col-md-4">
						<label for="acCurrency">acCurrency</label>
					</div>		
					<div class="col-md-4">
						<input type="text" class="form-control" id="acCurrency" name="acCurrency" value="${receipt.acCurrency}" required>
					</div>
				 		
		 			<div class="col-md-offset-4">
			 
					</div>	
			  	</div>
			  	<div class="row">
					<div class="col-md-4">
						<label for="acIds">acIds</label>
					</div>		
					<div class="col-md-4">
						<input type="text" class="form-control" id="acIds" name="acIds" value="${receipt.acIds}" required>
					</div>
				 		
		 			<spring:hasBindErrors name="receipt" >
    					<c:if test="${errors.hasFieldErrors('acIds')}">
						    <div class="col-md-4">
						    	${errors.getFieldError('acIds').defaultMessage} 
						    </div>
					  	</c:if>
					  	<c:if test="${!errors.hasFieldErrors('acIds')}">
						   	<div class="col-md-offset-4">	
						   				 
							</div> 
					  	</c:if>
					</spring:hasBindErrors>
			  	</div>
			    
	 			<br>
				<div class="row col-md-1">
					<div class="BTNSaveReceipts" class="btn btn-info">Add</div>
				</div>
			</form>	
			<form action="${voltar}">
				<div class="col-md-1">
					<button type="submit" class="btn btn-default">Return</button>
				</div>		
			</form>
		</div>
	</div>

 