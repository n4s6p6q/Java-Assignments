package JavaPractice;

import java.util.Scanner;

public class RectangleAreaCalculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // Enter the length of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        // Enter the width of the rectangle
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Call the method to calculate the area
        double area = calculateRectangleArea(length, width);

        // Display the result
        System.out.println("Area of the rectangle: " + area);
    }

    // Method to calculate the area of a rectangle
    public static double calculateRectangleArea(double length, double width) 
    {
        // Local variable to store the calculated area
        double area = length * width;

        // Return the result
        return area;

	}

}
