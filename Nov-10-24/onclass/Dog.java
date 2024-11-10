public class Dog {
    //String breed;
    int age;
    String name;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    // void eat() {
    //     System.out.println("Dog is eatting.");
    // }

    // void run() {
    //     System.out.println("Dog is running");
    // }

    // void sleep() {
    //     System.out.println("Dog is sleeping.");
    // }
    // TODO: implement a setter, a getter to each variable of the dog.


    public static void main (String [] args) {
        Dog newDog = new Dog();
        
        newDog.setAge(5);
        newDog.setName("Tom");

        int age = newDog.getAge();
        String name = newDog.getName();

        System.out.println("The age of dog is: " + age);
        System.out.println("The name of dot is: " + name);
    }
   
}
