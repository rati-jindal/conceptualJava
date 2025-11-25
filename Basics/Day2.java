package Basics;

import java.util.*;

public class Day2 {
    public static void main(String[] args) {
        double closingPrice = 50.0;
        for (int i = 1; i <= 7; i++) {
            closingPrice = closingPrice + (Math.random()*5);
            if (closingPrice > 60.0) {
//                System.out.println("Day" + i + ": Price is " + closingPrice + ". SELL!");
                System.out.printf("Day %d: Price is %.2f. SELL!%n", i, closingPrice);
            } else {
//                System.out.println("Day" + i + ": Price is " + closingPrice + ". SELL!");
                System.out.printf("Day %d: Price is %.2f. HOLD!%n", i, closingPrice);
            }
//            Note: %n inside printf creates a new line.
        }
    }
}
