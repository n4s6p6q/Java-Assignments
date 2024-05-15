package JavaPractice;

public class PrintOddNumDoWhile {

	public static void main(String[] args) {
		
		 int number = 1;

	        System.out.println("Odd numbers from 1 to 15 using do-while loop:");

	        do 
	        {
	            System.out.println(number);
	            
	            number = number + 2; // Increment by 2 to get the next odd number
	            
	        } while (number <= 15);
	}

}
