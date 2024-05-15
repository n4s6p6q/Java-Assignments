package JavaPractice;

public class ConstantsClass {
		
		public static final double PI = 3.141592653589793;
		
	    public static final double E = 2.718281828459045;

	    // Main method to demonstrate Constants class usage
	    public static void main(String[] args) 
	    {
	        // Calculate the circumference of a circle using pi
	        double radius = 5.0;
	        
	        double circumference = 2 * PI * radius;
	        
	        System.out.println("Circumference of the circle with radius " + radius + ": " + circumference);
	        
	        System.out.println();   //new line

	        // Calculate the area of a circle using pi
	        double area = PI * radius * radius;
	        
	        System.out.println("Area of the circle with radius " + radius + ": " + area);


	    }

}
