package interview;

public class LinkediN {

	public static void main(String[] args) {
		String str = "sumitM28";
		 char[] charArray = str.toCharArray();
		 
		 
		 
		 for (char c : charArray) {
		 if(c > 90) {
		 System.out.print(c);
		 }
		 }
		 System.out.println();
		 for (char c : charArray) {
		 if(c >= 65 && c <= 90) {
		 System.out.print(c);
		 }
		 }
		 System.out.println();
		 
		 for (char c : charArray) {
		 if(Character.isDigit(c)) {
		 System.out.print(c);
		 }
		 }
		 System.out.println();

	}

}
