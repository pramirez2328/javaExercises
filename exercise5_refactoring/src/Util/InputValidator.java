// Util/InputValidator.java
package Util;

import java.util.Scanner;

public record InputValidator(Scanner scanner) {

    public int getPrincipal() {
        return getIntInRange(
                "Enter the loan amount (principal): ",
                1000,
                1000000,
                "Value out of range, enter an amount greater than 1,000 but less than 1,000,000"
        );
    }

    public float getAnnualInterestRate() {
        return getFloatInRange(
        );
    }

    public int getNumberOfYears() {
        return getIntInRange(
                "Enter the number of years for the loan: ",
                1,
                30,
                "Value out of range, enter a value greater than 0 or less than 30"
        );
    }

    private int getIntInRange(String prompt, int min, int max, String errorMessage) {
        while (true) {
            System.out.println(prompt);

            if (!scanner.hasNextInt()) {
                System.out.println("Please enter an integer");
                scanner.next();
                continue;
            }

            int value = scanner.nextInt();
            if (value < min || value > max) {
                System.out.println(errorMessage);
                continue;
            }

            return value;
        }
    }

    private float getFloatInRange() {
        while (true) {
            System.out.println("Enter the annual interest rate (as a percentage, e.g. 6 for 6%): ");

            if (!scanner.hasNextFloat()) {
                System.out.println("Please enter a number");
                scanner.next();
                continue;
            }

            float value = scanner.nextFloat();
            if (value < (float) 0.01 || value > (float) 100.0) {
                System.out.println("Value out of range, enter an amount greater than 0 but less than 100");
                continue;
            }

            return value;
        }
    }
}
