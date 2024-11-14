package interview;

import java.util.Arrays;

public class MaxNumbeInArray {

	public static void main(String[] args) {
		int [] a= {2,5,1,9,6};
		
		int  max=a[0];
		int maxindex=0;
		
		for(int i=0;i<a.length;i++) {
			
				if(a[i]>max) {
					max=a[i];
					maxindex=i;
				}
				System.out.println((a[i]));
				
		}
		//we haven't sorted the array so we get the index 3 as 9 value
		System.out.println("The largest number is: " + max);
        System.out.println("The index of the largest number is: " + maxindex);
		
		
		
		
		
		
		
		
		
			}

}
