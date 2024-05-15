package JavaPractice;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Validate input
        if (number <= 0) 
        {
            System.out.println("Please enter a positive integer: ");    
        }

        // Print multiplication table using a while loop
        int i = 1;
        
        System.out.println("Multiplication table for " + number + ":");
        
        while (i <= 10) 
        {
            System.out.println(number + " x " + i + " = " + (number * i));
            
            i++;
        }


	}

}
