package JavaPractice;

abstract class Shape {
    protected int x;
    protected int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Abstract method to calculate area
    public abstract double calculateArea();
}

class CircleArea extends Shape {
    private double radius;

    public CircleArea(int x, int y, float radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class RectangleArea extends Shape {
    private double width;
    private double height;

    public RectangleArea(int x, int y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        CircleArea circle = new CircleArea(0, 0, 5); // Circle with center at (0, 0) and radius 5
        RectangleArea rectangle = new RectangleArea(0, 0, 4, 3); // Rectangle with bottom-left corner at (0, 0), width 4, and height 3

        // Calculate and print area of circle
        System.out.println("Area of Circle: " + circle.calculateArea());

        // Calculate and print area of rectangle
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}