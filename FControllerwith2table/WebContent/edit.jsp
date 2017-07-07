<%@page import="com.online.model.Employee"%>
<%@page import="com.online.model.Address"%>
<%@page import="com.online.model.EmpAndAddr"%>
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
		EmpAndAddr empaddr = (EmpAndAddr) request.getAttribute("empaddress");
	%>

	<h3 align="center">Edit Employee</h3>

	<form action="updateEmployee.htm" method="post">
		<input type="hidden" name="eno" value="<%=empaddr.getEno()%>">
		<input type="hidden" name="eaid" value="<%=empaddr.getEaid()%>">
		<input type="hidden" name="aid" value="<%=empaddr.getAid()%>">

		<table align="center">
			<tr>
				<td>Number</td>
				<td><input type="text" value="<%=empaddr.getEno()%>"
					disabled="disabled" /></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="ename"
					value="<%=empaddr.getEname()%>" /></td>
			</tr>
			<tr>
				<td>Designation</td>
				<td><input type="text" name="edesignation"
					value="<%=empaddr.getEdesignation()%>" /></td>
			</tr>
			<%
				if ((empaddr.getEgender()).equals("Male")) {
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
				<td><input type="text" name="esal" value="<%=empaddr.getEsalary()%>" /></td>
			</tr>
			<tr>
				<td>User Name</td>
				<td><input type="text" name="eusername" value="<%=empaddr.getEusername()%>" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="epassword" value="<%=empaddr.getEpassword()%>"></td>
			</tr>

			<tr> <th></th> </tr>
			<tr> <th></th> </tr>
			<tr>
				<td>Street</td>
				<td><input type="text" name="street" value=<%=empaddr.getStreet()%>></td>
			</tr>
			<tr>
				<td>City</td>
				<td><input type="text" name="city" value=<%=empaddr.getCity()%>></td>
			</tr>
			<tr>
				<td>State</td>
				<td><input type="text" name="state" value=<%=empaddr.getState()%>></td>
			</tr>
			<tr>
				<td>PinCode</td>
				<td><input type="text" name="pincode" value=<%=empaddr.getPincode()%>></td>
			</tr>
			<tr>
				<td>Contact number</td>
				<td><input type="text" name="contact" value=<%=empaddr.getContact()%>></td>
			</tr>
			<tr>
				<td>email address</td>
				<td><input type="text" name="email" value=<%=empaddr.getEmail()%>></td>
			</tr>
			<tr>
				<td><input type="reset" value="Clear"></td>
				<td><input type="submit" value="Update"></td>
			</tr>
		</table>
	</form>

</body>
</html>