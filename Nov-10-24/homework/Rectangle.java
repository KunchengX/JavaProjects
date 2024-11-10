public class Rectangle {
    int length;
    int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public Rectangle(){
        this(1, 1);
    }

    public int area() {
        return length * width;
    }

    public void displayInfo(){
        System.out.println(length + " " + width + " " + this.area());
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(10, 10);
        rectangle1.displayInfo();
        rectangle2.displayInfo();
    }
}
