package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ConvertArrayListToLinkedListViceVersa {

	public static void main(String[] args) {
		ArrayList<String> ali=new ArrayList<>();
		ali.add("Rahul");
		ali.add("Rohan");
		ali.add("Megha");
		ali.add("Mona");
		ali.add("Aruna");
		
		System.out.println("ArrayList elements"+ali);

		// Converting ArrayList to LinkedList
		LinkedList<String> li=new LinkedList<String>(ali);
		
		System.out.println("LinkedListElements"+li);
		
		// Converting LinkedList to Arraylist
		
		ArrayList<String> alil=new ArrayList<String>(li);
		System.out.println(alil);
		
		
		
		
		
		
	}

}
