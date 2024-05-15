package JavaPractice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt user to enter an integer
	        System.out.print("Enter an integer: ");

	        try {
	            // Read the integer input
	            int number = scanner.nextInt();
	            
	            // Display the input
	            System.out.println("You entered: " + number);
	        } catch (InputMismatchException e) {
	            // If user enters a non-integer value, handle the InputMismatchException
	            System.out.println("Invalid input! Please enter an integer.");
	        }
}
}
