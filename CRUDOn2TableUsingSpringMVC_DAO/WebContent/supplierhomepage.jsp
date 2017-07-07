<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Supplier Home Page</title>
</head>
<body>
	<h5 align="right" style="color: green;">
		Welcome ${user}&nbsp;&nbsp;<a href="logoutsupplier.sbc">logout</a>
	</h5>
	<h3 align="center" style="color: olive;">Home Page</h3>
	<h4>
		<a href="getallsuppliers.sbc">View All Suppliers</a>
	</h4>
	<h4>
		<a href="showsearch.sbc">Search Suppliers</a>
	</h4>
	<%-- <%-- <h4 align="center" style="color: red">
		<c:out value="${message}"></c:out>
	</h4>
	<form:form action="searchsupplierid.sbc" commandName="supplierhomepagecmd">
	<form:form>
		<table>
			<tr>
			<td>SupplierID :</td>
				<td><form:input path="supplierID" type="text"/></td>
				<td>Search SupplierID :</td>
				<td><form:input path="supplierID" type="text"
						placeHolder="enter supplierID here" /></td>
				<td><input type="submit" value="Search Supplier" /></td>
			</tr>
		</table>
	</form:form> --%>
</body>
</html>