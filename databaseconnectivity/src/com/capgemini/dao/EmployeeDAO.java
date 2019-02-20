package com.capgemini.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.capgemini.dao.pojo.Employee;
import com.capgemini.dao.support.ConnectionFactory;

public class EmployeeDAO {
	public int insert(Employee emp ) throws SQLException
	{
	Connection conn = ConnectionFactory.getConnection();	
	String query = "insert into emp values(?,?,?,?,?,?,?,?)";
	PreparedStatement pStatement=  conn.prepareStatement(query);
	pStatement.setInt(1, emp.getEmpNo());
	pStatement.setString(2, emp.getEname());
	pStatement.setString(3, emp.getJob());
	pStatement.setInt(4, emp.getMgr());
	pStatement.setDate(5, emp.getHiredate());
	pStatement.setDouble(6, emp.getSal());
	pStatement.setDouble(7, emp.getComm());
	pStatement.setInt(8, emp.getDeptNo());
	int output=pStatement.executeUpdate();
	return output;
	}
	public Employee read(int empNo) throws SQLException 
	{
		Connection conn = ConnectionFactory.getConnection();
		String query="select * from emp where empNo= ?";
		PreparedStatement pStatement=  conn.prepareStatement(query);
		pStatement.setInt(1, empNo);
		ResultSet resultSet=pStatement.executeQuery();
		Employee emp = null;
		while(resultSet.next()) {
			emp=new Employee();
			emp.setEname(resultSet.getString("ename"));
	
		}
		return emp;
	}
	public static void main(String[] args) {
		try {
			//System.out.println(new EmployeeDAO().insert(new Employee(1000, "Sachin", "Manager", 7369, new java.sql.Date(Calendar.getInstance().getTime().getTime()), 5000.00, 500.00, 20)));
			System.out.println(new EmployeeDAO().read(7369));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

	
	


