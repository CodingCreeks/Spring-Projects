<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>


<html>
  <head>
    <title>the c:url action (1)</title>
  </head>
  <body>
    This page takes 3 values that you specify, and forwards them to another JSP.
    That JSP will create a URL to another page, that then extracts the
    parameters and displays them.
    <p />
      <form action="createURL.jsp" method="post">
        <table>
          <tr><td>Enter name:</td>
              <td><input type="text" name="name"   /></td></tr>
          <tr><td>Enter age:</td>
              <td><input type="text" name="age"    /></td></tr>
          <tr><td>Enter gender:</td >
              <td><input type="text" name="gender" /></td></tr>
        </table>
        <input type="submit" value="Submit details" />
      </form>
  </body>
</html>