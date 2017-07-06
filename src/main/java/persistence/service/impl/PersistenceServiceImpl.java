package persistence.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import bo.GenericBo;
import model.PolicyHolder;
import model.Receipt;
import persistence.service.PersistenceService;

public class PersistenceServiceImpl implements PersistenceService {

	@Autowired
	@Qualifier("receiptBo")
	private GenericBo<Receipt, Integer> receiptBo;
	
	@Autowired
	@Qualifier("policyHolderBo")
	private GenericBo<PolicyHolder, Integer> policyHolderBo;
	
	
	
	public PersistenceServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	/** Implements the getReceiptBo() method in the interface **/
	@Override
	public GenericBo<Receipt, Integer> getReceiptBo(){
		return receiptBo;
	}
	/** Implements the getPolicyHolderBo() method in the interface **/
	@Override
	public GenericBo<PolicyHolder, Integer> getPolicyHolderBo(){
		return policyHolderBo;
	}

	@Override
	public GenericBo<Object, Integer> getXlsErrorListBo() {
		// TODO Auto-generated method stub
		return null;
	}

}
