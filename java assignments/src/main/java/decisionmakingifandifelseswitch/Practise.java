package decisionmakingifandifelseswitch;

import java.util.Scanner;

public class Practise {

	public static void main(String[] args) {

		// 0 1 1 2 3 5 8 13 21 34



		//		int n1=0; 
		//		int n2=1;
		//		int sum=0;
		//		
		//		System.out.println(n1+"  "+n2);
		//	    for(int i=2;i<=10;i++) {
		//	    	sum=n1+n2;
		//	    	System.out.println(" "+sum);
		//	    	n1=n2;
		//	    	n2=sum;
		//		
		//	}
		//		


		//		int num=371;//1*3+5*3+3*153
		//		int sum=0;
		//		int remainder=0;
		//		int temp=num;
		//		
		//		while(num>0) {
		//			remainder=num%10;
		//			sum=sum+remainder*remainder*remainder;
		//			num=num/10;
		//			
		//		}
		//		System.out.println(sum);
		//		if(temp==sum) {
		//			System.out.println("ArmStrongNumber:"+sum);
		//		}
		//		else
		//			System.out.println("not ArmStrongNumber:"+sum);


		//sum of the integers
		//	int  num=234;//2+3+4=9
		//		int sum=0;
		//		int remainder=0;
		//		Scanner sc=new Scanner(System.in);
		//		System.out.println("enter the number to sum:");
		//		int num=sc.nextInt();
		//		while(num>0) {
		//			remainder=num%10;
		//			sum=sum+remainder;
		//			num=num/10;
		//			
		//		}
		//		System.out.println("sum of the number is:"+sum);

		//prime
		//		int num=7;
		//		int start=2;
		//		boolean isprime=true;
		//		while(start<num) {
		//			
		//			if(num%start==0) {
		//				isprime=false;
		//				break;
		//				
		//			}
		//			start++;
		//		}
		//		if(isprime) {
		//			System.out.println("given number is prime number");
		//		}
		//			else
		//				System.out.println("not prime number");


		//charcter count
		//	String s="Aruna Reddy";
		//		int count=0;
		//		for(int i=0;i<s.length();i++) {
		//			if(s.charAt(i)!=' ')
		//				count++;
		//			
		//		}
		//		System.out.println(count);


		//duplicate characters
		//		char[] ch=s.toCharArray();
		//		for(int i=0;i<s.length();i++){
		//			for(int j=i+1;j<s.length();j++) {
		//				if(ch[i]==ch[j]) {
		//					  System.out.println("repeated or duplicated characters are:"+ch[i]);
		//				}
		//				
		//			}
		//			
		//		}
		//		


		//swap two numbers

		//		int n1=76;
		//		int n2=45;
		//		n1=n1+n2;
		//		n2=n1-n2;
		//		n1=n1-n2;
		//		System.out.println(n1);
		//		System.out.println(n2);


		//reverse array
		//		int a[]= {1,5,0,3,2,};
		//		
		//		for(int i=a.length-1;i>=0;i--) {
		//			System.out.println(a[i]);
		//		}
		//		


		//		String s="Aruna ReddY";
		//		int count=0;
		//		for(int i=0;i<s.length();i++) {
		//			if(s.charAt(i)>='A'&&s.charAt(i)<='Z') {
		//				count++;
		//				
		//			}
		//			
		//		}
		//		System.out.println(count);
		//		


		//		int[] arr = { 4, 3, 25, 6, 7, 8, 9, 2, 3, 10 };
		//		int count=0;
		//		int max=0;
		//		for(int i=0;i<arr.length-1;i++)
		//		{		
		//			if(arr[i]+1==arr[i+1]) {
		//				count++;
		//			}
		//			else {
		//				count=0;
		//			}
		//
		//			max = Math.max(max, count+1);
		//		}
		//		System.out.println(max);

		String s1="Aruna";

		String s2="reddy";


//		String swp;
//		swp=s1;
//		s1=s2;
//		s2=swp;
//		System.out.println(s1);
//		System.out.println(s2);


s1=s1.concat(s2);
s2=s1.substring(0, s1.length()-s2.length());
System.out.println(s2);
s1=s1.substring(s2.length());
System.out.println(s1);






	}

}
