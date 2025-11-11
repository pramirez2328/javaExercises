// View/MortgageView.java
package View;

import Model.Mortgage;

public class MortgageView {

    public void displayWelcome() {
        System.out.println("Welcome to mortgage calculator");
    }

    public void displayBalanceProgress(Mortgage mortgage) {
        for (int payment = 1; payment <= mortgage.getNumberOfMonths(); payment++) {
            double balance = mortgage.getRemainingBalance(payment);
            System.out.printf("Your balance after payment #%d is $%.2f.\n", payment, balance);
        }
    }

    public void displaySummary(Mortgage mortgage) {
        System.out.println("\n--- Mortgage Calculation ---");
        System.out.println("Annual interest rate: " + mortgage.getAnnualInterestRate() + "%");
        System.out.println("Number of months: " + mortgage.getNumberOfMonths());
        System.out.printf("Monthly payment: $%.2f\n", mortgage.getMonthlyPayment());
        System.out.println("Initial loan: $" + mortgage.getPrincipal());
        System.out.printf("Real final amount paid after interest: $%.2f.\n", mortgage.getTotalAmountPaid());
        System.out.printf("---YOU PAID: $%.2f ON INTEREST---\n", mortgage.getTotalInterestPaid());
        System.out.printf("---YOUR LOAN COST YOU $%.2f EVERY MONTH!---\n\n", mortgage.getMonthlyInterestCost());
    }
}
