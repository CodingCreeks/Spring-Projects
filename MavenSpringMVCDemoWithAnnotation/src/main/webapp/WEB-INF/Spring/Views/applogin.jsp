<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>${message} App User Login Details</legend>

		<h5 style="color: red;">
			<form:errors path="apploginform.*" />
		</h5>

		<form:form action="appUserSearch.sp" commandName="apploginform">
			<table>
				<tbody>
					<tr>
						<td><label>Name :</label></td>
						<td><form:input path="name" /></td>
					</tr>
					<tr>
						<td><label>Age :</label></td>
						<td><form:input path="age" /></td>
					</tr>
					<tr>
						<td><label>Email :</label></td>
						<td><form:input path="email" /></td>
					</tr>
					<tr>
						<td></td>
						<td><input type="submit" value="Submit"></td>
					</tr>
				</tbody>

			</table>
		</form:form>
	</fieldset>
</body>
</html>