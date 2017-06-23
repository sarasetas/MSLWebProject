package service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
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
		receiptBo.remove(receipt);
	}
	
	public void updateReceipt(Receipt receipt)
	{
		receiptBo.update(receipt);
	}
	
	public List<Receipt> findReceiptByCrit(DetachedCriteria crit)
	{
		List<Receipt> receiptList = receiptBo.findByCriteria(crit);
		
		if (receiptList.isEmpty()) 
			return null;
		else
			return receiptList;		
	}
	
	public Receipt findReceiptById (int receiptSequence){
		Receipt receipt = new Receipt();
		receipt = receiptBo.findById(receiptSequence);
		return receipt;

	}
	
	public int getSetNextSequence(){
		
		DetachedCriteria crit = (DetachedCriteria) DetachedCriteria.forClass(Receipt.class)
				.addOrder(Order.desc("receiptSequence"));
		
		List<Receipt> listReceipts = receiptBo.findByCriteria(crit);
		
		return listReceipts.get(0).getReceiptSequence() + 1;
	}
	
	 /* Flush and Clear session for batch process
	 */
	public void flushClearSession() {
		receiptBo.getCurrentSession().flush();
		receiptBo.getCurrentSession().clear();
	}

}
