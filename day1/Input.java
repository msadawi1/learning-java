import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        String correctAnswer = "Echo";

        System.out.println("I speak without a mouth and hear without ears. I have no body," +
                " but I come alive with the wind. What am I?");
        System.out.println("What is your answer?");

        String userAnswer = scanner.nextLine();

        System.out.println("Your answer is: " + userAnswer);
        System.out.println("Correct answer: " + correctAnswer);
    }
}