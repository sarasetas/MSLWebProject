package persistence.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import bo.GenericBo;
import model.AccountSettings;
import model.AccountSettingsId;
import model.Balance;
import model.BalanceId;
import model.Cheque;
import model.ChequeId;
import model.Commission;
import model.CommissionId;
import model.Cover;
import model.Observation;
import model.Operation;
import model.PolicyHolder;
import model.Receipt;
import model.ReceiptCollection;
import model.ReceiptStatus;
import model.ReceiptStatusId;
import model.ReferenceData;
import model.ReferenceDataId;
import model.TransactionDetail;
import persistence.service.PersistenceService;

public class PersistenceServiceImpl implements PersistenceService {

	@Autowired
	@Qualifier("operationBo")
	private GenericBo<Operation, Integer> operationBo;
	
	@Autowired
	@Qualifier("receiptBo")
	private GenericBo<Receipt, Integer> receiptBo;
	
	@Autowired
	@Qualifier("policyHolderBo")
	private GenericBo<PolicyHolder, Integer> policyHolderBo;
	
	@Autowired
	@Qualifier("receiptStatusBo")
	private GenericBo<ReceiptStatus, ReceiptStatusId> receiptStatusBo;

	@Autowired
	@Qualifier("receiptCollectionBo")
	private GenericBo<ReceiptCollection, Integer> receiptCollectionBo;
	
	@Autowired
	@Qualifier("coverBo")
	private GenericBo<Cover, Integer> coverBo;

	@Autowired
	@Qualifier("commissionBo")
	private GenericBo<Commission, CommissionId> commissionBo;

	@Autowired
	@Qualifier("chequeBo")
	private GenericBo<Cheque, ChequeId> chequeBo;

	@Autowired
	@Qualifier("balanceBo")
	private GenericBo<Balance, BalanceId> balanceBo;
	
	@Autowired
	@Qualifier("accountSettingsBo")
	private GenericBo<AccountSettings, AccountSettingsId> accountSettingsBo;
	
	@Autowired
	@Qualifier("referenceDataBo")
	private GenericBo<ReferenceData, ReferenceDataId> referenceDataBo;
	
	@Autowired
	@Qualifier("observationBo")
	private GenericBo<Observation, Integer> observationBo;
	
	@Autowired
	@Qualifier("transactionDetailBo")
	private GenericBo<TransactionDetail, Integer> transactionDetailBo;
	
	
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
	public GenericBo<ReceiptStatus, ReceiptStatusId> getReceiptStatusBo() {
		// TODO Auto-generated method stub
		return receiptStatusBo;
	}

	@Override
	public GenericBo<ReceiptCollection, Integer> getReceiptCollectionBo() {
		// TODO Auto-generated method stub
		return receiptCollectionBo;
	}

	@Override
	public GenericBo<Cover, Integer> getCoverBo() {
		// TODO Auto-generated method stub
		return coverBo;
	}

	@Override
	public GenericBo<Commission, CommissionId> getCommissionBo() {
		// TODO Auto-generated method stub
		return commissionBo;
	}

	@Override
	public GenericBo<Cheque, ChequeId> getChequeBo() {
		// TODO Auto-generated method stub
		return chequeBo;
	}

	@Override
	public GenericBo<Balance, BalanceId> getBalanceBo() {
		// TODO Auto-generated method stub
		return balanceBo;
	}


	@Override
	public GenericBo<AccountSettings, AccountSettingsId> getAccountSettingsBo() {
		// TODO Auto-generated method stub
		return accountSettingsBo;
	}

	@Override
	public GenericBo<ReferenceData, ReferenceDataId> getReferenceDataBo() {
		// TODO Auto-generated method stub
		return referenceDataBo;
	}

	@Override
	public GenericBo<TransactionDetail, Integer> getTransactionDetailBo() {
		// TODO Auto-generated method stub
		return transactionDetailBo;
	}

	@Override
	public GenericBo<Operation, Integer> getOperationBo() {
		// TODO Auto-generated method stub
		return operationBo;
	}

	
}
