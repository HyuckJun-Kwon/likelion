package work.com.workshop06;

public class Test03 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int sum = 0;
        System.out.print("출력 : ");
        boolean first = true;
        for (int i = num; i <= 10; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                if (!first) {
                    System.out.print(" + ");
                }
                System.out.print(i);
                sum += i;
                first = false;
            }
        }
        
        System.out.println("\n결과 : " + sum);

	}

}
