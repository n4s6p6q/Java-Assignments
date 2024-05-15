package JavaPractice;

public class TwoMatrixAddition {

	public static void printMatrix(int[][] a) 
    { 
        for (int i = 0; i < a.length; i++) 
        { 
            for (int j = 0; j < a[0].length; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(); 
        } 
    } 
    // Sum of two matrices using Iterative approach 
    public static void matrixAddition(int[][] a, int[][] b) 
    { 
        int[][] sum = new int[a.length][a[0].length];
        
        for (int i = 0; i < a.length; i++) 
        { 
            for (int j = 0; j < a[0].length; j++)
            {
                sum[i][j] = a[i][j] + b[i][j]; 
            }
        } 
        
        // printing the matrix 
        printMatrix(sum); 
    } 
    public static void main(String[] args) 
    { 
    	  int[][] matrix1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
          int[][] matrix2 = { {9, 8, 7}, {6, 5, 4}, {3, 2, 1} }; 
        System.out.println("The sum is "); 
  
        // calling the function 
        matrixAddition(matrix1, matrix2);
    }
}
