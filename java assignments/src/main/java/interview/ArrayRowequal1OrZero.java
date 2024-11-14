package interview;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRowequal1OrZero {

	public static void main(String[] args) {
		//1st row 1st element is same as 2nd row 1st element then it is 1 otherwise 0 ad same for all rows and columsn in each row
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
//		
//		for (int i = 0; i < a1.length; i++) {//each row takes
//			a3[i]=new int[a1.length];//create  a3 columns as a1 size
//			for(int j=0;j<a1[i].length;j++) {//iterate each row with row columns
//				if(a1[i][j]==a2[i][j]) 
//					a3[i][j]=1;
//					else 
//						a3[i][j]=0;
//					
//			}
//		}
//
//		System.out.println("output:");
//		for (int i = 0; i < a3.length; i++) {
//			System.out.println(Arrays.toString(a3[i]));
//		}
//		
//		
		
		//without scanner class
				int a[][]= {{1,8,4},{9,7,2},{7,6,4}};
				int b[][]= {{1,2,4},{4,7,0},{7,3,4}};


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
						if(a[i][j]==b[i][j])
							c[i][j]=1;
						else
							c[i][j]=0;
					}

				}
				System.out.println("output:");
				for (int i = 0; i < c.length; i++) {
					System.out.println(Arrays.toString(c[i]));
				}



//				input1:
//					[1, 8, 4]
//					[9, 7, 2]
//					[7, 6, 4]
//					input2:
//					[1, 2, 4]
//					[4, 7, 0]
//					[7, 3, 4]
//					output:
//					[1, 0, 1]
//					[0, 1, 0]
//					[1, 0, 1]
		
		//above 1 in 1st array and 1 in 2nd array equal so 1 and 8 and 2 not equal so 0
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
