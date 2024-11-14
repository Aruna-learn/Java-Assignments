package decisionmakingifandifelseswitch;

import java.util.Iterator;

public class OverloadFinalMethod {
	
public final void display(String message) {
	System.out.println("message"+ message);
}
public final void display(String message, int count) {
	for(int i=0;i<count;i++) {
		System.out.println("count is:"+ i);
	}
}

	public static void main(String[] args) {
		OverloadFinalMethod af=new OverloadFinalMethod();
		af.display("arunareddy");
		af.display("count is:", 9);

	}

}
