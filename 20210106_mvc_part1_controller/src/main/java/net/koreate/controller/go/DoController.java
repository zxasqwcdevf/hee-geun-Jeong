package net.koreate.controller.go;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import net.koreate.dao.TestDAO;
import net.koreate.service.TestService;

@Controller
public class DoController {
	@Autowired(required=false)
	TestService testService;
	
	@Autowired(required=false)
	TestDAO dao;
	
	
	@RequestMapping("main.do")
	public void mainDo() {
		System.out.println("hi do");
		if(testService != null) {
			testService.testService("DoController");
		}else {
			System.out.println("DoController do null");
			
		}
		if(dao != null) {
			dao.testDAO("DoController");
		}else {
			System.out.println("DoController dao null");
			
		}
		
	}
	

}
