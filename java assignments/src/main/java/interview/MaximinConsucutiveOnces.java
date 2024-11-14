package interview;

public class MaximinConsucutiveOnces {

	public static void main(String[] args) {
		//int a[] = { 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1 };
//
//		int max=0;
//		int count=0;
//		
//		for(int i=0;i<a.length;i++) {
//			
//			while( i < a.length && a[i] ==1) {
//				count++;
//				i++;
//				}
//				if(max<count)
//					max=count;
//				count=0;
//		}
//		System.out.println(max);
//		
		//Write a Java Program to print numbers 1 to 100 without using any loop(for/while/do-while).
		
		printnum(70);
		
	}
		public static void printnum(int num) {
		if(num<=100) {
			System.out.println(num);
			num++;
			printnum(num);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
