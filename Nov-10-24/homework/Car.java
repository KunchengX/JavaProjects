public class Car {
    String make;
    String model;
    int year;

    public void setDefault(){
       this.make = "Unknown"; 
       this.model = "Unknown";
       this.year = 0;
    }

    public void setCar(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayCarInfo(){
        System.out.println(make + " " + model + " " + year);
    }

    public static void main(String[] args) {
        Car ferrari = new Car();
        ferrari.setDefault();
        ferrari.displayCarInfo();
        ferrari.setCar("Ferrari", "F40", 30);
        ferrari.displayCarInfo();
    }
}
