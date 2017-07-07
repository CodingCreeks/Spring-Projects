<%@page import="com.online.model.Employee"%>
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

	<%
		String user = (String) session.getAttribute("user");
	%>
	<h4 align="right">
		Welcome
		<%=user%>&nbsp;<a href="logout">logout</a>
	</h4>

	<%
		List<Employee> employees = (List<Employee>) request.getAttribute("listOfEmployees");
	%>

	<h3 align="center">List of Employees</h3>
	<table align="center" border="1">
		<tr>
			<th>Number</th>
			<th>Name</th>
			<th>Gender</th>
			<th>Designation</th>
			<th>Salary</th>
			<th></th>
			<th></th>
		</tr>
		<%
			for (Employee emp : employees) {
		%>
		<tr>
		<tr>
			<td><%=emp.geteNo()%></td>
			<td><%=emp.geteName()%></td>
			<td><%=emp.geteGender()%></td>
			<td><%=emp.geteDesignation()%></td>
			<td><%=emp.geteSalary()%></td>
			<td><a href="getDataForEdit?eno=<%=emp.geteNo()%>"> <img
					src="images/edit.png" width="20" height="20">
			</a></td>
			<td><a href="DeleteServelet?eno=<%=emp.geteNo()%>"
				onclick="return confirm('Are you sure?')"> <img
					src="images/del.png" width="20" height="20">
			</a></td>
		</tr>
		<%
			}
		%>
	</table>

</body>
</html>