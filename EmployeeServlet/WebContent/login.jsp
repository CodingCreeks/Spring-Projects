<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
</head>
<body>

 	<% String str = request.getParameter("message"); %>
	<h4 align="center">Employee login</h4><br>
	<%if(str !=null) { %>
	<h5 align="center" style="color: red;"><%= str %></h5>
	<%} %>
	<form Name="login.htm" method="post">
	<table align="center">
		<tr><td>Name :</td><td> <input type="text" Name="empName" size="30"> </td></tr>
		<tr><td>Password :</td><td> <input type="password" Name="empPassword" size="30"> </td></tr>
		<tr><td><input type="submit" value="Submit"></td><td><input type="Reset" value="Clear"></td></tr>
		<tr><td></td><td><a href="EditRecord.jsp">NewEmployee ?</a></td></tr>
	</table>
	</form>
	</body>
</html>