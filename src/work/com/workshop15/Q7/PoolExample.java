package work.com.workshop15.Q7;

import java.util.concurrent.*;

public class PoolExample {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            final int taskNum = i;
            pool.execute(() -> System.out.println("작업 " + taskNum + " 처리 중"));
        }

        pool.shutdown();
    }
}
