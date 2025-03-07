package codeTest.work20250308;

import java.util.Scanner;

public class Q4_2562 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[9];
        for (int i = 0; i < arr.length ; i++){
            arr[i] = scanner.nextInt();
            scanner.nextLine();
        }

        int max = arr[0];
        int cnt = 0;
        for (int j = 1 ; j < arr.length ; j++){
            if (max < arr[j]){
                max = arr[j];
                cnt = j;
            }
        }
        System.out.println(max);
        System.out.println(cnt+1);

    }
}
