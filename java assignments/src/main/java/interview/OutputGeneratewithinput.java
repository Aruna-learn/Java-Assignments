package interview;

public class OutputGeneratewithinput {

	public static void main(String[] args) {
		//Write a Java Program to generate Output "aabbbcccc" with the input "a2b3c4"
		
		String s="a2b3c4";
		
		for(int i=0;i<s.length();i++) {
			if(Character.isAlphabetic(s.charAt(i))) {
			System.out.print(s.charAt(i));
			}
			else {
				int a=Character.getNumericValue(s.charAt(i));
						for(int j=1;j<a;j++) {//j is 1 because in above if already one time printed so we will continue here
							System.out.print(s.charAt(i-1));//2-1=1 a,3-1=2b,4-1=3c
						}
			}
				
				
		}
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		

	}

}
