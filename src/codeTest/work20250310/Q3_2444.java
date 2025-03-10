package codeTest.work20250310;

import java.util.Scanner;

public class Q3_2444 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        String str = "*";
        String str2 = " ";

        for (int i = 1 ; i <= num ; i++){
            int res = (i*2) - 1;
            System.out.println(str2.repeat((num-i))+str.repeat(res));
        }
        for (int j = (num-1); j > 0 ; j--){
            int res = (j *2) - 1;
            System.out.println(str2.repeat((num- j))+str.repeat(res));
        }
    }
}
