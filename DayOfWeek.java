package JavaPractice;

import java.util.Scanner;

public class DayOfWeek {
	
	    public static void main(String[] args) {
	    	
	        // Create a Scanner object to take user input
	        Scanner scanner = new Scanner(System.in);

	        // Get the input number for the day of the week
	        System.out.println("Enter a number (1-7) for the day of the week: ");
	        
	        int dayNumber = scanner.nextInt();

	        // Use a switch statement to determine the day of the week
	        String dayName;
	        
	        switch (dayNumber) {
	            case 1:
	                dayName = "Monday";
	                break;
	            case 2:
	                dayName = "Tuesday";
	                break;
	            case 3:
	                dayName = "Wednesday";
	                break;
	            case 4:
	                dayName = "Thursday";
	                break;
	            case 5:
	                dayName = "Friday";
	                break;
	            case 6:
	                dayName = "Saturday";
	                break;
	            case 7:
	                dayName = "Sunday";
	                break;
	            default:
	                dayName = "Invalid input. Please enter a number between 1 and 7.";
	                break;
	        }

	        // Display the day of the week
	        System.out.println("The day of the week is: " + dayName);

	        // Close the Scanner
	        scanner.close();
	    }
	}

