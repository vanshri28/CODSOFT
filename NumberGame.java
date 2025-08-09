
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int score = 0;
        boolean playAgain = true;

        System.out.println("Welcome to the Number Guessing Game...");

        while (playAgain) {
            int numberToGuess = ran.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 10;
            boolean hasGuessedCorrectly = false;

            System.out.println("\nI guessed a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts to guess it....");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == numberToGuess) {
                    System.out.println("Your guessed number is correct in " + attempts + " attempts.");
                    score++;
                    hasGuessedCorrectly = true;
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("low...");
                } else {
                    System.out.println("high...");
                }
            }

            if (!hasGuessedCorrectly) {
                System.out.println("You've used all attempts. The correct number was " + numberToGuess + ".");
            }

            System.out.print("\nDo you want to play another round? : ");
            sc.nextLine(); // consume leftover newline
            String response = sc.nextLine().toLowerCase();
            playAgain = response.equals("yes");
        }

        System.out.println("\nGame over!! Your total score: " + score);
        sc.close();
    }
}
