package decisionmakingifandifelseswitch;

public class NumberPattern {

	public static void main(String[] args) {
		int i,j;

	    for(i=1;i<=4;i++) {

	        for (j=1;j<=4-i;j++) {

	            System.out.print(" ");

	        }

	        for(j=1;j<=i;j++) {

	            System.out.print(j);

	        }

	        for(j=i-1;j>=1;j--) {

	            System.out.print(j);

	        }

	        System.out.println();

	    }

	    for(i=3;i>=1;i--) {

	        for(j=1;j<=4-i;j++) {

	            System.out.print(" ");

	        }

	        for(j=1;j<=i;j++) {

	            System.out.print(j);

	        }

	        for(j=i-1;j>=1;j--) {

	            System.out.print(j);

	        }

	        System.out.println();

	    }

	}

}
