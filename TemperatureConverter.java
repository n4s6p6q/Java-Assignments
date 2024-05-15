package JavaPractice;

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // Demonstrate the use of temperature conversion methods
        System.out.print("Enter temperature in Celsius: ");
        
        double celsius = scanner.nextDouble();
        
        double fahrenheit = celsiusToFahrenheit(celsius);
        
        System.out.println("Converted temperature to Fahrenheit: " + fahrenheit + " °F");

        System.out.print("\nEnter temperature in Fahrenheit: ");
        
        double fahrenheitInput = scanner.nextDouble();
        
        double celsiusConverted = fahrenheitToCelsius(fahrenheitInput);
        
        System.out.println("Converted temperature to Celsius: " + celsiusConverted + " °C");

    }

    // Static method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) 
    {
        return (celsius * 9 / 5) + 32;
    }

    // Static method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) 
    {
        return (fahrenheit - 32) * 5 / 9;

	}

}
