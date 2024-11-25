# Lesson 2024.11.25 Mon - Using super() keywork

## Exercise: Using `super()` to Invoke a Superclass Constructor

You are tasked with writing a Java program to model a **Vehicle** and a **Car** using inheritance.

1. Create a **Vehicle** class with the following:
    - A attribute `String type` (e.g., "Truck", "Car").
    - A constructor that accepts `type` as a parameter and initializes it.
    - A method `getType()` to return the vehicle's `type`.

2. Create a **Car** class that extends **Vehicle** with the following:
    - A attritube `String brand` (e.g., "Toyota", "Ford").
    - A constructor that accepts both `type` and `brand`. Use the `super()` keyword to pass the `type` to the parent class's constructor.
    - A method `displayInfo()` to print the car's `type` and `brand`.

3. Create a `Main` class to:
    - Instantiate a `Car` object with the `type` and `brand` values.
    - Call the `displayInfo()` method to print the details of the car.

### Example Output

```java
// type = "Sedan"
// brand = "Honda"

Vehicle Type: Sedan
Car Brand: Honda
```

### Solution skeleton

```java
// Here is the answer to the exercise:

// Vehicle class (Superclass)

class Vehicle {
    // YOUR CODE declare attribute

    // Constructor
    public Vehicle(String type) {
        // YOUR CODE
    }
    
    // Getter for type
    public String getType() {
        // YOUR CODE
    }
}

// Car class (Subclass)
class Car extends Vehicle {
    // YOUR CODE declare attribute

    // Constructor
    public Car(String type, String brand) {
        // Call to the superclass's constructor
        // YOUR CODE initialize attribute
    }

    // Method to display car info
    public void displayInfo() {
        // YOUR CODE prints out vehicle type
        // YOUR CDOE prints out car brand
    }
}

// Main class
public class Main {
    public static void main(String args[]) {
        // Create a Car object
        // YOUR CODE

        // Display the details
        // YOUR CODE
    }
}
```
