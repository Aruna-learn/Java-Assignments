package interview;

import java.util.HashMap;

public class OutputGenerate {

	public static void main(String[] args) {
		//Write a Java Program to generate Output "a2b3c4" with the input "aabbbcccc"


		String s="aabbbcccc";

		HashMap<Character, Integer> map=new HashMap<Character, Integer>();

		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(map.containsKey(ch)) {
				count=map.get(ch);
				count++;
				map.replace(ch, count);
			}

			else {
				map.put(ch, 1);

			}


		}

		for(Character key:map.keySet()) {
			System.out.print(key+"  "+map.get(key));
		}














	}

}
