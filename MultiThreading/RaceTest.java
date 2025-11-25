package MultiThreading;

public class RaceTest {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        Thread t1 = new Thread(() -> {
            for(int n = 0; n<=9999; n++){
                acc.addMoney();
            }
        });
        Thread t2 = new Thread(() -> {
            for(int n = 0; n<=9999; n++){
                acc.addMoney();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final Balance: " + acc.balance);
    }
}
