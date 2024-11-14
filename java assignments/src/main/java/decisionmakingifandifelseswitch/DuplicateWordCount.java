package decisionmakingifandifelseswitch;

import java.util.Scanner;

public class DuplicateWordCount {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("please enter the words");
//		
//		String s=sc.next();
		String s="Aruna reddy Aruna";
		s.toLowerCase();
		String words[]=s.split(" ");
		int count;
		
		for(int i=0;i<words.length;i++) {
			count=1;
			if(!words[i].equals("0")) {
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equals(words[j])) {
					count++;
					 //words[j]="0";// Set words[j] to "0" to avoid counting the word again
				}
			}
			 
			if (count > 1) {
                System.out.println(words[i] + ": " + count);
            }

			
		}

		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
