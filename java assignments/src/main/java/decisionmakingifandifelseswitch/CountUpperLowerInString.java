package decisionmakingifandifelseswitch;

import java.util.Scanner;

public class CountUpperLowerInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String s=sc.next();
		int lower=0;
		int upper=0;
		for(int i=0;i<s.length();i++) {
			char ch =s.charAt(i);
			if(ch>=65 && ch<=90) {
				upper++;
			}
			else
				lower++;
		}
		System.out.println(upper);
		System.out.println(lower);
		
		
		

	}

}
