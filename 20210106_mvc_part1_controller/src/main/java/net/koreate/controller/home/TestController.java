package net.koreate.controller.home;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import net.koreate.vo.ProductVO;

@Controller
public class TestController {
	// /WEB-INF/views/testA.jsp
	@RequestMapping("testA")
	public void testA() {
		System.out.println("testA CALL");
		
		
	}
	// /WEB-INF/views/home.jsp
	@RequestMapping("testB")
	public String testB() {
		return "home";
	}
	///WEB-INF/views/result.jsp
	@RequestMapping("testC")
	//@RequestMapping(value="testC",method={ RequestMethod.GET ,method= RequestMethod.POST})
	public String testC(Model model) {
		model.addAttribute("msg","Message");
		return "result";
	}
	@RequestMapping(value="testD",method= RequestMethod.GET)
	//String msg = request.getParameter("msg");
	//String view = testD(msg);
	public String testD(
			String msg,
			@RequestParam(name ="msg" , required=false, defaultValue="default")String message,
			String message1,
			@RequestParam(name ="msg" , required = true)String mess
			) { 
		System.out.println("msg : " + msg);
		System.out.println("message : " + message1);
		System.out.println("mess : "+ mess);
		return "result";
		
		
	}
	@RequestMapping(value ="testE" , method = RequestMethod.GET)
	//public String testE(String msg,Model model) {
	public String testE(@ModelAttribute("msg") String msg) {
		//model.addAttribute("msg", msg);
		System.out.println(msg);
		return "result";
	}
	
	@RequestMapping("product")
	public String product(Model model) {
		ProductVO vo = new ProductVO("sample",3000);
		model.addAttribute("product",vo);
		
		ProductVO product = new ProductVO("sample2",5000);
		//ProductVO ==> productVO
		model.addAttribute(product);
		
		
		return "product";
		
	}
	
	@RequestMapping("testH")
	public ModelAndView testH(ModelAndView mav) {
		ProductVO vo = new ProductVO("sample3",50000);
		mav.addObject(vo);
		
		ProductVO vo1 = new ProductVO("sample4",10000);
		mav.addObject("product",vo1);
		mav.setViewName("product");
		return mav;
		
	}
	
	
	@RequestMapping("productWrite")
	public void productWrite() {
	}
	
	@RequestMapping("productSubmit")
	public ModelAndView prductSubmit(
			//String name , int price 
			@ModelAttribute ProductVO vo) {
		ModelAndView mav = new ModelAndView();
		//ProductVO vo = new ProductVO(name,price);
		System.out.println(vo);
		mav.addObject("product", vo);
		mav.setViewName("product");
		return mav;
	}
	
	@RequestMapping("redirect")
	public String redirect(RedirectAttributes attr, HttpSession session) {
		attr.addFlashAttribute("msg", "redirect msg");
		System.out.println("redirect");
		return "redirect:/";
	}

}
