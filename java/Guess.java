package q2;
import java.util.Random;
import java.util.Scanner;

/**
 * <p>This project will ask used to guess a number between 1-100.
 * Everytime it will tell user if the guess if too high or too low.
 * The project will continue until the user choose to exit.</p>
 * @author Fred Xie
 * @version 1.0
 */
public class Guess {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        /**
         * The number that user guess.
         */
        int guess;
        /**
         * The random number that the system got(rang from 1 to 100).
         */
        int answer;
        /**
         * Ask the user if he/she wants to guess again if he/she guessed wrong.
         */
        String guessAgain;
        /**
         * Ask the user if he/she wants to quit or play more after he/she win.
         */
        String more;
        /**
         * Invoke the scanner
         */
        Scanner scan = new Scanner(System.in);
        /**
         * Out do loop that will determine if the user want to play.
         * more game after he/she win
         */
        do {
            Random generator = new Random();
            answer = generator.nextInt(Integer.parseInt("100")) + 1;
            int count = 0;
            /**
             * Inner do loop for user to guess
             */
        do {
            System.out.println("Please enter your guess: (1-100)");
            guess =  scan.nextInt();
            /**
             * If the guess is correct, break the loop.
             * If the guess is too high, tell the user and ask if he/she
             * wants to guess more.
             * If the guess is too low, tell the use and ask if he/she
             * wants to guess more.
             */
            if (guess == answer) {
                System.out.println("Congratulations! You got it!");
                break;
            } else if (guess > answer) {
                System.out.println("Sorry, your guess is to high! "
                        + "Guess again (y/n)");
                guessAgain = scan.next();
            } else {
                System.out.println("Sorry, your guess is to low! "
                        + "Guess again (y/n)");
                guessAgain = scan.next();
            }
            count++;
        } while (guessAgain.equalsIgnoreCase("y"));
        /**
         * Print out how many times the user has guessed
         */
        System.out.println("You have guessed " + count + " times");
        /**
         * Ask the user if he/she wants to play more.
         */
        System.out.println("Play again? (y/n)");
        more = scan.next();
        } while (more.equalsIgnoreCase("y"));
        /**
         * Close the scanner.
         */
        scan.close();
        System.out.println("Question two was called and ran sucessfully.");
    }

};
