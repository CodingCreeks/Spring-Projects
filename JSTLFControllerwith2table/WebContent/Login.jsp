<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h6 align="center" style="color: red">
		<c:out value="${message}"></c:out>
	</h6>
	<form action="check.htm" method="post">
		<table align="center">
			<tr>
				<th>User Name:</th>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<th>Password:</th>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td><input type="reset" value="Clear"></td>
				<td><input type="submit" value="Login"></td>
			</tr>
			<tr>
				<td></td>
				<td><a href="CreateEmployee.jsp">New Employee?</a></td>
			</tr>
		</table>
	</form>
</body>
</html>