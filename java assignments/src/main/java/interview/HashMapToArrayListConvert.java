package interview;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;

public class HashMapToArrayListConvert {

	public static void main(String[] args) {
		HashMap<String, String> map=new HashMap<String, String>();
		
		map.put("India", "Delhi");
		map.put("London", "koyi");
		map.put("Washuingiton", "dfsjkgf");
		map.put("w3ueyr", "cvmkhnsd");
		
		
		// convert hashmap keys to ArrayList
		ArrayList<String> Country=new ArrayList<String>(map.keySet());
	
		System.out.println("HashMap Keys are:");
		for(String s:Country) {
			System.out.println(s);
		}
		
		System.out.println("************************");
		// convert hashmap values to ArrayList

		ArrayList<String> capital=new ArrayList<String>(map.values());
		
		System.out.println("HashMap values are:");
		for(String s1:capital) {
			System.out.println(s1);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
