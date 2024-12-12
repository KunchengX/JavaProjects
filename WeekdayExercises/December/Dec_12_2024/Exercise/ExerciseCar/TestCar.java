package WeekdayExercises.December.Dec_12_2024.Exercise.ExerciseCar;

public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car("Honda", "TypeR", 3);
        Car car2 = new Car("Toyota", "LandCruser", 10);
        Car car3 = new Car("Toyota", "LandCruser", 10);

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());

        System.out.println(car1.equals(car2));
        System.out.println(car2.equals(car3));

    }
}
