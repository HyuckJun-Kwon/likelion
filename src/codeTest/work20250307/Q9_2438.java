package codeTest.work20250307;

import java.util.Scanner;

public class Q9_2438 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cnt = scanner.nextInt();
        String str = "*";
        for (int i = 1 ; i <= cnt ; i++){
            System.out.println(str.repeat(i));
        }
    }
}
