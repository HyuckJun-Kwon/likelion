package codeTest.work20250309;

import java.util.Scanner;

public class Q5_11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String num2 =scanner.next();

        int sum = 0;

        for (int i = 0 ; i < num ; i++){
            sum += num2.charAt(i) - '0';
        }

        System.out.println(sum);

    }
}
