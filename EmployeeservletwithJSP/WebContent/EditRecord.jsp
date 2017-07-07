<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="background-color:Block;color:white;padding:0px;">
	<h2 align="center">Add Employee Table</h2>
	<hr>
</div>
	<form action="EditRecord.htm" method="post" name="EditRecord" >
	
	<table>
			<tr> <td> <label>Employee Id : </label></td>
				 <td> <input type=text Name="eId"size="30"/> </td>
			</tr>
			<tr> <td> <label>Employee Name :</label></td>
				 <td> <input type=text Name="eName"size="30"/></td>
			</tr>
	
			<tr>
				<td><label>Employee Gender :</label></td>
				<td><input type=radio name=eGender value="Male" checked/>Male 
					<input type=radio name=eGender value="Female"/>Female </td>
			</tr>
	
			<tr>
				<td><label>Employee Salary :</label></td>
				<td><input type=text name="eSalary" size="30"/></td>
			</tr>
			<tr>
				<td><label>Employee Designation :</label></td>
				<td><input type=text Name="eDesignation" size="30"></td>
			</tr>
			<tr>
				<td><label>Employee Password :</label></td>
				<td><input type="password" Name="ePassword" size="30"></td>
			</tr>	
	</table>
	<br> <br>
		<input type="submit" value="Submit">
		<input type="reset" value="Clear">
	</form>
</body>
</html>