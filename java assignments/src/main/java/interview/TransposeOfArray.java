package interview;

import java.util.Arrays;
import java.util.Scanner;

public class TransposeOfArray {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the row size:");
//		int rowsize=sc.nextInt();
//		int a[][]=new int[rowsize][];
//
//		for (int i = 0; i < rowsize; i++) {//for each row how many columns
//			System.out.println("please enter the column size for row number:"+i);
//			int colsize=sc.nextInt();
//			a[i]=new int[colsize];
//			System.out.println("please enter the column values for row:"+i);
//
//			for (int j = 0; j < colsize; j++) {
//				a[i][j]=sc.nextInt();
//			}
//		}
//		System.out.println("input:");
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(Arrays.toString(a[i]));
//		}
//		
//		int transpose[][]=new int[a.length][];
//		for (int i = 0; i < a.length; i++) {
//			transpose[i]=new int [a.length];
//			for (int j = 0; j < transpose.length; j++) {
//				transpose[i][j]=a[j][i];
//			}
//			
//		}
//		System.out.println("output:");
//		for (int i = 0; i < transpose.length; i++) {
//			System.out.println(Arrays.toString(transpose[i]));
//		}
//		
//		
		
		//without scanner class
		int a[][]= {{1,8,4},{9,7,2},{7,6,4}};
		

		System.out.println("input1:");
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}


		


		int c[][]=new int[a.length][];//create  c rows as a size
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			c[i]=new int[a.length];//create  a3 columns as a1 size
			for(int j=0;j<a[i].length;j++) {//iterate each row with row columns
				c[i][j]=a[j][i];//interchange rows and columns
			}

		}
		System.out.println("output:");
		for (int i = 0; i < c.length; i++) {
			System.out.println(Arrays.toString(c[i]));
		}
		
		
		
		
//		input1:
//			[1, 8, 4]
//			[9, 7, 2]
//			[7, 6, 4]
//			output:
//			[1, 9, 7]
//			[8, 7, 6]
//			[4, 2, 4]
		
		
		
		
		
		
		
		
	}

}
