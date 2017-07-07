<%@page import="com.online.employeemodel.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	</head>
	<body>
	
	<% List<Employee> employees =(List<Employee>) request.getAttribute("listofEmployeees"); %>
	<h2> List of Employees</h2>
	<hr>
	<table align="center" Border="1">
	<tr>
		<th> Number	</th>
		<th> Name	</th>
		<th> Gender	</th>
		<th> Salary	</th>
		<th> Designation</th>
		<th> </th>
		<th> </th>
		
	</tr>
	
	<% for(Employee emp: employees) {%>
		<tr>
			<td> <%= emp.geteNo()  %> </td>
			<td> <%= emp.geteName()  %> </td>
			<td> <%= emp.geteGender()  %> </td>
			<td> <%= emp.geteSalary()  %> </td>
			<td> <%= emp.geteDesignation()  %> </td>
			<td> <a href="****">Edit</a></td>
			<td> <a href="****">Delete</a></td>
		
		 </tr>
	<% }%>	
	</table>
	
	
	</body>
</html>