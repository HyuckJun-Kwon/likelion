package work.com.workshop07;

import java.util.HashMap;
import java.util.Random;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();
        Random random = new Random();
        double sum = 0;  

        
        for (int i = 1; i <= 10; i++) {
            int number = random.nextInt(100) + 1;
            map.put(i, number);
            sum += number;
        }

     
        System.out.print("발생한 난수: ");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }
        System.out.println();

        
        double avg = sum / 10.0;

        
        System.out.printf("합계: %.2f%n", sum);
        System.out.printf("평균: %.2f%n", avg);
    }
}
