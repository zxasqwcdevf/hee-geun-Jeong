package net.koreate.test;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {
"file:src/main/webapp/WEB-INF/spring/root-context.xml"
})
public class MYbatisSpringTest {
	
	@Inject
	SqlSessionFactory factory;
	
	@Test
	public void testConnection() {
		SqlSession session = factory.openSession();
		System.out.println("연결 객체 생성 정보 : " + session);
		System.out.println("con : " + session.getConnection());
		session.close();
	}
}




