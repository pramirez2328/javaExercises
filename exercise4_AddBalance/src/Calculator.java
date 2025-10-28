public class Calculator {

    static void getMonthlyPayment(Integer principal, Float annualInterestRate, Integer numberOfYears) {
        double balance = (double) principal;
        double realAmountPaid = 0;
        // Convert annual rate to monthly decimal rate
        float monthlyInterestRate = (annualInterestRate / 100) / 12;

        // Calculate total number of payments (months)
        int numberOfMonths = numberOfYears * 12;

        // Apply the mortgage formula
        double monthlyPayment = principal *
                (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) /
                (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);


        for (int recurringPayment = 1; recurringPayment <= numberOfMonths; recurringPayment++) {

            realAmountPaid += monthlyPayment;
            // Apply the remaining balance formula: B = L[(1 + c)^n - (1 + c)^p] / [(1 + c)^n - 1]
            // Where: L = principal, c = monthly rate, n = total months, p = payments made
            balance = principal *
                    (Math.pow(1 + monthlyInterestRate, numberOfMonths) -
                            Math.pow(1 + monthlyInterestRate, recurringPayment)) /
                    (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);

            System.out.printf("Your balance after payment #%d is $%.2f.\n", recurringPayment, balance);
        }
        // Display the results
        System.out.println("\n--- Mortgage Calculation ---");
        System.out.println("Annual interest rate: " + annualInterestRate + "%");
        System.out.println("Number of months: " + numberOfMonths);
        System.out.printf("Monthly payment: $%.2f\n", monthlyPayment);
        System.out.println("Initial loan:" + principal);
        System.out.printf("Real final amount paid after interest: $%.2f.\n", realAmountPaid);
        System.out.printf("---YOU PAID: $%.2f ON INTEREST---\n", (realAmountPaid - principal));
        System.out.printf("---YOUR LOAN COST YOU $%.2f EVERY MONTH!---\n\n", (realAmountPaid - principal) / numberOfMonths);
    }
}