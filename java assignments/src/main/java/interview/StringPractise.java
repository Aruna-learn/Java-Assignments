package interview;

import java.util.Scanner;

public class StringPractise {

	public static void main(String[] args) {
				
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String s=sc.nextLine();


		// to find the length of the string---------------------------------------------------------------

		/*
		 * String s="Aruna reddy Poololla";
		 * 
		 * System.out.println("length of the string is:"+s.length());//it gives length
		 * 11 includes space
		 */		

		//to find the count of number of chars in string---------------------------------------------------------------
		int count=0;
		/*
		 * for (int i = 0; i < s.length(); i++) {
		 * 
		 * if(s.charAt(i)!=' ') { count++; } }
		 * System.out.println("number of character in string is:"+count);
		 */




		//no of words in the string---------------------------------------------------------------

		/*
		 * for (int i = 0; i <s.length(); i++) { if(s.charAt(i)==' '&& s.charAt(i+1)!='
		 * ') { count++; } }
		 * 
		 * System.out.println("no of words in the  string is:"+ count);
		 */


		// wecan use with split method also---------------------------------------------------------------
		//String[] words=	s.split(" ");
		//System.out.println(words.length);




		// no of occurences in string using target character---------------------------------------------------------------
		//System.out.println("please enter the target character");
		/*
		 * char targetchar=sc.next().charAt(0);// in string getting the character char[]
		 * ch=s.toCharArray();
		 * 
		 * for (int i = 0; i < ch.length; i++) { if(ch[i]==targetchar) { count++; } }
		 * System.out.println(count);
		 */



		//reverse string using char at---------------------------------------------------------------

		/*
		 * String rev="";
		 * 
		 * for (int i =s.length()-1; i>=0; i--) { rev=rev+s.charAt(i); }
		 * 
		 * System.out.println(rev);
		 */

		//reverse string using char  array---------------------------------------------------------------


		//		  String rev=""; char[] ch=s.toCharArray(); for (int i =ch.length-1; i>=0; i--)
		//		  { rev=rev+ch[i]; } System.out.println(rev);

		//		  hello world
		//		  dlrow olleh
		//		  



		//remove starting and ending spaces using trim(removes the starting and ending spaces but not the spaces betweent he string)
		//		System.out.println("before trim of the string:"+s);
		//		System.out.println("after trim og the string:"+s.trim());


		//reverse each word
				
		/*
		 * String[] word=s.split(" "); String revwordstring="";
		 * 
		 * for(int i=0;i<word.length;i++) { String w=word[i];
		 * 
		 * String rev=""; for (int j =w.length()-1; j>=0; j--) { rev=rev+w.charAt(j); }
		 * 
		 * if(i!=word.length-1) // to remove the extra space in last after word reverse
		 * revwordstring=revwordstring+rev+" ";
		 * 
		 * else revwordstring=revwordstring+rev; }
		 * 
		 * System.out.println(revwordstring);
		 */

			//		hello world
			//		olleh dlrow 















			sc.close();

		}

	}
