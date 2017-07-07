<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h4 align="right">
		Welcome
		<c:out value="${user}"></c:out>
		&nbsp;<a href="logout.htm">logout</a>
	</h4>
	<h3 align="center">Edit Employee</h3>

	
	<form action="updateEmployeeDetails.asp">
	<input name="eno" type="hidden" value="${empdetailsaddress.eno}">
		<table align="center">
			<tr>
				<td>Employee Number</td>
				<td><input type="text" value="${empdetailsaddress.eno}"
					disabled="disabled" /></td>
			</tr>
			<tr>
				<td>Employee Name</td>
				<td><input type="text" name="ename"
					value="${empdetailsaddress.ename}" /></td>
			</tr>
			<tr>
				<td>Employee Designation</td>
				<td><input type="text" name="edesignation"
					value="${empdetailsaddress.edesignation}" /></td>
			</tr>

			<c:choose>
				<c:when test="${empdetailsaddress.egender=='Male'}">
					<tr>
						<td>Employee Gender</td>
						<td><input type="radio" name="egender" value="Male"
							checked="checked" />Male <input type="radio" name="egender"
							value="Female" />Female</td>
					</tr>
				</c:when>
				<c:otherwise>
					<tr>
						<td>Employee Gender</td>
						<td><input type="radio" name="egender" value="Male" />Male <input
							type="radio" name="egender" value="Female" checked="checked" />Female</td>
					</tr>
				</c:otherwise>
			</c:choose>

			<tr>
				<td>Employee Salary</td>
				<td><input type="text" name="esalary"
					value="${empdetailsaddress.esalary}" /></td>
			</tr>
			<tr>
				<td>Employee User Name</td>
				<td><input type="text" name="eusername"
					value="${empdetailsaddress.eusername}" /></td>
			</tr>
			<tr>
				<td>Employee Password</td>
				<td><input type="password" name="epassword"
					value="${empdetailsaddress.epassword}"></td>
			</tr>
			<tr>
				<th></th>
			</tr>
			<tr>
				<th></th>
			</tr>
			<tr>
				<td align="center">Employee Address Details</td>
			</tr>
			<tr>
				<td>Street</td>
				<td><input type="text" name="street"
					value="${empdetailsaddress.street}"></td>
			</tr>
			<tr>
				<td>City</td>
				<td><input type="text" name="city"
					value="${empdetailsaddress.city}"></td>
			</tr>
			<tr>
				<td>State</td>
				<td><input type="text" name="state"
					value="${empdetailsaddress.state}"></td>
			</tr>
			<tr>
				<td>PinCode</td>
				<td><input type="text" name="pincode"
					value="${empdetailsaddress.pincode}"></td>
			</tr>
			<tr>
				<td>Contact number</td>
				<td><input type="text" name="contact"
					value="${empdetailsaddress.contact}"></td>
			</tr>
			<tr>
				<td>email address</td>
				<td><input type="text" name="email"
					value="${empdetailsaddress.email}"></td>
			</tr>
			<tr>
				<td><input type="reset" value="Clear"></td>
				<td><input type="submit" value="Update"></td>
			</tr>
		</table>
	</form>
</body>
</html>