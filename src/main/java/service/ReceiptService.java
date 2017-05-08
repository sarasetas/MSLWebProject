package service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import bo.GenericBo;
import model.Receipt;

@Component
public class ReceiptService {

	@Autowired
	@Qualifier("receiptBo")
	GenericBo<Receipt, Integer> receiptBo;
	
	public void setReceiptBo(GenericBo<Receipt, Integer> receiptBo) {
		this.receiptBo = receiptBo;
	}
	
	/** **/
			
	public void saveReceipt(Receipt receipt)
	{
		receiptBo.save(receipt);
	}
	
	public void removeReceipt(Receipt receipt)
	{
		receiptBo.delete(receipt);
	}
	
	public void updateReceipt(Receipt receipt)
	{
		receiptBo.update(receipt);
	}
	
	public List<Receipt> findReceiptByCrit(DetachedCriteria crit)
	{
		List<Receipt> receiptList = receiptBo.findByCriteria(crit);
		
		/** Can only return 1 receipt from the search**/
		if (receiptList.isEmpty()) 
			return null;
		else
			return receiptList;		
	}
	
	 /* Flush and Clear session for batch process
	 */
	public void flushClearSession() {
		receiptBo.getCurrentSession().flush();
		receiptBo.getCurrentSession().clear();
	}

	
}
