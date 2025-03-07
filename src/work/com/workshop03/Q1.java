package work.com.workshop03;

public class Q1 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1 ; i < 21 ; i++) {
			if ((i % 2 != 0) && (i % 3 != 0)) {
				sum += i;
			}
		}
		System.out.printf("sum = %d", sum);

	}

}
