<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login</title>
</head>
<body>
	<h3 align="center">Student login</h3>
	<form:form action="checkStudent.do" commandName="loginStudentform">
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
				<td></td>
				<td><input type="submit" value="submit" /> <input type="reset"
					value="clear" /></td>
			</tr>

			<tr>
				<td></td>
				<td><a href="showregstudent.do">RegisterStudent?</a></td>
			</tr>
		</table>
	</form:form>
</body>
</html>