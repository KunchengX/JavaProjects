package WeekdayExercises.December.Dec_12_2024.Exercise.ExerciseStudent;

public class TestStudent {
    public static void main (String[] args){
        Student s1 = new Student("Alyssa", 2500, 14);
        Student s2 = new Student("Candy", 520, 254);
        Student s3 = new Student("Candy", 520, 254);

        boolean isEqual = s1.equals(s2);
        System.out.println(isEqual);

        isEqual = s2.equals(s3);
        System.out.println(isEqual);
    }
}
