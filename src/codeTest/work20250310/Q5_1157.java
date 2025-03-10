package codeTest.work20250310;

import java.util.Scanner;

public class Q5_1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next().toUpperCase();

        int[] alphabetCount = new int[26];

        for (char c : word.toCharArray()) {
            alphabetCount[c - 'A']++;
        }

        int maxCount = 0;
        char frequent = '?';
        boolean isDuplicate = false;

        for (int i = 0; i < 26; i++) {
            if (alphabetCount[i] > maxCount) {
                maxCount = alphabetCount[i];
                frequent = (char) (i + 'A');
                isDuplicate = false;
            } else if (alphabetCount[i] == maxCount) {
                isDuplicate = true;
            }
        }

        System.out.println(isDuplicate ? "?" : frequent);
    }
}
