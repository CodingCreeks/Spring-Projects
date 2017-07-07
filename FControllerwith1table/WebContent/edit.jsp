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
		<%=user%>&nbsp;<a href="logout.htm">logout</a>
	</h4>

	<%
		Employee employee = (Employee) request.getAttribute("emp");
	%>
	<h3 align="center">Edit Employee</h3>

	<form action="updateEmployee.htm" method="post">
		<input type="hidden" name="eno" value="<%=employee.getEno()%>">

		<table align="center">
			<tr>
				<td>Number</td>
				<td><input type="text" value="<%=employee.getEno()%>"
					disabled="disabled" /></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="ename"
					value="<%=employee.getEname()%>" /></td>
			</tr>
			<tr>
				<td>Designation</td>
				<td><input type="text" name="edesignation"
					value="<%=employee.getEdesignation()%>" /></td>
			</tr>
			<%
				if ((employee.getEgender()).equals("Male")) {
			%>
			<tr>
				<td>Gender</td>
				<td><input type="radio" name="egender" value="Male"
					checked="checked" />Male <input type="radio" name="egender"
					value="Female" />Female</td>
			</tr>
			<%
				} else {
			%>
			<tr>
				<td>Gender</td>
				<td><input type="radio" name="egender" value="Male" />Male <input
					type="radio" name="egender" value="Female" checked="checked" />Female</td>
			</tr>
			<%
				}
			%>

			<tr>
				<td>Salary</td>
				<td><input type="text" name="esal"
					value="<%=employee.getEsalary()%>" /></td>
			</tr>
			<tr>
				<td>User Name</td>
				<td><input type="text" name="eusername"
					value="<%=employee.getEusername()%>" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="epassword"
					value="<%=employee.getEpassword()%>"></td>
			</tr>

			<tr>
				<th></th>
			</tr>
			<tr>
				<th></th>
			</tr>
			<tr>
				<td>Street</td>
				<td><input type="text" name="street"
					value=<%=employee.getStreet()%>></td>
			</tr>
			<tr>
				<td>City</td>
				<td><input type="text" name="city"
					value=<%=employee.getCity()%>></td>
			</tr>
			<tr>
				<td>State</td>
				<td><input type="text" name="state"
					value=<%=employee.getState()%>></td>
			</tr>
			<tr>
				<td>PinCode</td>
				<td><input type="text" name="pincode"
					value=<%=employee.getPincode()%>></td>
			</tr>
			<tr>
				<td>Contact number</td>
				<td><input type="text" name="contact"
					value=<%=employee.getContact()%>></td>
			</tr>
			<tr>
				<td>email address</td>
				<td><input type="text" name="email"
					value=<%=employee.getEmail()%>></td>
			</tr>
			<tr>
				<td><input type="reset" value="Clear"></td>
				<td><input type="submit" value="Update"></td>
			</tr>
		</table>
	</form>

</body>
</html>