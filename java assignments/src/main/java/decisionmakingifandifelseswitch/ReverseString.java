package decisionmakingifandifelseswitch;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string to revese");
		String s=sc.next();

		String rev="";
		//using s.charat(i)

		//		for(int i=s.length()-1;i>=0;i--) {
		//			rev=rev+s.charAt(i);
		//		}
		//		
		//		System.out.println(rev);

		//using char array
		//		char ch[]=s.toCharArray();
		//		
		//		for(int i=s.length()-1;i>=0;i--) {
		//			rev=rev+ch[i];
		//		}
		//		
		//		System.out.println(rev);



		//using string builder and buffer

//		StringBuffer sb=new StringBuffer(s);
//
//		System.out.println(sb.reverse());


		StringBuilder sb=new StringBuilder(s);

		System.out.println(sb.reverse());





	}








}
