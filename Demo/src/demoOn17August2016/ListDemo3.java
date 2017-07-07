package demoOn17August2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo3 {

	public static void main(String[] args) {
				
		//List<Object> l3=new ArrayList<Object>();
		List<Integer> l3=new ArrayList<Integer>();
		
		l3.add(1);
		l3.add(2);
		l3.add(3);
		l3.add(4);
		l3.add(5);
		l3.add(6);
		l3.add(7);
		l3.add(0);
		l3.add(8);
		l3.add(9);
		
		System.out.println(l3);
		//Collections.sort(l3); //The method sort(List<T>) in the type Collections is not applicable for the arguments (List<Object>)
		Collections.sort(l3);
		System.out.println(l3);
		
		System.out.println("Size of the List :"+l3.size());
	}

}
