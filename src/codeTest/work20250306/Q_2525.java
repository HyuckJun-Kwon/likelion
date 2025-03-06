package codeTest.work20250306;

import java.util.Scanner;

public class Q_2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int totalMinutes = a * 60 + b + c;
        int newHour=0;

        if(totalMinutes>23){
            newHour = (totalMinutes / 60) % 24;
        }
        int newMinute = totalMinutes % 60;

        System.out.println(newHour + " " + newMinute);
    }
}
