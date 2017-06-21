<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employees List</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<style type="text/css">
.myrow-container {
	margin: 20px;
}
</style>
</head>
<body class=".container-fluid">
	<div class="container myrow-container">
		<div class="panel-heading">
			<h3 class="panel-title" align="center">
				<b>Employees List</b>
			</h3>
			<form action="createEmployee">
				<input type="submit" value="Add Employee ?">
			</form>
		</div>
		<div class="panel-body">
			<c:if test="${empty employeeList}">
                There are no Employees
            </c:if>
			<c:if test="${not empty employeeList}">

				<form action="searchEmployee">
					<div class="row">
						<div class="col-md-4">
							Search Employees: <input type='text' name='searchName'
								id='searchName' />
						</div>
						<div class="col-md-4">
							<input class="btn btn-success" type='submit' value='Search' />
						</div>
					</div>
				</form>

				<table class="table table-hover table-bordered">
					<thead style="background-color: gray;">
						<tr>
							<th>Id</th>
							<th>Name</th>
							<th>Age</th>
							<th>Salary</th>
							<th>Edit</th>
							<th>Delete</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${employeeList}" var="emp">
							<tr>
								<th><c:out value="${emp.id}" /></th>
								<th><c:out value="${emp.name}" /></th>
								<th><c:out value="${emp.age}" /></th>
								<th><c:out value="${emp.salary}" /></th>
								<th><a href="editEmployee?id=<c:out value='${emp.id}'/>">Edit</a></th>
								<th><a href="deleteEmployee?id=<c:out value='${emp.id}'/>">Delete</a></th>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</c:if>
		</div>
	</div>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</html>