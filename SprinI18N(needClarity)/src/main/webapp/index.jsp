<%@page
	import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="java.util.Locale"%>
<%
	String lang = request.getHeader("accept-Language");
	Locale locale = new Locale(lang);
	ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
	String value = ap.getMessage("Lable", null, locale);
%>
<form action="/.hello">
	<%=value%>:<input type="text" name="name" /> <input type="submit"
		value="Submit" />
</form>
