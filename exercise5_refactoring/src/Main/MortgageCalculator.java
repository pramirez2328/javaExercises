package Main;

import Model.Mortgage;
import Util.InputValidator;
import View.MortgageView;

import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        InputValidator validator = new InputValidator(input);
        MortgageView view = new MortgageView();

        view.displayWelcome();

        // Gather input
        int principal = validator.getPrincipal();
        float annualInterestRate = validator.getAnnualInterestRate();
        int numberOfYears = validator.getNumberOfYears();

        input.close();

        // Create a mortgage model
        Mortgage mortgage = new Mortgage(principal, annualInterestRate, numberOfYears);

        // Display results
        view.displayBalanceProgress(mortgage);
        view.displaySummary(mortgage);
    }
}