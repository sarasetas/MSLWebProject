package persistence.service;

import org.springframework.stereotype.Component;

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
import model.Operation;
import model.PolicyHolder;
import model.Receipt;
import model.ReceiptCollection;
import model.ReceiptStatus;
import model.ReceiptStatusId;
import model.ReferenceData;
import model.ReferenceDataId;
import model.TransactionDetail;

/**
 * This interface describes the methods that expose all business objects.
 * The implementer class is SCPersistenceServiceImpl in the following package
 *  
 * When a new BO is created a new method should be added here and implemented in the impl class.
 *
 */
@Component
public interface PersistenceService {
	
	
	/** Exposes Operation entity business object **/
	GenericBo<Operation, Integer> getOperationBo();
	
	/** Exposes Receipt entity business object **/
	GenericBo<Receipt, Integer> getReceiptBo();
	
	/** Exposes PolicyHolder entity business object **/
	GenericBo<PolicyHolder, Integer> getPolicyHolderBo();
	
	/** Exposes ReceiptStatus entity business object **/
	GenericBo<ReceiptStatus, ReceiptStatusId> getReceiptStatusBo();
	
	/** Exposes ReceiptCollection entity business object **/
	GenericBo<ReceiptCollection, Integer> getReceiptCollectionBo();
	
	/** Exposes Cover entity business object **/
	GenericBo<Cover, Integer> getCoverBo();
	
	/** Exposes Commission entity business object **/
	GenericBo<Commission, CommissionId> getCommissionBo();
	
	/** Exposes Cheque entity business object **/
	GenericBo<Cheque, ChequeId> getChequeBo();
	
	/** Exposes Balance entity business object **/
	GenericBo<Balance, BalanceId> getBalanceBo();
	
	/** Exposes TransactionDetail entity business object **/
	GenericBo<TransactionDetail, Integer> getTransactionDetailBo();
	
	/** Exposes AccountSettings entity business object **/
	GenericBo<AccountSettings, AccountSettingsId> getAccountSettingsBo();
	
	/** Exposes ReferenceData entity business object **/
	GenericBo<ReferenceData, ReferenceDataId> getReferenceDataBo();
	
	
	
	
	
	

}
