package decisionmakingifandifelseswitch;

import java.util.Scanner;

public class PrinttheValues {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  starting number:");
		int n=sc.nextInt();
		System.out.println("enter the  ending number:");
		int n1=sc.nextInt();

		
		//print numbers in range
//		for(int i=n;i<n1;i++) {
//			System.out.println(i);
//		}
		
		
//		while(n<=n1) {
//			System.out.println(n);
//			n++;
//		}
		
		
//		//print even numbers in range
//		while(n<=n1) {
//		if(n%2==0) {
//			System.out.println(n+" is even number");
//		}
//			
//		n++;
//		
//		}
		
		//print  numbers  divisible by 7 in range
//				while(n<=n1) {
//				if(n%7==0) {
//					System.out.println(n);
//				}
//					
//				n++;
//				
//				}
		
		
		
		//print sum of even  numbers in range
//		int sum=0;
//		
//		while(n<=n1) {
//		if(n%2==0) 
//			sum=sum+n;
//			n++;
//		
//		}	
//		
//		System.out.println(sum);
		
		
		
		
		//print  odd numbers between 200 to 25 in reverse order
		while(n>=n1) {
		if(n%2!=0) {
			System.out.println(n);
		}
			
		n--;
		
		}
		
		
		
		
		
		
		
		
		sc.close();
		
		
	}

}
