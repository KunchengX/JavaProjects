package WeekdayExercises.December.Dec_19_2024.Answers.StepByStep;


import java.util.Scanner;
import java.util.Random;

public class Manipulation {
    public static void main(String[] args) {
        // Accept an integer from the user to define the size of the array
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Array of size " + n + " created.\n");
        scanner.close();

        // Populate the array with n random integers between 1 and 100 (inclusive)
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        // Print the array
        System.out.println("The array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");

        // Find and print the largest number in the array
        int max = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("The largest number in the array is: " + max + "\n");

        // Find and print the smallest number in the array
        int min = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("The smallest number in the array is: " + min + "\n");

        // Calculate and print the average of all the numbers in the array
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        double average = (double) sum / n;
        System.out.println("The average of all the numbers in the array is: " + average + "\n");
    
        // Reverse the array and print the reversed array
        System.out.println("\nThe reversed array is:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
