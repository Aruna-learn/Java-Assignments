package interview;

public class MagicNumber {

	public static void main(String[] args) {
		
		//The number is called a Magic number, If the sum of its digits is calculated till a single digit recursively by adding the sum of the digits after every addition. If the single-digit comes out to be 1, then the number is a magic number.
		int sum=0;
		int n=1890;
		int remainder=1;
		int num=n;
		 while (n > 0 || sum > 9) {

             if (n == 0) {

                   n = sum;

                   sum = 0;

             }

             sum =sum+ n % 10;

            n= n / 10;

       }
			
		
		if(sum==1) {
			System.out.println("magic number");
		}
			else
				System.out.println(" not magic number");
		

	}

}
