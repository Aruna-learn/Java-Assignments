package collections;

import java.util.Arrays;

public class SameElementsInArray {

	public static void main(String[] args) {
		/*int a[] = {1,2,3,4};

		int b[] = {2,1,4,3};

		boolean status=false;
		if(a.length!=b.length) {
			status=false;
			System.out.println("elements not same ");
		}
		
		else {
			Arrays.sort(a);

         Arrays.sort(b);
			for(int i=0;i<a.length;i++) {
				
					if(a[i]!=b[i]) {
						status=false;
					break;
					}
				status=true;
				}
		
		}

	
		
			 if (status)

	                System.out.println("Arrays are having same values");

	          else

	                System.out.println("Arrays are not having same values");
		
		
		*/
		String s="Aruna Reddy java is learning";
			 
		
		  String[] words=s.split(" "); 
		  String maxwordlen=words[0];
		  String minword=words[0];
		  
		  for (int i = 1; i < words.length; i++) {
			  // we take zero already so starts  from 1 
		 
		  if(words[i].length()>maxwordlen.length()) {
			  maxwordlen=words[i];
		  }
		  else
			 if( words[i].length()<minword.length()) {
				 minword=words[i];
			 }
				 
		  
		  
		  }
		  
		  
		  
		  
		  System.out.println(maxwordlen);
		 
		  System.out.println(minword);
				 
		
		
		
		
	}

}
