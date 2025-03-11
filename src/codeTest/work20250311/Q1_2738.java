package codeTest.work20250311;

import java.util.Scanner;

public class Q1_2738 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int a[][] = new int[n][m];
        int b[][] = new int[n][m];
        int sum[][] = new int[n][m];

        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < m ; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < m ; j++) {
                b[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < m ; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < m ; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

    }
}
