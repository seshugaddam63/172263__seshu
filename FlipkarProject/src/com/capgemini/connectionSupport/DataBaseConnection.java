package com.capgemini.connectionSupport;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {

//private static final DataBaseConnection dbc = new DataBaseConnection();
private static Connection conn;
public static Connection getConnection() throws SQLException
{
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","orcl11g");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return conn;
	
}
}
