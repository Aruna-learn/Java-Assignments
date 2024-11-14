package interview;

import java.util.Arrays;
import java.util.Scanner;

public class StringPractise1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String s=sc.nextLine();

		//change odd words to uppercase and reverse the even words-------------------------------------------------


		/*
		 * String[] word=s.split(" "); String revwordstring="";
		 * 
		 * for(int i=0;i<word.length;i++) { String w=word[i]; if(i%2==0) {
		 * revwordstring=w.toUpperCase(); } else {
		 * 
		 * 
		 * String rev=""; for (int j =w.length()-1; j>=0; j--) { rev=rev+w.charAt(j); }
		 * 
		 * if(i!=word.length-1) // to remove the extra space in last after word reverse
		 * revwordstring=revwordstring+rev+" ";
		 * 
		 * else revwordstring=revwordstring+rev; }
		 * 
		 * System.out.println(revwordstring);
		 * 
		 * 
		 * }
		 */


		//print count of uppercase, lowercase digits and  special char count-------------------------------------------------

		/*
		 * int uppercount=0; int lowercount=0; int digitscount=0; int
		 * specialcharacters=0;
		 * 
		 * char[] ch=s.toCharArray(); for (char c : ch) { if(Character.isUpperCase(c))
		 * uppercount++; else if(Character.isLowerCase(c)) lowercount++;
		 * 
		 * else if(Character.isDigit(c)) digitscount++; else specialcharacters++;
		 * 
		 * }
		 * 
		 * System.out.println("uppecase count is:"+uppercount);
		 * System.out.println("lowercase count is:"+lowercount);
		 * System.out.println("digits count is:"+digitscount);
		 * System.out.println("specialcha count is:"+specialcharacters);
		 */


		//first repeated and nonrepeated char-------------------------------------------------


		/*
		 * for (int i = 0; i < s.length(); i++) { int count=1; for (int j = i+1; j <
		 * s.length(); j++) { if(s.charAt(i)==s.charAt(j)) { count++;
		 * 
		 * } }
		 * 
		 * // if (count==1) { // System.out.println("first nonrepeating character is:"+
		 * count+" "+s.charAt(i)); // break; // } if (count>1) {
		 * System.out.println("first repeating character is:"+ count+" "+s.charAt(i));
		 * break; } }
		 */


		//create an array using the words at odd position-------------------------------------------------

		/*
		 * String[] words=s.split(" ");
		 * 
		 * String[] oddarr=new String [words.length/2];
		 * 
		 * int index=0; for (int i = 0; i < words.length; i++) { if(i%2==0) {//i%2==0
		 * because of zero based index to get the odd position oddarr[index]=words[i];
		 * index++; }
		 * 
		 * } System.out.println(Arrays.toString(oddarr));
		 */


		//find max length word in strig(if two words are same length then taake fisrst occurence)-------------------------------------------------

		/*
		 * String[] words=s.split(" "); String maxwordlen=words[0];
		 * 
		 * for (int i = 1; i < words.length; i++) {// we take zero already so starts
		 * from 1 if(words[i].length()>maxwordlen.length()) maxwordlen=words[i]; }
		 * 
		 * System.out.println(maxwordlen);
		 */

		//compare 2 strings, if char in string 1 are present in string 2 then print the same char else print+ ignore the case -------------------------------------------------
		//		Scanner sc=new Scanner(System.in);
		//		System.out.println("enter the string1:");
		//		String s=sc.nextLine();
		//
		//		System.out.println("enter the string2:");
		//		String s1=sc.nextLine();


		// iterate each char in string 1 and stor in tempchar and compare with 2nd string
		/*
		 * String output=""; for (int i = 0; i < s.length(); i++) { char
		 * temp=s.toLowerCase().charAt(i); if(s1.toLowerCase().indexOf(temp)>=0) {
		 * output=output+s.charAt(i); } else output=output+'+'; }
		 * 
		 * System.out.println(output);
		 */



		//Given hthe firstname and last name and print the ;last name followed by , and firstname first character-------------------------------------------------

		//		String Output=s1+","+s.charAt(0);
		//		
		//		System.out.println(Output);
		//		
		//		enter the string1:
		//			Aruna
		//			enter the string2:
		//			Reddy
		//			Reddy,A


		//to get the file extensions-------------------------------------------------

		//		String Output=s.substring(s.lastIndexOf(".")+1,s.length());
		//		
		//		System.out.println(Output);

		//string palindrome or not-------------------------------------------------

		String rev="";
		String original=s;
		for (int i = s.length()-1;i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);

		if(original.equals(rev)) {
			System.out.println("string is palindrome");
		}
		else
			System.out.println("string is not palindrome");





	}

}
