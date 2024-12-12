package Nov_10_24.Answers;

public class Test {
    public static void main(String[] args) {
        // Test the Rectangle class
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Area: " + rectangle.area());
        rectangle.displayRectangleInfo();

        // Test the Car class
        AnCar car = new AnCar("Car", "Toyota", 2021);
        car.displayInfo();
        
        // Test the Book class
        Book book = new Book("Java Programming", "John Doe", 500);
        book.displayInfo();
    }    
}