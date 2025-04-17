package work.com.workshop15.Q8;

public class Buffer {
    private int data;
    private boolean empty = true;

    public synchronized void produce(int value) {
        try {
            while (!empty) wait();
            data = value;
            System.out.println("생산됨: " + data);
            empty = false;
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void consume() {
        try {
            while (empty) wait();
            System.out.println("소비됨: " + data);
            empty = true;
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
