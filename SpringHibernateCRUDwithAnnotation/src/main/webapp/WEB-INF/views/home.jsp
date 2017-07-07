<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
<link rel='stylesheet' href='<c:url value="/resources/css/style.css" />'
	type='text/css' media='all' />
</head>
<body>
	<h1>Spring MVC, Hibernate, MySQL and Maven with Java Configuration
		in Eclipse</h1>
	<!-- Spring4 -->
	<P>The time on the server is ${serverTime}.</P>
	<div>
		<fieldset>
			<legend>User Login:</legend>
			<form:form action="searchUser.sp" commandName="userform">
				<table>
					<tr>
						<td><label>User Name :</label></td>
						<td><form:input type="text" path="name" /></td>
					</tr>
					<tr>
						<td><label>Email :</label></td>
						<td><form:input type="text" path="email" /></td>
					</tr>
					<tr>
						<td></td>
						<td><input type="submit" value="submit"></td>
						<td><a href="createUser.sp">new User?</a></td>
					</tr>
				</table>
			</form:form>
		</fieldset>
	</div>
</body>
</html>
