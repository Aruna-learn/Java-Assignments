package decisionmakingifandifelseswitch;

public class CountTotalOfNumber {

	public static void main(String[] args) {
		int num=871;
		int sum=0;
		for(int i=num;i>=0;i--) {
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
		

	}

}
