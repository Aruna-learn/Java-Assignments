package decisionmakingifandifelseswitch;

import java.util.Scanner;

public class Forloop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("select starting number");
		int st=sc.nextInt();
		System.out.println("enter the second number");
		int en=sc.nextInt();
				
		
		
		//print numbers in range
//		for(int i=st;i<=en;i++) {
//			System.out.println(i);
//		}
//				
				
				
				
		//print even numbers in range
		
//		for(int i=st;i<=en;i++) {
//			if(i%2==0)
//			System.out.println(i);
//		}
//				
				
		//print  numbers  divisible by 7 in range		
				
//		for(int i=st;i<=en;i++) {
//			if(i%7==0)
//			System.out.println(i);
//		}	
				
			
		
		//print sum of even  numbers in range
			
//		int sum=0;
//		
//		for(int i=st;i<=en;i++) {
//			if(i%2==0) {
//				sum=sum+i;
//				System.out.println(i);
//				
//			}
//			
//		}			
//		
//		System.out.println("sum of the even numbers is:"+sum);		
				
			
		//print odd numbers in range in reverse order
		for(int i=st;i>=en;i--) {
			if(i%2==1) {
				//sum=sum+i;
				System.out.println(i);
				
			}
				
		}
		sc.close();
				
	}

}
