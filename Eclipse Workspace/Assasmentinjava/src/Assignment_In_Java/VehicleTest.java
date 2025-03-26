package Assignment_In_Java;

// Base class
class Vehicle {
    protected String brand;
    protected int speed;

    // Constructor
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Brand: " + brand + " | Speed: " + speed + " km/h");
    }
}

// Subclass Car extending Vehicle
class Car extends VehicleTest {
    private int numDoors;

    // Constructor
    public Car(String brand, int speed, int numDoors) {
        super(); // Call the Vehicle constructor
        this.numDoors = numDoors;
    }

    // Override displayDetails to add additional info
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call parent class method
        System.out.println("Number of Doors: " + numDoors);
    }
}

// Main class
public class VehicleTest {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 180, 4);
        myCar.displayDetails();
    }

	public void displayDetails() {
		// TODO Auto-generated method stub
		
	}
}
