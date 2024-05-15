package JavaPractice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a string
	        System.out.print("Enter a string: ");
	        
	        String inputString = scanner.nextLine();

	        // Print the reversed string using a for loop
	        System.out.print("Reversed string: ");
	        
	        for (int i = inputString.length() - 1; i >= 0; i--) 
	        {
	            System.out.print(inputString.charAt(i));  //5-l, 4-i, 3-h, 2-k, 1-i, 0-N
	        }


	}

}
