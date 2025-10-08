import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        boolean isPlaying = true;

        while (isPlaying) {
            System.out.println("Welcome to the Word Guesser Game!");

            String secret = "java";
            Scanner scanner = new Scanner(System.in);

            int attempts = 5;
            System.out.print("You have 5 attempts to guess the secret word: ");

            for (int i = 0; i < secret.length(); i++) {
                System.out.print("_");
            }

            while (attempts > 0) {
                System.out.println();
                String guess = scanner.nextLine();
                if (secret.equalsIgnoreCase(guess)) {
                    System.out.println("Correct! Enter [p] to continue!");
                    isPlaying = false;
                    break;
                } else {
                    attempts--;
                    System.out.println("Incorrect! You have " + attempts + " attempts remaining.");
                }
            }
            if (attempts == 0) {
                System.out.println("No attempts left. Game Over!");
                System.out.println("Ender [p] to continue!");
                isPlaying = false;
            }
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("p")) {
                isPlaying = true;
            }
        }
    }
}