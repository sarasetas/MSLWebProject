	package controller;
 
import java.sql.Date;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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

	
	@RequestMapping(value = "/Receipts", method = RequestMethod.GET)
	public String receipts(@ModelAttribute("receipt") Receipt receipt, Model model) {
	   	
	    // 
	  /*  List <Receipt> listReceipts = receipt.getOriginalReceiptNumberCode() == null ? receiptOperation.listReceipts() 
	    		: receiptOperation.findReceiptsByOriginalReceiptNumber(receipt.getOriginalReceiptNumberCode());*/
	    List <Receipt> listReceipts =  receiptOperation.listReceipts();
	    
		model.addAttribute("receiptList", listReceipts);
		return "receipts/receipts";	
	}
	
	
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
   
	@RequestMapping(value = "/Receipt/Add", method = RequestMethod.GET)
	public String addReceiptGET(@ModelAttribute("receipt") Receipt receipt, Model model){		 
	 	
		model.addAttribute("receipt", new Receipt());
		
		return "receipts/addReceipts";
	}
	
	@RequestMapping(value = "/Receipt/Add", method = RequestMethod.POST)
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
		
		return "redirect:/Receipts";
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
	
	
	/* AJAX SERVICES*/
	
	@RequestMapping(value = "Receipts/Edit/{id}", method = RequestMethod.GET)
    public String editReceiptAjax(@PathVariable("id") int sqReceipt, Model model){
	
		Receipt receipt = receiptOperation.findReceiptById(sqReceipt);	
		model.addAttribute("receipt", receipt);
        
        return "receipts/editReceipts";
    }
	
	@RequestMapping(value = "Receipts/Edit/save/", method = RequestMethod.POST)
    public String editSaveReceiptAjax(@Valid @ModelAttribute("receipt") Receipt receipt, BindingResult bindingResult){
		/*Tentar gravar*/
		/*Verificar se foi bem gravado*/
		/*se foi bem gravado entao enviar o receipt e o codigo ok*/
		/*se nao foi bem gravado � necessario ver como se processa a msg para apontar os campos que estao incorrectos*/
		
		/*retirar mais tarde e colocar hidden ou talvez no update nao fazer com que ele actualize os campos tscreation e creationuser */
		if(bindingResult.hasErrors()){
			return "receipts/editReceipts";
		}
		
		java.util.Date date =  new java.util.Date() ;
		receipt.setTsCreation(date);
		receipt.setTsLastUpdate(date);
		receipt.setAcCreationUser("GohanMF");
		receipt.setAcLastUpdateUser("GohanMF");
		receiptOperation.updateReceipt(receipt);	
		
        return "receipts/editReceipts";
    }
	
	
	
}	