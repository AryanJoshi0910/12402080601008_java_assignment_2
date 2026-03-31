import java.util.LinkedList;
import java.util.Queue;

class A2P2 {
    static Queue<Integer> q = new LinkedList<>();
    static int capacity = 3;
    static Object lock = new Object();

    public static void main(String[] args) {
        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                synchronized (lock) {
                    try {
                        while (q.size() == capacity) lock.wait();
                        q.add(i);
                        System.out.println("Produced: " + i);
                        lock.notifyAll();
                    } catch (InterruptedException e) {}
                }
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                synchronized (lock) {
                    try {
                        while (q.isEmpty()) lock.wait();
                        System.out.println("Consumed: " + q.poll());
                        lock.notifyAll();
                    } catch (InterruptedException e) {}
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
