package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class ElementInCollectionOrNot {

	public static void main(String[] args) {
		
		//We can use contains() function to check if an element is part of any collection apart from Map. For Map type collections, we need to containsKey() to find if a key is present in the map and containsValue() to find if the value exists in the map.
		List<String> li=new ArrayList<>();
		li.add("Rahul");
		li.add("Rohan");
		li.add("Megha");
		
		System.out.println(li.contains("aruna"));
		System.out.println(li.contains("Megha"));
		
		
		Map<Integer, String> map=new HashMap<>();
		
		map.put(1, "aruna");
		map.put(109, "chini");
		map.put(112, "wokeri");
		

		System.out.println(map.containsKey(1));
		System.out.println(map.containsKey(100));
		
		System.out.println(map.containsValue("aruna"));
		System.out.println(map.containsValue("suiry"));
		
		
		
		
		
		
		
		
		
		
		

	}

}
