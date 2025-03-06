package codeTest.work20250307;

import java.util.Scanner;
import java.util.ArrayList;

public class Q11_10952 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> sum = new ArrayList<>();

        while (true){
            int i = scanner.nextInt();
            int j = scanner.nextInt();

            if ((i==0) && (j==0)){
                break;
            }
            sum.add(i+j);
        }

        for (int num : sum){
            System.out.println(num);
        }
    }
}
