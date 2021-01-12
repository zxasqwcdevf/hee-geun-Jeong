package net.koreate.controller.home;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;
import javax.inject.Named;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.koreate.service.TestService;


/**
 *	@Component - @Controller @Service @Repository  
 *  @Controller -> @Service -> @Repository
 *  @Service
 *  @Repository 
 */
@Controller
public class HomeController {
	
	// @Autowired         @Inject       @Resource
	//   스프링			        자바                          자바
	//    타입                              타입                      이름으로 연결
	
	//@Inject
	@Autowired
	@Qualifier("ts")
	TestService testService;
	/**
	 * 해당되는 타입의 빈이 존재 하는지 찾습니다.
	 */
	@Inject
	@Named("ts")
	TestService ts;
	
	//TestService ts = new TestServiceImpl();
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "home.home", method = RequestMethod.GET)
	// Model model  = new Model();
	// Locale local = Locale.getInstance();
	// String home = home(local, model);
	// InternalResourceViewResolver view = new InternalResourceViewResolver();
	// String a = view.getPrefix()+home+view.getSuffix();
	// request.getRequestDispatcher(a).forward(request,response);
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
