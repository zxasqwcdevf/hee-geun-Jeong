package net.koreate.test_java;

import java.sql.Connection;
import java.sql.SQLException;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import net.koreate.test_java.config.RootConfig;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {RootConfig.class})
public class DataSourceTest {
	
	@Inject
	DataSource dataSource;
	
	@Inject
	DriverManagerDataSource ds;
	
	@Test
	public void testDataSource() {
		Connection conn =null;
		
		try {
			conn =dataSource.getConnection();
			System.out.println("dataSource :" + dataSource);
			System.out.println("ds :" + ds);
			System.out.println("Root Bean DataSource conn :" + conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null)conn.close();
			} catch (SQLException e) {}
			
			
		}
	}
		
		
		
	
	
}
