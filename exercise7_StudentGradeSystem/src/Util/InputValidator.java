package Util;

import java.util.Scanner;

public class InputValidator {
    private static final int MAX_FINAL_GRADE = 40;
    private static final int MAX_MID_GRADE = 30;
    private static final int MIN_GRADE = 0;

    Scanner scanner = new Scanner(System.in);

    public int getInputGradeValidation(String typeOfInput) {
        return getIntInRange("Enter the " + typeOfInput + " grade: ", typeOfInput);
    }

    public String getInputNameValidation() {
        while (true) {
            System.out.print("Enter the student's name (e.g., Pedro Ramirez): ");
            String name = scanner.nextLine().trim();

            if (name.matches("^[A-Za-z]+\\s[A-Za-z]+$")) {
                return name;
            }

            System.out.println("Invalid name. Please enter in the format: First Last");
        }
    }

    private int getIntInRange(String prompt, String typeOfInput) {
        while (true) {
            System.out.println(prompt);

            if (!scanner.hasNextInt()) {
                System.out.println("Please enter an integer greater than " + MIN_GRADE + " and less than " + (typeOfInput.equals("final exam") ? MAX_FINAL_GRADE : MAX_MID_GRADE));
                scanner.next();
                continue;
            }

            int value = scanner.nextInt();
            if (typeOfInput.equals("final exam")) {
                if (value < MIN_GRADE || value > MAX_FINAL_GRADE) {
                    System.out.println("Value out of range, enter an amount greater than 0 but less than 40");
                    continue;
                }
            } else {
                if (value < MIN_GRADE || value > MAX_MID_GRADE) {
                    System.out.println("Value out of range, enter an amount greater than 0 but less than 30");
                    continue;
                }
            }

            return value;

        }
    }
}
