import java.util.concurrent.*;

class A2P1 {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) throws InterruptedException {
        int limit = 50;

        Thread t = new Thread(() -> {
            System.out.print("Thread: ");
            for (int i = 2; i <= limit; i++)
                if (isPrime(i)) System.out.print(i + " ");
            System.out.println();
        });

        Runnable r = () -> {
            System.out.print("Runnable: ");
            for (int i = 2; i <= limit; i++)
                if (isPrime(i)) System.out.print(i + " ");
            System.out.println();
        };

        ExecutorService ex = Executors.newSingleThreadExecutor();
        t.start();
        t.join();
        new Thread(r).start();
        Thread.sleep(100);
        ex.submit(() -> {
            System.out.print("Executor: ");
            for (int i = 2; i <= limit; i++)
                if (isPrime(i)) System.out.print(i + " ");
            System.out.println();
        });
        ex.shutdown();
    }
}
