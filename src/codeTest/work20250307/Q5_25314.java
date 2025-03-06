package codeTest.work20250307;

import java.util.Scanner;

public class Q5_25314 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cnt = scanner.nextInt();
        String str = "long ";

        System.out.println(str.repeat((cnt/4)) + "int");
    }
}

