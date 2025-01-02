# Computer Science AP Grade 10 Quiz

## Answers

### Section 1: Multiple Choice (50%)

1. **What is a class in Java?**
    - A. A blueprint for creating objects

2. **Which of the following is a correct way to declare a variable in Java?**
    - A. `int number = 5;`

3. **What is the purpose of a constructor in a class?**
    - A. To initialize objects

4. **Which keyword is used to inherit a class in Java?**
    - A. `extends`

5. **What is polymorphism in Java?**
    - A. The ability of a variable, function or object to take on multiple forms

6. **What is the output of the following Java code?**
    - B. 15

7. **Which of the following statements about Java exceptions is true?**
    - B. Exceptions are used to handle errors in the program.

8. **What will be the result of attempting to compile and run the following code?**
    - C. "Array index out of bounds"

9. **Which of the following is true about the `final` keyword in Java?**
    - D. All of the above

10. **What is the difference between `==` and `equals()` in Java?**
    - A. `==` checks for reference equality, while `equals()` checks for value equality.

### Section 2: Coding (50%)

1. **Create a Java class named `Student` with the following requirements:**
    - Private variables: `name` (String), `grade` (int)
    - A constructor that initializes the variables
    - Getter and setter methods for each variable

    ```java
    public class Student {
         private String name;
         private int grade;

         public Student(String name, int grade) {
              this.name = name;
              this.grade = grade;
         }

         public String getName() {
              return name;
         }

         public void setName(String name) {
              this.name = name;
         }

         public int getGrade() {
              return grade;
         }

         public void setGrade(int grade) {
              this.grade = grade;
         }
    }
    ```

2. **Create a subclass of `Student` named `APStudent` that includes an additional variable `apSubject` (String) and a method `displayInfo()` that prints the student's name, grade, and AP subject.**

    ```java
    public class APStudent extends Student {
         private String apSubject;

         public APStudent(String name, int grade, String apSubject) {
              super(name, grade);
              this.apSubject = apSubject;
         }

         public String getApSubject() {
              return apSubject;
         }

         public void setApSubject(String apSubject) {
              this.apSubject = apSubject;
         }

         public void displayInfo() {
              System.out.println("Name: " + getName());
              System.out.println("Grade: " + getGrade());
              System.out.println("AP Subject: " + apSubject);
         }
    }
    ```
