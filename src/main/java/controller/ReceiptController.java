	package controller;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
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

		model.addAttribute("message", "Spring 3 MVC Hello World");
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
   
	@RequestMapping(value = "/receipt/add", method = RequestMethod.POST)
	public String addReceipt(Receipt receipt){
		if (receipt.getReceiptSequence() == 0) {
			receiptOperation.insertReceipt(receipt);
		}else{
			receiptOperation.updateReceipt(receipt);
		}
		
	return "redirect:/SearchReceipts";
	}	
	
}	