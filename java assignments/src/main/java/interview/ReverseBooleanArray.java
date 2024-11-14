package interview;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseBooleanArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("please enter   the array size");
		int arsize=sc.nextInt();//size of the array
		boolean a[]=new boolean[arsize];//created the array with size
		System.out.println("enter the values");
		for(int i=0;i<arsize;i++) {//take the number of elements one by one
			a[i]=sc.nextBoolean();
		}
		
		System.out.println(Arrays.toString(a));
		boolean rev[]=new boolean[a.length];
		for(int i=0;i<a.length;i++) {
		rev[a.length-i-1]	=a[i];//[a.length-i-1] if a.lenth is 5 then 5-0 is 5 no index 5 in rev array so use like this otherwise arrayindex exception
			System.out.println(a[i]);
		}
		
		System.out.println(Arrays.toString(rev));
		
		
		
		
		
		
	}

}
