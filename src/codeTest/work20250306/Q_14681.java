package codeTest.work20250306;

import java.util.Scanner;

public class Q_14681 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.nextLine();
        int y = scanner.nextInt();

        if (x>0 && y>0){
            System.out.println("1");
        } else if (x<0 && y>0) {
            System.out.println("2");
        }
        else if (x<0 && y<0) {
            System.out.println("3");
        } else {
            System.out.println("4");
        }
    }
}
