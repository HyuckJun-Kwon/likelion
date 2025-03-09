package codeTest.work20250309;

import java.util.Scanner;

public class Q6_10809 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int[] a = new int[26];

        for (int i = 0; i < 26; i++){
            a[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (a[index] == -1) {
                a[index] = i;
            }
        }

        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
