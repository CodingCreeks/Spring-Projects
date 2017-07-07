package demoOn17August2016;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<String, Integer> map1 = new HashMap<String, Integer>();
				
		map1.put("Apache", 56000);
		map1.put("Shine", 89000);
		map1.put("Aventure", 99000);
		map1.put("Unicorn", 89000);
		System.out.println(map1);
		
		map1.put("Apache", 78000);
		System.out.println(map1);
		
		Set<String> keys = map1.keySet();
		System.out.println(keys);
		
		Collection<Integer> values = map1.values();
		System.out.println(values);
		
		System.out.println(map1.containsKey("Shine"));
	}
}
