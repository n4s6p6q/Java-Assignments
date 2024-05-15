package JavaPractice;

import java.util.Scanner;

public class RemoveDuplicatesStringBuffer {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        
        String inputString = scanner.nextLine();

        // Call the method to remove duplicate characters using StringBuffer
        String resultString = removeDuplicates(inputString);

        // Display the result
        System.out.println("Original String: " + inputString);
        
        System.out.println("String after removing duplicates: " + resultString);
    }

    // Method to remove duplicate characters using StringBuffer
    public static String removeDuplicates(String input) {
        
        StringBuffer resultBuffer = new StringBuffer(); 

        // Array to keep track of characters encountered
        boolean[] charSet = new boolean[128]; 

        // Loop through each character in the input string
        for (int i = 0; i < input.length(); i++) 
        {
            char currentChar = input.charAt(i);

            // If the character is not encountered before, append it to the result and mark it as encountered
            if (!charSet[currentChar]) 
            {
                resultBuffer.append(currentChar);
                charSet[currentChar] = true;
            }
        }

        // Convert StringBuffer to String
        return resultBuffer.toString();
    }

}


