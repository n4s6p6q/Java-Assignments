package JavaPractice;

	@FunctionalInterface
	interface Calculator {
	    double calculate(double num1, double num2);
	}

	public class InterfaceCalculator {
	    public static void main(String[] args) {
	        // Lambda expressions for addition, subtraction, multiplication, and division
	        Calculator addition = (num1, num2) -> num1 + num2;
	        Calculator subtraction = (num1, num2) -> num1 - num2;
	        Calculator multiplication = (num1, num2) -> num1 * num2;
	        Calculator division = (num1, num2) -> num1 / num2;

	        // Example calculations
	        double resultAddition = addition.calculate(10, 5); // 10 + 5 = 15
	        double resultSubtraction = subtraction.calculate(10, 5); // 10 - 5 = 5
	        double resultMultiplication = multiplication.calculate(10, 5); // 10 * 5 = 50
	        double resultDivision = division.calculate(10, 5); // 10 / 5 = 2

	        // Output results
	        System.out.println("Result of Addition: " + resultAddition);
	        System.out.println("Result of Subtraction: " + resultSubtraction);
	        System.out.println("Result of Multiplication: " + resultMultiplication);
	        System.out.println("Result of Division: " + resultDivision);
	    }
	}

