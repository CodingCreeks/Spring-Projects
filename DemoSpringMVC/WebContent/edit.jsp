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
	<h3 align="center">Edit Employee</h3>

	<form action="updateEmployee.htm" method="post">
		<input type="hidden" name="eno" value="${empaddress.eno}">
		<input type="hidden" name="eaid" value="${empaddress.eaid}">
		<input type="hidden" name="aid" value="${empaddress.aid}">

		<table align="center">
			<tr><td>Number</td><td><input type="text" value="${empaddress.eno}" disabled="disabled" /></td></tr>
			<tr><td>Name</td><td><input type="text" name="ename" value="${empaddress.ename}" /></td></tr>
			<tr><td>Designation</td><td><input type="text" name="edesignation" value="${empaddress.edesignation}" /></td></tr>
			
		<c:choose>
			<c:when test="${empaddress.egender=='Male'}">
			<tr><td>Gender</td><td><input type="radio" name="egender" value="Male" checked="checked" />Male 
								   <input type="radio" name="egender" value="Female" />Female</td></tr>
			</c:when>
			<c:otherwise>
			<tr><td>Gender</td><td><input type="radio" name="egender" value="Male" />Male 
								   <input type="radio" name="egender" value="Female" checked="checked" />Female</td></tr>
			</c:otherwise>
		</c:choose>

			<tr><td>Salary</td><td><input type="text" name="esal" value="${empaddress.esalary}" /></td> </tr>
			<tr><td>User Name</td><td><input type="text" name="eusername" value="${empaddress.eusername}" /></td>
			</tr><tr><td>Password</td><td><input type="password" name="epassword" value="${empaddress.epassword}"></td></tr>
			<tr> <th></th> </tr>
			<tr> <th></th> </tr>
			<tr><td>Street</td><td><input type="text" name="street" value="${empaddress.street}"></td></tr>
			<tr><td>City</td><td><input type="text" name="city" value="${empaddress.city}"></td></tr>
			<tr><td>State</td><td><input type="text" name="state" value="${empaddress.state}"></td></tr>
			<tr><td>PinCode</td><td><input type="text" name="pincode" value="${empaddress.pincode}"></td></tr>
			<tr><td>Contact number</td><td><input type="text" name="contact" value="${empaddress.contact}"></td></tr>
			<tr><td>email address</td><td><input type="text" name="email" value="${empaddress.email}"></td></tr>
			<tr><td><input type="reset" value="Clear"></td><td><input type="submit" value="Update"></td></tr>
		</table>
	</form>

</body>
</html>