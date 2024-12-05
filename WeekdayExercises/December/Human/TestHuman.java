package WeekdayExercises.December.Human;

public class TestHuman {
    public static void main(String[] args) {
        Human John = new Boy();
        John.eat();

        Human Paolo = new Human();
        Paolo.eat();
    }
}

class Human {
    //Overridden method
    public void eat() {
        System.out.println("Human is eatting.");
    }
}

// Boy is eatting != Human is eatting
class Boy extends Human {
    //Overriding method
    public void eat() {
        System.out.println("Do whatever you want for this subclass.");
    }
}

class Girl extends Human {

}

class Gay extends Human {

}

class Biosexual extends Human {
    
}

class Transgender extends Human {

}

class WalmartBag extends Human {
    
}

class IKEAShoppingBag extends Human {

}
