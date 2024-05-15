package JavaPractice;

public class MultiplicationTable2DArray {

	public static void main(String[] args) {
		
		int tableSize = 10;

        // Create a 2D array to store the multiplication table
        int[][] multiplicationTable = new int[tableSize][tableSize];

        // Generate the multiplication table using nested enhanced for loops
        for (int i = 1; i <= tableSize; i++) 
        {
            for (int j = 1; j <= tableSize; j++) 
            {
                multiplicationTable[i - 1][j - 1] = i * j;
            }
        }

        // Display the multiplication table using enhanced for loops
        System.out.println("Multiplication Table:");

        // Print the column headers
        System.out.print("\t");
        
        for (int col = 1; col <= tableSize; col++) 
        {
            System.out.print(col + "\t");
        }
        
        System.out.println();

        // Print the table using enhanced for loops
        int rowNumber = 1;
        
        for (int[] row : multiplicationTable) 
        {
            System.out.print(rowNumber++ + "\t");
            
            for (int value : row) 
            {
                System.out.print(value + "\t");
            }
            System.out.println();
        }

	}

}
