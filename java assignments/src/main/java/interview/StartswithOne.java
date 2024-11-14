package interview;

public class StartswithOne {

	public static void main(String[] args) {
		int[] arr = {1, 23, 123, 45, 67};

        System.out.println("Numbers that start with 1:");
        for (int num : arr) {
            if (String.valueOf(num).startsWith("1")) {
                System.out.println(num);
            }
        }
	}

}
