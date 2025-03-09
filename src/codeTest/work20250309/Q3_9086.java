package codeTest.work20250309;

import java.util.Scanner;

public class Q3_9086 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        String[] str = new String[i];

        for (int j = 0; j < i; j++) {
            String s = scanner.next();
            str[j] = s.charAt(0) + "" + s.charAt(s.length() - 1);
        }

        for (String str2 : str){
            System.out.println(str2);
        }

    }
}
