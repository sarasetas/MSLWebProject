	package controller;
 
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Receipt;
import operation.ReceiptOperation;
 
@Controller
public class ReceiptController {
 
	ApplicationContext appContext = new ClassPathXmlApplicationContext("META-INF/spring/config/bean-location.xml");
	//MainApp mainApp = appContext.getBean(MainApp.class);
	ReceiptOperation receiptOperation = (ReceiptOperation) appContext.getBean("receiptOperation");		    

   
   @RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

		model.addAttribute("message", "CENAS!");
		return "hello";

	}

   
   @RequestMapping(value = "/searchReceipts", method = RequestMethod.GET)
	public String listReceipts(@ModelAttribute("receipt") Receipt receipt, Model model) {
	   	
	    // if there is not any search then show all receipts
	    List <Receipt> listReceipts = receipt.getOriginalReceiptNumberCode() == null ? receiptOperation.listReceipts() 
	    		: receiptOperation.findReceiptsByOriginalReceiptNumber(receipt.getOriginalReceiptNumberCode());
	    
	   	model.addAttribute("receipt", new Receipt());
		model.addAttribute("receiptList", listReceipts);
		return "SearchReceipts";
	}
   
	@RequestMapping(value = "/receipt/add", method = RequestMethod.GET)
	public String addReceipt(@ModelAttribute("receipt") Receipt receipt, Model model){
		if (receipt != null && receipt.getReceiptSequence() == 0 && receipt.getOriginalReceiptNumberCode() != null) {
			receipt.setReceiptSequence(receiptOperation.getSetNextSequence());
			receiptOperation.insertReceipt(receipt);
		}
	 	model.addAttribute("receipt", new Receipt());
		model.addAttribute("receiptList", receiptOperation.listReceipts());
	return "addReceipts";
	}	
	
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String editReceipt(@PathVariable("id") int receiptSequence, Model model){
		
		Receipt receipt = receiptOperation.findReceiptById(receiptSequence);	
		model.addAttribute("receipt", receipt);
        
        return "editReceipts";
    }
	
	@RequestMapping(value = "/edit/save/", method = RequestMethod.GET)
    public String editSaveReceipt(@ModelAttribute("receipt") Receipt receipt){
		
		receiptOperation.updateReceipt(receipt);	
        
        return "redirect:/searchReceipts";
    }

	@RequestMapping("/remove/{id}" )
	public String removeReceipt(@PathVariable("id") int receiptSequence, Model model){		
		Receipt receipt = receiptOperation.findReceiptById(receiptSequence);
		receiptOperation.removeReceipt(receipt);	
    
        return "redirect:/searchReceipts";
    }	
	
}	