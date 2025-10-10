public class Methods {
    // methods overloading
    public static int add(int a, int b) {
        return a + b;
    }
    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(5, 3)); // int
        System.out.println(add(5.0, 3)); // double
    }
}