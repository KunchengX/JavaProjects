package WeekdayExercises.December.Animal;

public class TestingInheritance {
    public static void main(String[] args) {
        // Object definitation
        Animal obj = new Wolf();
        // Method overriding
        obj.makeNoise();
        obj.eat();  // Inherited from Animal class
        obj.roam();
        obj.sleep();  // Inherited from Animal class
    }
}
