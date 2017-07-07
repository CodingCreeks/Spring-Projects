<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3 align="center">Create new Customer</h3>
	<form:form action="createNewCustomer.asp" commandName="newCustomer">
		<table align="center">
			<tr>
				<td>Number :</td>
				<td><form:input path="cnum" /></td>
			</tr>
			<tr>
				<td>Title :</td>
				<td><form:input path="ctitle" /></td>
			</tr>
			<tr>
				<td>First Name :</td>
				<td><form:input path="cfirstname" /></td>
			</tr>
			<tr>
				<td>Last Name :</td>
				<td><form:input path="clastname" /></td>
			</tr>
			<tr>
				<td>Gender :</td>
				<td><form:radiobutton path="cgender" value="Male" />Male <form:radiobutton
						path="cgender" value="Female" />Female</td>
			</tr>
			<tr>
				<td>Birth Date :</td>
				<td><form:input path="cdob" /></td>
			</tr>
			<tr>
				<td>Company :</td>
				<td><form:input path="ccompany" /></td>
			</tr>
			<tr>
				<td>Address :</td>
				<td><form:input path="caddress" /></td>
			</tr>
			<tr>
				<td>webSite :</td>
				<td><form:input path="cwebsite" /></td>
			</tr>
			<tr>
				<td>UserName :</td>
				<td><form:input path="cusername" /></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><form:password path="cpassword" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr><td></td><td><input type="submit" value="submit"><nobr></nobr><input type="reset" value="Clear"></td></tr>
		</table>
	</form:form>
</body>
</html>