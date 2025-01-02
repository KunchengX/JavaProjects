# Computer Science AP Grade 10 Quiz

## Duration: 1 Hour

### Section 1: Multiple Choice (50%)

1. **What is a class in Java?**
    - A. A blueprint for creating objects
    - B. A variable type
    - C. A method
    - D. A constructor

2. **Which of the following is a correct way to declare a variable in Java?**
    - A. `int number = 5;`
    - B. `int number: 5;`
    - C. `int number == 5;`
    - D. `int number <- 5;`

3. **What is the purpose of a constructor in a class?**
    - A. To initialize objects
    - B. To define methods
    - C. To declare variables
    - D. To inherit from another class

4. **Which keyword is used to inherit a class in Java?**
    - A. `extends`
    - B. `implements`
    - C. `inherits`
    - D. `super`

5. **What is polymorphism in Java?**
    - A. The ability of a variable, function or object to take on multiple forms
    - B. The ability to create multiple classes
    - C. The ability to define multiple methods
    - D. The ability to inherit from multiple classes

6. **What is the output of the following Java code?**

    ```java
    public class Test {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            int result = 0;
            for (int i = 0; i < arr.length; i++) {
                result += arr[i];
            }
            System.out.println(result);
        }
    }
    ```

    - A. 10
    - B. 15
    - C. 20
    - D. 25

7. **Which of the following statements about Java exceptions is true?**
    - A. All exceptions must be caught or declared to be thrown.
    - B. Exceptions are used to handle errors in the program.
    - C. Runtime exceptions must be caught or declared to be thrown.
    - D. Checked exceptions do not need to be caught or declared to be thrown.

8. **What will be the result of attempting to compile and run the following code?**

    ```java
    public class Test {
        public static void main(String[] args) {
            try {
                int[] arr = new int[5];
                System.out.println(arr[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bounds");
            }
        }
    }
    ```

    - A. Compilation error
    - B. Runtime error
    - C. "Array index out of bounds"
    - D. No output

9. **Which of the following is true about the `final` keyword in Java?**
    - A. A final class cannot be subclassed.
    - B. A final method cannot be overridden.
    - C. A final variable cannot be reassigned.
    - D. All of the above

10. **What is the difference between `==` and `equals()` in Java?**
    - A. `==` checks for reference equality, while `equals()` checks for value equality.
    - B. `==` checks for value equality, while `equals()` checks for reference equality.
    - C. Both `==` and `equals()` check for reference equality.
    - D. Both `==` and `equals()` check for value equality.

### Section 2: Coding (50%)

1. **Create a Java class named `Student` with the following requirements:**
    - Private variables: `name` (String), `grade` (int)
    - A constructor that initializes the variables
    - Getter and setter methods for each variable

    ```java
    // Write your code here.














    ```

2. **Create a subclass of `Student` named `APStudent` that includes an additional variable `apSubject` (String) and a method `displayInfo()` that prints the student's name, grade, and AP subject.**

    ```java
    // Write your code here.















    
    ```
