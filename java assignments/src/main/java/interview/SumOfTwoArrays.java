package interview;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfTwoArrays {

	public static void main(String[] args) {

		//		Scanner sc=new Scanner(System.in);
		//		System.out.println("enter the row size of array 1:");
		//		int rowsize1=sc.nextInt();
		//		int a1[][]=new int[rowsize1][];
		//
		//		for (int i = 0; i < rowsize1; i++) {//for each row how many columns
		//			System.out.println("please enter the column size for row number:"+i);
		//			int colsize1=sc.nextInt();
		//			a1[i]=new int[colsize1];
		//			System.out.println("please enter the column values for row:"+i);
		//
		//			for (int j = 0; j < colsize1; j++) {
		//				a1[i][j]=sc.nextInt();
		//			}
		//		}
		//		System.out.println("input1:");
		//		for (int i = 0; i < a1.length; i++) {
		//			System.out.println(Arrays.toString(a1[i]));
		//		}
		//
		//		
		//		System.out.println("enter the row size of array 2:");
		//		int rowsize2=sc.nextInt();
		//		int a2[][]=new int[rowsize2][];
		//
		//		for (int i = 0; i < rowsize2; i++) {//for each row how many columns
		//			System.out.println("please enter the column size for row number:"+i);
		//			int colsize2=sc.nextInt();
		//			a2[i]=new int[colsize2];
		//			System.out.println("please enter the column values for row:"+i);
		//
		//			for (int j = 0; j < colsize2; j++) {
		//				a2[i][j]=sc.nextInt();
		//			}
		//		}
		//		System.out.println("input2:");
		//		for (int i = 0; i < a2.length; i++) {
		//			System.out.println(Arrays.toString(a2[i]));
		//		}
		//		
		//		
		//		int a3[][]=new int[a1.length][];//create  a3 rows as a1 size
		//		
		//		int sum=0;
		//		for (int i = 0; i < a1.length; i++) {//each row takes
		//			a3[i]=new int[a1.length];//create  a3 columns as a1 size
		//			for(int j=0;j<a1[i].length;j++) {//iterate each row with row columns
		//				a3[i][j]=a1[i][j]+a2[i][j];
		//			}
		//		}
		//
		//		System.out.println("output:");
		//		for (int i = 0; i < a3.length; i++) {
		//			System.out.println(Arrays.toString(a3[i]));
		//		}
		//		

		//without scanner class
		int a[][]= {{1,8,4},{9,7,2},{7,6,4}};
		int b[][]= {{7,2,4},{4,7,0},{9,3,5}};


		System.out.println("input1:");
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}


		System.out.println("input2:");
		for (int i = 0; i < b.length; i++) {
			System.out.println(Arrays.toString(b[i]));
		}


		int c[][]=new int[a.length][];//create  c rows as a size
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			c[i]=new int[a.length];//create  a3 columns as a1 size
			for(int j=0;j<a[i].length;j++) {//iterate each row with row columns
				c[i][j]=a[i][j]+b[i][j];
			}

		}
		System.out.println("output:");
		for (int i = 0; i < c.length; i++) {
			System.out.println(Arrays.toString(c[i]));
		}



















	}

}
