public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student(1, 20, "Alice");
        Student student2 = new Student(1, 20, "Alice");

        System.out.println(student1);
        System.out.println(student2);

        System.out.println(student1.equals(student2));

        student1.id = 3;
        student1.age = 22;
        student1.name = "Charlie";

        System.out.println(student1.equals(student2));

        System.out.println(student1);
        System.out.println(student2);
    }
}
