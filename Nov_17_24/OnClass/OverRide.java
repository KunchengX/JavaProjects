public class OverRide {
    public static void main(String[] args) {
        int a = 10;
        int b = 50;
        double c = 4.5;
        double d = 5.5;
        int bigger;
        bigger = max(a, b);
        System.out.println("Bigger = " + bigger);
        double biggerDouble = max(c, d);
        System.out.println("BiggerDouble = " + biggerDouble);
    }

    public static int max(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        }
        return num2;
    }

    public static double max(double num3, double num4) {
        if (num3 > num4) {
            return num3;
        }
        return num4;
    }
}
