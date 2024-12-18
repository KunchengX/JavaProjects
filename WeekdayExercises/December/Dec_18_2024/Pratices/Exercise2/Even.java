package WeekdayExercises.December.Dec_18_2024.Pratices.Exercise2;

public class Even {
    public static void main (String[] args){

        int[] Integers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
            
        for(int i = 1; i < Integers.length; i+=2) {
            System.out.println(Integers[i]);
        }

        System.out.println();
        for (int i = 0; i < Integers.length; i++) {
            if (i % 2 != 0) {
                System.out.println(Integers[i]);
            }
        }
    }
}
