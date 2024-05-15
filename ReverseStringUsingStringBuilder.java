package JavaPractice;

import java.util.Scanner;

public class ReverseStringUsingStringBuilder {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        
        String inputString = scanner.nextLine();

        // Call the method to reverse the string using StringBuilder
        String reversedString = reverseString(inputString);

        // Display the result
        System.out.println("Original String: " + inputString);
        
        System.out.println("Reversed String: " + reversedString);
    }

    // Method to reverse a string using StringBuilder
    public static String reverseString(String input) 
    {
        // Create a StringBuilder object with the input string
        StringBuilder stringBuilder = new StringBuilder(input);

        // Use the reverse method of StringBuilder
        stringBuilder.reverse();

        // Convert StringBuilder to String
        return stringBuilder.toString();

	}

}
