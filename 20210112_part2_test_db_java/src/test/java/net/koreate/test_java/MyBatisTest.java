package net.koreate.test_java;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import net.koreate.test_java.config.RootConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {RootConfig.class})
public class MyBatisTest {
	
	@Inject
	SqlSessionFactory sqlSessionFactory;
	
	@Test
	public void testSessionFactory() {
		
		try(SqlSession session = sqlSessionFactory.openSession()){
			System.out.println("연결 정보 객체 생성 완료 : "+ session);
			System.out.println("connection 정보 : "+session.getConnection());;
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
