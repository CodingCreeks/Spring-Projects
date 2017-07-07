<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<h4 align="right">Welcome <c:out value="${user}"></c:out> &nbsp;<a href="logout.htm">logout</a> </h4>
		
		<%-- 	<% List<EmpAndAddr> empaddress=(List<EmpAndAddr>)request.getAttribute("listOfRecords"); %> --%>
		<h3 align="center">List of Employees</h3>
		<form>
		<table align="center" border="1">
			<tr>
				<th>Number</th>
				<th>Name</th>
				<th>Designation</th>
				<th>Gender</th>
				<th>Salary</th>
				<th>User Name</th>
				<th>Street</th>
				<th>City</th>
				<th>State</th>
				<th>PinCode</th>
				<th>Contact Number</th>
				<th>email Address</th>
				<th></th>
				<th></th>
			</tr>
			<c:forEach items = "${listOfRecords}" var="empaddr">
				<tr>
					<td>${empaddr.eno}</td>
					<td>${empaddr.ename}</td>
					<td>${empaddr.edesignation}</td>
					<td>${empaddr.egender}</td>
					<td>${empaddr.esalary}</td>				
					<td>${empaddr.eusername}</td>
					<td>${empaddr.street}</td>
					<td>${empaddr.city}</td>
					<td>${empaddr.state}</td>
					<td>${empaddr.pincode}</td>
					<td>${empaddr.contact}</td>
					<td>${empaddr.email}</td>
					<td><a href="getDataForEdit.htm?eno=${empaddr.eno}">
						<img src="/images/edit.png" width="25" height="25"></a></td>
					<td><a href="remove.htm?eno=${empaddr.eno}" onclick="return confirm('Are you sure?')">
						<img src="/images/del.png" width="25" height="25"></a></td>
				</tr>
			</c:forEach>
			
		</table>
		</form>
	</body>
</html>