package interview;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistReplace {

	public static void main(String[] args) {

		ArrayList<String> al=new ArrayList<String>();
		al.add("Test1");
		al.add("Test2");
		al.add("Test3");
		al.add("Test4");
		al.add("Test5");

		System.out.println("ArrayList before Replace");

		System.out.println(al);


		int index=al.indexOf("Test2");
		al.set(index, "ReplacedTest");

		System.out.println("ArrayList after Replace");

		System.out.println(al);










	}

}
