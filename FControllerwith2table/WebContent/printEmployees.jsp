<%@page import="com.online.model.EmpAndAddr"%>
<%@page import="com.online.model.Employee"%>
<%@page import="com.online.model.Address"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		
		<% String user = (String)session.getAttribute("user"); %>
		<h4 align="right">Welcome <%= user %>&nbsp;<a href="logout.htm">logout</a></h4>
		
		<% List<EmpAndAddr> emp=(List<EmpAndAddr>)request.getAttribute("listOfRecords"); %>
		<%-- <% List<?> emp=(List<?>)request.getAttribute("listOfRecords"); %> --%>
		
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
			<% for(EmpAndAddr empaddr : emp ) {%>
				<tr>
					<td><%=empaddr.getEno()%></td>
					<td><%=empaddr.getEname()%></td>
					<td><%=empaddr.getEdesignation()%></td>
					<td><%=empaddr.getEgender()%></td>
					<td><%=empaddr.getEsalary()%></td>				
					<td><%=empaddr.getEusername()%></td>
					<td><%=empaddr.getStreet()%></td>
					<td><%=empaddr.getCity()%></td>
					<td><%=empaddr.getState()%></td>
					<td><%=empaddr.getPincode()%></td>
					<td><%=empaddr.getContact()%></td>
					<td><%=empaddr.getEmail()%></td>
					<td>
					<a href="getDataForEdit.htm?eno=<%=empaddr.getEno()%>">
							<img src="/images/edit.png" width="25" height="25">
					</a></td>
					<td>
					<a href="remove.htm?eno=<%=empaddr.getEno()%>"onclick="return confirm('Are you sure?')">
							<img src="/images/del.png" width="25" height="25">
					</a>
					</td>
				</tr>
			<% } %>
		</table>
		</form>
	</body>
</html>