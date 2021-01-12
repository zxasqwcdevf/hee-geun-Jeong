package net.koreate.test;

import java.sql.Connection;
import java.sql.SQLException;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {
"file:src/main/webapp/WEB-INF/spring/root-context.xml"
})
public class DataSourceTest {
	
	@Inject
	DataSource ds;
	
	//@Inject
	//DriverManagerDataSource dds;
	
	@Test
	public void dataSourceTest() {
		Connection conn = null;
		try {
			conn = ds.getConnection();
			System.out.println("ds conn : " + conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) conn.close();
			} catch (SQLException e) {}
		}
	}
}



