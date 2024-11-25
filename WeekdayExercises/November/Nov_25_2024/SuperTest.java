package WeekdayExercises.November.Nov_25_2024;

public class SuperTest {
    public static void main(String[] args) {
        // SuperClass superClass = new SuperClass(5);
        SubClass subClass = new SubClass(5);
        subClass.doSth();
        System.out.println("End of Code.");
    }
}

// 系统会自动调用父类的无参构造器。
class SuperClass {
    int n;

    public SuperClass() {
        System.out.println("Super Class");
    }

    public SuperClass(int n) {
        System.out.println("Super Class with attribute");
    }
}

class SubClass extends SuperClass {
    int n;

    public SubClass(int n) {
        super(20);
        System.out.println("Sub Class");
    }

    public void doSth() {
        System.out.println("Sub Class is doing something.");
    }
}
