package LambdaStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;


//The Scenario: You are working on a financial backend. You have a List<Transaction> containing 10 million transaction objects.
//
//Java
//
//class Transaction {
//    int id;
//    double amount; // The important field
//
//    // constructor and getters...
//    public double getAmount() { return amount; }
//}
//The Task: We need to calculate the Total Sum of all transactions where the amount is greater than $100.00.
//
//The Challenge: Write a Stream pipeline to solve this.
//
//Constraint: You must write it in a way that avoids the "Boxing Penalty".
//
//Hint: If you use standard Stream<Double>, the JVM will create millions of wrapper objects during the summation. We want to avoid that.
public class Transaction {
    int id;
    double amount;

    // constructor and getters...
    public double getAmount() {
        return amount;
    }

    List<Transaction> transactions = new ArrayList<>();

    double total = transactions.stream()
            .filter(t -> t.getAmount() > 100.00)
            .mapToDouble(Transaction::getAmount)
            .sum();


}
