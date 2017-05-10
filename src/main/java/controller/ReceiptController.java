	package controller;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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


	@RequestMapping(value = "/hello/{name:.+}", method = RequestMethod.GET)
	public ModelAndView hello(@PathVariable("name") String name) {

		ModelAndView model = new ModelAndView();
		model.setViewName("hello");
		model.addObject("msg", name);

		return model;

	}
   
   @RequestMapping(value = "/searchReceipts", method = RequestMethod.GET)
	public String listReceipts(Model model) {
		model.addAttribute("receipt", new Receipt());
		model.addAttribute("receiptList", receiptOperation.listReceipts());
		return "SearchReceipts";
	}
   
	@RequestMapping(value = "/receipt/add", method = RequestMethod.GET)
	public String addReceipt(@ModelAttribute("receipt") Receipt receipt){
		if (receipt.getReceiptSequence() == 0 ) {
			receipt.setReceiptSequence(receiptOperation.getSetNextSequence());
			receiptOperation.insertReceipt(receipt);
		}else{
			receiptOperation.updateReceipt(receipt);
		}
		
	return "redirect:/searchReceipts";
	}	
	
	@RequestMapping("/edit/{id}")
    public String editReceipt(@PathVariable("id") int receiptSequence, Model model){
		
		receiptOperation.updateReceipt(receiptOperation.findReceiptById(receiptSequence));	
        
        return "redirect:/searchReceipts";
    }	
	
	@RequestMapping("/remove/{id}" )
    public String removeReceipt(@PathVariable("id") int receiptSequence, Model model){
		
		Receipt receipt = receiptOperation.findReceiptById(receiptSequence);
		receiptOperation.removeReceipt(receipt);	
        
        return "redirect:/searchReceipts";
    }	
	
	
	  @RequestMapping(value = "/addStudent", method = RequestMethod.GET)
      public String addStudent(@ModelAttribute("receipt")Receipt receipt, 
   
   ModelMap model) {
      model.addAttribute("id", receipt.getReceiptSequence());
      model.addAttribute("name", receipt.getOriginalReceiptNumberCode());
      
      return "test";
   }
}	