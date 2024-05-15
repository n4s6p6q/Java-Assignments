package JavaPractice;

import java.util.Scanner;

public class StringPalindromeCheck {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        
        String inputString = scanner.nextLine();

        // Call the method to check if the string is a palindrome
        boolean isPalindrome = isPalindrome(inputString);

        // Display the result
        System.out.println("Is the string a palindrome? " + isPalindrome);
    }

    // Method to check if a string is a palindrome using StringBuffer
    public static boolean isPalindrome(String input) 
    {
        // Create a StringBuffer from the input string
        StringBuffer stringBuffer = new StringBuffer(input);

        // Reverse the StringBuffer
        stringBuffer.reverse();

        // Compare the reversed string with the original string
        return input.equals(stringBuffer.toString());
    }

}

