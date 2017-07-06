	package controller;
 
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.PolicyHolder;
import operation.PolicyHolderOperation;
 
@Controller
public class PolicyHolderController {
 
	ApplicationContext appContext = new ClassPathXmlApplicationContext("META-INF/spring/config/bean-location.xml");
	//MainApp mainApp = appContext.getBean(MainApp.class);
	PolicyHolderOperation policyHolderOperation = (PolicyHolderOperation) appContext.getBean("policyHolderOperation");		    

   
   @RequestMapping(value = "/searchClients", method = RequestMethod.GET)
	public String searchPolicyHolders() {
		return "searchClients";
	}
   
   @RequestMapping(value = "/clientsList", method = RequestMethod.GET)
  	public String listPolicyHolders(@ModelAttribute("policyHolder") PolicyHolder policyHolderParameter, Model model) {
  	   	
  	    // 
  	    if (policyHolderParameter != null) {
  	    	List <PolicyHolder> policyHoldersList = policyHolderOperation.listPolicyHolders(policyHolderParameter);
  	    	model.addAttribute("policyHoldersList", policyHoldersList);
  	    }   		
  	    		
  	   	model.addAttribute("policyHolder", new PolicyHolder());
  		
  		return "clientsList";
  	}
/*	@RequestMapping(value = "/receipt/add", method = RequestMethod.GET)
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
*/
}	