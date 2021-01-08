package net.koreate.test;

import java.util.ArrayList;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import net.koreate.test.dao.MemberDAO;
import net.koreate.test.vo.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {
"file:src/main/webapp/WEB-INF/spring/root-context.xml"
})
public class MemberDAOTest {
	
	@Inject
	MemberDAO dao;
	
	@Test
	public void insertMember() {
		MemberVO member = new MemberVO();
		member.setName("장인제자냐");
		member.setAddr("아오지");
		dao.insertMember(member);
	}
	
	@Test
	public void readMember() {
	MemberVO member = dao.readMember(1);	
	System.out.println("readMember(1):"+member);
	
	ArrayList<MemberVO> memberList
	=dao.selectList();
	for(MemberVO m : memberList) {
		System.out.println(m);
		
	}
	System.out.println("readMember 끝!");
		
	}
	

}









