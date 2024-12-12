package WeekdayExercises.December.Dec_12_2024.Exercise.ExerciseCar;

public class Car {
    String make;
    String model;
    int year;

    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String toString(){
        return "Year: " + year + ", Make: " + make + ", Model: " + model;
    }

    public boolean equals(Object obj){
        if (! (obj instanceof Car)) return false;
        Car car = (Car) obj;
        return year == car.year && this.make.equals(car.make) && this.model.equals(car.model); 
    }
}
