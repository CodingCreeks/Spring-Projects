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
	<h3 align="center">new Customer Registration Page</h3>
	<h3 align="center" style="">"${error}"</h3>
	<form:form action="regCustomer.asp" commandName="regCustomerform">
		<table align="center">
			<tr>
				<td><label>FirstName :</label></td>
				<td><form:input path="customerfname" type="text" /></td>
				<td><label>LastName :</label></td>
				<td><form:input path="customerlname" type="text" /></td>
			</tr>
			<tr>
				<td><label>Gender :</label></td>
				<td><form:input path="customergender" type="text" /></td>
				<td><label>Phone :</label></td>
				<td><form:input path="customerphone" type="text" /></td>

				<td><label>Email :</label></td>
				<td><form:input path="customeremail" type="text" /></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" value="submit" /> <input type="reset"
					value="clear" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>