<%@page import="com.online.model.Employee"%>
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
		Employee employee = (Employee) request.getAttribute("employee");
	%>

	<h2 align="center">Edit Employee Details</h2>
	<hr>
	<form action="updateEmployee" method="post" name="EditRecord">
		<input type="hidden" name="eNo" value="<%=employee.geteNo()%>">
		<table align="center">
			<tr>
				<td><label>Employee No : </label></td>
				<td><input type=text size="30" value="<%=employee.geteNo()%>"
					disabled="disabled" /></td>
			</tr>
			<tr>
				<td><label>Employee Name :</label></td>
				<td><input type=text name="eName" size="30"
					value="<%=employee.geteName()%>" /></td>
			</tr>

			<%
				if ((employee.geteGender()).equals("Male")) {
			%>

			<tr>
				<td><label>Employee Gender :</label></td>
				<td><input type=radio name=eGender value="Male" checked />Male
					<input type=radio name=eGender value="Female" />Female</td>
			</tr>
			<%
				} else {
			%>
			<tr>
				<td><label>Employee Gender :</label></td>
				<td><input type=radio name=eGender value="Male" />Male <input
					type=radio name=eGender value="Female" checked />Female</td>
			</tr>

			<%
				}
			%>
			<tr>
				<td><label>Employee Designation :</label></td>
				<td><input type=text name="eDesignation" size="30"
					value="<%=employee.geteDesignation()%>"></td>
			</tr>
			<tr>
				<td><label>Employee Salary :</label></td>
				<td><input type=text name="eSalary" size="30"
					value="<%=employee.geteSalary()%>" /></td>
			</tr>
			<tr>
				<td><label>Employee Password :</label></td>
				<td><input type="password" name="ePassword" size="30"
					value="<%=employee.getePassword()%>"></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td><input type="submit" value="Update"></td>
				<td><input type="reset" value="Clear"></td>
			</tr>
		</table>
	</form>
</body>
</html>