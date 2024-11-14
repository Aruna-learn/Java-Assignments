package decisionmakingifandifelseswitch;

import java.util.Scanner;

public class WeekdaySwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  dayname:");
		String dayName=sc.next();
		
		switch(dayName) {
		case "Monday":
		case "tuesday":
		case "wednesday":
		case "thursday":
		case "friday":
		System.out.println("Uff, it's week day");
			break;
			
		case "saturday":
		case "sunday":
			
			System.out.println("yahoo, it's weekend");
			break;
			default:
				System.err.println("invalid dayname!!");
		}
		sc.close();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
