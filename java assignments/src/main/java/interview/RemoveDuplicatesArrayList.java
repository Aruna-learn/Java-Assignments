package interview;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicatesArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(23);
		al.add(55);
		al.add(23);
		al.add(27);
		al.add(20);
		System.out.println("Before removing the duplicates");
		for(int i:al) {
			System.out.println(i);
		}
		System.out.println("After removal of duplicates");		
		

Set<Integer> ss = new LinkedHashSet<Integer>(al);  
System.out.println(ss);  	

	}

}
