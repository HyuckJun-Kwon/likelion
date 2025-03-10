package codeTest.work20250310;

import java.util.Scanner;

public class Q2_3003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] correctPieces = {1, 1, 2, 2, 2, 8};
        int[] inputPieces = new int[6];


        for (int i = 0; i < 6; i++) {
            inputPieces[i] = scanner.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            System.out.print((correctPieces[i] - inputPieces[i]) + " ");
        }
    }
}
