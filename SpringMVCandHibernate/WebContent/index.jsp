<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer login</title>
</head>
<body>
	<h3 align="center">Customer login</h3>
	<h3 align="center" style="">"${error}"</h3>
	<form:form action="searchCustomer.asp" commandName="loginCustomerform">
		<table align="center">
			<tr>
				<td><label>Customer Number :</label></td>
				<td><form:input path="customerId" type="text" /></td>
			</tr>
			<tr>
				<td> <label>Customer Email :</label></td>
				<td><form:input path="customeremail" type="text" /></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" value="submit" /> <input type="reset"
					value="clear" /></td>
			</tr>

			<tr>
				<td></td>
				<td><a href="showRegCustomer.asp">RegisterCustomer?</a></td>
			</tr>
		</table>
	</form:form>
</body>
</html>