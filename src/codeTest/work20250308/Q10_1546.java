package codeTest.work20250308;

import java.util.Scanner;

public class Q10_1546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] records = new int[num];
        double[] newRecords = new double[num];
        double sum = 0;

        for (int i = 0 ; i < records.length ; i++){
            records[i] = scanner.nextInt();
        }

        double max = records[0];
        for (int j = 0 ; j < records.length ; j++){
            if (max < records[j]){
                max = records[j];
            }
        }

        for (int k = 0 ; k < newRecords.length ; k++){
            newRecords[k] = (records[k]/max) * 100;
            sum += newRecords[k];
        }

        double avg = sum/(double) num;
        System.out.println(avg);
    }
}
