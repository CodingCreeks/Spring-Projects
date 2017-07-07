<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="createEmployee.asp">
<h3 align="center">Create Employee</h3>
<table align="center">
<tr><td>Employee number : </td> <td><input type="text" name=eno></td></tr>
<tr><td>Employee name : </td> <td><input type="text" name=ename></td></tr>
<tr><td>Employee Designation : </td> <td><input type="text" name=edesignation></td></tr>
<tr><td>Employee Gender : </td> <td><input type="radio" name=egender value="Male" checked="checked">Male <input type="radio" name=egender value="Female">Female</td></tr>
<tr><td>Employee Salary : </td> <td><input type="text" name=esalary></td></tr>
<tr><td>Employee UserName : </td> <td><input type="text" name=eusername></td></tr>
<tr><td>Employee Password : </td> <td><input type="password" name=epassword></td></tr>
<tr></tr>
<tr></tr>
<tr></tr>
<tr><td></td><td align="center">Address Details</td></tr>
<tr></tr>
<tr><td>Street : </td> <td><input type="text" name=street></td></tr>
<tr><td>City : </td> <td><input type="text" name=city></td></tr>
<tr><td>State : </td> <td><input type="text" name=state></td></tr>
<tr><td>ZipCode : </td> <td><input type="text" name=pincode></td></tr>
<tr><td>Contact Number : </td> <td><input type="text" name=contact></td></tr>
<tr><td>eMail Address : </td> <td><input type="text" name=email></td></tr>
<tr></tr>
<tr></tr>
<tr></tr>
<tr><td></td><td><input type="submit" value="submit"> &nbsp; &nbsp; <input type="reset" value="Clear"></td></tr>

</table>

</form>
</body>
</html>