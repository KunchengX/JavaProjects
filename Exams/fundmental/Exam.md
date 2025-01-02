# Mock Exam: Introduction to Java Programming

**Total Time**: 60 minutes  
**Total Marks**: 100  

---

## Section 1: Multiple Choice Questions (40 marks)

*Choose the correct answer for each of the following questions. Each question is worth 5 marks.*

1. **Which of the following is a valid variable declaration in Java?**  
   a) `int 1number;`  
   b) `float number = 2.5;`  
   c) `double num = "3.14";`  
   d) `char num = 1000;`

2. **Which of the following statements will compile without an error?**

    a) `int a = 10; b = 3; c = 5;`
    b) `double a = 10, int b = 3, double c = 5;`
    c) `double a = 10, b = 3, c = 5;`
    d) `int a = 3, b = 3, c = 3.0;`

3. **Which of the following is the correct way to call a method named calculateSum that takes two integer arguments?**

    a) `calculateSum(5, 10);`
    b) `int calculateSum(5, 10);`
    c) `calculateSum(int 5, int 10);`
    d) `calculateSum(5, 10) {}`

4. **What is the value of x after the following code is executed?**

    ```java
    int x = 5;
    x += 3;
    x *= 2;
    ```

    a) 11
    b) 16
    c) 13
    d) 15

5. **What value is stored in result if int `result = 13-3*6/4%3`?**
    a) -5
    b) 0
    c) 13
    d) 12

6. **Which of the following is the correct syntax for a for loop?**
    a) `for(int i = 0; i < 10; i++) {}`
    b) `for(int i = 0; i++) {}`
    c) `for(i = 0; i < 10; i++) {}`
    d) `for(int i = 0; i < 10) {}`

7. **Which of the following will NOT correctly assigns the value 2.6 to answer?**
    a) `double answer = (double)13/5;`
    b) `double answer = 13/(double)5;`
    c) `double answer = 13.0/5;`
    d) `double answer = (double)(13/5);`

8. **What is the output of the following code?**

   ```java
   int a = 7;
   int b = 3;
   if (a < 10 && b < 0) {
       System.out.println("Value is: " + a * b);
   } else {
       System.out.println("Value is: " + a / b);
   }
   ```

    a) `Value is: 21`
    b) `Value is: 2.33333`
    c) `Value is: 2`
    d) `Value is: 0`

---

## Section 2: Short Answer Questions (10 marks)

*Answer the following questions briefly. Each question is worth 5 marks.*

1. **Explain the role of the `else` statement in an `if-else` construct.**

2. **What is the difference between `while` and `for` loops in Java?**

---

<br></br>
<br></br>
<br></br>
<br></br>
<br></br>
<br></br>

## Section 3: Coding Questions (30 marks)

*Write the code for the following tasks. Each question is worth 15 marks.*

1. **Write a Java method `printTable` that takes an integer `n` as input and prints the multiplication table for that number from 1 to 10. For example, if the input is `3`, the output should be:**

```html
3 x 1 = 3
3 x 2 = 6
3 x 3 = 9
3 x 4 = 12
3 x 5 = 15
3 x 6 = 18
3 x 7 = 21
3 x 8 = 24
3 x 9 = 27
3 x 10 = 30
```

2. **Write a Java method `sumOfNumbers` that takes an integer `n` as input and returns the sum of all integers from 1 to `n`. For example, if the input is `4`, the output should be `10` (1 + 2 + 3 + 4). Use a `for` loop to solve this.**

---

## Section 4: Debugging (20 marks)

*Below is a code snippet that contains some errors. Debug the code and write the corrected version. Each error is worth ██ marks.*

```java
public class DebuggingExample {
    public static main(String[] args) {
        int x = 10;
        int y = 5;

        if x < y {
            System.out.println("x is greater");
        } else {
            System.out.println("y is greater");
        }

        for i = 0; i < 10; i++ {
            System.out.println(i);
        }
    }
}
```

---

End of Exam
