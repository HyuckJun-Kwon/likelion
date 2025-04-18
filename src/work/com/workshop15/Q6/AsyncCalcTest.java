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
/*
생성
CompletableFuture
.supplyAsync(Supplier) 결과를 반환하는 비동기 작업 시작
. runAsync(Runnable)   결과 없이 실행하는 비동기 작업 

결과 후 처리 
thenApply(fn):    CompletableFuture<R>
thenAccept(Consumer):    CompletableFuture<Void>
thenRun(Runnable):    CompletableFuture<Void>
thenCombine(future2, (a,b) -> ...) : 두 개의 결과조합
thenAcceptBoth(future2, (a,b) -> ...) : 두 결과 실행 후 종료
runAfterBoth(f1, f2)    : 결과 없이 둘 다 끝난 후 작업

1)Spring Boot     :REST 비동기 응답, 외부 API 호출 조합 처리
2)WebClient + Reactor 연동 : .toFuture() 변환 시 CompletableFuture 사용
3) 백엔드 계산 분리    AI, 이미지 처리 등 비동기 CPU 작업
4) 테스트/모의 비동기 시나리오: CompletableFuture.completedFuture(...) 자주 사용
https://docs.spring.io/spring-data/jpa/reference/repositories/query-return-types-reference.html#appendix.query.return.types
*/