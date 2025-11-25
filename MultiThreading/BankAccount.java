package MultiThreading;

public class BankAccount {
    int balance = 0;

    synchronized void addMoney(){
        balance++;
    }
}
