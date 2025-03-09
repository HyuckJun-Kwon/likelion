package codeTest.work20250309;

import java.util.Scanner;

public class Q10_5622 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int t = 0;

        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'C') t += 3;
            else if (c >= 'D' && c <= 'F') t += 4;
            else if (c >= 'G' && c <= 'I') t += 5;
            else if (c >= 'J' && c <= 'L') t += 6;
            else if (c >= 'M' && c <= 'O') t += 7;
            else if (c >= 'P' && c <= 'S') t += 8;
            else if (c >= 'T' && c <= 'V') t += 9;
            else if (c >= 'W' && c <= 'Z') t += 10;
        }

        System.out.println(t);
    }
}
