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
	<h3 align="center" style="border-color: Grey">View Employees records</h3>
	<h5 align="right">
		Welcome ${user} &nbsp; <a href="logout.asp">logout</a>
	</h5>
	<form action="getAllEmployees.asp">
		<table align="center" border="1" bordercolor="blue" bgcolor="lightblue" style="border-style: dashed; border: thin; ">
			<tr>
				<th>Number</th>
				<th>Name</th>
				<th>Designation</th>
				<th>Gender</th>
				<th>Salary</th>
				<th>UserName</th>
				<th>Street</th>
				<th>City</th>
				<th>State</th>
				<th>ZipCode</th>
				<th>Contact Number</th>
				<th>eMail Address</th>
				<th></th>
				<th></th>
			</tr>
			<c:forEach items="${listOfEmpAndAddress}" var="listofemp">
				<tr>
					<td style="border-style: thin">${listofemp.eno}</td>
					<td>${listofemp.ename}</td>
					<td>${listofemp.edesignation}</td>
					<td>${listofemp.egender}</td>
					<td>${listofemp.esalary}</td>
					<td>${listofemp.eusername}</td>
					<td>${listofemp.street}</td>
					<td>${listofemp.city}</td>
					<td>${listofemp.state}</td>
					<td>${listofemp.pincode}</td>
					<td>${listofemp.contact}</td>
					<td>${listofemp.email}</td>
					<td><a href="getEmployeeDataForEdit.asp?eno=${listofemp.eno}"> <img
							src="src/images/edit.png" width="25" height="25"></a></td>
					<td><a href="removeEmployeedetails.asp?eno=${listofemp.eno}"
						onclick="return confirm('Are you sure?')"> <img
							src="<c:url value='images/del.png'/>" width="25" height="25"></a></td>
				</tr>
			</c:forEach>
		</table>
		<h6 align="right"><a href="homePage.jsp">Goto Home Page</a></h6>
		<h6 align="right"> 	<a href="addEmployee.jsp">Add Employee</a></h6>
	</form>
</body>
</html>