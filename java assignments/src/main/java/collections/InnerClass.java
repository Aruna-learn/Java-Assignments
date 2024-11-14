package collections;

public class InnerClass {
	
	class In{
		void run() {
			System.out.println("running....");
		}
	}

	public static void main(String[] args) {
		InnerClass ic=new InnerClass();
	InnerClass.	In i=ic.new In();
		i.run();

	}

}
