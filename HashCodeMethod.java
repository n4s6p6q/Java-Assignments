package JavaPractice;

public class HashCodeMethod {

	public static void main(String[] args) {
		
		Object obj1 = new Object();
		
        Object obj2 = new Object();

        // Get the hash code for each object
        int hashCode1 = obj1.hashCode();
        
        int hashCode2 = obj2.hashCode();

        // Display the hash codes
        System.out.println("Hash code of obj1: " + hashCode1);
        
        System.out.println("Hash code of obj2: " + hashCode2);

        // Demonstrate hash codes of equal objects
        String str1 = "Hello";
        
        String str2 = "Hello";
        
        int hashCodeStr1 = str1.hashCode();
        
        int hashCodeStr2 = str2.hashCode();

        System.out.println("\nHash code of str1: " + hashCodeStr1);
        
        System.out.println("Hash code of str2: " + hashCodeStr2);

	}

}
