class Vehicle {
    String brand;
    int speed, capacity;
    
    public Vehicle(String brand, int speed, int capacity) {
        this.brand = brand;
        this.speed = speed;
        this.capacity = capacity;
    }

    public void displayinfo() {
        System.out.println("Brand of vehicle is: " + this.brand);
        System.out.println("Speed of vehicle is: " + this.speed);
        System.out.println("Capacity of vehicle is: " + this.capacity);
    }

    public void accerlate() {
        this.speed += 5;
    }

    public void brake() {
        this.speed -= 3;
    }
}

class Car extends Vehicle {
    public Car(String brand, int speed, int capacity) {
        super(brand, speed, capacity);
    }
    // Define properties and methods for Car
}