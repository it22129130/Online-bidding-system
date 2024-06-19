<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<table>
	<c:forEach var="cus" items="${cusDetails}">
	
	<c:set var ="idcustomer" value="${cus.idcustomer }"/>
	<c:set var ="fullname" value="${cus.fullname}"/>
	<c:set var ="email" value="${cus.email}"/>
	<c:set var ="message" value="${cus.message}"/>
	
	<tr>
		<td>customer id</td>
		<td>${cus.idcustomer} </td>
	</tr>
	
	<tr>
		<td>full name</td>
		<td>${cus.fullname}	</td>
	</tr>
	
	<tr>
		<td>email</td>
		<td>${cus.email}</td>
	</tr>

	<tr>
		<td>message</td>
		<td>${cus.message}</td>
	</tr>
	
	
	</c:forEach>
	</table>
	
	<c:url value="updatecustomer.jsp" var="cusupdate">
		<c:param name="idcustomer" value ="${idcustomer}"/>
		<c:param name="fullname" value ="${fullname}"/>
		<c:param name="email" value ="${email}"/>
		<c:param name="message" value ="${message}"/>
		
	</c:url>
	<a href="${cusupdate}">
	<input type ="button" name="update"value="Update">
	</a>
	
	
	<c:url value ="deletecustomer.jsp" var="cusdelete">
	
		<c:param name="idcustomer" value="${idcustomer}"></c:param>
		<c:param name="fullname" value ="${fullname}"></c:param>
		<c:param name="email" value ="${email}"></c:param>
		<c:param name="message" value ="${message}"></c:param>
		
	</c:url>
	<a href ="${cusdelete}">
	<input type="button" name="delete"value="delete">
	</a>
	
	
	
	
	
	
</body>
</html>