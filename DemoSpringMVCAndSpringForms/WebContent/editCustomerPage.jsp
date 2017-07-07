<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3 align="center">Edit Customer</h3>
	
	<form:form action="updateCustomerDetails.asp" commandName="editcustomer">
		<table align="center">
			<tr>
				<td>Customer Number :</td>
				<%-- <form:hidden path="cnum"/> --%>
				<%-- <td><form:input  path="cnum" value="${editcustomer.cnum}" disabled="true"/></td> --%>
				<td><form:input path="cnum" value="${editcustomer.cnum}" /></td>
			</tr>
			<tr>
				<td>Title :</td>
				<td><form:input path="ctitle" type="text" value="${editcustomer.ctitle}" /></td>
			</tr>
			<tr>
				<td>First name :</td>
				<td><form:input path="cfirstname" type="text" value="${editcustomer.cfirstname}" /></td>
			</tr>
			<tr>
				<td>Last name :</td>
			<%-- 	<td><c:out value="${editcustomer.clastname}"/></td>
				<td>${editcustomer.clastname}</td> --%>
				<td><form:input path="clastname" type="text" value="${editcustomer.clastname}" /></td>
			</tr>
			<%-- <form:option value="${editcustomer.cgender}"></form:option> --%>
			<tr><td><form:radiobutton path="cgender" value="${editcustomer.cgender}"/>Male<nobr></nobr> 
					<form:radiobutton path="cgender" value="${editcustomer.cgender}"/>Female</td></tr>

		<%-- 	<c:choose>
				<c:when test="${editcustomer.egender=='Male'}">
					<tr>
						<td>Gender :</td>
					<td><form:radiobutton path="cgender" value="Male" checked="checked"/>Male<nobr></nobr> 
					<form:radiobutton path="cgender" value="Female"/>Female</td>
					</tr>
				</c:when>
				<c:otherwise>
					<tr>
						<td>Gender :</td>
						<td><form:radiobutton path="cgender" value="Male" />Male
						<form:radiobutton path="cgender" value="Female" checked="checked" />Female</td>
					</tr>
				</c:otherwise>
			</c:choose> --%>
			<tr>
				<td>Birth Date :</td>
				<td><form:input path="cdob" type="text" value="${editcustomer.cdob}" /></td>
			</tr>
			<tr>
				<td>Company :</td>
				<td><form:input path="ccompany" type="text" value="${editcustomer.ccompany}" /></td>
			</tr>
			<tr>
				<td>Address :</td>
				<td><form:input path="caddress" type="text" value="${editcustomer.caddress}"/></td>
			</tr>
			<tr>
				<td>WebSite :</td>
				<td><form:input path="cwebsite" type="text" value="${editcustomer.cwebsite}"/></td>
			</tr>
			<tr>
				<td>UserName :</td>
				<td><form:input path="cusername" type="text" value="${editcustomer.cusername}"/></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><form:input path="cpassword" type="password" value="${editcustomer.cpassword}"/></td>
			</tr>
			<tr>
				<th></th>
			</tr>
			<tr>
				<th></th>
			</tr>
			<tr>
		
			<tr>
				<td><input type="reset" value="Clear"></td>
				<td><input type="submit" value="Update"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>