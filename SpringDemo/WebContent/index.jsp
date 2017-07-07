<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Company Login</h1>
	<form action="homePage.do">
		<table>
			<tr>
				<td><label>User Name : </label></td>
				<td><input name="user" type="text"></td>
			</tr>
			<tr>
				<td><label>Password : </label></td>
				<td><input name="password" type="text"></td>
			</tr>
			<tr></tr>
			<tr>
				<td></td>
				<td><button type="submit">Submit</button></td>
			</tr>
			<tr>
				<td></td>
				<td><a href="newUser.do">New User?</a></td>
			</tr>
		</table>
	</form>
</body>
</html>