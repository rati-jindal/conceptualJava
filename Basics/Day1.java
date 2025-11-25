package Basics;

public class Day1 {

    static String salaryCalculator(int hoursWorked, double hourlyRate, boolean isBonusEligible) {
        double grossSalary = hourlyRate * hoursWorked;
        if (isBonusEligible)
            grossSalary = grossSalary + 100;
        int totalSalary = (int) grossSalary;
        return "Your calculated salary is :" + totalSalary;
    }

    String salaryCalculatorr(int hoursWorked, double hourlyRate, boolean isBonusEligible) {
        double grossSalary = hourlyRate * hoursWorked;
        if (isBonusEligible)
            grossSalary = grossSalary + 100;
        int totalSalary = (int) grossSalary;
        return "Your calculated salary is :" + totalSalary;
    }

    public static void main(String[] args) {
        System.out.println(salaryCalculator(50, 20.5, true));
        Day1 finalPayCheck = new Day1();
        System.out.println(finalPayCheck.salaryCalculatorr(50,20,true));


    }
}
