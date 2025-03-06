package codeTest.work20250307;

import java.util.Scanner;

public class Q3_8393 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int sum = 0;
        for (int j = 1 ; j <(i+1) ; j++){
            sum += j;
        }
        System.out.println(sum);
    }
}
