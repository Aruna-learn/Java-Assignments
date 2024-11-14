package interview;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfElementsOfMultidimesionalArray {

	public static void main(String[] args) {


		//without scanner class
				int a[][]= {{1,8,4},{9,7,2},{7,6,4}};
		
				int sum=0;
				for (int i = 0; i < a.length; i++) {
					for(int j=0;j<a[i].length;j++) {//iterate each row with row columns
						sum+=a[i][j];//48
					}
					System.out.println(sum);
				}
				//System.out.println(sum);


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
//		int sum=0;
//		for (int i = 0; i < a.length; i++) {
//			for(int j=0;j<a[i].length;j++) {//iterate each row with row columns
//				sum+=a[i][j];//48
//			}
//		}
//
//		System.out.println(sum);
//













	}

}
