public class TypeCasting {
    public static void main(String[] args) {
        int myInt = 5;
        double myDouble = 9.99;

        myDouble = myInt; // widening casting, automatic

        System.out.println("Widening casting int(4b) -> double(8b): " + myDouble); // prints 5.0 instead of 5;

        myDouble = 9.99;
        myInt = (int) myDouble; // narrowing casting, manual

        System.out.println("Narrowing casting double(8b) -> int(4b): " + myInt); // prints 5.0 instead of 5;
    }
}