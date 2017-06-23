package operation;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import model.Receipt;
import service.ReceiptService;

@Component
public class ReceiptOperation {

	@Autowired
	private ReceiptService receiptService;
	
	public void insertReceipt(Receipt receipt) {
		if(receipt.getReceiptSequence() == 0){
			receiptService.getSetNextSequence();
		}
		receiptService.saveReceipt(receipt);
		
	}
	//@Transactional(propagation = Propagation.REQUIRES_NEW)
	@Transactional
	public void removeReceipt (Receipt receipt){
		receiptService.removeReceipt(receipt);
	}
	
	public void updateReceipt (Receipt receipt){
		receiptService.updateReceipt(receipt);
	}
	
	public List<Receipt> listReceipts (){

		DetachedCriteria crit = (DetachedCriteria) DetachedCriteria.forClass(Receipt.class)
				.addOrder(Order.asc("receiptSequence"));
				
		List<Receipt> listReceipts = receiptService.findReceiptByCrit(crit);
		
		return listReceipts;
	}
	
	public List<Receipt> findReceiptsByOriginalReceiptNumber (String originalReceiptNumber){

		DetachedCriteria crit = (DetachedCriteria) DetachedCriteria.forClass(Receipt.class)
				.add(Restrictions.eq("originalReceiptNumberCode", originalReceiptNumber));
				
		List<Receipt> listReceipts = receiptService.findReceiptByCrit(crit);
		
		return listReceipts;
	}
	
	public int getSetNextSequence(){
		return receiptService.getSetNextSequence();
	}
	
	public Receipt findReceiptById (int receiptSequence){
		
		return receiptService.findReceiptById(receiptSequence);
		
	}
	
	public void flushClearSession(){
		receiptService.flushClearSession();
	}
}
