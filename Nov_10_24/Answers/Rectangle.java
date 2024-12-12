package Nov_10_24.Answers;

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