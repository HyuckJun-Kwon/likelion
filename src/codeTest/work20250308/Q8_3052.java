package codeTest.work20250308;

import java.util.Scanner;

public class Q8_3052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] arr = new boolean[42];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            int a = num % 42;

            if (!arr[a]) {
                arr[a] = true;
                count++;
            }
        }

        System.out.println(count);
    }
}
