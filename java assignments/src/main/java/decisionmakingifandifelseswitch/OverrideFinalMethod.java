package decisionmakingifandifelseswitch;

 class Add{
	final int add(int a, int b) {
		return a+b;
	}
}
// class Sub extends Add{
//	final int add(int a, int b) { 	
//		return a * b;
//		 } 
// }
 
 //As evident from the above Output, attempting to Override a final method causes a compile-time error.
 //This proves that final methods cannot be overridden in Java.
 
 //In the beginning, it was discussed that methods to be Overridden follow Dynamic Method Dispatch (late binding)But the methods which are declared as final follow static binding (early binding), which means that the method definition will be grouped with a body at compile-time itself.
 
 
 
public class OverrideFinalMethod {

	public static void main(String[] args) {
		//Sub s=new Sub();
		//System.out.println(s.add(5, 3));
	}

}
