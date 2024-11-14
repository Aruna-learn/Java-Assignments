package decisionmakingifandifelseswitch;

import java.util.Scanner;

public class SwitchEvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		int remainder=n%2;
		switch(remainder) {
		case 0:
			System.out.println("number is even");
			break;
		case 1:
			System.out.println("number is odd");
			
		}
	}

}
