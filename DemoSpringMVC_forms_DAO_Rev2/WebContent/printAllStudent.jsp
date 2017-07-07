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
	<h4 align="center">-Student Details-</h4>
	<h5 align="right">
		Welcome ${user} &nbsp;<a href="logoutStudent.do">logout</a>
	</h5>
	<form:form commandName="printAllStudentform">
		<table align="center" border="1">
			<tr>
				<th>Roll Number</th>
				<th>Name</th>
				<th>Course</th>
				<th>College</th>
				<th>University</th>
				<th></th>
				<th></th>
			</tr>
			<c:forEach items="${studentslist}" var="slist">
				<tr>
					<td>${slist.rollno}</td>
					<td>${slist.name}</td>
					<td>${slist.course}</td>
					<td>${slist.college}</td>
					<td>${slist.university}</td>
					<td><a href="getStudentDataForEdit.do?rollno=${slist.rollno}">
							<img src=<c:url value='images/edit.png'/> width="25" height="25">
					</a></td>
					<td><a href="removeStudent.do?rollno=${slist.rollno}"
						onclick="return confirm('Are you sure?')"> <img
							src="<c:url value='images/del.png'/>" width="25" height="25"></a></td>
				</tr>
			</c:forEach>
		</table>
		<h6 align="right">
			<a href="view.jsp">Goto Home Page</a>
		</h6>
	</form:form>
</body>
</html>