<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3 align="center">Employee login page</h3>
	
	<%-- <h6 align="center" style="color: red"> <c:out value="${message}"></c:out> </h6> --%>
	<h6 align="center" style="color: red"> <c:out value="${message}"/></h6>
	
	<form action="checkEmployee.asp">
	<table align="center">
		<tr>
			<td align="justify">Employee Name :</td>
			<td><input type=text name=eusername size=30></td>
		</tr>
		<tr>
			<td align="justify">Employee Password :</td>
			<td><input type="password" name=epassword size=30></td>
		</tr>
		<tr></tr>
		<tr></tr>
		<tr>
			<td></td>
			<td>&nbsp; &nbsp; &nbsp; <input type="submit" value="SignIn">
				&nbsp; &nbsp; &nbsp;<input type="reset" value="Clear"></td>
		</tr>
		<tr></tr>
		<tr></tr>
		<tr>
			<td></td>
			<th align="center"><a href="createEmployee.jsp">New
					Employee?</a></th>
		</tr>
	</table>
	</form>
</body>
</html>