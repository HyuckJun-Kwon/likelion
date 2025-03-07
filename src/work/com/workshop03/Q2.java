package work.com.workshop03;

public class Q2 {

	public static void main(String[] args) {
		int i = 1;
		while(i <= 11) {
			int j = 1;
			while(j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
