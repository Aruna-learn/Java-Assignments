package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {
		
		Map<String, Integer> location=new HashMap<String, Integer>();
		
		location.put("Banglore", 560);
		location.put("Chennai", 890);
		location.put("Hyderabad", 566);
		location.put("Mumbai", 788);
		location.put("New Delhi,", 1000);
		
		for (Entry<String, Integer> entry : location.entrySet()) {
			System.out.println("Distance from Hometown to "+entry.getKey()+" "+entry.getValue());
		}
		
		
		Set<String> keys =location.keySet();
		for (String key : keys) {
			System.out.println("keys are:"+key);
	}
		
		
		Collection<Integer>values =location.values();
		for (Integer value : values) {
			System.out.println("values are:"+value);
		}
		

	}

}
