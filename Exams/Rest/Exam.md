# CS AP Exam

**Duration:** 1 hour

## Multiple Choice Questions - 50%

1. What is the purpose of the `Object.toString()` method?
    - a) To compare two objects
    - b) To return a string representation of the object
    - c) To calculate the hash code of the object
    - d) To clone the object

2. Which method is used to compare two strings for equality?
    - a) `String.compare()`
    - b) `String.equals()`
    - c) `String.match()`
    - d) `String.compareTo()`

3. What does the `Math.pow(2, 3)` return?
    - a) 6
    - b) 8
    - c) 9
    - d) 12

4. How do you find the length of a string `str` in Java?
    - a) `str.size()`
    - b) `str.length()`
    - c) `str.count()`
    - d) `str.getLength()`

5. What is the index of the first character in a Java string?
    - a) 0
    - b) 1
    - c) -1
    - d) It depends on the string

6. Which of the following is a valid declaration of a Java array?
    - a) `int[] arr = new int[5];`
    - b) `int arr = new int[5];`
    - c) `int arr[] = new int(5);`
    - d) `int arr = new int[];`

7. What is the output of `System.out.println(10 + 20 + "30");`?
    - a) `1030`
    - b) `102030`
    - c) `3030`
    - d) `30`

8. Which keyword is used to inherit a class in Java?
    - a) `implements`
    - b) `inherits`
    - c) `extends`
    - d) `super`

9. What is the size of an `int` variable in Java?
    - a) 4 bytes
    - b) 2 bytes
    - c) 8 bytes
    - d) 1 byte

10. Which of the following is not a Java keyword?
    - a) `static`
    - b) `Boolean`
    - c) `void`
    - d) `private`

## Coding Questions - 50%

1. Write a Java method that overrides the `toString()` method for a class `Student` which includes the student's name and grade.

```java
public class Student {
     private String name;
     private int grade;

     public Student(String name, int grade) {
          this.name = name;
          this.grade = grade;
     }

     @Override
     // Write your code here



}
```

2. Write a Java method that checks if two `Integer` objects are equal using `compareTo()` method.

```java
public boolean areIntegersEqual(Integer a, Integer b) {
    // Write your code here.



}
```

3. Write a Java method that returns the square root of a number using the `Math.sqrt()` method.

```java
public double getSquareRoot(double number) {
    // Write your code here.



}
```

4. Write a Java method that returns a substring of a given string from index 2 to 5.

```java
public String getSubstring(String str) {
    // Write your code here.



}
```

5. Define an array of integers and write a method to find the maximum value in the array.

```java
public int findMax(int[] array) {
    // Write your code here.







}
```

Good luck!
