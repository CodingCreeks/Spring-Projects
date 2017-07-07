package demoOn17August2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class listDemo2 {

	public static void main(String[] args) {
				
		List<String> l2=new ArrayList<String>(); // Homogeneous type of String
		//l2.add(1000); //The method add(int, String) in the type List<String> is not applicable for the arguments (int)
		l2.add("Red");
		l2.add("Green");
		l2.add("Blue");
		System.out.println(l2);
		Collections.sort(l2);
		System.out.println(l2);
	}

}
