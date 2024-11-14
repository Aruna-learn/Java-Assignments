package decisionmakingifandifelseswitch;

import java.util.Scanner;

public class ArithmeticSwirtch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  first number:");
		int n1=sc.nextInt();
		
		System.out.println("enter the  scond number:");
		int n2=sc.nextInt();
		
		System.out.println("enter the  target operation:");
		String operation=sc.next();
		
		int result=0;
		
		boolean validOperation = true;
		switch(operation) {
		case "+":
			result=n1+n2;
			break;
		case "-":
			result=n1-n2;
			break;
		case "*":
			result=n1*n2;
			break;
		case "/":
			result=n1/n2;
			break;
		case "%":
			result=n1%n2;
			
			
		}
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
