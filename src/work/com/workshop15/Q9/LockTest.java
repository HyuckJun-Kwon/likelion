package work.com.workshop15.Q9;

public class LockTest {
    public static void main(String[] args) {
        SharedResource res = new SharedResource();

        Thread t1 = new Thread(res::safeAccess);
        Thread t2 = new Thread(res::safeAccess);

        t1.start();
        t2.start();
    }
}
