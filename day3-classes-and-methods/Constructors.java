public class Constructors {
    int x;
    // unparameterized constructor
    public Constructors() {
        x = 5;
    }
    // parameterized constructor
    public Constructors(int n) {
        x = n;
    }
    public static void main(String[] args) {
        var obj1 = new Constructors(); // first constructor is called
        System.out.println(obj1.x); // prints 5

        var obj2 = new Constructors(10); // 2nd constructor is called
        System.out.println(obj2.x); // prints 10
    }
}