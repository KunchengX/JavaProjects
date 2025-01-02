# Answers: Introduction to Java Programming

**Total Time**: 60 minutes  
**Total Marks**: 100  

---

## Section 1: Multiple Choice Questions (40 marks)

*Choose the correct answer for each of the following questions. Each question is worth 4 marks.*

1. b) `float number = 2.5;`

2. c) `double a = 10, b = 3, c = 5;`

3. a) `calculateSum(5, 10);`

4. b) 16

5. d) 12

6. a) `for(int i = 0; i < 10; i++) {}`

7. d) `double answer = (double)(13/5);`

8. c) `Value is: 2`

---

## Section 2: Short Answer Questions (10 marks)

*Answer the following questions briefly. Each question is worth 8 marks.*

1. Answer:
The `else` statement in an `if-else` construct provides an alternative block of code to execute when the condition in the `if` statement evaluates to `false`. It ensures that if the `if` condition fails, a different set of actions will be performed.

2. Answer:

    while loop: A while loop is used when the number of iterations is not known beforehand. The loop continues as long as the specified condition evaluates to true.

    for loop: A for loop is used when the number of iterations is known beforehand, typically when iterating over a range or a collection.

---

## Section 3: Coding Questions (40 marks)

*Write the code for the following tasks. Each question is worth 20 marks.*

1. Answer:

    ```java
    public class MultiplicationTable {
        public static void printTable(int n) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        }

        public static void main(String[] args) {
            printTable(3);
        }
    }
    ```

2. Answer:

    ```java
    public class SumNumbers {
        public static int sumOfNumbers(int n) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            return sum;
        }

        public static void main(String[] args) {
            System.out.println(sumOfNumbers(4));  // Output: 10
        }
    }
    ```

---

## Section 4: Debugging (20 marks)

*Below is a code snippet that contains some errors. Debug the code and write the corrected version. Each error is worth 4 marks.*

Answer:

- Missing void in the method signature (`public static void main`).
- Logical error in the condition `x < y`, which was incorrect.
- Incorrect for loop syntax that didn't declare the loop variable type.
- Missing brackets in `if (x < y)`.
- Missing brackets in `for (int i = 0; i < 10; i++)`.

```java
// Findings
public class DebuggingExample {
    public static main(String[] args) { // 'void' added and 'main' fixed
        int x = 10;
        int y = 5;

        if x < y {  // should be ">" or ">=", missing brackets
            System.out.println("x is greater");
        } else {
            System.out.println("y is greater");
        }

        for i = 0; i < 10; i++ {  // Declare type for 'i' and fix loop syntax
            System.out.println(i);
        }
    }
}
```

---

End of Exam
