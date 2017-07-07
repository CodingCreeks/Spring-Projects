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
<h3 align="center">Customer login</h3>
	<form:form action="checkCutomerlogin.asp" commandName="customerLogin">
		<table align="center">
			<tr>
				<td>UserName :</td>
				<td><form:input path="cusername"/></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><form:password path="cpassword"/></td>
			</tr>
			<tr>
			<td></td>
				<td colspan="1"><input type="submit" value="SignIn"> <nobr>  </nobr> <input type="reset" value="Clear"></td>
			</tr>
			<tr><th></th><th colspan="1"><a href="createCustomer.asp">new Customer?</a></th></tr>
		</table>
	</form:form>


</body>
</html>