package interview;

public class LeapYear {

	public static void main(String[] args) {
		int year=1624;
		
		if(year%400==0||(year%100!=0 && year%4==0)) {
			System.out.println(year+"is leap year");
		}
		else
			System.out.println("not leap year");
	
		
		//A leap year takes place roughly every four years, when an extra day is added to the Gregorian calendar, making the total duration of that year 366, not 365, days. The extra day is added at the end of the month of February. Feb. 29 is known as leap day.
		
		
		
		

	}

}
