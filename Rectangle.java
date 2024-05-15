package JavaPractice;

public class Rectangle {
	
	private double width;
    private double height;

    // Default constructor
    public Rectangle() {
        // Default width and height
        this.width = 0;
        this.height = 0;
    }

    // Parameterized constructor with width and height
    public Rectangle(double width, double height) {
        // Call another constructor using 'this'
        this(); // Call the default constructor to set default values for width and height
        this.width = width;
        this.height = height;
    }

    // Getters and setters
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Method to calculate area of rectangle
    public double calculateArea() {
        return width * height;
    }

    // Example usage
    public static void main(String[] args) {
        // Creating objects using various constructors
        Rectangle rectangle1 = new Rectangle(); // Default constructor
        Rectangle rectangle2 = new Rectangle(5, 10); // Parameterized constructor

        // Displaying information
        System.out.println("Rectangle 1: Width = " + rectangle1.getWidth() + ", Height = " + rectangle1.getHeight() + ", Area = " + rectangle1.calculateArea());
        System.out.println("Rectangle 2: Width = " + rectangle2.getWidth() + ", Height = " + rectangle2.getHeight() + ", Area = " + rectangle2.calculateArea());
    }

}
