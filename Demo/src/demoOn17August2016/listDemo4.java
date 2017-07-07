package demoOn17August2016;

import java.util.LinkedList;
import java.util.List;

public class listDemo4 {

	public static void main(String[] args) {
		
		List<Employee> l4=new LinkedList<Employee>();
		Employee emp=new Employee(100, "Raju");
		l4.add(emp);
				
		l4.add(new Employee(200, "Sanju"));
		l4.add(new Employee(150, "Suraj"));
		l4.add(new Employee(102, "Anish"));
	
		System.out.println(l4);
	}

}
