package net.koreate.test_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

public class MySQLTest {
	
	String driver = "com.mysql.cj.jdbc.Driver";
	String url 
		= "jdbc:mysql://localhost:3307/mydata?serverTimezone=Asia/Seoul";
	String username = "java";
	String password = "java";
	
	@Test
	public void testConnection() {
		System.out.println("mysql test Connection");
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,username,password);
			System.out.println("connection : " + conn);
		} catch (ClassNotFoundException e) {
			System.out.println("DRIVER CLASS 를 찾을 수 없음");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("db 정보 오류");
			e.printStackTrace();
		} finally{
			try {
				if(conn != null) conn.close();
			} catch (SQLException e) {}
		}
	}
}






