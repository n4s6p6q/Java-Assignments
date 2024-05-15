package JavaPractice;

import java.util.HashMap;
import java.util.Map;

public class HashMapStudent {

	    public static void main(String[] args) {
	        // Create a HashMap to store student names and their scores
	        Map<String, Integer> studentScores = new HashMap<>();

	        // Add student names and scores to the HashMap
	        studentScores.put("Nikhil", 85);
	        studentScores.put("Vivek", 70);
	        studentScores.put("Charlie", 92);
	        studentScores.put("David", 78);
	        studentScores.put("Varun", 95);

	        // Define the threshold score
	        int threshold = 80;

	        // Print the names of students who scored above the threshold
	        System.out.println("Students who scored above " + threshold + ":");
	        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
	            String studentName = entry.getKey();
	            int score = entry.getValue();
	            if (score > threshold) {
	                System.out.println(studentName);
	            }
	        }
	    }
	}
