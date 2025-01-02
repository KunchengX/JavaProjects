package WeekdayExercises.December.Dec_19_2024.Practice;

import java.util.Scanner;
import java.util.Random;

public class Manipulation {
    public static void main(String[] args) {
        // 1. Accept integer n
        System.out.println("Please type in one integer: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int[] numbers = new int[n];

        System.out.println();
        // numbers[n - 1]
        for (int i = 0; i < n; i++) {
            Random r = new Random();
            int a = r.nextInt(100) + 1; // 1 ~ 100
            numbers[i] = a;
        }

        System.out.println();

        for (int value : numbers) {
            System.out.println(value);
        }
        System.out.println();

        int max = numbers[0];
        for (int i = 0; i < n; i++) {
            if (max > numbers[i]) {
                continue;
            } else { // max > numbers[i] == false
                max = numbers[i];
            }
            /*
             * if (max <= numbers[i]) {
             * max = numbers[i]
             * }
             */
        }
        System.out.print("Max number is: ");
        System.out.println(max);

        int min = numbers[0];
        for (int i = 0; i < n; i++){
            if (min > numbers[i]){ // true
                min = numbers[i]; // change small to smaller
            } else {
                continue;
            }
        }
        System.out.print("Min number is: ");
        System.out.println(min);

        int sum, avg;
        sum = 0;
        avg = 0;

        int length = numbers.length;

        for (int value: numbers) {
            sum += value;
        }

        avg = sum / length;
        System.out.println(avg);
        System.out.println();

        int left;
        int right;
        for (left = 0, right = n - 1; left < right; left++, right--) {
            int reverse = numbers[left];    // x <- left
            numbers[left] = numbers[right]; // left <- right
            numbers[right] = reverse;
        }











        // int left;
        // int right;
        // for (left = 0, right = n - 1; left < right; left++, right--) {
        //     int temp = numbers[left];
        //     numbers[left] = numbers[right];
        //     numbers[right] = temp;
        // }

        for (int v : numbers) {
            System.out.println(v);
        }

    }
}
/*        0  1  2  3  4 5  6  7  8  9    n = 10
 *       15 17 31 59 73 31 39 3 80 55
 *        ^left                     ^right
 * 
 *    left = 15, right = 55 -> reverse --> left = 55, right = 15
 * 
 *        0   1   2   3   4   5   6   7   8   9   
 *       55   17  31  59  73  31 39  3   80   15
 *            ^left                      ^right
 * 
 *    left = 17, right = 80 -> reverse --> left = 80, right = 17
 * 
 *        0   1   2   3   4   5   6   7   8   9   
 *       55   80  31  59  73  31 39  3   17   15
 *                        ^right^left
 * 
 *       55  80   3   59   73   31   39  31  17   15
 * 
 *       55  80  3  39  73  31   59
 */
// 1 2 3 8 3 213 9430 -2498 43903
// ^(number = 43903) 
// compare 