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
		<c:if test="${message !=null}">
			<h4 align="center" style="color: green">
				<c:out value="${message}" />
			</h4>
		</c:if>
	</div>

	<div>
		<form:form id="form1" name="searchSupplier" action="searchsupplierID.sbc"
			commandName="searchcmd">
			<table align="center">
				<tr align="center" height="15">
				<tr height="25"></tr>
				<tr align="center" height="15">
					<td align="right">Supplier ID :</td>
					<td><form:input path="supplierID" type="text"/></td>
					<td><input type="submit" value="Submit" /> &nbsp;<input
						type="reset" value="Clear" /></td>
				</tr>
			</table>
		</form:form>
	</div>
	<div>
		<form:form id="form2" name="searchusername" action="checkusername.sbc"
			commandName="searchusercmd">
			<table align="center">
				<tr align="center" height="15">
				<tr height="25"></tr>
				<tr align="center" height="15">
					<td align="right">UserName :</td>
					<td><form:input path="username" type="text"
							placeHolder="enter username" /></td>
					<td><input type="submit" value="Submit" /> &nbsp;<input
						type="reset" value="Clear" /></td>
					<td></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>