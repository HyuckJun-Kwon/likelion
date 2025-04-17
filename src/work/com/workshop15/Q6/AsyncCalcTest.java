package work.com.workshop15.Q6;

import java.util.concurrent.*;

public class AsyncCalcTest {
    public static void main(String[] args) throws InterruptedException {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 200 + 100;
        });

        future.thenAccept(result -> System.out.println("계산 결과: " + result));

        Thread.sleep(1000); // 비동기 완료 대기
        System.out.println("main 종료");
    }
}
