package JavaPractice;

import java.util.Scanner;

public class ArithmaticSwitch {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Get the input numbers and operator
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, or /): ");
        char operator = scanner.next().charAt(0);

        double result;

        // Use a switch statement to perform the arithmetic operation
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // Check if the second number is not zero before performing division
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    // Exit the program if division by zero is attempted
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operator. Please enter +, -, *, or /.");
                // Exit the program if an invalid operator is entered
                scanner.close();
                return;
        }

        // Display the result
        System.out.println("Result: " + result);

        // Close the Scanner
        scanner.close();
    }
}