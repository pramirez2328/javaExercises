import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Principal
        int principal = InputValidation.getPositiveNumber(
                input,
                "Enter the loan amount (principal): ",
                Integer.class,
                "principal"
        );

        // Annual interest rate
        float annualInterestRate = InputValidation.getPositiveNumber(
                input,
                "Enter the annual interest rate (as a percentage, e.g. 6 for 6%): ",
                Float.class,
                "annualInterestRate"
        );


        // Number of years
        int numberOfYears = InputValidation.getPositiveNumber(
                input,
                "Enter the number of years for the loan: ",
                Integer.class,
                "numberOfYears"
        );

        input.close();

        Calculator.getMonthlyPayment(principal, annualInterestRate, numberOfYears);
    }
}


