package codeTest.work20250310;

import java.util.Scanner;

public class Q8_25206 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalScore = 0.0;
        double totalCredit = 0.0;

        for (int i = 0; i < 20; i++) {
            String subject = scanner.next();
            double credit = scanner.nextDouble();
            String grade = scanner.next();

            double gradeValue = getGradeValue(grade);

            if (gradeValue != -1) {
                totalScore += credit * gradeValue;
                totalCredit += credit;
            }
        }

        System.out.printf("%.6f%n", totalCredit == 0 ? 0.0 : totalScore / totalCredit);
    }

    private static double getGradeValue(String grade) {
        switch (grade) {
            case "A+": return 4.5;
            case "A0": return 4.0;
            case "B+": return 3.5;
            case "B0": return 3.0;
            case "C+": return 2.5;
            case "C0": return 2.0;
            case "D+": return 1.5;
            case "D0": return 1.0;
            case "F": return 0.0;
            case "P": return -1;
            default: return -1;
        }
    }
}
