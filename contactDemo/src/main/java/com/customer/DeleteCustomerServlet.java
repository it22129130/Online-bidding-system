package com.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteCustomerServlet")
public class DeleteCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idcustomer = request.getParameter("idcustomer");
		boolean isTrue;
		
		isTrue = contactDBUtil.deleteCustomer(idcustomer);
		
		if(isTrue == true) {
			RequestDispatcher dispatcher =request.getRequestDispatcher("customerinsert.java");
			dispatcher.forward(request, response);
			
		}else {
			List<contact> cusDetails = contactDBUtil.getCustomerDetails(idcustomer);
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("useraccount.jsp");
			dispatcher.forward(request, response);
		}
		
	}

}
