package work.com.workshop15.Q10;

import java.util.concurrent.*;

public class FutureExample {
    public static void main(String[] args) throws Exception {
        System.out.println("비동기 계산 시작");

        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 200 + 100)
            .thenApply(result -> {
                System.out.println("최초 계산 결과: " + result);
                return result * 2;
            });

        int finalResult = future.get();
        System.out.println("후속 처리 결과 (x2): " + finalResult);
        System.out.println("main 종료");
    }
}
