package WeekdayExercises.December.Dec_18_2024.Answers.Exercise1;

public class ArrayTest {
    public static void main(String[] args) {
        String[] strArr;
        strArr = new String[5];
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        for (int i = 0; i < strArr.length; i++) {
            System.out.println("Enter string " + (i + 1) + ":");
            strArr[i] = scanner.nextLine();
        }
        scanner.close();
        System.out.println("\nThe strings in reverse order are:");
        for (int i = strArr.length - 1; i >= 0; i--) {
            System.out.println(strArr[i]);
        }
        System.out.println("\nThe strings in original order are:");
        for (String str : strArr) {
            System.out.println(str);
        }
    }
}