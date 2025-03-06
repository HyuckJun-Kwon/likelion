package codeTest.work20250307;

import java.util.Scanner;

public class Q4_25304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPrice = scanner.nextInt();
        scanner.nextLine();

        int totalCnt = scanner.nextInt();
        scanner.nextLine();

        int[] product = new int[totalCnt];
        int[] price = new int[totalCnt];
        int[] sum = new int[totalCnt];
        int calc = 0;

        for (int i = 0 ; i < totalCnt ; i++){
            product[i] = scanner.nextInt();
            price[i] = scanner.nextInt();

            sum[i] = (product[i] * price[i]);
            calc += sum[i];
        }

        if (totalPrice == calc){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
