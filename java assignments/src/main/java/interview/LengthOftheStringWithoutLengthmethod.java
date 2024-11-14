package interview;

public class LengthOftheStringWithoutLengthmethod {

	static int i,c;
	
	static void length(String s) {
		try {
			 for(i=0,c=0;0<=i;i++,c++) {
				s.charAt(i);
			}
		}
			catch(StringIndexOutOfBoundsException e)

	        {

	          System.out.println("");

	            System.out.print("The length of the string \""+s+"\" is " +c);

	        }

	    
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		String s="aruna";
		
		length(s);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
