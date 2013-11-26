package q2;
import java.util.Scanner;
import java.util.Random;
/**
 * <p> * The class guess(instance) for a guessing game.
 * Functions:
 * - to let player guess a number between 1-100</p>
 *
 * @author Ruosi Ding
 * @version 1.0
 */
public class Guess {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        // your code will go here!!!
        /**
         * <p>declare integer value numOne.</p>
         */
        int numOne;
        /**
         * <p>declare integer value count.</p>
         */
        int count;
        /**
         * <p>declare boolean value playAgain and set to true.</p>
         */
        boolean playAgain = true;
        /**
         * <p>declare new scanner value scan.</p>
         * <p>declare new random value generator.</p>
         */
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        
        /**
         * <p>while loop to let player choose play or not.</p>
         */
        while (playAgain) {
            /**
             * <p>message to the player.</p>
             * <p>scan player input.</p>
             */
            System.out.println("Guess a interger between 1 and 100." 
                            + "\nEnter your guess (0 to quit): ");
            numOne = scan.nextInt();

            /**
             * <p>count number of player input.</p>
             * <p>use do while loop to let player play guessing game</p>
             * <p>let player input 0 to quit.</p>
             * <p>if player guessed low, let player guess again.</p>
             * <p>if player guessed high, let player guess again.</p>
             * <p>if player guessed right, let player choose to play again.</p>
             */
            count = 0;
            int numTwo = generator.nextInt(Integer.parseInt("100")) + 1;
            do {
                if (numOne < numTwo) {
                    System.out.println("The guess was too low."
                            + "\nGuess again (0 to quit): ");
                    numOne = scan.nextInt();
                    scan.nextLine();
                    count++;
                } else if (numOne > numTwo) {
                    System.out.println("The guess was too high. "
                            + "\nGuess again (0 to quit): ");
                    numOne = scan.nextInt();
                    scan.nextLine();
                    count++;
                } else {
                    System.out.println("Guess is Correct!");
                    count++;
                    System.out.println("Number of Guesses: " + count);
                    numOne = 0;
                }
            }
            while (numOne != 0);
            
            /**
             * <p>ask player to play again or not.</p>
             * <p>if input is n, function ends.</p>
             */
            System.out.println("Play Again? (y/n): ");
            String input = scan.nextLine();
            if (input.equalsIgnoreCase("n")) {
                playAgain = false;
            }
            
        }
    /**
     * close the scanner.
     */
    scan.close();
    
    System.out.println("Question two was called and ran sucessfully.");
    }
};
