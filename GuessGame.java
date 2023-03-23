import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        // Set secret number
        int secret = 8;

        // Take user input
        Scanner reader = new Scanner(System.in);
        int guess = reader.nextInt();

        if (guess == secret) {                   // Correct guess
            System.out.println("Correct!");
        } else if (guess > secret) {            // Guess is too high
            System.out.println("TOO HIGH!");
        } else if (guess < secret) {            // Guess is too low
            System.out.println("t o o  l o w");
        }
    }
}
