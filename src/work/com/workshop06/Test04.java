package work.com.workshop06;

import java.util.Random;

public class Test04 {
    public static void main(String args[]) {
        if (args.length != 2) {
            System.out.println("다시 입력 하세요");
            return;
        }
        
        int rows = Integer.parseInt(args[0]);
        int cols = Integer.parseInt(args[1]);
        
        if (rows < 1 || rows > 5 || cols < 1 || cols > 5) {
            System.out.println("숫자를 확인 하세요");
            return;
        }
        
        int[][] array = new int[rows][cols];
        Random random = new Random();
        double sum = 0;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = random.nextInt(5) + 1;
                sum += array[i][j];
            }
        }
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        
        double avg = sum / (rows * cols);
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}
