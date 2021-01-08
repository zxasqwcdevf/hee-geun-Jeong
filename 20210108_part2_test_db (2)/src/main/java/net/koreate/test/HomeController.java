package net.koreate.test;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@Autowired
	DataSource ds;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		System.out.println(ds);
		return "home";
	}
	
}
