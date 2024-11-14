package decisionmakingifandifelseswitch;

public class OverloadStaticMethod {

	
	public static void display(){
		System.out.println("Aruna");
		
	}
	
	//static method over,loading with different parameters
	public static void display(int a) {
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		OverloadStaticMethod.display();
		OverloadStaticMethod.display(4);

	}

}

//
//Here a question arises that can we overload the methods if they are only different by static keyword.
//The answer is No. We cannot override two methods if they differ only by static keyword. For example, consider the following Java program.
//
//OverloadStaticMethodExample2.java
//
//public class OverloadStaticMethodExample2   
//{   
////static method  
//public static void sum(int a, int b)   
//{   
//int c=a+b;  
//System.out.println("The sum is: "+c);   
//}   
////non-static method   
//public void sum(int a, int b)   
//{   
//int c=a+b;  
//System.out.println("The sum is: "+c);   
//}   
////main method  
//public static void main(String args[])   
//{   
////calling static method by using the class name  
//OverloadStaticMethodExample2.sum(12, 90);   
//}   
//}  
//When we compile the above program, it shows the following error.
//
//error: method sum(int,int) is already defined in class OverloadStaticMethodExample2