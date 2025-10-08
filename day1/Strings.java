public class Strings {
    public static void main(String[] args) {
        /* - In Java, string variables are stored in the string pool, unless you create them using `new` keyword.
           - In the string pool, if you declare multiple variables with the same value,
           Java assigns the later variables to the memory address of the first one to save memory.
           Reusing the same address by multiple pointers to save memory.
        */
        // using == with strings compares addresses not characters
        String name1 = "cat";
        String pet1 = "cat";
        System.out.println(name1 == pet1); // prints true

        String name2 = "cat";
        String pet2 = new String("cat");
        System.out.println(name2 == pet2); // prints false

        // use String.equals() to compare by character
        System.out.println(name2.equals(name1));
    }
}