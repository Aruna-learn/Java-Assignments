package interview;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int a[]= {2,3,8,9,1,7};// 1 2 3 7 8 9
		
		int len=a.length;
		int temp;
		for(int i=0;i<=a.length-1;i++) {
		    for(int j=i+1;j<=a.length-1;j++) {
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		}
		System.out.println(a[4]);
		
		
		
		Arrays.sort(a);
		System.out.println(a[4]);
		
		
		
		
		
		
		
		
		
		
		

	}

}
