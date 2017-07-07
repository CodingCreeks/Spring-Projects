<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3 align="center">Add Employee</h3>
	<h4 align="center" style="color: red"><c:out value="${message}"></c:out></h4>
		<form action="create.htm" method="post">
			<table align="center">
				<tr><td>Number</td><td><input type="text" name="eno"></td></tr>
				<tr><td>Name</td><td><input type="text" name="ename"></td></tr>
				<tr><td>Designation</td><td><input type="text" name="edesignation"></td></tr>
				<tr><td>Gender</td><td><input type="radio" name="egender" value="Male" checked >Male
									   <input type="radio" name="egender" value="Female">Female</td></tr>
				<tr><td>Salary</td><td><input type="text" name="esal"></td></tr>
				<tr><td>User Name</td><td><input type="text" name="eusername"></td></tr>
				<tr><td>Password</td><td><input type="password" name="epassword"></td></tr>
				<tr><th></th></tr>
				<tr><th></th></tr>
				<tr><td>Street</td><td><input type="text" name="street"></td></tr>
				<tr><td>City</td><td><input type="text" name="city"></td></tr>
				<tr><td>State</td><td><input type="text" name="state"></td></tr>
				<tr><td>PinCode</td><td><input type="text" name="pincode"></td></tr>
				<tr><td>Contact number</td><td><input type="text" name="contact"></td></tr>
				<tr><td>email address</td><td><input type="text" name="email"></td></tr>
				<tr><td><input type="reset" value="Clear"></td><td><input type="submit" value="Create"></td></tr>
			</table>
		</form>
</body>
</html>