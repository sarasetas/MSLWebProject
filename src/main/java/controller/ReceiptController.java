	package controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import model.Receipt;
import service.ReceiptService;
 
@Controller
public class ReceiptController {
 

   private ReceiptService receiptService;
   
   @RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "hello";

	}

   @RequestMapping(value = "/receipts", method = RequestMethod.GET)
	public String searchReceipts(ModelMap model) {

		return "SearchReceipts";

	}
	@RequestMapping(value = "/hello/{name:.+}", method = RequestMethod.GET)
	public ModelAndView hello(@PathVariable("name") String name) {

		ModelAndView model = new ModelAndView();
		model.setViewName("hello");
		model.addObject("msg", name);

		return model;

	}
   
   @RequestMapping(value = "/test", method = RequestMethod.GET)
   public String test (@RequestParam(value="name", required=false, defaultValue="World") String name, Model model){
	   model.addAttribute("name", name);
	   return "test";
   }
   
  /* @RequestMapping(value = "/receipts", method = RequestMethod.GET)
	public String listReceipts(Model model) {
		model.addAttribute("receipt", new Receipt());
//		model.addAttribute("listReceipts", this.receiptService.listReceipts());
		return "receipt";
	}
   
	@RequestMapping(value = "/receipt/add", method = RequestMethod.POST)
	public String addReceipt(Receipt receipt){
		if (receipt.getReceiptSequence() == 0) {
			receiptService.saveReceipt(receipt);
		}else{
			receiptService.updateReceipt(receipt);
		}
		
	return "redirect:/receipts";
	}
*/	
	
}	