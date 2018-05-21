package service;

import bo.impl.GenericBoImpl;
import model.Receipt;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class ReceiptService  {

    @Qualifier("receiptBo")
    @Autowired
    private GenericBoImpl<Receipt, Integer> receiptBo;

    public GenericBoImpl<Receipt, Integer> getReceiptBo() {
        return receiptBo;
    }

    public Receipt getReceiptById(int receiptId){

        return  receiptBo.findById(receiptId);
    }

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
                .addOrder(Order.desc("sqReceipt"));

        List<Receipt> listReceipts = receiptBo.findByCriteria(crit);

        return listReceipts.get(0).getReceiptId() + 1;
    }

    /* Flush and Clear session for batch process
     */
    public void flushClearSession() {
        receiptBo.getCurrentSession().flush();
        receiptBo.getCurrentSession().clear();
    }
}
