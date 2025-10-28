import java.util.Scanner;


@SuppressWarnings("unchecked")
public class InputValidation {
    static <T extends Number> T getPositiveNumber(
            Scanner input,
            String prompt,
            Class<T> type,
            String typeOfInput) {

        while (true) {
            System.out.println(prompt);

            if (type == Integer.class) {
                if (!input.hasNextInt()) {
                    System.out.println("Please enter an integer");
                    input.next();
                    continue;
                }

                int value = input.nextInt();
                if ((value < 1000 || value > 1000000) && typeOfInput.equals("principal")) {
                    System.out.println("Value out of range, enter an amount greater than 1_000 but less than 1_000_000");
                    continue;
                } else if ((value < 1 || value > 30) && typeOfInput.equals("numberOfYears")) {
                    System.out.println("Value out of range, enter a value greater than 0 or less than 30");
                    continue;
                }

                return (T) Integer.valueOf(value);
            }

            if (type == Float.class) {
                if (!input.hasNextFloat()) {
                    System.out.println("Please enter a float");
                    input.next();
                    continue;
                }

                float value = input.nextFloat();
                if ((value <= 0 || value > 100) && typeOfInput.equals("annualInterestRate")) {
                    System.out.println("Value out of range, enter an amount greater than 0 but less than 100");
                    continue;
                }

                return (T) Float.valueOf(value);
            }

            // Optional safeguard
            throw new IllegalArgumentException("Unsupported type: " + type.getSimpleName());
        }
    }


    ;
}
