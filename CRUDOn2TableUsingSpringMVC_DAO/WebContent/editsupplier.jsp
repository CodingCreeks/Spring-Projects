<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Supplier Details</title>
</head>
<body>
	<h3 align="center">Edit Supplier</h3>
	<hr>
	<form:form name="editform" action="updatesupplier.sbc"
		commandName="editsuppliercmd">
		<table align="center">
			<tr align="center" height="15">
				<td align="right">SupplierID :</td>
				<td><form:input path="supplierID" value="${editsuppliercmd.supplierID}"/></td>
				<td align="right">Company Name :</td>
				<td><form:input path="companyName" value="${editsuppliercmd.companyName}"/></td>
				<td align="right">Contact Name :</td>
				<td><form:input path="contactName" value="${editsuppliercmd.contactName}" /></td>
				<td align="right">Contact Job Title :</td>
				<td><form:input path="contactJobTitle" value="${editsuppliercmd.contactJobTitle}" /></td>
			</tr>
			<tr height="25"></tr>
			<tr align="center" height="50">
				<td align="right">Address :</td>
				<td><form:input path="address" value="${editsuppliercmd.address}" /></td>
				<td align="right">City :</td>
				<td><form:input path="city" value="${editsuppliercmd.city}" /></td>
				<td align="right">State :</td>
				<td><form:input path="state" value="${editsuppliercmd.state}" /></td>
				<td align="right">Postal Code :</td>
				<td><form:input path="postalcode" value="${editsuppliercmd.postalcode}" /></td>
			</tr>
			<tr align="center" height="15">
				<td align="right">Phone(Office) :</td>
				<td><form:input path="phoneoffice" value="${editsuppliercmd.phoneoffice}" /></td>
				<td align="right">Fax :</td>
				<td><form:input path="fax" value="${editsuppliercmd.fax}" /></td>
				<td align="right">email :</td>
				<td><form:input path="email" value="${editsuppliercmd.email}" /></td>
				<td align="right">Country :</td>
				<td><form:input path="country" value="${editsuppliercmd.country}" /></td>
			</tr>
			<tr height="25"></tr>
			<tr align="center" height="15">
				<td></td>
				<td></td>
				<td align="right">UserName :</td>
				<td><form:input path="username" value="${editsuppliercmd.username}" /></td>
				<td align="right">Password :</td>
				<td><form:password path="password" value="${editsuppliercmd.password}"/></td>
			</tr>

			<tr height="25"></tr>
			<tr align="center" height="15">
				<td></td>
				<td></td>
				<td colspan='5'><input name="submit" type="submit"
					value="Submit" />&nbsp;&nbsp;<input name="submit"
					type="reset" value="Clear" /></td>
				<td></td>
			</tr>

		</table>
	</form:form>

</body>
</html>