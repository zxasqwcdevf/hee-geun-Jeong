package net.koreate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.koreate.dao.TestDAO;

@Service
public class TestServiceImpl implements TestService{
	
	@Autowired
	TestDAO dao;
	
	//TestDAO dao = new TestDAOImpl();

	@Override
	public void testService(String message) {
		System.out.println(message+" testService 요청 처리");
		dao.testDAO(message);
	}
	
}
