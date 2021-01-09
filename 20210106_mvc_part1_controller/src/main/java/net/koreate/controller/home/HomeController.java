package net.koreate.controller.home;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.koreate.service.TestService;
import net.koreate.service.TestServiceImpl;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	// @Autowired @Inject @Resource
	// 스프링              자바           자바
	// 타입                  타입           이름으로 연결
	@Inject
	//@Autowired
	TestService testService;
	/**
	 * 해당되는 타입의 빈이 존재하는 지 찾습니다 .
	 */
	
	//TestService ts = new TestServiceImpl();
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "home.home", method = RequestMethod.GET)
	//Model model = new Model();
	//Local local = Local.getInstance();
	//String home = home(local, model);
	//InternalResourceViewResolver view = new InternalResourceViewResolver();
	//String a = view.getPrefix()+home+view.getSuffix();
	//request.getRequestDispatcher(a).forward(request,response);
	
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		testService.testService("HomeController");
		return "home";
	}
	
}
