package JavaPractice;

public class Student {

	
		public String name;
		public int age;
		public int studentId;

	    // Main method to demonstrate Student class usage
	    public static void main(String[] args) 
	    {
	        // Create two Student objects
	        Student student1 = new Student();
	        Student student2 = new Student();

	        // Set attributes for Student 1
	        student1.name = "Nikhil Chandane";
	        student1.age = 22;
	        student1.studentId = 123456;

	        // Set attributes for Student 2
	        student2.name = "Ashish Chandane";
	        student2.age = 22;
	        student2.studentId = 789012;

	        // Demonstrate usage of Student objects
	        System.out.println("Student 1 Information:");
	        displayStudentInfo(student1);

	        System.out.println("\nStudent 2 Information:");
	        displayStudentInfo(student2);
	    }

	    // Method to display Student information
	    public static void displayStudentInfo(Student student) {
	        System.out.println("Name: " + student.name);
	        System.out.println("Age: " + student.age);
	        System.out.println("Student ID: " + student.studentId);

	}

}
