# January 2025 CS AP Exam 01 for Xuanyu

**Total Time**: 60 minutes  
**Total Marks**: 100

*You can use cheat sheet.*

---

# Section 1: Mutiple Choice

**Each question worths 10 marks**

1. Which of the following will **NOT** correctly assigns the value 5.5 to answer?
    A.  `double answer = (double) 22 / 4;`
    B.  `double answer = 22 / (double) 4;`
    C.  `double answer = 22 / 4.0;`
    D.  `double answer = 22.0 / 4;`
    E.  `double answer = (double) (22 / 4);`

2. Consider the following code segment.

    ```java
    int[] arr = {4, 2, 9, 7, 3};

    for (int k : arr) {
        k = k + 10;
        System.out.print(k + " ");
    }

    for (int k : arr) {
        System.out.print(k + " ");
    }
    ```

    What is printed as a result of executing the code segment?
    A.  `0 1 2 3 4 0 1 2 3 4`
    B.  `4 2 9 7 3 4 2 9 7 3`
    C.  `10 11 12 13 14 0 1 2 3 4`
    D.  `14 12 19 17 13 4 2 9 7 3`
    E.  `14 12 19 17 13 14 12 19 17 13`

3. Consider the following method.

    ```java
    public int mystery(int num) {
        int x = num;

        while (x > 0) {
            if (x / 10 % 2 == 0) {
                return x;
            }
            x = x / 10;
        }
        return x;
    }
    ```

    ```
    input = 1034

    x = 1034

    1034 > 0 ? -> true

        1034 / 10 = 103 % 2 == 0 ? -> false

        x = 1034 / 10 = 103;

    103 > 0 ? -> true

        103 / 10 = 10 % 2 == 0 > -> true

            return 103
    ```

    What value is returned as a result of the call `mystery(1034)`?
    A.  `4`
    B.  `10`
    C.  `34`
    D.  `103`
    E.  `1034`

4. Consider the following method.

    ```java
    public int pick(boolean test, int x, int y) {   // true , 6, 7

        // test == false
        if (test) { 
            return x;   
        }
        return y; // y = 6
    }
    ```

    ```
    pick(true, 6, 7) == 6

    pick(true, 0, 1) == 0

    pick(false, 0, 6)
    ```

    What value is returned by the following method call?
    `pick(false, pick(true, 0, 1), pick(true, 6, 7));`
    A.  `0`
    B.  `1`
    C.  `3`
    D.  `6`
    E.  `7`

5. When designing a class hierarchy, which of the following should be true of a superclass?
    A.  A superclass should contian the data and functionality that are common to all subclasses that inherit from the superclass.
    //B.  A superclass should be the largest, most complex class from which all other subclasses are derived.
    //C.  A superclass should contain the data and functionality that are only required for the most complex class.
    D.  A superclass should have **public** data in order to provide access for the entire class hierarchy.
    //E.  A superclass should contain the most specific details of the class hierarchy.

6. Consider the following code segment.
    ```java

    String str = "abcdef";
    for (int rep = 0; rep < str.length() - 1; rep++) {
        System.out.print(str.substring(rep, rep + 2)); // [)
    }
    ```

    ```
    rep = 0 print(str[rep], str[rep + 1]) == print(ab)
    rep = 1 print(str[rep], str[rep + 1]) == print(bc)
    rep = 2 print(str[rep], str[rep + 1]) == prtint(cd)
    ...
    ...
    ```

    What is the printed as a result of executing this code segment?
    A.  `abcdef`
    B.  `aabbccddeeff`
    C.  `abbccddeef`
    D.  `abcbcdcdedef`
    E.  Nothing is printed because an `IndexOutOfBoundsException` is thrown.

7. Consider the following method.

    ```java

    public void numberCheck(int maxNum) {
        int typeA = 0;
        int typeB = 0;
        int typeC = 0;

        for (int k = 1; k <= maxNum; k++) {
            if (k % 2 == 0 && k % 5 == 0) {
                typeA++;
            }
            if (k % 2 == 0) {
                typeB++;
            }
            if (k % 5 == 0) {
                typeC++;
            }
        }
        System.out.println(typeA + " " + typeB + " " + typeC);
    }
    ```

    What is printed as a result of the call `numberCheck(50)`?
    A.  `5 20 5`
    B.  `5 20 20`
    C.  `5 25 5`
    D.  `5 25 10`
    E.  `30 25 10`

8. Consider the following method that is intended to modify its parameter `nameList` by replacing all occurrences of `name` with `newValue`.

    ```java

    Object .equals

    array[j]
    public void replace(ArrayList<String> nameList, String name, String newValue) {
        for (int j = 0; j < nameList.size(); j++) {
            if ( /*Expression*/) {
                nameList.set(j, newValue);
            }
        }
    }
    ```

    Which of the following can be used to replace `/*Expression*/` so that `replace` will work as intended?
    A.  `nameList.get(j).equals(name)`
    B.  `nameList.get(j) == name`
    C.  `nameList.remove(j)`
    D.  `nameList[j] == name`
    E   `nameList[j].equals(name)`

9. Consider the followin incomplete method.

    ```java
    public int someProcess(int n) {
        /* Body of someProcess */
    }
    ```

    The following table shows several examples of input values and the results that should be produced by calling `someProcess`.

    | Input Value `n` | Value returned by `someProcess(n)` |
    |-----------------|------------------------------------|
    | 3               | 30                                 |
    | 6               | 60                                 |
    | 7               | 7                                  |
    | 8               | 80                                 |
    | 9               | 90                                 |
    | 11              | 11                                 |
    | 12              | 120                                |
    | 14              | 14                                 |
    | 16              | 160                                |

    Which of the following code segments could be used to replace `/* Body of someProcess */` so that the method will produce the results shown in the table?

    ```java
    // I
    if ((n % 3 == 0) && (n % 4 == 0)) {
        return n * 10;
    }
    return n;

    // II
    if ((n % 3 == 0) || (n % 4 == 0)) {
        return n * 10;
    }
    return n;

    // III
    if (n % 3 == 0) {
        if (n % 4 == 0) {
            return n * 10;
        }
    }
    return n;
    ```

    A.  I     only
    B.  II    only
    C.  III   only
    D.  I  and  II
    E.  II and III

10. Consider the following instance variables and incomplete method that are part of a class that represents an item. The variables `years` and `months` are used to represent the age of the item, and the value for `months` is always between 0 and 11, inclusive. Method `updateAge` is used to update these variables based on the parameter `extraMonths` that represents the number of months to be added to the age.

    ```java
    private int years;
    private int months; // 0 <= months <= 11

    // precondition: extraMoths >= 0
    public void updateAge(int extraMonths) {
        /* Body of updateAge */
    }
    ```

    Which of the following code segments could be used to replace `/* Body of updateAge */` so that the method will workd as intended?

    ```java
    // I.

    12 % 12 == 0

    int yrs = extraMonths % 12;
    int mos = extraMonths / 12
    years = years + yrs;
    months = months + mos;

    // II.
    int totalMonths = years * 12 + months + extraMonths;
    years = totalMonths / 12;
    months = totalMonths % 12;

    // III.
    int totalMonths = months + extraMonths;
    years = years + totalMonths / 12;
    months = totalMonths % 12;
    ```

    A.  I only
    B.  II only
    C.  III only
    D.  II and III only
    E.  I, II and III

11. Assume that the following variable declarations have been made.

    ```java
    double d = Math.random();   //[0.0, 1.0) * 5 --> [0.0, 5.0) --> + 0.5 == [0.5, 5.5)
    double r;
    ```

    Which of the following assigns a value to `r` from the uniform distribution over the range 0.5 <= r < 5.5?
    A.  `r = d + 0.5;`
    B.  `r = d + 0.5 * 5.0;`
    C.  `r = d * 5.0;`
    D.  `r = d * 5.0 + 0.5;`
    E.  `r = d * 5.5;`

---

# Appendix A - A Exam Java Quick Reference

**Accessible Methods from the java Library That may Be Included on the Exam**

```java
class java.lang.Object
    boolean equals(Object other)
    String toString()

class java.lang.Ingeter
    Ingeter(int value)
    int intValue()

class java.lang.Double
    Double(double value)
    double doubleValue()

class java.lang.String
    int length()
    String substring(int from, int to)  // returns the substring beginning at from
                                        // and ending at to-1
    String  substring(int from)         // returns substring(from, length())
    int indexOf(String str)             // returns the index of the first
                                        // occurrence of str; returns -1 if not found
    int compareTo(String other)         // returns a value < 0 if this is less than other
                                        // returns a value = 0 if this is equal to other
                                        // returns a value > 0 is this is gerater than other

class java.lang.Math
    static int abs(int x)
    static double abs(double x)
    static double pow(double base, double exponent)
    static double sqrt(double x)
    static double random()              // returns a double in the range [0.0, 1.0) 
    // X --> 0.5 + 5X
    // X == [0.0, 1.0)
    // 0.5 + 5 * [0.0, 1.0)
    // 
class java.util.ArrayList<E>
    int size()                          
    boolean add(E obj)              // appends obj to end of list; returns true
    void add(int index, E obj)      // inserts obj at position index (0<= index <= size),
                                    // moving elements at position index and higher
                                    // to the right(adds 1 to their indices) and adjusts size
    E get(int index)
    E set(int ineex, E obj)         // replaces the element at position index with obj
                                    // returns the element formerly at the specified position
    E remove(int index)             // removes element from position index, moving elements
                                    // at position index + 1 and higher to the left
                                    // (subtracts 1 from their indices) and adjusts size
                                    // returns the element formerly at the specified position
```
