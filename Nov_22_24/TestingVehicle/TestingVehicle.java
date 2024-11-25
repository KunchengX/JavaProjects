public class TestingVehicle {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 100, 5, 20, "Gasoline", true);
        Truck truck = new Truck("Ford", 80, 5, 500, true);
        Bus bus = new Bus("BYD", 35, 30, "line 15", true, 4);

        car.displayInfo();
        System.out.println();
        truck.displayInfo();
        System.out.println();
        bus.displayInfo();
    }
}

class Vehicle {
    String brand;
    int speed, capacity;

    public Vehicle(String brand, int speed, int capacity) {
        this.brand = brand;
        this.speed = speed;
        this.capacity = capacity;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + ", Capacity: " + capacity);
    }

    public void accerlate(int accerlation) {
        this.speed += accerlation; 
    }
}

class Car extends Vehicle {
    int tankSize;
    String fuelType;
    Boolean isConvertible;

    public Car(String brand, int speed, int capacity, int tankSize, String fuelType, Boolean isConvertible) {
        super(brand, speed, capacity);
        this.tankSize = tankSize;
        this.fuelType = fuelType;
        this.isConvertible = isConvertible;
    }

    public void toggleRoof() {
        System.out.println("The roof is open.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(tankSize + " " + fuelType + " " + isConvertible + " ");
    }
}

class Truck extends Vehicle {
    int loadCapacity;
    Boolean hasTrailer;

    public Truck(String brand, int speed, int capacity, int loadCapacity, Boolean hasTrailer) {
        super(brand, speed, capacity);
        this.loadCapacity = loadCapacity;
        this.hasTrailer = hasTrailer;
    }

    public void attachedTrailer() {
        hasTrailer = !hasTrailer;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(loadCapacity + " " + hasTrailer + " ");
    }
}

class Bus extends Vehicle {
    String routeName;
    Boolean isElectric;
    int ticketPrice;

    public Bus(String brand, int speed, int capacity, String routeName, Boolean isElectric, int ticketPrice) {
        super(brand, speed, capacity);
        this.routeName = routeName;
        this.isElectric = isElectric;
        this.ticketPrice = ticketPrice;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(routeName + " " + isElectric + " " + ticketPrice);
    }
}
