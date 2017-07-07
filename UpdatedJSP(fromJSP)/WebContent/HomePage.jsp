<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String user = (String) session.getAttribute("user");
	%>
	<h4 align="right">
		Welcome
		<%=user%>&nbsp;<a href="Logout">logout</a>
	</h4>
	<%
		String str = request.getParameter("message");
	%>
	<h3 align="center">Employee Home Page</h3>
	<a href="GetEmployeeRecords">"Get Employee Records"</a>
	<form action="GetEmployeeRecords" name="Home.htm"></form>

</body>
</html>