package interview;

import java.util.Scanner;

public class MinLengthWordInArray {

	public static void main(String[] args) {
//		String[] s= {"Coffee","Water","Chai","Diet Coke"};
//
//
//		String minword=s[0];
//		int minindex=0;
//		for (int i = 0; i < s.length; i++) {
//
//			if(s[i].length()<minword.length()) {
//				minword=s[i];
//				minindex=i;
//			}
//		}
//
//		System.out.println("The smallest word is: " + minword);
//		System.out.println("The index of the smallest word is: " + minindex);



Scanner sc=new Scanner(System.in);

System.out.println("enter the array size:");
int size=sc.nextInt();
String[] s=new String[size];
System.out.println("enter the elements");
for(int i=0;i<s.length;i++) {//take the number of elements one by one
	s[i]=sc.next();
}


String minword=s[0];
int minindex=0;
for (int i = 0; i < s.length; i++) {

			if(s[i].length()<minword.length()) {
				minword=s[i];
				minindex=i;
			}
		}



System.out.println("The smallest word is: " + minword);
System.out.println("The index of the smallest word is: " + minindex);




	}

}
