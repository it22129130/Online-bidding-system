<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="contact.css">
</head>
<body style="
    	height: 200px;
    	margin: auto;
    	text-align: center;">

 	<%
 	    String idcustomer =request.getParameter("iscustomer");
		String fullname =request.getParameter("fullname");
		String email =request.getParameter("email");
		String message =request.getParameter("message");
 	%>
 
 
        <div class="contactForm">
        <form action="update" method="post" >
                <h2>Update details</h2>
                <div class="inputBox">
                    <input type="text" name="fullname" required="required"value="<%=fullname %>">
                    <span>Full name</span>
                </div>
                <div class="inputBox">
                    <input type="text" name="email" required="required"value="<%=email%>">
                    <span>Email</span>
                </div>
                <div class="inputBox">
                    <textarea required="required"name ="message"value="<%=message%>"></textarea>
                    <span>Type your Message...</span>
                </div>
                <div class="inputBox">
                    <input type="submit" name="" value="Update">
                    
                </div>
                
            </form>


</body>
</html>