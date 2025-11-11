// Model/Mortgage.java
package Model;

public class Mortgage {
    private final double principal;
    private final float annualInterestRate;
    private final int numberOfYears;
    private final float monthlyInterestRate;
    private final int numberOfMonths;
    private final double monthlyPayment;

    public Mortgage(double principal, float annualInterestRate, int numberOfYears) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;

        // Calculate derived values
        this.monthlyInterestRate = (annualInterestRate / 100) / 12;
        this.numberOfMonths = numberOfYears * 12;
        this.monthlyPayment = calculateMonthlyPayment();
    }

    private double calculateMonthlyPayment() {
        return principal *
                (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) /
                (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
    }

    public double getRemainingBalance(int paymentsMade) {
        if (paymentsMade >= numberOfMonths) {
            return 0.0;
        }

        return principal *
                (Math.pow(1 + monthlyInterestRate, numberOfMonths) -
                        Math.pow(1 + monthlyInterestRate, paymentsMade)) /
                (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
    }

    public double getTotalAmountPaid() {
        return monthlyPayment * numberOfMonths;
    }

    public double getTotalInterestPaid() {
        return getTotalAmountPaid() - principal;
    }

    public double getMonthlyInterestCost() {
        return getTotalInterestPaid() / numberOfMonths;
    }

    // Getters
    public double getPrincipal() {
        return principal;
    }

    public float getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public int getNumberOfMonths() {
        return numberOfMonths;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }
}
