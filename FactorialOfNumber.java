package JavaPractice;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        
        int number = scanner.nextInt();

         // Calculate factorial using a loop
        
            long factorial = 1;

            for (int i = 1; i <= number; i++) 
            {
                factorial = factorial * i;
            }

            System.out.println("Factorial of " + number + " is: " + factorial);

	}

}
