package com.capgemini.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class UserDaoLogin {
	static boolean status=false;  
	public static boolean validate(String username,String Password){  
		
		try{  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","orcl11g");  
		      
		PreparedStatement ps=con.prepareStatement("select * from flogin where username=? and Password=?");  
		ps.setString(1,username);  
		ps.setString(2,Password);  
		      System.out.println(username);
		ResultSet rs=ps.executeQuery();  
		status=rs.next();  
System.out.println(rs.next());	          
		}catch(Exception e){System.out.println(e);}  
		return status;  
		}  
		}  




