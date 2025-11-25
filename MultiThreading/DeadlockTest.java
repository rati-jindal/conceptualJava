package MultiThreading;

public class DeadlockTest {
    static final Object lock1 = new Object();
    static final Object lock2 = new Object();

    public static void main(String[] args) {


        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1: Holding Lock 1...");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1: Waiting for Lock 2...");

                synchronized (lock2) {
                    System.out.println("Thread 1: Holding Lock 1 & 2!");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2: Holding Lock 2...");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2: Waiting for Lock 1...");

                synchronized (lock1) {
                    System.out.println("Thread 2: Holding Lock 1 & 2!");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
