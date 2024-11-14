package decisionmakingifandifelseswitch;

import java.util.Scanner;

public class StudentResult {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		if(n<35) {
			System.out.println(+n+ "fail");
		}
		else if(n==35){
			System.out.println(+n+ "pass");
		}
		else if(n>35&&n<70){
			System.out.println(+n+ "third class");
		}
		else if(n>75&&n<80){
			System.out.println(+n+ "second class");
		}
		else
			System.out.println("first class");

		sc.close();
	}

}
