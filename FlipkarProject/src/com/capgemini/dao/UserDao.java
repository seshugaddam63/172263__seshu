package com.capgemini.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



import com.capgemini.connectionSupport.DataBaseConnection;

public class UserDao {
	
	public int insert(String Email,String Username, String rpassword,String repeatpassword) throws SQLException 
	{
		
		String query = "insert into login values(?,?,?,?)";
		Connection con =DataBaseConnection.getConnection();
		PreparedStatement pst =   con.prepareStatement(query);
		/*
		 * pst.setString(1, Email); pst.setString(2, Username); pst.setString(3,
		 * rpassword); pst.setString(4, repeatpassword); int output =
		 * pst.executeUpdate(); return output;
		 */
		pst.setString(1, Email);
		pst.setString(2, Username);
		pst.setString(3, rpassword);
		pst.setString(4, repeatpassword);
	    int output = pst.executeUpdate();
	    return output;
	  }
	
}
