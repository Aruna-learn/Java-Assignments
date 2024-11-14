package interview;

import java.util.Arrays;

public class ArrayPractise1 {

	public static void main(String[] args) {

		//determine whether two matrices are equal
		//Both the matrices should have the same number of rows and columns.
		//Both the matrices should have the same corresponding elements

		//		  int row1, col1, row2, col2;    
		//	        boolean flag = true;    
		//
		//		int a[][] = {       
		//				{1, 2, 3},    
		//				{8, 4, 6},    
		//				{4, 5, 7}    
		//		};    
		//
		//		//Initialize matrix b    
		//		int b[][] = {       
		//				{1, 2, 3},    
		//				{8, 4, 6},    
		//				{4, 5, 7}    
		//		};    
		//
		//		
		//		//Calculates the number of rows and columns present in the first matrix    
		//	    
		//        row1 = a.length;    
		//      col1 = a[0].length;    
		//          
		//      //Calculates the number of rows and columns present in the second matrix    
		//  
		//        row2 = b.length;    
		//      col2 = b[0].length;    
		//          
		//      //Checks if dimensions of both the matrices are equal    
		//      if(row1 != row2 || col1 != col2){    
		//          System.out.println("Matrices are not equal");    
		//      }    
		//      else {    
		//          for(int i = 0; i < row1; i++){    
		//              for(int j = 0; j < col1; j++){    
		//                if(a[i][j] != b[i][j]){    
		//                    flag = false;    
		//                    break;    
		//                }    
		//              }    
		//          }    
		//              
		//          if(flag)    
		//              System.out.println("Matrices are equal");    
		//          else    
		//              System.out.println("Matrices are not equal");    
		//      }    



		//   frequency of odd & even numbers in the given matrix
		//
		//		int a[][] = {       
		//				{4, 1, 3},    
		//				{3, 5, 7},    
		//				{8, 2, 6}    
		//		};  
		//
		//		int evn=0;
		//		int odd=0;
		//		for (int i = 0; i < a.length; i++) {
		//			for (int j = 0; j < a.length; j++) {
		//				if(a[i][j]%2==0) {
		//					evn++;
		//				}
		//				else
		//					odd++;
		//			}
		//		}
		//
		//		System.out.println(evn);
		//
		//		System.out.println(odd);



		// sum of row elements and sum of column elements 

		//		 int a[][] = {       
		//                 {1, 2, 3},    
		//                 {4, 5, 6},    
		//                 {7, 8, 9}    
		//             };    
		//       
		//		
		//		
		//		for (int i = 0; i < a.length; i++) {
		//			int sumrow=0;
		//			for(int j=0;j<a[i].length;j++) {//iterate each row with row columns
		//				sumrow=sumrow+a[i][j];
		//				
		//			}
		//			System.out.println(" sum of "+(i+1)+" row"+sumrow);
		//		}
		//
		//
		//		
		//		for (int i = 0; i < a[0].length; i++) {
		//			int sumcol=0;
		//			for(int j=0;j<a.length;j++) {//iterate each row with row columns
		//				sumcol=sumcol+a[j][i];//48
		//			}
		//			System.out.println(" sum of "+(i+1)+" row"+sumcol);
		//		}



		//lower triangular matrix[To convert given matrix into the lower triangular matrix, loop through the matrix and set the values of the element to zero where column number is greater than row number.]

//		int a[][] = {       
//				{1, 2, 3},    
//				{8, 6, 4},    
//				{4, 5, 6}    
//		};    
//
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				if(j>i) {
//					System.out.print("0");
//				}
//				else
//					System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}

		//upper triangluar[element to zero where row number is greater than column number.]
//		int a[][] = {       
//				{1, 2, 3},    
//				{8, 6, 4},    
//				{4, 5, 6}    
//		};    
//
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				if(i>j) {
//					System.out.print("0");
//				}
//				else
//					System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}


		//Identity Matrix
		 int rows, cols;    
	        boolean flag = true;    
	            
	        //Initialize matrix a    
	        int a[][] = {       
	                        {1, 0, 0},    
	                        {0, 1, 0},    
	                        {0, 0, 1}    
	                    };    
	            
	        //Calculates the number of rows and columns present in the given matrix    
	    
	          rows = a.length;    
	        cols = a[0].length;    
	            
	        //Checks whether given matrix is a square matrix or not    
	        if(rows != cols){    
	            System.out.println("Matrix should be a square matrix");    
	        }    
	        else {    
	            //Checks if diagonal elements are equal to 1 and rest of elements are 0    
	            for(int i = 0; i < rows; i++){    
	                for(int j = 0; j < cols; j++){    
	                  if(i == j && a[i][j] != 1){    
	                      flag = false;    
	                      break;    
	                  }    
	                  if(i != j && a[i][j] != 0){    
	                      flag = false;    
	                      break;    
	                  }    
	                }    
	            }    
	                
	            if(flag)    
	                System.out.println("Given matrix is an identity matrix");    
	            else    
	                System.out.println("Given matrix is not an identity matrix");    
	        }    



	}

}
