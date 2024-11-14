package decisionmakingifandifelseswitch;

public class RemoveSpaces {

	public static void main(String[] args) {
		String s="Java     is a language";

		s=s.replaceAll("\\s\\s", "");//if multiple places is there we can use like this
		System.out.println(s);
		
		
		
	}

}
