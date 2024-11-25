class HwCar {
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
}
