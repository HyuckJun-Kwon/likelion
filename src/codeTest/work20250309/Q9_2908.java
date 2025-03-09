package codeTest.work20250309;

import java.util.Scanner;

public class Q9_2908 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();

        int revA = Integer.parseInt(new StringBuilder(s1).reverse().toString());
        int revB = Integer.parseInt(new StringBuilder(s2).reverse().toString());

        System.out.println(Math.max(revA, revB));
    }
}
