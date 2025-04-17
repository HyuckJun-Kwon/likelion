package work.com.workshop15.Q5;

import java.util.concurrent.*;

public class VirtualTest {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

        for (int i = 1; i <= 5; i++) {
            final int num = i;
            executor.submit(() -> {
                try {
                    Thread.sleep(500);
                    System.out.println("가상 스레드 " + num + "번 실행 중");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        executor.shutdown();
        executor.awaitTermination(2, TimeUnit.SECONDS);
        System.out.println("main 종료");
    }
}
