package com.capgemini.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DemoClass
 */
@WebServlet("/DemoClass")
public class DemoClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoClass() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	String userName= request.getParameter("userName");
	HttpSession session = request.getSession();
	ServletContext context = request.getServletContext();
	if(userName != "" &&userName !=null)
	{
		session.setAttribute("savedUserName", userName);
		context.setAttribute("savedUserName", userName);
	}
	
	
	
    out.println("Request parameter has username " +userName);
    out.println("Session parameter has username " + (String)session.getAttribute("savedUserName"));
    out.println("Context parameter has username " + (String)context.getAttribute("savedUserName"));
	//out.println("hello" +userName);
	
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName= request.getParameter("userName");
		String fullName= request.getParameter("fullName");
		String prof = request.getParameter("prof");
		//String location = request.getParameter("location");
		String[] location = request.getParameterValues("location");
	    out.println("you are at" +location.length +"places" )	;
	    for(int i=0 ;i<location.length;i++)
	    {
	    	out.println(location[i]);
	    }
	    
		
		
		//out.println("hello from post" +" " +userName +" "+fullName +" "+prof + " " +location);
		
	}

}
