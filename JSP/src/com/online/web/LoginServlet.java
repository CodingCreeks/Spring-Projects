	package com.online.web;

	import java.io.IOException;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	import com.online.dao.EmployeeDAO;
	import com.online.model.Employee;

	@WebServlet("/loginServlet")
	public class LoginServlet extends HttpServlet {
		private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			String eName=request.getParameter("eName");
			String ePassword=request.getParameter("ePassword");
			EmployeeDAO eDao= new EmployeeDAO();
			Employee employee=new Employee();
			employee.seteName(eName);
			employee.setePassword(ePassword);
			boolean flag=eDao.checkEmployee(employee);
			if(flag)
				response.sendRedirect("HomePage.jsp? message="+eName);
			else
				response.sendRedirect("LoginPage.jsp?message=Invalid%20Credentials"); //%20 is for providing the space between the words
	}
}

