<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Supplier login</title>
</head>
<body>
<div>
<h3 align="center">Supplier login</h3>
	<hr>
	<c:if test="${error !=null}">
		<h4 align="center" style="color: red">
			<c:out value="${error}"></c:out>
		</h4>
	</c:if>
</div>
	
<div>
	<form:form name="Login Supplier" action="checksupplierlogin.sbc"
		commandName="loginsuppliercmd">
		<table align="center">
			<tr align="center" height="15">
			<tr height="25"></tr>
			<tr align="center" height="15">
				<td align="right">UserName :</td>
				<td><form:input path="username" type="text" placeHolder="enter UserName" /></td>
			</tr>
			<tr align="center" height="15">
				<td align="right">Password :</td>
				<td><form:password path="password" placeHolder="enter Password" /></td>
			</tr>

			<tr height="15"></tr>
			<tr align="center" height="15">
				<td></td>
				<td><input type="submit" value="Submit" /> &nbsp;&nbsp; <input
					type="reset" value="Clear" /></td>
				<td></td>
			</tr>
			<tr><td></td><td><a href="showcreatsupplier.sbc">new Supplier...</a></td></tr>

		</table>
	</form:form>
</div>


</body>
</html>