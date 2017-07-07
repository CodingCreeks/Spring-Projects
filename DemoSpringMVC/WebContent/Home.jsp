<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<%-- Scriptlet <% %>, <%= %> --%>
		
		<%-- <% String user = (String)session.getAttribute("user"); %> --%>
		<%-- <h4 align="right">Welcome <%= user %>&nbsp;<a href="logout.htm">logout</a></h4> --%> 
		
		<%-- Expression language ${} --%>
		
		<%-- 	<h4 align="right">Welcome ${user} &nbsp;<a href="logout.htm">logout</a></h4> --%>
		
		<!-- JSTL -->
		<h4 align="right">Welcome <c:out value="${user}"></c:out> &nbsp;<a href="logout.htm">logout</a></h4> 
		<a href="getAll.htm">Get All Employees</a><br>
		<a href="CreateEmployee.jsp">New Employee?</a>
	</body>
</html>