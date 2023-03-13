import java.util.Random;
import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // generate a random number between 1 and 100

        Scanner scanner = new Scanner(System.in);
        int guess;
        int numGuesses = 0;
        boolean guessedCorrectly = false;

        System.out.println("Guess a number between 1 and 100:");

        while (!guessedCorrectly) {
            guess = scanner.nextInt();
            numGuesses++;

            if (guess == randomNumber) {
                guessedCorrectly = true;
                System.out.println("Congratulations, you guessed the number in " + numGuesses + " guesses!");
            } else if (guess < randomNumber) {
                System.out.println("Too low, try again:");
            } else {
                System.out.println("Too high, try again:");
            }
        }

        scanner.close();
    }
}
