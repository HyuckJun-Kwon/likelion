package codeTest.work20250310;

import java.util.Scanner;

public class Q7_1316 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < N; i++) {
            String word = scanner.next();
            if (isGroupWord(word)) {
                count++;
            }
        }

        scanner.close();
        System.out.println(count);
    }

    private static boolean isGroupWord(String word) {
        boolean[] seen = new boolean[26];
        char prev = ' ';

        for (char c : word.toCharArray()) {
            if (prev != c) {
                if (seen[c - 'a']) {
                    return false;
                }
                seen[c - 'a'] = true;
            }
            prev = c;
        }
        return true;
    }
}
