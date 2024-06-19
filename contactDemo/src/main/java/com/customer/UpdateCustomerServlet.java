package com.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateCustomerServlet")
public class UpdateCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 

		String fullname =request.getParameter("fullname");
		String email =request.getParameter("email");
		String message =request.getParameter("message");
		
		boolean isTrue;
		
		isTrue = contactDBUtil.updatecustomer(0, fullname, email, message);
		
		if(isTrue==true) {
			
			List<contact> cusDetails = contactDBUtil.getCustomerDetails(fullname);
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dis =request.getRequestDispatcher("useraccount.jsp");
			dis.forward(request, response);
		}
		else {
			
			List<contact> cusDetails = contactDBUtil.getCustomerDetails(fullname);
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dis =request.getRequestDispatcher("unsuccess.jsp");
			dis.forward(request, response);
		}
		
		
	}

}
