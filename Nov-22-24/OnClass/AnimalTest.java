public class AnimalTest {
    public static void main(String[] args) {
        Animal fish = new Animal();
        fish.eat();
        Dog Panpan = new Dog();
        Panpan.eat();
        Panpan.bark();
    }
}

class Animal {
    String type;
    int weight;
    int length;
    float foodAmount;

    public void eat() {
        System.out.println("Animal is eatting");
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    String type;

    public void eat() {
        System.out.println("Dog is eatting");
    }

    public void bark() {
        System.out.println("This dog is barking very LOUD!");
    }   
}