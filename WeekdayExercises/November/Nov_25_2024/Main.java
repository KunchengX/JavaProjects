package WeekdayExercises.November.Nov_25_2024;

// Vehicle class (Superclass)
class Vehicle {
    // YOUR CODE declare attribute
    String type;
    // Constructor
    public Vehicle(String type) {
        // YOUR CODE
        this.type = type;    
    }
    
    // Getter for type
    public String getType() {
        // YOUR CODE
        return type;
    }
}

// Car class (Subclass)
class Car extends Vehicle {
    // YOUR CODE declare attribute
    String brand;
    // Constructor
    public Car(String type, String brand) {
        // Call to the superclass's constructor
        // YOUR CODE initialize attribute
        super(type);
        this.brand = brand;
    }

    // Method to display car info
    public void displayInfo() {
        // YOUR CODE prints out vehicle type
        // YOUR CDOE prints out car brand
        System.out.println("Vehicle Type: " + type);
        System.out.println("Car Brand: " + brand);
    }
}

// Main class
public class Main {
    public static void main(String args[]) {
        // Create a Car object
        // YOUR CODE
        Car myCar = new Car("Sedan", "Honda");

        // Display the details
        // YOUR CODE
        myCar.displayInfo();
    }
}