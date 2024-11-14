package decisionmakingifandifelseswitch;

public class PrimeNumberRange {

	public static void main(String[] args) {
		int num=10;
		int start=2;
		
		
		boolean isprime=true;
		
		while(start<num) {
			if(num%start==0) {
				isprime=false;
				break;
			}
			start++;
			
		}
		
		
		
		if(isprime) {
			System.out.println("given number is prime number");
		}
			else
				System.out.println("not prime number");
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
