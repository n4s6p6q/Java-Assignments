package JavaPractice;


	interface ElectricVehicle {
	    // Default method to charge the electric vehicle
	    default void charge() {
	        System.out.println("Charging the electric vehicle...");
	    }

	    // Static method to get the charging time
	    static int getChargingTime() {
	        return 4; // Assuming 4 hours charging time
	    }
	}

	// Implementation of the ElectricVehicle interface
	class ElectricCar implements ElectricVehicle {
	    // Other methods and fields can be added here
	}

	public class ElectricClass {
	    public static void main(String[] args) {
	        ElectricCar electricCar = new ElectricCar();

	        // Demonstrate the use of default method
	        electricCar.charge(); // Output: Charging the electric vehicle...

	        // Demonstrate the use of static method
	        int chargingTime = ElectricVehicle.getChargingTime();
	        System.out.println("Charging time for the electric vehicle: " + chargingTime + " hours"); // Output: Charging time for the electric vehicle: 4 hours
	    }
	}

