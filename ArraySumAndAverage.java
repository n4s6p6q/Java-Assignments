package JavaPractice;

public class ArraySumAndAverage {

	public static void main(String[] args) {
		
		int[] array = {10,20,30,40,50};

        int sum = 0;
        
        int size = array.length;
        
        for (int i = 0; i < size; i++) 
        {
            sum = sum + array[i];
        }

        // Calculate the average of the elements
        double average = sum / size;

        // Print the sum and average
        System.out.println("Sum of the elements: " + sum);
        
        System.out.println("Average of the elements: " + average);

	}

}
