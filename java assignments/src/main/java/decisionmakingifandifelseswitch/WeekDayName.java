package decisionmakingifandifelseswitch;

import java.util.Scanner;

public class WeekDayName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the day name:");
		String day=sc.next();
		
		if(day.equals("MOnday")||
		day.equals("Tuesday")||
		day.equals("wednesday")||
		day.equals("thursday")||
		day.equals("friday"))
			System.out.println("Uff, it's week day");
		
		else if(day.equals("saturday")||
				day.equals("sunday"))
				System.out.println("yahoo, it's weekend");
		
		
		
		
		
		
		
		sc.close();
	}

}
