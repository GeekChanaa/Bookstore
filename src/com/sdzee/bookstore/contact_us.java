package com.sdzee.bookstore;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class contact_us extends HttpServlet {
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		this.getServletContext().getRequestDispatcher( "/contact-us.jsp" ).forward( request, response );
	}
}