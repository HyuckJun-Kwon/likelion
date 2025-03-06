package codeTest.work20250307;

import java.util.Scanner;

public class Q10_2439 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cnt = scanner.nextInt();
        String str = " ";
        String str2 = "*";
        for (int i = 1 ; i <= cnt ; i++){
            System.out.println(str.repeat((cnt-i)) + str2.repeat(i));
        }
    }
}
