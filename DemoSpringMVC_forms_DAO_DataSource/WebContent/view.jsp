<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3 align="center">Welcome to Student Home Page</h3>
	<h5 align="right">
		Welcome ${user}&nbsp;<a href="logoutStudent.do" title="logout">logout</a>
	</h5>
	<h4 align="left">
		<a href="printAllStudent.do">View All Students</a> &nbsp; <a
			href="showaddStudent.do">Add Student</a>
	</h4>
</body>
</html>