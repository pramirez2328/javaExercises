public class Calculator {

    static void getMonthlyPayment(Integer principal, Float annualInterestRate, Integer numberOfYears) {
        // Convert annual rate to monthly decimal rate
        float monthlyInterestRate = (annualInterestRate / 100) / 12;

        // Calculate total number of payments (months)
        int numberOfMonths = numberOfYears * 12;

        // Apply the mortgage formula
        double monthlyPayment = principal *
                (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) /
                (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);

        // Display the results
        System.out.println("\n--- Mortgage Calculation ---");
        System.out.printf("Monthly interest rate: %.6f\n", monthlyInterestRate);
        System.out.println("Number of months: " + numberOfMonths);
        System.out.printf("Monthly payment: $%.2f\n", monthlyPayment);
    }
}
