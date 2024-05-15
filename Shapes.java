package JavaPractice;

import java.util.Scanner;

public class Shapes {
    // Method to calculate area of a circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate area of a rectangle
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    // Method to calculate area of a square
    public static double calculateArea(float side) {
        return side * side;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape to calculate area:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        int choice = scanner.nextInt();

        double area = 0;

        if (choice == 1) {
            System.out.println("Enter the radius of the circle:");
            double radius = scanner.nextDouble();
            area = calculateArea(radius);
            System.out.println("Area of the circle: " + area);
        } else if (choice == 2) {
            System.out.println("Enter the length of the rectangle:");
            double length = scanner.nextDouble();
            System.out.println("Enter the width of the rectangle:");
            double width = scanner.nextDouble();
            area = calculateArea(length, width);
            System.out.println("Area of the rectangle: " + area);
        } else if (choice == 3) {
            System.out.println("Enter the side of the square:");
            double side = scanner.nextDouble();
            area = calculateArea(side);
            System.out.println("Area of the square: " + area);
        } else {
            System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
