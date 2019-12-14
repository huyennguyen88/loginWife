package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
	public static Connection getConnection() {
		System.out.println("Ket noi CSDL ");
	    String hostName = "localhost";
	    String dbName = "WifeDB";
	    String userName = "root";
	    String password = "password";

	    
	    Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
			conn = DriverManager.getConnection(connectionURL, userName,password);
			System.out.println("ket noi thanh cong");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	    return conn;
	}
}
