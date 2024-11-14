package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HighestAndLowestValuesOflist {

	public static void main(String[] args) {
		
		
		//There are 2 ways we can achieve that. First, sorting the collection and getting the first & last elements of the collection. Second, using max() & min() methods of Collections class, we can get the highest and lowest values.
		List<Integer> li=new ArrayList<>();
		li.add(9);
		li.add(70);
		li.add(23);
		li.add(90);
		li.add(7);
		li.add(3);
		
//		Collections.sort(li);
//		System.out.println(li.get(0));
//		System.out.println(li.get((li.size()-1)));
		
		
		System.out.println(Collections.max(li));
		System.out.println(Collections.min(li));
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
