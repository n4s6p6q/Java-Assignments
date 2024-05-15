package JavaPractice;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter an integer: ");
	        
	        int inputNumber = scanner.nextInt();

	        // Calculate and print the sum of digits using a while loop
	        int number = inputNumber;
	        
	        int sum = 0;

	        while (number > 0) 
	        {
	            int digit = number % 10;
	            
	            sum = sum + digit;
	            
	            number = number/ 10;
	        }

	        System.out.println("Sum of digits in " + inputNumber + " is: " + sum);

	}

}
