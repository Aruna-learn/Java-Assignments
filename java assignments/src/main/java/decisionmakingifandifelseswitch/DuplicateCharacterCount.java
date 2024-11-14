package decisionmakingifandifelseswitch;

import java.util.Scanner;

public class DuplicateCharacterCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the string");
		String s=sc.next();

char[] ch=s.toCharArray();

int count=1;
for(int i=0;i<s.length()-1;i++) {
	for(int j=i+1;j<s.length();j++) {
	if(ch[i]==ch[j]) {
		count++;
		
	}
}
	System.out.println("duplicate characters are:"+ch[i]);

}
System.out.println("duplicate character count is:"+count);









	}

}
