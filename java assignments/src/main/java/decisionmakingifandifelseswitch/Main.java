package decisionmakingifandifelseswitch;

public class Main {
	static{
		System.out.println("reddy");
		System.exit(0);
	}
	
 public static void main(String[] args) {
	 
     //System.out.println("aruna");
	 
	 
}
}



//1. we can use the main method without static also but we have to create the instacne of the class coz JVM always look for the instance if static not mentioned
//If the main method wasn't static, the command to run the program would have to specify extra information about how to make a class instance, which would make the command-line execution process more difficult. The main method can be called directly because it is static, which makes command-line calling easier.

/*
 * Java main() method is always static, so that compiler can call it without the
 * creation of an object or before the creation of an object of the class. I
 * will try to explain this by an example. Let us suppose that we defined a
 * normal or non static method in our program that return sum of two numbers A &
 * B. Now we call this in our main method by creating one instance. In the same
 * way, if we create ten instances (object) of its class then every time the
 * object is created, it will require that much memory. Now, because i required
 * this method multiple times in my program it had create it object first which
 * in turn used more memory. But if we had defined this method as static, we
 * could use it as many times as we require in our program without creating its
 * object or instance. Hence saving the memory. So my friend, this is why main
 * method is defined as static in order to save memory.
 */




















//2.why we need to use string[] args always in main instead of int args[it will not run if we write like this and no error will writing the code)
//public static void main(Integer[] args)
//Because everything you pass as argument to your program on the command line can be represented as a string. Not as doubles or integers

//3. can we run program without main method
// yes using static block


//4. can we print some data without static block and main empty
//yes using static method and static variable with return type
//public static int printstring() {
//	System.out.println("aruna");
//	return 1;
//}
//static int p=printstring();
//	}
