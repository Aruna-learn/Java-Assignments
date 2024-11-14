package interview;

import java.util.Arrays;

public class ArrayPractise {

	public static void main(String[] args) {
		//transpose of matrix

//		int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
//		
//		int[][] trans=new int [a.length][];
//		
//		for (int i = 0; i < a.length; i++) {
//			trans[i]=new int[a.length];
//			for (int j = 0; j < a.length; j++) {
//				trans[i][j]=a[j][i];
//			}
//		}
//		System.out.println("input:");
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(Arrays.toString(a[i]));
//		}
//		
//		System.out.println("output:");
//		for (int i = 0; i < trans.length; i++) {
//			System.out.println(Arrays.toString(trans[i]));
//		}
		
		
		
		//spars matrix means most of the elements in the matrix should be zero 
		//Number of zeroes present in below matrix is 6 and size of the matrix is 3 * 3 = 9. Since, 6 > 4.5 that means, most elements of given array are zero. Hence, the below matrix is a sparse matrix.
		
		
//		int a[][] = {       
//                {4, 0, 0},    
//                {0, 5, 0},    
//                {0, 0, 6}    
//            };    
//		
//		int rows, col, size;
//		int count=0;
//		rows=a.length;
//		col=a[0].length;
//		size=rows*col;
//		
//		for(int i = 0; i < rows; i++){    
//            for(int j = 0; j < col; j++){    
//                if(a[i][j] == 0)    
//                    count++;    
//                }    
//            }    
//                
//        if(count > (size/2))    
//            System.out.println("Given matrix is a sparse matrix");    
//        else    
//            System.out.println("Given matrix is not a sparse matrix");    
//        
		//add two matrices
//        int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
//        int b[][]={{1,3,4},{2,4,3},{1,2,4}};    
//		
//        int add[][]=new int[a.length][];
//        
//		
//        for(int  i = 0; i < a.length; i++){ 
//        add[i]=	new int [a.length];
//            for(int j = 0; j < a.length; j++){    
//                add[i][j]=a[i][j]+b[i][j];
//            }
//            
//        }
//       
//        System.out.println("input a:");
//		for (int j = 0; j < a.length; j++) {
//			System.out.println(Arrays.toString(a[j]));
//		}
//		
//		System.out.println("input b:");
//		for (int k = 0; k < b.length; k++) {
//			System.out.println(Arrays.toString(b[k]));
//		}
//		System.out.println("addition of two matrices:");
//		for (int l = 0; l < add.length; l++) {
//			System.out.println(Arrays.toString(add[l]));
//		}
		
		//substarction of two matrices
//		int a[][]={{7,5,4},{3,4,3},{3,4,5}};    
//        int b[][]={{1,3,4},{2,0,1},{1,2,4}};    
//		
//        int sub[][]=new int[a.length][];
//        
//		
//        for(int  i = 0; i < a.length; i++){ 
//        add[i]=	new int [a.length];
//            for(int j = 0; j < a.length; j++){    
//                add[i][j]=a[i][j]-b[i][j];
//            }
//            
//        }
//       
//        System.out.println("input a:");
//		for (int j = 0; j < a.length; j++) {
//			System.out.println(Arrays.toString(a[j]));
//		}
//		
//		System.out.println("input b:");
//		for (int k = 0; k < b.length; k++) {
//			System.out.println(Arrays.toString(b[k]));
//		}
//		System.out.println("addition of two matrices:");
//		for (int l = 0; l < add.length; l++) {
//			System.out.println(Arrays.toString(sub[l]));
//		}
		
		//multiplication/product of two matrices
		int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
		int b[][]={{1,1,1},{2,2,2},{3,3,3}};      
		
		
//		//Calculates number of rows and columns present in first matrix    
//        row1 = a.length;    
//      col1 = a[0].length;    
//          
//      //Calculates the number of rows and columns present in the second matrix    
//  
//        row2 = b.length;    
//      col2 = b[0].length;    
//          
//      //For two matrices to be multiplied,     
//      //number of columns in first matrix must be equal to number of rows in second matrix    
//      if(col1 != row2){    
//          System.out.println("Matrices cannot be multiplied");    
//      }    
//      else{    
        int product[][]=new int [3][3];
        
		
        for(int  i = 0; i < a.length; i++){ 
        
            for(int j = 0; j < a.length; j++){  
            	for(int k = 0; k < a.length; k++){  
            	
                product[i][j]=product[i][j]+a[i][k]*b[k][j];
            }
            
        }
        }
       
        System.out.println("input a:");
		for (int j = 0; j < a.length; j++) {
			System.out.println(Arrays.toString(a[j]));
		}
		
		System.out.println("input b:");
		for (int k = 0; k < b.length; k++) {
			System.out.println(Arrays.toString(b[k]));
		}
		System.out.println("addition of two matrices:");
		for (int l = 0; l < product.length; l++) {
			System.out.println(Arrays.toString(product[l]));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
        
	}

}
