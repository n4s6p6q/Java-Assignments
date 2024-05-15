package JavaPractice;

import java.util.Scanner;

public class ShapeAreaCalculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // Demonstrate the use of methods to calculate areas
        System.out.println("Area of Circle:");
        calculateAndDisplayAreaOfCircle(scanner.nextDouble());

        System.out.println("\nArea of Rectangle:");
        calculateAndDisplayAreaOfRectangle(scanner.nextDouble(), scanner.nextDouble());

        System.out.println("\nArea of Triangle:");
        calculateAndDisplayAreaOfTriangle(scanner.nextDouble(), scanner.nextDouble());

    }

    // Method to calculate and display the area of a circle
    public static void calculateAndDisplayAreaOfCircle(double radius) {
        double area = Math.PI * radius*radius;
        System.out.println("Radius: " + radius);
        System.out.println("Area of Circle: " + area);
    }

    // Method to calculate and display the area of a rectangle
    public static void calculateAndDisplayAreaOfRectangle(double length, double width) {
        double area = length * width;
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area of Rectangle: " + area);
    }

    // Method to calculate and display the area of a triangle
    public static void calculateAndDisplayAreaOfTriangle(double base, double height) {
        double area = 0.5 * base * height;
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
        System.out.println("Area of Triangle: " + area);

	}

}
