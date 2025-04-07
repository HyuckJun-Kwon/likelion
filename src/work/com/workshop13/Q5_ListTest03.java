package work.com.workshop13;

import java.util.ArrayList;
import java.util.Random;

public class Q5_ListTest03 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            list1.add(rand.nextInt(10));
            list2.add(rand.nextInt(10));
        }

        for (int i = 0; i < 10; i++) {
            int numerator = list1.get(i);
            int denominator = list2.get(i);
            try {
                int result = numerator / denominator;
                System.out.println(numerator + "/" + denominator + " " + result);
            } catch (ArithmeticException e) {
                System.out.println(numerator + "/" + denominator + " 분모가 0입니다");
            }
        }
    }
}
