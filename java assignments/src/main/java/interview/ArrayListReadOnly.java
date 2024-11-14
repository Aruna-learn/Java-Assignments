package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListReadOnly {

	public static void main(String[] args) {
		List<String> li=new ArrayList<String>();
		li.add("Aruna");
		li.add("reddy");
		li.add("poololla");
		li.add("family");
		
		System.out.println(li);
		for(String s: li) {
			System.out.println(s);
		}
			
		List<String> lii=Collections.unmodifiableList(li);
		//make the arraylist as unmodifiable but try to add the data so get the java.lang.UnsupportedOperationException
		lii.add("great");
		System.out.println(lii);

	}

}
