package JavaPractice;

public class ArraySumEnhancedForLoop {

	public static void main(String[] args) {
		
		int[] array = {5, 2, 8, 1, 9};

        // Calculate the sum using the enhanced for loop
        int sum = 0;
        
        for (int number : array) 
        {
            sum = sum + number;
        }

        // Print the sum
        System.out.println("Sum of the elements in the array: " + sum);

	}

}
