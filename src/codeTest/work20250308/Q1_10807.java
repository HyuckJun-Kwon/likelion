package codeTest.work20250308;

import java.util.Scanner;

public class Q1_10807 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        int[] arr = new int[num];

        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = scanner.nextInt();
        }
        int find = scanner.nextInt();
        int cnt = 0;

        for (int j = 0 ; j < arr.length ; j++){
            if (arr[j] == find){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
