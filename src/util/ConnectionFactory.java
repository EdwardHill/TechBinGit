package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public static Connection getConnection() throws SQLException{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connectado");
		      return DriverManager.getConnection("jdbc:mysql://localhost:3306/techbinweb", "root","");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			throw new SQLException(e.getMessage());
		}
		
	}
}
