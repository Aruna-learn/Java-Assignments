package decisionmakingifandifelseswitch;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  starting number:");
		int n=sc.nextInt();
		System.out.println("enter the  ending number:");
		int n1=sc.nextInt();
		int count=0;



		//EX check 5 is prime or not so 1,2,3,4,5 i know that 1and 5 not divisible and it is prime numbers to check 2,3,4 starts with 2 and chck
		while(n<=n1) {
			boolean isPrime=true;
			if(n!=1&&n!=2) {
				int i=2;
				while(i<n) {
					if(n%i==0) {
						count++;
						isPrime=false;
						break;
					}
					i++;
				}
			}

			else isPrime=false;

			if(isPrime) {
				System.out.println(n);
			}
			n++;
		}
		System.out.println("total number of primes:"+count);











	}

}
