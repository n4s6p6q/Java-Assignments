package JavaPractice;

import java.util.Random;

public class RandomNumberGenerator {

	public static void main(String[] args) {
		
		Random random = new Random();

        // Generate and print random numbers between 1 and 100
        for (int i = 0; i < 5; i++) 
        { // Generate 5 random numbers
            int randomNumber = random.nextInt(100) + 1; // Generates numbers between 0 and 99, so we add 1
            
            System.out.println("Random number " + (i + 1) + ": " + randomNumber);
        }

	}

}
