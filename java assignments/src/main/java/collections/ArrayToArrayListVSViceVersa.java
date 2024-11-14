package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayToArrayListVSViceVersa {

	public static void main(String[] args) {
		//Array to array list
//		String[] s= {"aruna","poorna","akka","cnhinni"};
//
//		
//		System.out.println(Arrays.toString(s));
//		
//		ArrayList<String>list=new ArrayList<>();
//		Collections.addAll(list, s);
//		
//		System.out.println(list);
		
		//Arraylist to array 
		ArrayList<String>list=new ArrayList<>();
		list.add("aruna");
		list.add("fshe");
		list.add("rweo4");
		list.add("epiuw");
	
		System.out.println(list);
		
		Object[] array=list.toArray();
		System.out.println(Arrays.toString(array));
		
		
		for (Object o : array) {
			String s=(String)o;
			System.out.println(s);
		}
		
		
	}

}
