import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
	
	
@RequestMapping
public String createURL(HttpServletRequest request){
	
/*	String name;
	int Age;
	String Gender;
	*/
	return "createURL.jsp";
	}
}
