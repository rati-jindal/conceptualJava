package StreamChallenges.DailyRollup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class DailySummary {
    double totalAmount;
    long count;
    double maxAmount;

    // You'll need a constructor to combine data
//    The Task: Write a method summarize(List<Transaction> transactions) that returns a DailySummary.
//
//The Hint: You will need the 3-argument reduce method:
//
//Identity: The starting "empty" summary.
//
//Accumulator: How to add one Transaction into a DailySummary.
//
//Combiner: How to merge two DailySummary objects together (crucial for parallel streams).
    public DailySummary(double totalAmount, long count, double maxAmount) {
        this.totalAmount = totalAmount;
        this.count = count;
        this.maxAmount = maxAmount;
    }

    List<Transaction> transactions = new ArrayList<>();
    DailySummary result = transactions.stream()
            .reduce(
                    new DailySummary(0, 0, 0.0), // 1. Identity (Start empty)

                    (summary, t) ->
                            // 2. Accumulator
                            // TODO: Return a NEW DailySummary that adds 't' to 'summary'
                            new DailySummary(
                                    summary.totalAmount + t.getAmount(),
                                    summary.count + 1,
                                    Math.max(summary.maxAmount, t.getAmount())
                            ),


                    (s1, s2) ->
                            // 3. Combiner
                            // TODO: Return a NEW DailySummary that combines s1 and s2
                            new DailySummary(
                                    s1.totalAmount + s2.totalAmount,
                                    s1.count + s2.count,
                                    Math.max(s1.maxAmount, s2.maxAmount)
                            )

            );
}
