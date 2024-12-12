package WeekdayExercises.December.Dec_12_2024.Exercise.ExerciseStudent;

public class Student {
    String name;
    int id;
    int age;

    public Student(String name, int id, int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Student)) return false;
        // name.equals(name)
        // id == id
        // age == age
        Student student = (Student) obj;
        return age == student.age && this.name.equals(student.name) && this.id == student.id;
    }
}
