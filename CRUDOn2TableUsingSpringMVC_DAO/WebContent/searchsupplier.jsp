<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Searched Supplier Details</title>
<style>
#foo {
	position: fixed;
	bottom: 0;
	right: 0;
}

#topcorner {
	position: fixed;
	top: 0;
	right: 0;
}

#topcorner2 {
	position: fixed;
	top: 50;
	right: 0;
}

#tablecorner {
	position: fixed;
	top: 0;
	right: 0;
}

table #t01 {
	color: red;
	width: 100%;
}

th {
	font-family: verdana;
	text-align: center;
	font-size: 70%;
}

td {
	font-family: cursive;
	text-align: left;
	font-size: 70%;
}

h3 {
	color: teal;
	font-family: verdana;
	font-size: 150%;
}

table#t01 tr:nth-child(even) {
	background-color: #eee;
}

table#t01 tr:nth-child(odd) {
	background-color: #fff;
}

table#t01 th {
	color: white;
	background-color: teal;
}

th, td {
	padding: 5px;
}

table#t01, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

table#t02, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

input#image-button {
	background: #ccc url('images/Edit.png') no-repeat top left;
	padding-left: 16px;
	height: 16px;
}
</style>
</head>
<body>
	<div id="topcorner">
		<h5 style="color: green;">
			Welcome ${user}&nbsp;&nbsp;<a href="logoutsupplier.sbc"
				Title="logout" style="color: red;">Logout</a>
		</h5>
	</div>
	<div>
		<h3>View searched Supplier Details</h3>
	</div>
	<h5>${message}</h5>
	<form:form>
		<table align="right" style="border-color: white;" id="table05">
			<tr>
				<td><a href="supplierhomepage.jsp" Title="Goto Home Page"
					onfocus="focus()"><img src="<c:url value='images/Home.png'/>"
						width="20" height="20"> </a></td>
				<td><a href="showaddsupplier.sbc" Title="Add Supplier"><img
						src="<c:url value='images/user-group-new.png'/>" width="20"
						height="20"></a></td>
			</tr>
		</table>
	</form:form>
	<form:form commandName="searchsuppliercmd">
		<table align="center" border="1" style="width: 100%" id="t01">
			<tr>
				<th>Supplier ID</th>
				<th>Company Name</th>
				<th>Contact Name</th>
				<th>Contact Job Title</th>
				<th>Address</th>
				<th>City</th>
				<th>State</th>
				<th>Country</th>
				<th>Postal Code</th>
				<th>Phone(Office)</th>
				<th>FAX</th>
				<th>Email</th>
				<th>Password</th>
				<th colspan="2">User Actions</th>
			</tr>
				<tr>
					<td width="10">${searchsuppliercmd.supplierID}</td>
					<td>${searchsuppliercmd.companyName}</td>
					<td>${searchsuppliercmd.contactName}</td>
					<td>${searchsuppliercmd.contactJobTitle}</td>
					<td>${searchsuppliercmd.address}</td>
					<td>${searchsuppliercmd.city}</td>
					<td>${searchsuppliercmd.state}</td>
					<td>${searchsuppliercmd.country}</td>
					<td width="20">${searchsuppliercmd.postalcode}</td>
					<td>${searchsuppliercmd.phoneoffice}</td>
					<td>${searchsuppliercmd.fax}</td>
					<td>${searchsuppliercmd.email}</td>
					<td>${searchsuppliercmd.username}</td>
					<td width="15"><a
						href="getsupplierDataForEdit.sbc?supplierID=${searchsuppliercmd.supplierID}"
						title="Edit"><img src="<c:url value='images/Edit.png'/>"
							width="15" height="15"></a></td>
					<td width="15"><a
						href="removesupplier.sbc?supplierID=${searchsuppliercmd.supplierID}"
						onclick="return confirm('Are you sure?')" title="Delete"> <img
							src="<c:url value='images/Remove.png'/>" width="15" height="15">
					</a></td>
				</tr>
		</table>
	</form:form>
</body>
</html>