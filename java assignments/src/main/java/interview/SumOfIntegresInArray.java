package interview;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfIntegresInArray {

	public static void main(String[] args) {
//		int a[]= {2,5,1,9,6};
//		int len=a.length;
		
		//Sum of integers in array 
		int sum=0;
//		for(int i=0;i<a.length;i++) {
//			sum=sum+a[i];
//		}
//		System.out.println("Sum of integers in array is:"+sum);//23
		
		
		//average of intergers in array
		
		
//		int sum=0;
//		long average=0;
//		for(int i=0;i<a.length;i++) {
//			sum=sum+a[i];
//			average=sum/len;
//		}
//		System.out.println("average of integers in array is:"+average);//4
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("please entr the array size");
		int arsize=sc.nextInt();//size of the array
		int a[]=new int[arsize];//created the array with size
		
		System.out.println("enterthe values");
		for(int i=0;i<a.length;i++) {//take the number of elements one by one
			a[i]=sc.nextInt();
		}
			
		
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		
		System.out.println(sum);
		System.out.println(sum/a.length);//average of integers

		System.out.println(Arrays.toString(a));
	}

}
