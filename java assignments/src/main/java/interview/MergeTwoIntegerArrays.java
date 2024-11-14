package interview;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoIntegerArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("please enter  fisrt the array size");
		int arsize=sc.nextInt();//size of the array
		int a[]=new int[arsize];//created the array with size
		System.out.println("enter the values");
		for(int i=0;i<a.length;i++) {//take the number of elements one by one
			a[i]=sc.nextInt();
		}

		System.out.println("please enter the  second array size");
		int arsize1=sc.nextInt();//size of the array
		int b[]=new int[arsize1];//created the array with size
		System.out.println("enterthe values");
		for(int i=0;i<b.length;i++) {//take the number of elements one by one
			b[i]=sc.nextInt();
		}


		int c[]=new int[a.length+b.length];
		for (int i = 0; i < a.length; i++) {
			c[i]=a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[i+a.length]=b[i];//[i+a.length] after a array values inserted then add the b values continuosly inested of the index start form zero
		}

				System.out.println(Arrays.toString(a));		
				System.out.println(Arrays.toString(b));		
				System.out.println(Arrays.toString(c));


				// to just print the values of arrays
//				for (int i = 0; i < a.length; i++) {
//					System.out.println(a[i]);
//				}
//				
//				for (int i = 0; i < b.length; i++) {
//					System.out.println(b[i]);
//				}
		sc.close();
	}

}
