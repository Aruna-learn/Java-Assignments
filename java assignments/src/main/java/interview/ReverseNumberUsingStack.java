package interview;

import java.util.Stack;

public class ReverseNumberUsingStack {

	public static void main(String[] args) {
		
	//	Write a Java Program to reverse a number using Stack.
		int num=561206434;
		int reverse=0;
		int i=1;
		
		Stack<Integer> st=new Stack<Integer>();
		
		while(num!=0) {
			st.push(num%10);
			num=num/10;
		}
		
		while (!st.isEmpty()) {
			reverse = reverse + (st.peek() * i);//peek is used to ee whether number is there or not
			st.pop();//remove the number that stored in reverse
			i = i * 10;
			}

		
		System.out.println(reverse);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
