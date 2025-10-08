import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        System.out.println("Welcome to the Word Guesser Game!");

        String secret = "java";
        Scanner scanner = new Scanner(System.in);

        System.out.print("You have 5 attempts to guess the secret word");
        for (int i = 0; i < secret.lengnt(); i++) {
            System.out.print("_");
        }
        System.out.println();
        String guess = scanner.nextLine();
    }
}