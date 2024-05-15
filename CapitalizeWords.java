package JavaPractice;

import java.util.Scanner;

public class CapitalizeWords {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        
        String inputSentence = scanner.nextLine();

        // Call the method to capitalize the first letter of each word
        String capitalizedSentence = capitalizeWords(inputSentence);

        // Display the result
        System.out.println("Original Sentence: " + inputSentence);
        
        System.out.println("Capitalized Sentence: " + capitalizedSentence);
    }

    // Method to capitalize the first letter of each word using StringBuilder
    public static String capitalizeWords(String sentence) 
    {
        StringBuilder result = new StringBuilder();

        // Flag to indicate the start of a new word
        boolean newWord = true;

        // Loop through each character in the sentence
        for (char ch : sentence.toCharArray()) 
        {
            if (newWord && Character.isLetter(ch)) 
            {
                // Capitalize the first letter of the word
                result.append(Character.toUpperCase(ch));
                
                newWord = false;
                
            } else {
                // Add the character as-is to the result
                result.append(ch);

                // Set the flag to true when a space is encountered
                newWord = Character.isWhitespace(ch);
            }
        }

        return result.toString();

	}

}
