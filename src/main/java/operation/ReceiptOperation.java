package operation;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import model.Receipt;
import service.ReceiptService;

@Component
public class ReceiptOperation {

	@Autowired
	private ReceiptService receiptService;
	
	public void insertReceipt(Receipt receipt) {
		receiptService.saveReceipt(receipt);
		
	}
	
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
}
