package decisionmakingifandifelseswitch;
//No, we cannot override static methods because method overriding is based on dynamic binding at runtime and the static methods are bonded using static binding at compile time. So, we cannot override static methods.

class Parent{
	public static void display() {
		System.out.println("parent display method");
	}
}
class Child extends Parent{
	public static void display() {
		System.out.println("child display method");
	}
}
public class OverrideStaticMethod {

	public static void main(String[] args) {
		Parent p=new Child();
		p.display();

	}

}
