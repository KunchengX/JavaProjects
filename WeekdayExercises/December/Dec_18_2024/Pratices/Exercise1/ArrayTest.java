package WeekdayExercises.December.Dec_18_2024.Pratices.Exercise1;

public class ArrayTest {
    public static void main(String[] args){
        String[] Fruit = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};

        for (String element: Fruit){
            System.out.println(element);
        }
        System.err.println();
        for (int i = Fruit.length - 1; i >= 0; i--) {
            System.out.println(Fruit[i]);
        }

    }  
}