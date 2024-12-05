package WeekdayExercises.December.Life;

public class TestLife {

    public static void main(String[] args) {
        Plant plant = new Tree();
        plant.breathe("CO2");

        Plant plant2 = new Plant();
        plant2.breathe("O2");
        plant2.breathe("CO2");
    }
}

// Output:
// CO2
// Tree is breathing.
// Plant is not breathing.
// Plant is breathing.

// Commons:
// Doing print job
// both are public
// same return type
// same symbol "breathe"
// same parameter list

// parent class
class Plant {
    public void breathe(String chemical) {
        if (chemical.equals("CO2")) {
            System.out.println("Plant is breathing.");
        } else {
            System.out.println("Plant is not breathing.");
        }
    }
}

// sub class
class Tree extends Plant {

    // overriding method
    public void breathe(String chemical) {
        System.out.println(chemical);
        System.out.println("Tree is breathing.");
    }

    public void grow() {
        System.out.println("Tree is growing.");
    }
}
