package interview;

import java.util.Arrays;
import java.util.Scanner;

public class SquareOfArray {

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
//		int sqrarr[][]=new int[a.length][];
//		for (int i = 0; i < a.length; i++) {
//			sqrarr[i]=new int [a.length];
//			for (int j = 0; j < sqrarr.length; j++) {
//				sqrarr[i][j]=(int) Math.pow(a[i][j], 2);
//			}
//			
//		}
//		System.out.println("output:");
//		for (int i = 0; i < sqrarr.length; i++) {
//			System.out.println(Arrays.toString(sqrarr[i]));
//		}
//		
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
						c[i][j]=(int) Math.pow(a[i][j], 2);//using math class and power method
					}

				}
				System.out.println("output:");
				for (int i = 0; i < c.length; i++) {
					System.out.println(Arrays.toString(c[i]));
				}





		
		
		

	}

}
