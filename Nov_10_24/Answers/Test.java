public class Test {
    public static void main(String[] args) {
        // Test the Rectangle class
        Rectangle defaultRectangle = new Rectangle();
        defaultRectangle.displayRectangleInfo();

        Rectangle customRectangle = new Rectangle(5, 3);
        customRectangle.displayRectangleInfo();

        // Test the Book class
        Book book = new Book("Java Programming", "John Doe\n", 500);
        book.displayInfo();

        // Test the Car class
        Car car = new Car("Toyota", "Corolla", 2020);
        car.displayInfo();
    }    
}

class Rectangle {
    private final double length;
    private final double width;

    // Default constructor
    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    // Parameterized constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    public double area() {
        return this.length * this.width;
    }

    // Method to display rectangle information
    public void displayRectangleInfo() {
        System.out.println("Length: " + this.length);
        System.out.println("Width: " + this.width);
        System.out.println("Area: " + this.area());
    }
}

class Book {
    private final String title;
    private final String author;
    private final int pages;

    // Parameterized constructor
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    // Method to display book information
    public void displayInfo() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Pages: " + this.pages);
    }
}

class Car {
    private final String make;
    private final String model;
    private final int year;

    // Parameterized constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display car information
    public void displayInfo() {
        System.out.println("Make: " + this.make);
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
    }
}
