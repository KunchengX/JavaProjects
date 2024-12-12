public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car("Toyota", "Camry", 2020);
        Car car3 = new Car("Toyota", "Corolla", 2020);

        System.out.println("Car1: " + car1);
        System.out.println("Car2: " + car2);
        System.out.println("Car3: " + car3);

        System.out.println("Car1 equals Car2: " + car1.equals(car2));
        System.out.println("Car1 equals Car3: " + car1.equals(car3));
    }
}
