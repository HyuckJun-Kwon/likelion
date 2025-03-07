package work.com.workshop03;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1자리 정수를 입력하세요: ");
        int num = scanner.nextInt();
        int sum = 0;

        for (int i = num; i <= 100; i += num) {
            sum += i;

            if (i == num) {
                System.out.print(i);
            } else {
                System.out.print(" + " + i);
            }
        }
        System.out.println(" = " + sum);
    }

}
