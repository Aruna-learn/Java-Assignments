package decisionmakingifandifelseswitch;

public class OverloadingOfMainMethod {

	//overload the main method but with different parameters only
	public static void main(int a) {
		System.out.println(a);
	}
	public static void main(String[] args) {
		main(9);
	}

}
//we can't ovveride the main method because static method we can't override