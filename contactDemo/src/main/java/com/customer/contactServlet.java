package com.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/contactServlet")
public class contactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fullname =request.getParameter("fullname");
		String email =request.getParameter("Email");
		String message =request.getParameter("message");
		
		try {
		List<contact> conDetails =contactDBUtil.validate(fullname, email, message);
		request.setAttribute("conDetails","conDetails");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dis =request.getRequestDispatcher("useraccount.jsp");
		dis.forward(request, response);
		
	}

}
