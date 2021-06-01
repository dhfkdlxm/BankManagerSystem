package kr.ac.kopo.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@192.168.119.111:1521:oracle19";
			String user = "scott";
			String password = "tiger";
			
			conn = DriverManager.getConnection(url,user,password);
			
		} catch (Exception e) {
			
		}
		return conn;
		
		
	}
	
	
}
