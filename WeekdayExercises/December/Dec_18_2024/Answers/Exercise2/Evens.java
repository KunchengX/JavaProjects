package WeekdayExercises.December.Dec_18_2024.Answers.Exercise2;

public class Evens {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Please enter 10 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.println("\nElements at even positions are:");
        for (int i = 0; i < numbers.length; i += 2) {
            System.out.println(numbers[i]);
        }

        System.out.println("\nElements at odd positions are:");
        for (int i = 1; i < numbers.length; i += 2) {
            System.out.println(numbers[i]);
        }
    }

}
