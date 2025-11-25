package Basics;

public class BankAccount {
    private String accountHolder;
    private double balance;

    BankAccount(String name, double initialDeposit) {
        this.accountHolder = name;
        this.balance = initialDeposit;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("New Balance is: " + balance);

    }

    void withdrawal(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient Funds");
        } else {
            balance = balance - amount;
            System.out.println("Remaining amount: " + balance);
        }

    }

//    Encapsulation security getters-setters
    public double getBalance() {
        return this.balance;
    }

    public static void main(String[] args) {
        BankAccount alice = new BankAccount("Alice", 300.0);
        BankAccount bob = new BankAccount("Bob", 100);
        alice.deposit(200);
        bob.withdrawal(200);
        System.out.println("Alice's current balance is: " + alice.getBalance());
    }
}
