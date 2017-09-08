	package controller;
 
import java.sql.Date;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Receipt;
import operation.ReceiptOperation;
 
@Controller
public class ReceiptController {
	
	
	ApplicationContext appContext = new ClassPathXmlApplicationContext("META-INF/spring/config/bean-location.xml");
	ReceiptOperation receiptOperation = (ReceiptOperation) appContext.getBean("receiptOperation");		    

	@RequestMapping(value = "/searchReceipts", method = RequestMethod.GET)
	public String searchReceipts(@ModelAttribute("receipt") Receipt receipt, Model model) {
	   	
	    // 
	  /*  List <Receipt> listReceipts = receipt.getOriginalReceiptNumberCode() == null ? receiptOperation.listReceipts() 
	    		: receiptOperation.findReceiptsByOriginalReceiptNumber(receipt.getOriginalReceiptNumberCode());*/
	    List <Receipt> listReceipts = receipt.getAcOriginalReceiptNumber() == null || receipt.getAcOriginalReceiptNumber() == ""  ? receiptOperation.listReceipts() 
	    		: receiptOperation.findReceiptsBySomething(receipt.getAcOriginalReceiptNumber());
	    
	  	model.addAttribute("receipt", new Receipt());
		model.addAttribute("receiptList", listReceipts);
		return "SearchReceipts";	
	}
	
	
   
   @RequestMapping(value = "/AjaxTest")
   public String home (){
	   return "SearchReceiptsAjax";
   }
   
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public @ResponseBody List<Receipt> cenas(HttpServletRequest request, HttpServletResponse response) 
   		throws Exception {
	   	
	   String originalReceiptNumber = request.getParameter("originalReceiptNumberCode");
	   /* List <Receipt> receiptsList = originalReceiptNumber == null || originalReceiptNumber == ""  ? receiptOperation.listReceipts() 
	    		: receiptOperation.findReceiptsByOriginalReceiptNumber(originalReceiptNumber.trim());*/
	    List <Receipt> receiptsList = originalReceiptNumber == null || originalReceiptNumber == ""  ? receiptOperation.listReceipts() 
	    		: receiptOperation.findReceiptsBySomething(originalReceiptNumber.trim());
	    
	    
		return receiptsList;
	}
   
	@RequestMapping(value = "/receipt/add", method = RequestMethod.GET)
	public String addReceiptGET(@ModelAttribute("receipt") Receipt receipt, Model model){		 
	 	
		model.addAttribute("receipt", new Receipt());
		
		return "addReceipts";
	}
	
	@RequestMapping(value = "/receipt/add", method = RequestMethod.POST)
	public String addReceiptPOST(@ModelAttribute("receipt") Receipt receipt, Model model){
		if (receipt != null &&  receipt.getAcOriginalReceiptNumber() != null) {
			receipt.setSqReceipt(receiptOperation.getSetNextSequence());
			/** TODO : Remover/subtituir mais tarde por causa do user **/
			java.util.Date date =  new java.util.Date() ;
			receipt.setTsCreation(date);
			receipt.setTsLastUpdate(date);
			receipt.setAcCreationUser("GohanMF");
			receipt.setAcLastUpdateUser("GohanMF");
			
			receiptOperation.insertReceipt(receipt);
		}
	 	model.addAttribute("receipt", new Receipt()); 
		
		return "addReceipts";
	}
	
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String editReceipt(@PathVariable("id") int sqReceipt, Model model){
	
		Receipt receipt = receiptOperation.findReceiptById(sqReceipt);	
		model.addAttribute("receipt", receipt);
        
        return "editReceipts";
    }
	
	@RequestMapping(value = "/edit/save/", method = RequestMethod.GET)
    public String editSaveReceipt(@ModelAttribute("receipt") Receipt receipt){
		
		receiptOperation.updateReceipt(receipt);	
        
        return "redirect:/searchReceipts";
    }

	@RequestMapping("/remove/{id}" )
	public String removeReceipt(@PathVariable("id") int sqReceipt, Model model){		
		Receipt receipt = receiptOperation.findReceiptById(sqReceipt);
		receiptOperation.removeReceipt(receipt);	
    
        return "redirect:/searchReceipts";
    }	
	
}	