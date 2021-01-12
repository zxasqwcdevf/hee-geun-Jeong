package net.koreate.test_java.config;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"net.koreate.test_java.dao"})
public class RootConfig {
	
	@Inject
	ApplicationContext context;
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds =new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3307/mydata?serverTimezone=Asia/Seoul");
		ds.setUsername("java");
		ds.setPassword("java");
		return ds;
		
	}
	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource());
		bean.setConfigLocation(context.getResource("classpath:/MybatisConfig.xml"));
		return (SqlSessionFactory)bean.getObject();
		
		
	}
	@Bean
	public SqlSession sqlSession() throws Exception{
		SqlSession session = new SqlSessionTemplate(sqlSessionFactory());
		return session;
		
		
	}
	
}
