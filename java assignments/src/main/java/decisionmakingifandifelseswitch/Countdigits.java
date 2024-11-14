package decisionmakingifandifelseswitch;

public class Countdigits {

	public static void main(String[] args) {
		int num=3450875;
		
		int countdigit=0;
		while(num>0) {
			num=num/10;
			countdigit++;
		}
		System.out.println(countdigit);
		
		
		
		
		

	}

}
