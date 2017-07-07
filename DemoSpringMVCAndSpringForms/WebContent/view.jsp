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
	<h3 align="center">Customers details</h3>
	<hr>
	<%-- action="viewCustomers.asp" commandName="viewAllCustomers" --%>
	<form:form commandName="viewCustomerdetails">
		<table align="center" border="1" bordercolor="blue" bgcolor="silver"
			style="border-style: dashed; border: thin;">
			<tr>
				<td>Number</td>
				<td>Title</td>
				<td>First Name</td>
				<td>Last Name</td>
				<td>Gender</td>
				<td>Birth Date</td>
				<td>Company</td>
				<td>Address</td>
				<td>website Address</td>
				<td>UserName</td>
			</tr>
			<c:forEach items="${Customerslist}" var="listOfcust">
				<tr>
					<td>${listOfcust.cnum}</td>
					<td>${listOfcust.ctitle}</td>
					<td>${listOfcust.cfirstname}</td>
					<td>${listOfcust.clastname}</td>
					<td>${listOfcust.cgender}</td>
					<td>${listOfcust.cdob}</td>
					<td>${listOfcust.ccompany}</td>
					<td>${listOfcust.caddress}</td>
					<td>${listOfcust.cwebsite}</td>
					<td>${listOfcust.cusername}</td>
					<td><a
						href="getCustomerDataForEdit.asp?cnum=${listOfcust.cnum}">
						<img src="<c:url value='images/edit.png'/>" width="25" height="25"></a></td>
					<td><a
						href="removeCustomerdetails.asp?cnum=${listOfcust.cnum}"
						onclick="return confirm('Are you sure?')"> 
						<img src="<c:url value='images/del.png'/>" width="25" height="25"></a></td>
				</tr>
			</c:forEach>
		</table>
	</form:form>
</body>
</html>