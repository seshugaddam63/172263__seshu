package com.capgemini.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.dao.UserDao;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistrationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		response.setContentType("text/html");
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		String password = request.getParameter("psw");
		String repeatpassword = request.getParameter("psw-repeat");
		
		System.out.println(email+" "+username+" "+password+" "+repeatpassword);
		
		UserDao obj = new UserDao();
		try {
			obj.insert(email, username, password, repeatpassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		response.sendRedirect("success.html");
		
		
	}

}
