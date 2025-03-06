package codeTest.work20250307;

import java.util.Scanner;

public class Q2_10950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int[] a = new int[i];
        int[] b = new int[i];
        int[] sum = new int[i];

        for (int j = 0 ; j < i ; j++){
            a[j] = scanner.nextInt();
            b[j] = scanner.nextInt();

            sum[j] = a[j] + b[j];
        }

        for (int num = 0 ; num < i; num++){
            System.out.println(sum[num]);
        }
    }
}
