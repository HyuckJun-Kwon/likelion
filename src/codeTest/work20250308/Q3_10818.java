package codeTest.work20250308;

import java.util.Scanner;

public class Q3_10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[9];
        for (int i = 0; i < arr.length ; i++){
            arr[i] = scanner.nextInt();
            scanner.nextLine();
        }

        int max = arr[0];
        int min = arr[0];
        for (int j = 1 ; j < arr.length ; j++){
            if(min > arr[j]){
                min = arr[j];
            } else if (max < arr[j]){
                max = arr[j];
            }
        }

        System.out.printf("%d %d", min, max);
    }
}
