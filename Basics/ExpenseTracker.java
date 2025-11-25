package Basics;

import java.util.ArrayList;

public class ExpenseTracker {
    public static void main(String[] args) {
        ArrayList<Double> prices = new ArrayList<>();
        prices.add(12.50);
        prices.add(45.00);
        prices.add(10.75);

        double total = 0;

        for (double n :prices) {
            total = total+n;
            System.out.println("Printing prices: "+ n);
        }
        System.out.println("Total Spend: "+total);

    }
}
