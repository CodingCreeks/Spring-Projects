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
	<h3 align="center">Add Supplier</h3>
	<hr>
	<form:form name="Add Supplier" action="addsupplier.sbc"	commandName="addsuppliercmd">
		<table align="center">
			<tr align="center" height="15">
				<td>SupplierID :</td>
				<td align="right"><form:input path="supplierID" type="text"/></td>
				<td align="right">Company Name :</td>
				<td><form:input path="companyName" type="text"/></td>
				<td align="right">Contact Name :</td>
				<td><form:input path="contactName" type="text" /></td>
				<td align="right">Contact Job Title :</td>
				<td><form:input path="contactJobTitle" type="text" /></td>
			</tr>
			<tr height="25"></tr>
			<tr align="center" height="50">
				<td align="right">Address :</td>
				<td><form:input path="address" type="text"/></td>
				<td align="right">City :</td>
				<td><form:input path="city" type="text" /></td>
				<td align="right">State :</td>
				<td><form:input path="state" type="text" /></td>
				<td align="right">Postal Code :</td>
				<td><form:input path="postalcode" type="text" /></td>
			</tr>
			<tr align="center" height="15">
				<td align="right">Phone(Office) :</td>
				<td><form:input path="phoneoffice" type="text" /></td>
				<td align="right">Fax :</td>
				<td><form:input path="fax" type="text"/></td>
				<td align="right">email :</td>
				<td><form:input path="email" type="text" /></td>
				<td align="right">Country :</td>
				<td><form:input path="country" type="text" /></td>
			</tr>
			<tr height="25"></tr>
			<tr align="center" height="15">
				<td></td>
				<td></td>
				<td align="right">UserName :</td>
				<td><form:input path="username" type="text" /></td>
				<td align="right">Password :</td>
				<td><form:password path="password" /></td>
			</tr>

			<tr height="25"></tr>
			<tr align="center" height="15">
				<td></td>
				<td></td>
				<td colspan='5'><input name="submit" type="submit"
					value="Submit" />&nbsp;&nbsp;<input name="submit" type="reset"
					value="Clear" /></td>
				<td></td>
			</tr>

		</table>
	</form:form>

</body>
</html>