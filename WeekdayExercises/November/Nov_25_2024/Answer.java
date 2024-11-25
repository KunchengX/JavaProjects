package WeekdayExercises.November.Nov_25_2024;

// Main class
public class Answer {
    public static void main(String[] args) {
        // Create a car object
        // YOUR CODE
        Car car = new Car("Car", "Toyota");
        car.displayInfo();
    }
}

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
        return this.type;
    }
}

// Car class (Subclass)
class Car extends Vehicle {
    // YOUR CODE declare attribute
    String brand;

    // Constructor
    public Car(String type, String brand) {
        super(type);
        this.brand = brand;
    }

    // Method to display car info
    public void displayInfo() {
        System.out.println("Vehicle Type: " + this.getType());
        System.out.println("Car Brand: " + this.brand);
    }
}