package vn.pandora.Connection;

import java.sql.Connection;
import java.sql.DriverManager;

import vn.pandora.Connection.*;

public class ConnectJDBC {

	//Connection của Ân
//	private final String serverName = "LAPTOP-EVKJEPF2";
//	private final String dbName = "QUANLYDETAI";
//	private final String portNumber = "1433";
//	private final String instance = "SQLEXPRESS";
//	private final String userID = "sa";
//	private final String password = "123456";
	
	//Connection của P.Khánh
	private final String serverName = "localhost";
	private final String dbName = "LTWeb";
	private final String portNumber = "1433";
	private final String instance = "";
	private final String userID = "sa";
	private final String password = "123456";
	
	//Connection của Q.Khánh
//	private final String serverName = "LAPTOP-EVKJEPF2";
//	private final String dbName = "QUANLYDETAI";
//	private final String portNumber = "1433";
//	private final String instance = "SQLEXPRESS";
//	private final String userID = "sa";
//	private final String password = "123456";

	public Connection getConnection() throws Exception {
		String url = "jdbc:sqlserver://" + serverName + "\\" + instance + ";databaseName=" + dbName;
		if (instance == null || instance.trim().isEmpty())
			url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName;
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		return DriverManager.getConnection(url, userID, password);
	}

	public static void main(String[] args) {
		try {
			System.out.println(new ConnectJDBC().getConnection());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
