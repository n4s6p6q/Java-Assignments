package JavaPractice;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateFormat {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter a date in milliseconds: ");
        
        long milliseconds = scanner.nextLong();

        Date date = new Date(milliseconds);

        // Format the Date object using SimpleDateFormat
        String formattedDate = formatDateTime(date);

        // Display the formatted date
        System.out.println("Formatted Date: " + formattedDate);
    }

    // Method to format a Date object to "yyyy-MM-dd HH:mm:ss"
    public static String formatDateTime(Date date) 
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);

	}

}
