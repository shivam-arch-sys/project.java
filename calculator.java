import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Welcome to Simple Calculator ===");

        // Run until user chooses to exit
        while (true) {
            // Show menu options
            System.out.println("\nChoose an operation:");
            System.out.println("1 ➝ Add (+)");
            System.out.println("2 ➝ Subtract (-)");
            System.out.println("3 ➝ Multiply (*)");
            System.out.println("4 ➝ Divide (/)");
            System.out.println("5 ➝ Exit");
            System.out.print("Enter your choice (1-5): ");

            int choice = sc.nextInt();

            // Exit if user chooses 5
            if (choice == 5) {
                System.out.println("\nThank you for using the calculator. Goodbye! 👋");
                break;
            }

            // Ask for numbers
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            double result = 0; // to store the answer
            boolean valid = true; // check if operation is valid

            // Perform operation based on user choice
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("✅ Result: " + num1 + " + " + num2 + " = " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("✅ Result: " + num1 + " - " + num2 + " = " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("✅ Result: " + num1 + " × " + num2 + " = " + result);
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("✅ Result: " + num1 + " ÷ " + num2 + " = " + result);
                    } else {
                        System.out.println("⚠️ Error: You can’t divide by zero!");
                        valid = false;
                    }
                    break;
                default:
                    System.out.println("❌ Invalid choice! Please enter 1 to 5.");
                    valid = false;
            }

            // Only show a separator if calculation was valid
            if (valid) {
                System.out.println("------------------------------");
            }
        }

        sc.close();
    }
}
