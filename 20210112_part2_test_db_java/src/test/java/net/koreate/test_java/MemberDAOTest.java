package net.koreate.test_java;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import net.koreate.test_java.config.RootConfig;
import net.koreate.test_java.dao.MemberDAO;
import net.koreate.test_java.vo.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {RootConfig.class})
public class MemberDAOTest {
	
	@Inject
	MemberDAO dao;
	
	@Test
	public void testReanMember() {
		MemberVO m = dao.readMember("id001");
		System.out.println(m);
		
		MemberVO m1 = dao.readMemberWithPass("id001", "pw001");
		System.out.println(m1);
		
		List<MemberVO> list = dao.getMemberList();
		for(MemberVO vo :list) {
			System.out.println(vo);
			
		}
	}

}
