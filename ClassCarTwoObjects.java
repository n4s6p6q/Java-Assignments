package JavaPractice;

public class ClassCarTwoObjects {

	private String make;
    private String model;
    private int year;

    // Main method to demonstrate Car class usage
    public static void main(String[] args) 
    {
        // Create two Car objects without using a constructor or this keyword
    	ClassCarTwoObjects car1 = new ClassCarTwoObjects();
    	ClassCarTwoObjects car2 = new ClassCarTwoObjects();

        // Set attributes for Car 1 directly
        car1.make = "Toyota";
        car1.model = "Camry";
        car1.year = 2022;

        // Set attributes for Car 2 directly
        car2.make = "Honda";
        car2.model = "Civic";
        car2.year = 2021;

        // Demonstrate usage of Car objects
        System.out.println("Car 1 Details:");
        displayCarDetails(car1);

        System.out.println("\nCar 2 Details:");
        displayCarDetails(car2);
    }

    // Method to display Car details
    public static void displayCarDetails(ClassCarTwoObjects car) 
    {
        System.out.println("Make: " + car.make);
        System.out.println("Model: " + car.model);
        System.out.println("Year: " + car.year);
	}

}
