<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete here</title>

<link rel="stylesheet" href="contact.css">
</head>
<body>

	
 	<%
 	    String idcustomer =request.getParameter("iscustomer");
		String fullname =request.getParameter("fullname");
		String email =request.getParameter("email");
		String message =request.getParameter("message");
 	%>

	<div class="contactForm">
        <form action="delete" method="post" >
                <h2>Delete details</h2>
                
                <div class="inputBox">
                    <input type="text" name="fullname" required="required"value="<%=fullname %>"readonly>
                    <span>Full name</span>
                </div>
                <div class="inputBox">
                    <input type="text" name="email" required="required"value="<%=email%>"readonly>
                    <span>Email</span>
                </div>
                <div class="inputBox">
                    <textarea required="required"name ="message"value="<%=message%>"readonly></textarea>
                    <span>Type your Message...</span>
                </div>
                <div class="inputBox">
                    <input type="submit" name="" value="delete">
                    
                </div>
                
            </form>

</body>
</html>