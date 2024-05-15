package JavaPractice;

public class Person {
	
	  String name;
	  int age;

	    // No-argument constructor
	    public Person() {
	        // Default values
	        this.name = "Unknown";
	        this.age = 0;
	    }

	    // Parameterized constructor with name
	    public Person(String name) {
	        this.name = name;
	        this.age = 0; // Default age
	    }

	    // Parameterized constructor with name and age
	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Getters and setters
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    // toString method to represent object as string
	    @Override
	    public String toString() {
	        return "Person [name=" + name + ", age=" + age + "]";
	    }

	    // Example usage
	    public static void main(String[] args) {
	        // Using various constructors
	        Person person1 = new Person(); // No-argument constructor
	        Person person2 = new Person("Alice"); // Constructor with name
	        Person person3 = new Person("Bob", 25); // Constructor with name and age

	        // Display information
	        System.out.println("Person 1: " + person1);
	        System.out.println("Person 2: " + person2);
	        System.out.println("Person 3: " + person3);
	    }

}
