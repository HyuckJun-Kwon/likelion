package codeTest.work20250308;

import java.util.Scanner;

public class Q2_10871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0 ; i < arr1.length ; i++){
            arr1[i] = scanner.nextInt();
            if(x > arr1[i]){
                arr2[i] += arr1[i];
            }
        }

        for (int i : arr2) {
            if (i != 0) {
                System.out.printf("%d ", i);
            }

        }
    }
}
