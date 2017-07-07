<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h4 align="center">-Edit Student-</h4>
	<h5 align="right">
		Welcome ${user}&nbsp;<a href="logoutStudent.do">logout</a>
	</h5>
	<form:form action="updateStudent.do" commandName="editStudentform">
		<table align="center" border="1">
			<tr>
				<td>Roll Number :</td>
				<td><form:input path="rollno" value="${editStudentform.rollno}" /></td>
			</tr>
			<tr>
				<td>Name :</td>
				<td><form:input path="name" value="${editStudentform.name}" /></td>
			</tr>
			<tr>
				<td>Course :</td>
				<td><form:input path="course" value="${editStudentform.course}" /></td>
			</tr>
			<tr>
				<td>College :</td>
				<td><form:input path="college"
						value="${editStudentform.college}" /></td>
			</tr>
			<tr>
				<td>University :</td>
				<td><form:input path="university"
						value="${editStudentform.university}" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Update" /> <nobr></nobr><input
					type="reset" value="Clear" /></td>
			</tr>
		</table>

	</form:form>

</body>
</html>