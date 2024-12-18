package WeekdayExercises.December.Dec_18_2024.Pratices.Exercise3;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        int[] Integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner scanner = new Scanner(System.in);

        System.out.println ("\n Input a number to search for int the array");
         int inputs = scanner.nextInt();

         scanner.close();

        int count = 0;
        boolean found = false;
        for (int integer : Integers){
            if (integer == inputs){
                found = true;
                count++;
            }
        }

        if (found){
            System.out.println("The number " + String.valueOf(inputs) + " is found in the array."); 
        }
        else{
            System.out.println("The number " + String.valueOf(inputs) + " is not found in the array.");
        }

        System.out.println("\nThe number " + String.valueOf(inputs) + " is found " + String.valueOf(count) + " times in the array.");
    }
}
