public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument" + " " + (i + 1) + ": " + args[i]);
        }
        String name = "Sadawi";
        int age = 19;
        float height = 1.72f;
        char initial = 'M';
        final boolean isAdult = true;
        isAdult = false;
        int integer = isAdult ? 1 : 0;
        System.out.println(integer);
    }
}