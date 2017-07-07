<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>New User</h1>
	<form action="creatUser.do">
		<table>
			<tr>
				<td><label>User Name : </label></td>
				<td><input name="user" type="text"></td>
			</tr>
			<tr>
				<td><label>Password : </label></td>
				<td><input name="password" type="text"></td>
			</tr>
			<tr><td><button type="submit">Submit</button></td></tr>
		</table>
	</form>
</body>
</html>