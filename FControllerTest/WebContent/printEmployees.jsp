<%@page import="com.online.model.Employee"%>
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
		
		<% List<Employee> employees = (List<Employee>)request.getAttribute("listOfEmployees"); %>
		
		<h3 align="center">List of Employees</h3>
		<table align="center" border="1">
			<tr>
				<th>Number</th>
				<th>Name</th>
				<th>Designation</th>
				<th>Gender</th>
				<th>Salary</th>
				<th>User Name</th>
				<th></th>
				<th></th>
			</tr>
			<% for(Employee emp : employees) { %>
				<tr>
					<td><%= emp.getEno() %></td>
					<td><%= emp.getEname() %></td>
					<td><%= emp.getEdesignation() %></td>
					<td><%= emp.getEgender() %></td>
					<td><%= emp.getEsal() %></td>					
					<td><%= emp.getEusername() %></td>		
					<td><a href="getDataForEdit.htm?eno=<%=emp.getEno()%>">
							<img src="/images/edit.png" width="20" height="20">
						</a></td>		
					<td><a href="remove.htm?eno=<%=emp.getEno()%>" onclick="return confirm('Are you sure?')">
							<img src="/images/del.jpg" width="25" height="25">									
						</a></td>		
				</tr>
			<% } %>
		</table>
		
	</body>
</html>