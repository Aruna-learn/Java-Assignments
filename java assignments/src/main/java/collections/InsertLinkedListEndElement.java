package collections;

import java.util.LinkedList;

public class InsertLinkedListEndElement {

	public static void main(String[] args) {
		LinkedList<String> li=new LinkedList<String>();
		li.add("Aruna");
		li.add("Reddy");
		li.add("MOna");
		li.add("sjdfk");
		

		System.out.println("LinkedList before Inserting Element at the End/Last");

        System.out.println(li);
		
		
		li.addLast("Testing");
		li.offerLast("uyt");

		System.out.println("LinkedList After Inserting Element at the End/Last");

        System.out.println(li);
		
		
		
		
		
		
		
	}

}
