package codeTest.work20250308;

import java.util.Scanner;

public class Q7_5597 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] students = new boolean[30];


        for (int i = 0; i < 28; i++) {
            int num = scanner.nextInt();
            students[num - 1] = true;
        }

        for (int i = 0; i < 30; i++) {
            if (!students[i]) {
                System.out.println(i + 1);
            }
        }
    }
}
