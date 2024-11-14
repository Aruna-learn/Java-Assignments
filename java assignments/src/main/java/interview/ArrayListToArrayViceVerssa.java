package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArrayViceVerssa {

	public static void main(String[] args) {
		List<String> li= new ArrayList<String>();
		li.add("Aruna");
		li.add("redyy");
		li.add("poololla");
		li.add("mohanjdji");
		System.out.println("Coverting arraylist to array");
		String[] name=li.toArray(new String[li.size()]);
		for(String s: name) {
	System.out.println(s);
}
       
       System.out.println("converting array to arraylist");
       List<String> lii= new ArrayList<String>();
       lii=Arrays.asList(name);
       System.out.println(lii);
	}

}
