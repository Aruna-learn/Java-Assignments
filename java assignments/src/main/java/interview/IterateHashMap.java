package interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class IterateHashMap {

	public static void main(String[] args) {

		HashMap<String, String> map=new HashMap<String, String>();

		map.put("India", "Delhi");
		map.put("London", "koyi");
		map.put("Washuingiton", "dfsjkgf");
		map.put("w3ueyr", "cvmkhnsd");

		Iterator<String> it=map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = map.get(key);
			System.out.println("key: " + key + "==>" + "value: " + value);
		}

		System.out.println("**********************************");


		// Iterate by using entrySet()

		Iterator<Entry<String, String>> map_entry = map.entrySet().iterator();

		while (map_entry.hasNext()) {
		Entry<String, String> entry = map_entry.next();
		System.out.println("key: " + entry.getKey() + "==>" + entry.getValue());
		}














	}

}
