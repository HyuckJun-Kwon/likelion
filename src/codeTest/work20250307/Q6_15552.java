package codeTest.work20250307;

import java.util.Scanner;

public class Q6_15552 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cnt = scanner.nextInt();
        scanner.nextLine();
        int[] a = new int[cnt];
        int[] b = new int[cnt];
        int[] sum = new int[cnt];

        for (int i = 0; i < cnt ; i++){
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
            sum[i] = a[i] + b[i];
        }

        for (int j = 0; j < cnt ; j++){
            System.out.println(sum[j]);
        }
    }
}
