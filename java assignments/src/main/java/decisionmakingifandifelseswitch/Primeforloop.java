package decisionmakingifandifelseswitch;

import java.util.Scanner;

public class Primeforloop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter starting number");
		int st=sc.nextInt();
		System.out.println("enter the second number");
		int en=sc.nextInt();
//		System.out.println("enter the  number to check for prime");
//		int num=sc.nextInt();	
		
		int dividents=0;
//		if(num!=1&&num!=2) {
//			for(int i=1;i<=num;i++) {
//				if(num%i==0) {
//					dividents++;
//				}
//				
//			}
//		}
//		if(dividents==2) { //1 and 2 only
//			System.out.println("prime");
//		}
//		else
//			System.out.println("not prime");
		
		
		
		
		
		for(int num=st;num<=en;num++) {
		
		if(num!=1&&num!=2) {
			for(int i=1;i<=num;i++) {
				if(num%i==0) 
					dividents++;
			}
				
		}
		
		if(dividents<=2&&dividents!=0) { //1 and 2 only
			System.out.println("prime");
			System.out.println(num);
		
		}
		
		
		
		
		
		
		
		
		}
		
		
		
		
		

	}

	}
