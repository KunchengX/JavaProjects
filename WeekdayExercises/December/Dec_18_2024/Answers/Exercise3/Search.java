package WeekdayExercises.December.Dec_18_2024.Answers.Exercise3;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Enter the number to search:");
        int searchNumber = scanner.nextInt();

        scanner.close();
        
        int count = 0;
        boolean found = false;
        for (int number : numbers) {
            if (number == searchNumber) {
                found = true;
                count++;
            }
        }

        if (found) {
            System.out.println("The number " + String.valueOf(searchNumber) + " is found in the array.");
        } else {
            System.out.println("The number " + String.valueOf(searchNumber) + " is not found in the array.");
        }

        System.out.println("\nThe number " + String.valueOf(searchNumber) + " is found " + String.valueOf(count) + " times in the array.");
    }
}

