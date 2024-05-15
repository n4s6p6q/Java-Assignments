package JavaPractice;

import java.util.Scanner;

public class ReplaceSubstring {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the original string
        System.out.print("Enter the original string: ");
        
        String originalString = scanner.nextLine();

        // Prompt the user to enter the substring to be replaced
        System.out.print("Enter the substring to be replaced: ");
        
        String oldSubstring = scanner.nextLine();

        // Prompt the user to enter the new substring
        System.out.print("Enter the new substring: ");
        
        String newSubstring = scanner.nextLine();

        // Call the method to replace substrings
        String resultString = replaceSubstring(originalString, oldSubstring, newSubstring);

        // Display the result
        System.out.println("Original String: " + originalString);
        
        System.out.println("Modified String: " + resultString);
    }

    // Method to replace all occurrences of a substring with another substring
    public static String replaceSubstring(String original, String oldSubstring, String newSubstring) 
    {
        return original.replace(oldSubstring, newSubstring);

	}

}
