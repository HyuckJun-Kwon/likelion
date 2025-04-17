package work.com.workshop15.Q9;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    private final ReentrantLock lock = new ReentrantLock();

    public void safeAccess() {
        lock.lock();
        try {
            System.out.println("잠금 획득");
        } finally {
            System.out.println("잠금 해제");
            lock.unlock();
        }
    }
}
