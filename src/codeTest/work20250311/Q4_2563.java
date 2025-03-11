package codeTest.work20250311;

import java.util.Scanner;

public class Q4_2563 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] paper = new int[100][100];
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            for (int j = a; j < a + 10; j++) {
                for (int k = b; k < b + 10; k++) {
                    paper[k][j] = 1;
                }
            }

        }

        int res = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (paper[i][j] == 1) {
                    res += paper[i][j];
                }
            }
        }
        System.out.println(res);

    }
}
