package JavaPractice;

import java.util.Scanner;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 
	        System.out.print("Enter a string: ");
	        
	        String inputString = scanner.nextLine().toLowerCase(); // Convert the string to lowercase for case-insensitive comparison

	        // Call the method to count vowels and consonants
	        int[] counts = countVowelsAndConsonants(inputString);

	        // Display the results
	        System.out.println("Number of vowels: " + counts[0]);
	        
	        System.out.println("Number of consonants: " + counts[1]);
	    }

	    // Method to count vowels and consonants in a string
	    public static int[] countVowelsAndConsonants(String str) 
	    {
	        int vowelsCount = 0;
	        
	        int consonantsCount = 0;

	        for (char ch : str.toCharArray()) {
	            // Check if the character is a letter
	            if (Character.isLetter(ch)) 
	            {
	                // Check if the letter is a vowel
	                if (isVowel(ch)) 
	                {
	                    vowelsCount++;
	                    
	                } else 
	                {
	                    consonantsCount++;
	                }
	            }
	        }

	        return new int[]{vowelsCount, consonantsCount};
	    }

	    // Method to check if a character is a vowel
	    public static boolean isVowel(char ch) 
	    {
	        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	    }

}
