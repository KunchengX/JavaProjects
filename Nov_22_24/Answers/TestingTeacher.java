public class TestingTeacher {
    public static void main(String[] args) {
        Teacher JohnDoe = new Teacher("John", "Doe", "123 Main St.");
        JohnDoe.createStudent("Jane", "Doe");
        JohnDoe.PrintInfoTeacher();
    }
}

class Student {
    String name;
    String surname;
    Teacher teach;

    public Student(String name, String surname, Teacher teach) {
        this.name = name;
        this.surname = surname;
        this.teach = teach;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}

/**
 * The TeacherStudent class represents a teacher with a student.
 * It contains information about the teacher's name, surname, and address,
 * and allows for the creation and management of a student associated with the teacher.
 */
class Teacher {
    String name;
    String surname;
    String address;
    Student std;

    public Teacher(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    // Create a student associated with the teacher
    /**
     * Creates a new Student object with the given name, surname, and address.
     *
     * @param studentName the first name of the student
     * @param studentSurname the surname of the student
     * @param studentAddress the address of the student
     * @param this the teacher associated with the student
     */
    public void createStudent(String studentName, String studentSurname) {
        this.std = new Student(studentName, studentSurname, this);
    }

    public void PrintInfoTeacher() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Address: " + address);
    }

    public void PrintInfoStudent() {
        System.out.println("Student Name: " + std.getName());
        System.out.println("Student Surname: " + std.getSurname());
    }
}