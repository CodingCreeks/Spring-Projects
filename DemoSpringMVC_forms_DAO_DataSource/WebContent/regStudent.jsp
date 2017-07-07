<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration form</title>
</head>
<body>
	<h3 align="center">Student Registration form</h3>
	<form:form action="regStudent.do" commandName="regStudentform">
		<table align="center">
			<tr>
				<td>Roll No :</td>
				<td><form:input path="rollno" type="text" /></td>
			</tr>
			<tr>
				<td>Name :</td>
				<td><form:input path="name" type="text" /></td>
			</tr>
			<tr>
				<td>Course :</td>
				<td><form:input path="course" type="text" /></td>
			</tr>
			<tr>
				<td>College :</td>
				<td><form:input path="college" type="text" /></td>
			</tr>
			<tr>
				<td>University :</td>
				<td><form:input path="university" type="text" /></td>
			</tr>
			<tr>
				<td></td>
				<td colspan="2"><input type="submit" value="Submit" /> <nobr></nobr>
					<input type="reset" value="Clear" /></td>
			</tr>
		</table>

	</form:form>
</body>
</html>