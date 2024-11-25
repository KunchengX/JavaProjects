public class HwTest {
    public static void main(String[] args) {
        // Test the HwRectangle class
        HwRectangle rectangle = new HwRectangle(5, 10);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        // Test the HwCar class
        HwCar car = new HwCar();
        car.setDefault();
        car.displayCarInfo();
        car.setCar("Toyota", "Corolla", 2021);
        car.displayCarInfo();

        // Test the HwBook class
        HwBook book = new HwBook();
        book.setDetail("Java Programming", "John Doe", 500);
        book.displayInfo();
    }
}
