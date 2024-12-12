public class Car {
    String make;
    String model;
    int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Make: " + make + ", Model: " + model + ", Year: " + year;
    }

    @Override
    public boolean equals(Object obj) {
        // Check if obj is an instance of Car
        if (!(obj instanceof Car)) return false;

        // Cast obj to Car and comapre fields
        Car car = (Car) obj;
        return make.equals(car.make) && model.equals(car.model) && year == car.year;
    }
}
