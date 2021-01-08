package net.koreate.dao;

import org.springframework.stereotype.Repository;

@Repository
public class TestDAOImpl implements TestDAO{
	
	@Override
	public void testDAO(String message) {
		System.out.println(message+" testDAO 요청 실행");
	}
	
}
