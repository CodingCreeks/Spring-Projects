<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Suppliers Details</title>
<style>
#topcorner1 {
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

table#table05, th, td {
	border-collapse: collapse;
	border-color: white;
}

input#image-button {
	background: #ccc url('images/Edit.png') no-repeat top left;
	padding-left: 16px;
	height: 16px;
}

#search-text-input {
	border-top: thin solid #e5e5e5;
	border-right: thin solid #e5e5e5;
	border-bottom: 0;
	border-left: thin solid #e5e5e5;
	box-shadow: 0px 1px 1px 1px #e5e5e5;
	float: left;
	height: 15px;
	margin: .8em 0 0 .5em;
	outline: 0;
	padding: .4em 0 .4em .6em;
	width: 183px;
}

#button-holder {
	background-color: #f1f1f1;
	border-top: thin solid #e5e5e5;
	box-shadow: 1px 1px 1px 1px #e5e5e5;
	cursor: pointer;
	float: left;
	height: 25px;
	margin: 11px 0 0 0;
	text-align: center;
	width: 50px;
}

#button-holder img {
	margin: 5px;
	width: 15px;
}
</style>
</head>
<body>
	<div id="topcorner1">
		<h5 style="color: green;">
			Welcome ${user}&nbsp;&nbsp;<a href="logoutsupplier.sbc"
				Title="logout" style="color: red;">Logout</a>
		</h5>
	</div>
	<div>
		<h3>Suppliers List...</h3>
	</div>
	<div>
		<c:if test="${message !=null}">
			<h4 align="center" style="color: red">
				<c:out value="${searchsupplierscmd.supplierID} ${message}"></c:out>
			</h4>
		</c:if>
	</div>
	<form:form action="searchsupplierid.sbc"
		commandName="searchsupplierscmd">
		<table align="right" style="border-color: white;" id="table05">
			<tr>
				<td><a href="supplierhomepage.jsp" Title="Goto Home Page"
					onfocus="focus()"><img src="<c:url value='images/Home.png'/>"
						width="20" height="20"> </a></td>
				<td><a href="showaddsupplier.sbc" Title="Add Supplier"><img
						src="<c:url value='images/user-group-new.png'/>" width="20"
						height="20"></a></td>
				<td>
					<div>
						<form:input path="supplierID" type="text"
							placeHolder="Search....." />
						<input type="submit" value="Search..." />
					</div>

				</td>
			</tr>
		</table>
	</form:form>
	<form:form commandName="viewallsupplierscmd">
		<div>
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
				<c:forEach items="${supplierslist}" var="slist">
					<tr>
						<td width="10">${slist.supplierID}</td>
						<td>${slist.companyName}</td>
						<td>${slist.contactName}</td>
						<td>${slist.contactJobTitle}</td>
						<td>${slist.address}</td>
						<td>${slist.city}</td>
						<td>${slist.state}</td>
						<td>${slist.country}</td>
						<td width="20">${slist.postalcode}</td>
						<td>${slist.phoneoffice}</td>
						<td>${slist.fax}</td>
						<td>${slist.email}</td>
						<td>${slist.username}</td>
						<td width="15"><a
							href="getsupplierDataForEdit.sbc?supplierID=${slist.supplierID}"
							title="Edit"><img src="<c:url value='images/Edit.png'/>"
								width="15" height="15"></a></td>
						<td width="15"><a
							href="removesupplier.sbc?supplierID=${slist.supplierID}"
							onclick="return confirm('Are you sure?')" title="Delete"> <img
								src="<c:url value='images/Remove.png'/>" width="15" height="15">
						</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</form:form>
</body>
</html>