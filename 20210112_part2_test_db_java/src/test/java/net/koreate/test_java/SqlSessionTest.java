package net.koreate.test_java;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import net.koreate.test_java.config.RootConfig;
import net.koreate.test_java.vo.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {RootConfig.class})
public class SqlSessionTest {
	
	@Inject
	SqlSession session;
	
	String namespace = "net.koreate.mappers.MemberMapper";
	
	@Test
	public void insertMember() {
		MemberVO member = new MemberVO();
		member.setUserid("id003");
		member.setUserpw("pw003");
		member.setUsername("rari");
		session.insert(namespace+".insertMember",member);
	}
}